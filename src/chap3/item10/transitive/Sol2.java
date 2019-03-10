package chap3.item10.transitive;

import chap3.item10.transitive.Sol1.ColorPoint;
import chap3.item10.transitive.Sol1.Point;

//Here, composition is preferred over inheritance
//Now we can extend the Point to create a counterPoint also, but remember, there a value component is not added, if we need it
// consider using compostiion

public class Sol2 {
	
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
	
	static class ColorPoint{
		
		private final int color;
		Point point;
		
		public ColorPoint(int x, int y,int color) {
			point = new Point(x, y);
			this.color=color;
		}
		
		@Override
		public boolean equals(Object o) {
			if(!(o instanceof ColorPoint)) return o.equals(this);
			ColorPoint p=(ColorPoint)o;
			return point.equals(p.point) && color==p.color;
		}
	}

}
