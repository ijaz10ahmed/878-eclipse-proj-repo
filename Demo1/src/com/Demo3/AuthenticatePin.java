package com.Demo3;
import java.util.Scanner;
public class AuthenticatePin {
	
	static void checkpinnumber(String pinnumber) throws PinLengthCheckException
	{
		if (pinnumber.length()!=4)
		{
			throw new PinLengthCheckException(pinnumber);	
		}
	}
	public static void main(String[] args) throws PinLengthCheckException {
		String pinumber;
		pinumber = "231651";
		try
		{
		checkpinnumber(pinumber);
		}
		catch(PinLengthCheckException ex)
		{
			System.out.println("please enter length as 4 digits");
		}
	}
}
