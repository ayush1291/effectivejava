package chap3.item13;

public class Step3 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		A a = new B();
		a.clone();
		
	}
	
	static class A implements Cloneable{
		int a =3;
		
		@Override
		protected Object clone() throws CloneNotSupportedException {
			do1();
			return super.clone();
		}
		
		public void do1(){
			System.out.println("THis is A");
		}
	}
	
	static class B extends A implements Cloneable{
		int b =8;
		
		@Override
		protected Object clone() throws CloneNotSupportedException {
			return super.clone();
		}
		
		@Override
		public void do1() {
			System.out.println("this is B");
		}
	}

}
