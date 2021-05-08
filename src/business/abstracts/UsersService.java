package business.abstracts;

import entities.concretes.Users;

public interface UsersService {

	void register(Users users);
	void registerToGoogle(String name);
	boolean login(Users user);
	void delete(Users users);
	void update(Users users);
}
