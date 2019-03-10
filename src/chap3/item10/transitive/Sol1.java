package chap3.item10.transitive;

//This now breaks trnasitive
//One more point, if there is one more class that extends Point and comparison is done like
// c2.equals(c1); - c1 of colorpoint and c2 of smellpoint, then a stackoverflow error

public class Sol1 {
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
			if(!(o instanceof Point)) return false;
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
			if(!(o instanceof Point)) return false;
			//Can cause infinite loop
			if(!(o instanceof ColorPoint)) return o.equals(this);
			ColorPoint p=(ColorPoint)o;
			return super.equals(o) && color==p.color;
		}
	}
}
