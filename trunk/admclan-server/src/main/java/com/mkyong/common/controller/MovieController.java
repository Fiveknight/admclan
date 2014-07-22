package com.mkyong.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/movie")
public class MovieController {
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public @ResponseBody String getMovieNovo(ModelMap model) {

		model.addAttribute("movie", "Novo");
		return "list";

	}

	
	@RequestMapping(value="/{id}", method = RequestMethod.GET )
	public @ResponseBody String getMoviePorId(@PathVariable long id, ModelMap model) {
		model.addAttribute("movie", "porId" + id);
		return "list";

	}	
	
}