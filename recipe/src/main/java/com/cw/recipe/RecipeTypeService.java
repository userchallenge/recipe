package com.cw.recipe;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
