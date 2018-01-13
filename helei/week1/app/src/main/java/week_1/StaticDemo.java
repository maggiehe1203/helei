package week_1;
//done
public class StaticDemo {
	static int a=0;
	int b=1;
	
	static {
		System.out.println(a); //最先输出
	//	System.out.println(b); 静态块里不能调用非静态成员
		
	}
	
	static void add1() {
		a++;
		StaticDemo s1=new StaticDemo();
		s1.b++;
		System.out.print(a+" ");
		System.out.println(s1.b);	
	}
	
	 void add2() {
		a++;
		b++;
		System.out.print(a+" ");
		System.out.println(b);	
	}
	
	static class  Print1{
		void add3() {
			a++;
			StaticDemo s1=new StaticDemo();
			s1.b++;
			System.out.print(a+" ");
			System.out.println(s1.b);	
		}
	}
	
	
	class Print2 {
		void add4() {
		a++;
		b++;
		System.out.print(a+" ");
		System.out.println(b);	
	}
	}	
	public static void main(String[] args) {
		add1();
		add1();//静态方法中，非静态成员依赖实例
		StaticDemo p=new StaticDemo();
		p.add2();
		p.add2();//非静态方法依赖实例
		Print1 print1=new Print1();//静态内部类直接实例
		print1.add3();
		Print2 print2=p.new Print2();//非静态类依赖实例
		print2.add4();
	}
	

}
