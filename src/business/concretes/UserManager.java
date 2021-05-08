package business.concretes;

import java.util.Scanner;

import business.abstracts.UsersService;
import core.AuthenticationServiceAdapter;
import core.GoogleAuthenticationManagerAdapter;
import core.validMail;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.MemoryUserDao;
import entities.concretes.Users;

public class UserManager implements UsersService {
	private UserDao userDao;
	private AuthenticationServiceAdapter authService;
	
	public UserManager(UserDao userDao, AuthenticationServiceAdapter googleAuthManager) {
		super();
		this.userDao = userDao;
		this.authService = googleAuthManager;
	}
	
	public UserManager(MemoryUserDao userDao2, GoogleAuthenticationManagerAdapter googleAuthManager) {
		
	}

	




	@Override
	public void register(Users user) {
		if (!validMail.checkIfEmailValid(user.getEmail())) {
			System.out.println("Lütfen Geçerli Bir Email Giriniz.");
			return;
		}
		if(userDao.eMailExisting(user.getEmail())) {
			System.out.println("this mail registered to system .");
			return;
		}
		if(user.getName().length() < 6) {
			System.out.println("password least 6 charcter");
			return;
		}
		
		 Scanner scanner = new Scanner(System.in);
	     System.out.print("");
	     int  result = scanner.nextInt();
	     if (result != 1){
	         System.out.println("error :  validation unsuccessful");
	         return;
	     }
	     userDao.register(user);
	
	

	}

	@Override
	public void delete(Users users) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Users users) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerToGoogle(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean login(Users user) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
