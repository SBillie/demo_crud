package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import repository.SalarieDAO;

@RestController
@RequestMapping("api/salaries")
public class SalarieController {

	@Autowired
	private SalarieDAO salarieDAO;
	
	//créer  getAllSalaries qui va récupérer 
	//l'ensemble des datas salaries
	
	//Mise en place du CRUD
	
	//CREATE un salarie by id (C)
	
	//GET un salarie (R)
	
	//UPDATE un salarie (U)
	
	//DELETE un salarie (D)
}
