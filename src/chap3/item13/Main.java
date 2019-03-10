package chap3.item13;

//Chck the clone method in Object class...its a native method
//If we try to call, clone without cloneable, error is throwm 
//Type casted clone method to return the specific type

public class Main implements Cloneable{
	
	@Override
	protected Main clone() throws CloneNotSupportedException {
		return (Main) super.clone();
	}
	 

}
