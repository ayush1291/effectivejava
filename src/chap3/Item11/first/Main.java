package chap3.Item11.first;

import java.util.HashMap;
import java.util.Map;

//This results in null as hashcode is different
//Collections have a big impace if this happens- they are dependent on equals and hashes

public class Main {
	
	
	public static void main(String[] args) {
		Map<PhoneNumber, String> m = new HashMap<>();
		m.put(new PhoneNumber(1, 2), "Jen");
		System.out.println(m.get(new PhoneNumber(1, 2)));
	}
	
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
