package com.example.repository;

import com.example.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

@Repository
public class JdbcUserRepository implements UserRepository {

    private JdbcTemplate jdbcTemplate;
    private SimpleJdbcInsert userInserter;
    private ObjectMapper objectMapper;

    @Autowired
    public JdbcUserRepository(JdbcTemplate jdbcTemplate) {
        this.userInserter = new SimpleJdbcInsert(jdbcTemplate)
                .withTableName("User")
                .usingGeneratedKeyColumns("id");
        this.jdbcTemplate = jdbcTemplate;
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public User findByUsername(String username) {
        return jdbcTemplate.queryForObject(
                "select * from User where username = ?",
                this::mapRowToUser,
                username
        );
    }

    @Override
    public User save(User user) {
        @SuppressWarnings("unchecked")
        Map<String, Object> map = objectMapper.convertValue(user, Map.class);
        long id =  userInserter.executeAndReturnKey(map).longValue();
        user.setId(id);
        return user;
    }

    private User mapRowToUser(ResultSet resultSet, int rowNum) throws SQLException {
        return new User(
                resultSet.getLong("id"),
                resultSet.getString("username"),
                resultSet.getString("password"),
                resultSet.getString("fullname"),
                resultSet.getString("street"),
                resultSet.getString("city"),
                resultSet.getString("state"),
                resultSet.getString("zip"),
                resultSet.getString("phoneNumber")
        );
    }
}
