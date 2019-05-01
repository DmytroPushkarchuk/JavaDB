package JDBC.database.DAO;

import java.util.List;

import JDBC.database.entity.EmplProj;
import JDBC.database.entity.Employee;

public interface EmplProjDAO {
//	create
	void add(EmplProj emplProj);

//	read
	List<Employee> getAll();

	EmplProj getByEmployeeIdAndProjectId(Long employeeId, Long projectId);

//	update
	void update(EmplProj emplProj);

//	delete
	void remove(EmplProj emplProj);

}
