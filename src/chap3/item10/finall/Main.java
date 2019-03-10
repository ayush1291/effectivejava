package chap3.item10.finall;

public class Main {
	
	static class PhoneNumber{
		private final int x,y;
		
		public PhoneNumber(int x, int y) {
			this.x=x;
			this.y=y;
		}
		
		
		//If you substitue ath with Object, a new overloaded method will be created
		//So, consider using annotation here always
		@Override
		public boolean equals(Object o) {
			//This is done for performance improval
			if(this==o) return true;
			
			//This checks for null values also
			if(!(o instanceof PhoneNumber)) return false;
			
			PhoneNumber p = (PhoneNumber)o;
			return x==p.x && y==p.y;
		}
	}

}
