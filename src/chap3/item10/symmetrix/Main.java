package chap3.item10.symmetrix;

//Violation of symmetric principle

public class Main {
	
	public static void main(String[] args) {
		
		PositiveInteger inte = new PositiveInteger(2);
		Integer inte2= 2;
		
		System.out.println(inte.equals(inte2));
		System.out.println(inte2.equals(inte));
	}
	
	
	static class PositiveInteger{
		Integer a;
		
		public PositiveInteger(int a) {
			this.a=a;
		}
		
		@Override
		public boolean equals(Object o) {
			if(o instanceof PositiveInteger){
				return this.a.equals(((PositiveInteger)o).a);
			}
			if(o instanceof Integer){
				return this.a.equals((Integer)o);
			}
			return false;
		}
	}

}
