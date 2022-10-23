package model.dao;

import java.util.List;

import model.entidies.Department;

public interface SellerDao {

	void insert(Department obj);
	void update(Department obj);
	void deleteById(Department obj);
	Department findById(Integer id);
	List<Department> findAll();
}
