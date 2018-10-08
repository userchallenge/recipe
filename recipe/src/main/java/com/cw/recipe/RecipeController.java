package com.cw.recipe;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller    // This means that this class is a Controller  ****
@RequestMapping(path="/recipe") // This means URL's start with /demo (after Application path)
public class RecipeController {
	
	@Autowired
	private RecipeService recipeService;
	
	/*
	@GetMapping(path="/add") // Map ONLY GET Requests
	public @ResponseBody String addNewRecipe (@RequestParam String recipeName
			, @RequestParam Integer recipeType) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		Recipe r = new Recipe();
		
		r.setRecipeName(recipeName);
		r.setRecipeType(recipeType);
		
		//recipeService.
		recipeRepository.save(r);
		return "Saved";
	}
*/

	/*
	@RequestMapping(path="/{id}")
	public @ResponseBody String getRecipeByID(@PathVariable String id, Model model) {
		// This returns a JSON or XML with the users
		model.addAttribute("recipesbyid", recipeService.getRecipeByID(Integer.parseInt(id)));
		return "recipebyid";
	}
	*/
	
	@RequestMapping(path="/{type}")
	public String getRecipeByType(@PathVariable String type, Model model) {
		// This returns a JSON or XML with the users
		System.out.println("**** rec: " + recipeService.getRecipeTypeByID(Integer.parseInt(type)).size());
		model.addAttribute("cat", recipeService.getRecipeTypeByID(Integer.parseInt(type)));
		return "recipebytype";
	}
	
	@GetMapping(path="/all")
	public String getAllRecipesFormatted(Model model) {
		model.addAttribute("recipes", recipeService.getAllRecipes());
		return "allrecipes";
		
	}
	
	@PostMapping(path="/check")
	public String getCheckMenu(@ModelAttribute RecipeChoice choice) {
		//model.addAttribute("recipes", recipeService.getAllRecipes());
		return "index";
		
	}
    
	@GetMapping(path="/random")
	public String getAllRecipesRandowmized(Model model) {
		model.addAttribute("recipes", recipeService.getAllRecipesRandomized());
		return "allrecipes";
		
	}
	
	/* TO DO - Gör om till parameter på antal recept */
	@GetMapping(path="/randomfive")
	public String getFiveRecipesRandowmized(Model model) {
		model.addAttribute("recipes", recipeService.getFiveRecipesRandomized());
		return "allrecipes";
		
	}
	
	@GetMapping(value = "/showform")
	public String showForm(Model model) {
	  /*
	  List<String> allItems = new ArrayList<String>();
	  allItems.add("value1");
	  allItems.add("value2");
	  allItems.add("value3");
	  model.addAttribute("allItems", allItems);

	  RecipeChoice choice = new RecipeChoice();
	  List<String> checkedItems = new ArrayList<String>();
	  // value1 will be checked by default.
	  checkedItems.add("value1");
	  //choice.setCheckedItems(checkedItems);
	  model.addAttribute("choice", choice);
		*/
	  return "showform";
	}
/*
	@RequestMapping(value = "/processForm", method=RequestMethod.POST)
	public String processForm(@ModelAttribute(value="foo") Foo foo) {
	  // Get value of checked item.
	  List<String> checkedItems = foo.getCheckedItems();
	  ...
	}
*/	
}