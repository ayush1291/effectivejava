package chap3.item10.transitive;

//This solves the problem but breaks Liskov substitution - a Point is still a point

//If we pass a point which does not add any value component like below, which maintains a count, 
//and if we use contains method in a collection having a Point with a new CoounterPoint, then it will return false


//CounterPoint extends Point{
//	static AtomicInteger counter;
//	
//}



public class Sol1_5 {
	
	public static void main(String[] args) {
		ColorPoint c2 = new ColorPoint(1, 2, 6);
		Point p1 = new Point(1, 2);
		ColorPoint c1 = new ColorPoint(1, 2, 3);
		
		//Check for symm
		System.out.println(p1.equals(c1));
		System.out.println(c1.equals(p1));
		
		//Check for trnasitive
		System.out.println(c2.equals(p1));
		System.out.println(p1.equals(c1));
		System.out.println(c2.equals(c1));
	}
	
	
	
	static class Point{
		private final int x;
		private final int y;
		
		public Point(int x, int y) {
			this.x=x;
			this.y=y;
		}
		
		@Override
		public boolean equals(Object o) {
			if(o!=null && o.getClass()!=getClass()) return false;
			Point p = (Point)o;
			return x==p.x && y==p.y;
		}
	}
	
	static class ColorPoint extends Point{
		private final int color;
		
		public ColorPoint(int x, int y,int color) {
			super(x,y);
			this.color=color;
		}
		
		@Override
		public boolean equals(Object o) {
			if(o!=null && o.getClass()!=getClass()) return false;
			ColorPoint p=(ColorPoint)o;
			return super.equals(o) && color==p.color;
		}
	}

}
