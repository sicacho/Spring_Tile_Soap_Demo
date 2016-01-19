package com.springapp.mvc.controller;

import com.springapp.mvc.dao.ProjectDao;
import com.springapp.mvc.domain.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Controller
@RequestMapping("/")
public class HelloController {

	@Autowired
	ProjectDao projectDao;

	@RequestMapping(method = RequestMethod.GET)
	public String portfolio(ModelMap model) {
		List<Project> projects = StreamSupport.stream(Spliterators.
				spliteratorUnknownSize(projectDao.findAll().iterator(), Spliterator.ORDERED),false).collect(Collectors.<Project>toList()) ;
		model.addAttribute("projects", projects);
		return "index";
	}

	@RequestMapping(value = "contact",method = RequestMethod.GET)
	public String contact(ModelMap model) {
		return "contact";
	}

	@RequestMapping(value = "about",method = RequestMethod.GET)
	public String about(ModelMap model) {
		return "about";
	}

	@RequestMapping(value = "projectDetail/{id}",method = RequestMethod.GET)
	public String projectDetail(ModelMap model,@PathVariable Long id) {
		model.addAttribute("project",projectDao.findOne(id));
		return "freelancers";
	}
}