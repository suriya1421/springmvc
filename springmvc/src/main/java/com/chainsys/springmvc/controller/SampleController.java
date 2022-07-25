package com.chainsys.springmvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SampleController {
@RequestMapping("/")
public String index() {
	return "index";//index is the name of the view 
	//runtime will search for index for jsp in web app/webinf/views folder
	
}
@PostMapping("/print")
public String print(@RequestParam("username")String uName,Model model){
		model.addAttribute("username",uName);

	return "print";//print is the name of the view 
		//runtime will search for print for jsp in web app/webinf/views folder
		
		
	}

	
}

