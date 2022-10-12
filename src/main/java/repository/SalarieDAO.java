package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.SalarieBo;

@Repository
public interface SalarieDAO  extends JpaRepository <SalarieBo, Integer>{

}
