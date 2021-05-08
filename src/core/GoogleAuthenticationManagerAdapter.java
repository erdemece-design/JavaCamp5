package core;

import googleAuthentication.googleAuthentication;

public class GoogleAuthenticationManagerAdapter implements AuthenticationServiceAdapter {
googleAuthentication authManager = new googleAuthentication();

@Override
public void register(String message) {
	authManager.register(message);
	
}

@Override
public void login(String message) {
	authManager.login(message);
	
}
}
