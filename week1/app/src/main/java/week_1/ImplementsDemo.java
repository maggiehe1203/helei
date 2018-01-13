package week_1;

public class ImplementsDemo {
	public static void main(String[] args){
		ImplementsDemo ex=new ImplementsDemo();
		
		Dog bull1=ex.new Dog();
		bull1.fly();
		bull1.run();
		bull1.swim();
	}

	interface CanRun {
	    void run();
	}

	interface CanSwim {
	    void swim();
	}


	interface CanFly {
	    void fly();
	}



	public class Dog implements CanRun,CanFly,CanSwim{

	    public void fly() {
	    	System.out.println("dogs can not fly");
	    }

	    public void swim() {
	    	System.out.println("dogs can not swim");
	    }
	    public void run() {
	    	System.out.println("dogs can run");
	    }
	  
	}


	
}
