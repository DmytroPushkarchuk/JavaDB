package JDBC.database.DAO;

import java.util.List;

import JDBC.database.entity.Employee;

public interface EmployeeDAO {
//	create
	void add(Employee employee);

//	read
	List<Employee> getAll();

	Employee getById(Long id);

//	update
	void update(Employee employee);

//	delete
	void remove(Employee employee);

}
