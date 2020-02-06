package test;

import java.util.Base64;

public class Decoded_String {

	public static void main(String[] args) 
	{
		// create an encoded String to decode 
        String encoded 
            = "YWdhbWkudGVzdDAwMkBnbWFpbC5jb20="; 
  
        // print encoded String 
        System.out.println("Encoded String:\n"
                           + encoded); 
  
        // decode into String from encoded format 
        byte[] actualByte = Base64.getDecoder() 
                                .decode(encoded); 
  
        String actualString = new String(actualByte); 
  
        // print actual String 
        System.out.println("actual String:\n"
                           + actualString); 
	}

}
