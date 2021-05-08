package eTicaretSystem;

import business.concretes.UserManager;
import core.GoogleAuthenticationManagerAdapter;
import dataAccess.concretes.MemoryUserDao;
import entities.concretes.Users;

public class Main {

	public static void main(String[] args) {
		
		UserManager manager = new UserManager(new MemoryUserDao(), new GoogleAuthenticationManagerAdapter());
		
		Users user1 = new Users(1,"erdem","ece","erdem@gmail.com");

		
		boolean returnValue = manager.login(user1);
		if (returnValue) {
			System.out.println("success to system");
		}
		else {
			System.out.println("dont entry success to system");
		}
		
		
		Users user2 = new Users(2,"engin","demirog","engin@gmail.com");

		
		Users user3 = new Users(2,"engin","demirog","engin@gmail.com");


		}

	}


