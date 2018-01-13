package week_1;

public class Inner1 {
    int i=1;
    int j=2;
    public static void outer1() {

    }

    public void outer2() {

    }

    protected  class Inner{
        // static int j=0;内部类内不申明静态变量
        int i=2;

        void in1(){
            System.out.println(i);
            System.out.println(this.i);//inner.i
            System.out.println(Inner1.this.i);//外部的i
            System.out.println(j);
            outer1();
            outer2();//上三行不重复直接用外部
        }
    }

    public void out3() {
        Inner i1=new Inner();
        i1.in1();
    }//外部非静态方法直接实例内部类

    public static void out4() {
        Inner1 o1=new Inner1();
        Inner i1=o1.new Inner();
        i1.in1();
    }//外部静态方法内部类实例依赖外部类实例

    public static void main(String[] args) {
        Inner1 in=new Inner1();
        in.out3();//

        out4();
    }

}