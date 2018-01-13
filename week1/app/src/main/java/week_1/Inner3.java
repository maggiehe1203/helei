package week_1;

abstract class Destination {



    abstract String readlabel();
}

/*
 * 局部内部类 public class Inner3 {
 *
 * public Destination des() {
 * class PDestination implements Destination{
 * public String readlabel() {
 * System.out.println("jhjkh"); return "jhjkh";
 * }
 *
 * }
 * return new PDestination(s);
 *  }
 *
 * public static void main(String[] args){
 *  Inner3 in=new Inner3();
 *  Destinationd=in.des();
 *  d.readlabel();
 *
 * } }
 */
//匿名内部类
public class Inner3 {
    public Destination des() {
        return new Destination() {
            public String readlabel() {
                System.out.println("jhjkh");
                return "jhjkh";
            }
        };
    }
    public static void main(String[] args) {
        Inner3 in = new Inner3();
        Destination d = in.des();
        d.readlabel();

    }
}