package week_1;

public class ExtendsDemo2 {
	
	public static void main(String[] args){
		Son s=new Son();
		System.out.println(s.sonStrong());
		System.out.println(s.sonCare());		
	}
	
}
class Father{
	public int strong(){
		return 8;
	}
}
class Mother{
	public int care(){
		return 11;
	}
}
class Son{
	class SonFromF extends Father {
		public int strong(){
	
			return super.strong()+3;
		}
	}
	class SonFromM extends Mother {
		public int care(){
			return super.care()-3;
		}
	}
	
	public int sonStrong(){
		  return new SonFromF().strong();
		
	}
	
	public int sonCare(){
		 return new SonFromM().care();
	}
}