package chap1.item4;

public class Step2 {
	
	//Provide a private constructor for on instantiability 
	//This beats refection also
	//Also, no subclass can use this also
	private Step2(){
		throw new AssertionError();
	}
	
	public static void main(String[] args) {
		
	}

}
