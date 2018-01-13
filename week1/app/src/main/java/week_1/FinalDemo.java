package week_1;


class check{
	int i=5;
}

public class FinalDemo {
   final  int a=6;
// a=1;final变量不可以改变
   static final int b =7;
   public static final int c=8;
   final int e=(int)(Math.random()*20);  
   static final int f=(int)(Math.random()*20);  
   final check c1=new check();
   static final check c2=new check();  
   public static final check c3=new check();       
   final int[] g = {1,3,4,5,5};

   final static void prt() {  
	   System.out.println(0);
   }
   static void prt(int a  ) { 
	   System.out.println(a);
  }//final方法可重载
 //   abstract final class Final{}	   
      final class Final{
		   final void f1() {	   
	   }
   }  
  // class FinalSon extends Final{//final类不能被其他类继承
  //    final  void f1() {
		   //final方法不能被重写
	//   }
  // }
   public static void main(String[] args) {
	   FinalDemo fd1=new FinalDemo();
	   FinalDemo fd2=new FinalDemo();	   
	   prt(3);
	   prt();	
	   prt(fd1.a);
	   prt(b);
	   prt(c);  	

	  // prt(fd.a++); final基本数据类型不能改变
	   System.out.println("以上单纯测试prt以及验证final基本数据类型不能改变");
	   prt(fd1.e);	  
	   prt(fd1.e);	
	   prt(fd2.e);
	   prt(fd2.e);	//前四行两行两行显示不一样
	   prt(f);  //final基本数据类型不能改变
	   prt(fd1.c1.i+3);//final句柄，所指位置不变，变化的是里面的内容
	   System.out.println(fd1.g);
	   System.out.println(fd1.g);
	   System.out.println(fd2.g);
	   
	   
   }
   
}
