package JDBC.database.DAO;

import java.util.List;

import JDBC.database.entity.Project;

public interface ProjectDAO {
//	create
	void add(Project project);

//	read
	List<Project> getAll();

	Project getById(Long id);

//	update
	void update(Project project);

//	delete
	void remove(Project project);

}
