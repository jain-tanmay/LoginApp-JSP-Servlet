package io.gupshup;

public class LoginService {
	
	public boolean authenticate(String userID, String password) {
		if (password == null || password.trim() == "") {
			return false;
		}
		return true;
	}
public User getUserDetails(String userID) {
	return 
}
}
