package chap3.item12;

import java.math.BigInteger;

//Check the documentation for BigInteger toString method, the string can be constructed to object
// if passed directly to it, plus the format of return type is given.

//Static utility classes will have only static utility methods, so no toString is needed

//??- Read why is is not required in enum ?

public class Main {
	
	public static void main(String[] args) {
		BigInteger big = new BigInteger("234");
		System.out.println(big.toString());
		
	}

}
