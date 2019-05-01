package JDBC.database.dao;

import java.sql.SQLException;
import java.util.List;

import JDBC.database.entity.Address;

public interface AddressDAO {

//	create
	void add(Address address) throws SQLException;

//	read
	List<Address> getAll() throws SQLException;

	Address getById(Long id) throws SQLException;

//	update
	void update(Address address) throws SQLException;

//	delete
	void remove(Address address) throws SQLException;

}
