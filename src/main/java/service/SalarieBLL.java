package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.SalarieBo;
import repository.SalarieDAO;



@Service
public class SalarieBLL {
	
	@Autowired
	private SalarieDAO salarieDAO;
	
	public List<SalarieBo> selectAll(){
		return salarieDAO.findAll();

}
	
	public SalarieBo selectById(int id){
		return salarieDAO.findById(id).get();

}
	
	public void save(SalarieBo a) {
		salarieDAO.save(a);
	}
	
	public void delete(SalarieBo a) {
		salarieDAO.delete(a);
	}
	
	public void delete(int id) {
		salarieDAO.deleteById(id);
	}
	
	public boolean contains(int id) {
		return salarieDAO.existsById(id);
	}
	

}
