package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.model.Team;
import demo.repository.TeamRepository;



@Controller
public class HelloController {
	
	@Autowired
	TeamRepository t;
	@RequestMapping("/hi")
	public @ResponseBody String getMessage(){
		return "Hello";
	}
	@RequestMapping("/hi/{name}")
	public @ResponseBody String getMessage(@PathVariable String name){
		return name;
	}
	@RequestMapping("/teams/{id}")
	public @ResponseBody Team getMessage(@PathVariable Long id){
		return t.findOne(id);
	}
}
