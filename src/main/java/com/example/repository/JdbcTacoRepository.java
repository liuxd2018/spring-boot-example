package com.example.repository;

import com.example.model.Ingredient;
import com.example.model.Taco;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementCreatorFactory;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

@Repository
public class JdbcTacoRepository implements TacoRepository {

    private JdbcTemplate jdbc;

    public JdbcTacoRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public Taco save(Taco taco) {
        long tacoId = saveTacoInfo(taco);
        taco.setId(tacoId);
        for (Ingredient ingredient : taco.getIngredients()) {
            saveIngredientToTaco(ingredient, tacoId);
        }

        return taco;
    }

    private long saveTacoInfo(Taco taco) {
        taco.setCreatedAt(new Date());
//        PreparedStatementCreator psc =
//                new PreparedStatementCreatorFactory(
//                        "insert into Taco (name, createdAt) values (?, ?)",
//                        Types.VARCHAR, Types.TIMESTAMP, Statement.RETURN_GENERATED_KEYS
//                ).newPreparedStatementCreator(
//                        Arrays.asList(
//                                taco.getName(),
//                                new Timestamp(taco.getCreatedAt().getTime())));

        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbc.update(connection -> {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into Taco (name, createdAt) values (?, ?)", Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, taco.getName());
            preparedStatement.setDate(2, new java.sql.Date(taco.getCreatedAt().getTime()));
            return preparedStatement;
        }, keyHolder);

        return keyHolder.getKey().longValue();
    }

    private void saveIngredientToTaco(
            Ingredient ingredient, long tacoId) {
        jdbc.update(
                "insert into Taco_Ingredients (taco, ingredient) " +
                        "values (?, ?)",
                tacoId, ingredient.getId());
    }

}
