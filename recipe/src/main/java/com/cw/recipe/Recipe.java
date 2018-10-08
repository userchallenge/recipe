package com.cw.recipe;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Recipe {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String recipeName;

    private Integer recipeType;

	public Integer getRecipeType() {
		return recipeType;
	}

	public void setRecipeType(Integer recipeType) {
		this.recipeType = recipeType;
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

}
