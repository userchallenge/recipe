package com.cw.recipe;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface RecipeTypeRepository extends CrudRepository<RecipeType, Integer> {

	List<Recipe> findByRecipeType(Integer type);
	
}