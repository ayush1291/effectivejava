package chap3.item13;

public class Clone implements Cloneable{
	
	public static void main(String[] args) throws CloneNotSupportedException {
		//Just for reference
		Node a1 = new Node();
		Node b1 = a1;
		System.out.println(a1==b1);
		
		A a = new A();
		A b =a.clone();
		System.out.println(a.objs==b.objs);
		System.out.println(a.a==b.a);
		System.out.println(a.ab==b.ab);
		System.out.println(a.str==b.str);
		
		//For this to work, deep cloing is required
		System.out.println(a.objs[0]==b.objs[0]);
		System.out.println(a.objs[2]==b.objs[2]);
		System.out.println(a.a==b.a);
		
		a.objs[2]=null;
		System.out.println(a.objs[2]==b.objs[2]);
		a.objs=null;
		a.b=null;
		System.out.println(a.objs==b.objs);
		System.out.println(a.b==b.b);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	public static class A implements Cloneable{
		
		Object[] objs= new Object[3];
		Integer a = new Integer(5);
		Node b= new Node();
		Node[] ab = new Node[5];
		String str="abc";
		public A(){
			init();
		}
		
		public void init() {
			objs[0]= new Integer(4);
			objs[1]= "abcd";
			objs[2]=new Node();
			a= new Integer(6);
		}
		
		@Override
		protected A clone() throws CloneNotSupportedException {
			A a = (A) super.clone();
		//	a.objs=objs.clone();
			return a;
		}
	}
	
	public static class Node{
		int a=2;
	}
}
