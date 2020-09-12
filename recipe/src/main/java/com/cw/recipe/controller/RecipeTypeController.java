package com.cw.recipe.controller;

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

import com.cw.recipe.FormCommand;

@Controller    // This means that this class is a Controller
//@RequestMapping(path="/types") // This means URL's start with /demo (after Application path)
public class RecipeTypeController {
	
	//@Autowired
	//private RecipeTypeService recipeTypeService;
	
	@GetMapping("/recipetype")
    public String greetingForm(Model model) {
        model.addAttribute("formcommand", new FormCommand());
        return "greeting";
    }

    @PostMapping("/recipetype")
    public String greetingSubmit(@ModelAttribute FormCommand formcommand) {
    System.out.println("Formcommand textfield: " + formcommand.getTextField());    
    	return "result";
    }
 
}