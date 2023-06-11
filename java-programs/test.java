import myPackage.Inheritance;

public class test extends Inheritance {
    public static void main(String[] args){
        System.out.println("Hello world");
        test o = new test();
        System.out.println(o.operation(200, 300));
        System.out.println(o.multiplication(200, 300));
    }
}
