package com.example;


public class AccountException {
		  
	    // method to check the balance  
	    static void balance(int bal) throws CustomException{    
	       if(bal < 1000){  
	  
	        // throw an object of user defined exception  
	        throw new CustomException("Balance is low");    
	    }  
	       else {   
	        System.out.println("Rich");   
	        }   
	     }    
}
