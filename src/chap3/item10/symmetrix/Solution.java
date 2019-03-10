package chap3.item10.symmetrix;

public class Solution {
	
	public static void main(String[] args) {
		PositiveInteger inte = new PositiveInteger(2);
		PositiveInteger inte3 = new PositiveInteger(2);
		Integer inte2= 2;
		
		System.out.println(inte.equals(inte2));
		System.out.println(inte2.equals(inte));
		System.out.println(inte.equals(inte3));
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
			
			//THis is to be removed
//			if(o instanceof Integer){
//				return this.a.equals((Integer)o);
//			}
			return false;
		}
	}


}
