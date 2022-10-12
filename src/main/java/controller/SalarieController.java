package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.SalarieBo;
import repository.SalarieDAO;

@RestController
@RequestMapping("api/salaries")
public class SalarieController {

	@Autowired
	private SalarieDAO salarieDAO;
	
	//créer  getAllSalaries qui va récupérer 
	//l'ensemble des datas salaries
	
	@GetMapping("/Salariés")
	public List<SalarieBo> getAllSalaries(){
		return salarieDAO.findAll();
	}
	
	//Mise en place du CRUD
	
	//CREATE un salarie by id (C)
	@PostMapping("/Salariés")
	public SalarieBo createSalarie(SalarieBo salarie) {
		return salarieDAO.save(salarie);
	}
	
	//GET un salarie (R)
	
	//UPDATE un salarie (U)
	
	//DELETE un salarie by id(D)
}
