package core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validMail {

	public boolean mailValid(String mail) {
		String form ="^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(form);
		Matcher matcher = pattern.matcher(mail);
		return matcher.matches();
	}

	public static boolean checkIfEmailValid(String email) {
		// TODO Auto-generated method stub
		return false;
	}
}
