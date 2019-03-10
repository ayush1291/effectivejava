package chap3.item10.transitive;

import java.awt.Color;

//This is breaking symmetry

public class Main {
	
	public static void main(String[] args) {
		Point p1 = new Point(1, 2);
		ColorPoint c1 = new ColorPoint(1, 2, 3);
		System.out.println(p1.equals(c1));
		System.out.println(c1.equals(p1));
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
			if(!(o instanceof ColorPoint)) return false;
			ColorPoint p=(ColorPoint)o;
			return super.equals(o) && color==p.color;
		}
	}

}
