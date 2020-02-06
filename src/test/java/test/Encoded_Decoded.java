package test;

import java.util.Base64;

public class Encoded_Decoded {

	public static void main(String[] args) 
	{
		// create a sample String to encode 
        String email = "agami.test002@gmail.com"; 
  
        // print actual String 
        System.out.println("Sample String:\n"
                           + email); 
  
        // Encode into Base64 format 
        String BasicBase64format = Base64.getEncoder().encodeToString(email.getBytes()); 
  
        // print encoded String 
        System.out.println("Encoded String:\n"
                           + BasicBase64format); 

	}

}
