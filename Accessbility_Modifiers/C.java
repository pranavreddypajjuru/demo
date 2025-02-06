package p2;
import p1.A;
class C extends A 
{
	public static void main(String[] args)
	{
	A a = new A();
   //System.out.println("a:"+a.a);
   //System.out.println("b:"+a.b);
   //System.out.println("c:"+a.c);
	System.out.println("d:"+a.d);
	
	C c1 = new C();
//  System.out.println("a:"+c1.a);
//	System.out.println("b:"+c1.b);
	System.out.println("c:"+c1.c);
	System.out.println("d:"+c1.d);
	}
}
