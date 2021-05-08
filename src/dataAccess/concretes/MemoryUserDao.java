package dataAccess.concretes;

import java.util.ArrayList;

import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.Users;

public class MemoryUserDao implements UserDao{
	
	private static List<Users> users = null;
	
	public  MemoryUserDao() {
		if(users==null) {
			users = new ArrayList<Users>();
	}
		
	else {
		return;
	}
	}

	@Override
	public void register(Users users) {
		users.add(users);
		System.out.println("person successfully has been add ");
		
	}

	@Override
	public boolean login(Users user) {
		for(Users user1: users) {
			if(user1.getEmail()==user1.getEmail()) {
				if(user1.getPassword()==user1.getPassword()) {
					return true;
				}
				else {
					return false;
				}
			}
		}
		
		return false;
	}

	@Override
	public void delete(Users users) {
		users.remove(users);
		System.out.println("person has been removed" +users.getName());
		
	}

	@Override
	public boolean eMailExisting(String mail) {
		for(Users user: users) {
			if(user.getEmail()==mail) {
				return true;
			}
		}
		return false;
	}

}
