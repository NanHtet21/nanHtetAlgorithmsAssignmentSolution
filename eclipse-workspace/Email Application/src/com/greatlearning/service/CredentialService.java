package com.greatlearning.service;
import com.greatlearning.model.*;
import java.util.Random;

public class CredentialService {
	//generate email address
	public String generateEmailAddress(Employee emp) {
		return "";
	}
	public String generatePassword() {
		//Generate a 8 digit password which can have capital letter
		String capitalletters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallletters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*__=+-/.?<>)";
		String allowedChars = capitalletters + smallletters + numbers + specialCharacters;
		char[] password = new char[8];
		Random random = new Random();
		for(int i=0; i<8; i++) {
		
			int idx = random.nextInt(allowedChars.length());
			password[i]=allowedChars.charAt(idx);
		}
		return new String(password);
	}
	public void showCredentials(Employee emp, String email, String password) {
		System.out.println("Dear " + emp.getFirstName() + "- here are your credentails");
		System.out.println("Email Address " + email);
		System.out.println("Password " + email);	
	}		
	}


