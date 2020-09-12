package com.cw.recipe.service;

//import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cw.recipe.domain.Recipe;
import com.cw.recipe.repository.RecipeRepository;

@Service
public class RecipeService {
	
	@Autowired
	private RecipeRepository recipeRepository;

	public List<Recipe> getAllRecipes(){
		
		List<Recipe> recipes = new ArrayList();
		recipeRepository.findAll()
		.forEach(recipes::add);
		return recipes;
	}
	
	public List<Recipe> getAllRecipesRandomized(){
		
		List<Recipe> recipes = new ArrayList();
		recipeRepository.findAll()
		.forEach(recipes::add);
		Collections.shuffle(recipes);
		//Minska till 10 recept
		return recipes;
	}
	
	/* TODO - Gör antal recept parameterstyrt */
	public List<Recipe> getFiveRecipesRandomized(){
		
		List<Recipe> recipes = new ArrayList();
		recipeRepository.findAll()
		.forEach(recipes::add);
		Collections.shuffle(recipes);
		return recipes.subList(0, 5);
	}
	
	public Recipe getRecipeByID(Integer id) {
		return recipeRepository.findOne(id);
	}
	
	public List<Recipe> getRecipeTypeByID(Integer type) {
		return recipeRepository.findByRecipeType(type);
	}
	
	public void addRecipe(Recipe recipe) {
		recipeRepository.save(recipe);
	}
	
	public void updateRecipe(Integer id, Recipe recipe) {
		recipeRepository.save(recipe);
	}
	
	public void deleteRecipe(Integer id, Recipe recipe) {
		recipeRepository.delete(recipe);
	}
	
	
}
