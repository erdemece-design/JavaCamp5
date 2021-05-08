package core;

import entities.concretes.Users;

public class SendMail {
	
	public boolean sendMail(Users user) {
		System.out.println("to person send the mail" + user.getName());
		return true;
	}
}
