package chap3.item10;


//Does == for 2 objects
//Check out String class equals method, follows all practices
public class GeneralWayOfEqualsBehaviour {
	
	
	
	public static void main(String[] args) {
		Emp emp = new Emp(2);
		Emp emp2 = new Emp(2);
		System.out.println(emp.equals(emp2));
	}

	static class Emp{
		int a=0;
		private Emp(int a) {
			
		}
	}
}
