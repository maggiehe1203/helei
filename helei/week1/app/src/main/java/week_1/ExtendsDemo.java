package week_1;

public class ExtendsDemo {
	public static void main(String[] args){
	ExtendsDemo ex=new ExtendsDemo();
	
	Bulldog bull1=ex.new Bulldog();
	bull1.run();
	bull1.appearance();
}
	
	abstract class Animal{
		abstract void run();
	}
	
	abstract class Dog extends Animal{
		abstract void run();
		abstract void appearance();
	}
	
	class Bulldog extends Dog{
		 void run(){
			 System.out.println("Bulldog runs fast");}
		 void appearance(){
			 System.out.println("Bulldog looks ugly");
		 }
		
	}
	
	
	

}
