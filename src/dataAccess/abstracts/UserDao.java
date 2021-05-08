package dataAccess.abstracts;

import entities.concretes.Users;

public interface UserDao {

	void register(Users users);
	boolean login(Users users);
	void delete(Users users);
	boolean eMailExisting(String mail);
}
