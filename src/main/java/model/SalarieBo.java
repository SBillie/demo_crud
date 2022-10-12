package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Salariés")
public class SalarieBo {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "matricule")
	private String matricule;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "dateseNaissance")
	private LocalDate dateDeNaissance;
	
	public SalarieBo(String name, String matricule) {}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	
}
