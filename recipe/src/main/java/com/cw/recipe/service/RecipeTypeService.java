package com.cw.recipe.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cw.recipe.domain.RecipeType;
import com.cw.recipe.repository.RecipeTypeRepository;

@Service
public class RecipeTypeService {
	
	@Autowired
	private RecipeTypeRepository recipeTypeRepository;

	public List<RecipeType> getAllRecipeTypes(){
		
		List<RecipeType> recipeTypes = new ArrayList();
		recipeTypeRepository.findAll()
		.forEach(recipeTypes::add);
		return recipeTypes;
	}
	
}
