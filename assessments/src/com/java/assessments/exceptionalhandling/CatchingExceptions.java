package com.java.assessments.exceptionalhandling;
/*2)	(Catching Exceptions with Superclasses) 
 * Use inheritance to create an exception superclass (called ExceptionA)
 *  and exception subclasses ExceptionB and ExceptionC, 
 *  where ExceptionB inherits from ExceptionA and ExceptionC 
 *  inherits from ExceptionB. Write a program to demonstrate that 
 *  the catch block for type ExceptionA catches exceptions of types 
 *  ExceptionB and ExceptionC.
 * 
 */
public class CatchingExceptions {
	public static void main(String args[]) {
		try {
			throw new ExceptionB();
		} catch(ExceptionA e) {
			e.printStackTrace();
			//System.out.println("ExceptionB is catched in ExceptionA");
		
		}
		
		  try { 
			  throw new ExceptionC(); 
		  } 
		  catch(ExceptionA e) {
		  e.printStackTrace();
			  //System.out.println("ExceptionC is catched in ExceptionA" );
		  }
		 
	}
}
