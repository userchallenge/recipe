package com.cw.recipe.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class RecipeType {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String recipeTypeName;

    private Integer recipeType;

	public Integer getRecipeType() {
		return recipeType;
	}

	public void setRecipeType(Integer recipeType) {
		this.recipeType = recipeType;
	}

	public String getRecipeTypeName() {
		return recipeTypeName;
	}

	public void setRecipeTypeName(String recipeTypeName) {
		this.recipeTypeName = recipeTypeName;
	}

}
