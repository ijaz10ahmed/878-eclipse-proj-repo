package com.Demo3;

public class PinLengthCheckException extends Exception{
	public PinLengthCheckException(String pin) {
		System.out.println("Length of pin should be 4");
	}
}
