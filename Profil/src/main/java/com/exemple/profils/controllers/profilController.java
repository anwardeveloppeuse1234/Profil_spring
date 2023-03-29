package com.exemple.profils.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.exemple.profils.entities.profil;
import com.exemple.profils.service.profilService;

@Controller
public class profilController {
	
	
	@Autowired
	profilService profilService;
	
	@RequestMapping("/showCreate")
	public String showCreate()
	{
	return "createprofil";
	}
	
	@RequestMapping("/saveprofil")
	public String saveprofil(@ModelAttribute("profil") profil profil,
							  @RequestParam("date") String date,
	                          ModelMap modelMap) throws 	ParseException
	{
	
	profil saveprofil = profilService.saveprofil(profil);
	String msg ="profil enregistré avec Id "+saveprofil.getIdprofil();
	modelMap.addAttribute("msg", msg);
	return "createprofil";
	}
	
	
	


	@RequestMapping("/updateprofils")
	public String updateprofil(@ModelAttribute("profil") profil profil,	ModelMap modelMap) throws ParseException
	{
	profilService.updateprofil(profil);
		return "listeprofil";
	}
	

	
	


@RequestMapping("/modifierprofil")
public String editerprofil(@RequestParam("id") Long id,ModelMap modelMap)
{
	profil p= profilService.getprofil(id);
	modelMap.addAttribute("profil", p);
	modelMap.addAttribute("mode", "edit");
	return "formprofil";

}
@RequestMapping("/updateprofil")
public String updateprofil(@ModelAttribute("profil") profil profil,
@RequestParam("date") String date,ModelMap modelMap) throws ParseException {
	
	 profilService.updateprofil(profil);
	 modelMap.addAttribute("profils");
	return "listeprofil";
	}

}
