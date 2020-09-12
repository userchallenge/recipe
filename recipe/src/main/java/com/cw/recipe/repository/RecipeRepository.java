package com.cw.recipe.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cw.recipe.domain.Recipe;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface RecipeRepository extends CrudRepository<Recipe, Integer> {

	List<Recipe> findByRecipeType(Integer type);
	
}