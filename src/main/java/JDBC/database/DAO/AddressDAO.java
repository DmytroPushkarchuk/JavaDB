package JDBC.database.DAO;

import java.util.List;

import JDBC.database.entity.Address;

public interface AddressDAO {

//	create
	void add(AddressDAO address);

//	read
	List<Address> getAll();

	Address getById(Long id);

//	update
	void update(Address address);

//	delete
	void remove(Address address);

}
