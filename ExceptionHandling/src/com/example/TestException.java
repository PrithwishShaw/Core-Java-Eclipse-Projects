package com.example;

public class TestException extends AccountException{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try  
        {  
			int bal=100;
			// calling the method   
            balance(bal);  
        }  
        catch (CustomException e)  
        {  
            System.out.println("Caught the exception");  
    
            // printing the message  
            System.out.println("Exception occured: " + e);  
        }  
  
        System.out.println("Byee...");    
	}
}
