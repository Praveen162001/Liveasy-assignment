package com.loads.Loads.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loads.Loads.interfaces.loadservice;
import com.loads.Loads.modules.loads;

@RestController
@Controller
@RequestMapping
public class loadscontroller {
	@Autowired
	 loadservice service;
	@GetMapping("/loads")
	public List<loads> ListAll(Model model) {
		var load=(List<loads>) service.findAll();

		return load;

	} 
	 @GetMapping("/loads/{loadid}")
	public loads getloadsById(@PathVariable("loadid") long id) {
		   
		//return service.findById(id);
		 return null;
	}
	@DeleteMapping("/loads/{loadid}")
	public String deleteload(@PathVariable("loadid") long id) {
		if(id>0)
		{
			if(service.deleteload(id))
               return "deleted";
               else
               return "cannot delete";
         }
		return "The id is invalid";
	}
   @PostMapping("/loads")
   public String addload(@RequestBody loads loads) {
	   service.insert(loads);
	return "added a load data";
	   
   }
}

	
   

