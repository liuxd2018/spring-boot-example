package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Taco {
    @NotNull
    @Size(min=5, message="Name must be at least 5 characters long")
    private String name;

    @NotNull(message = "You must choose at least 1 ingredient in each category")
    @Size(min=5, message="You must choose at least 1 ingredient in each category") // this validation is very sloppy
    private List<String> ingredients;

}
