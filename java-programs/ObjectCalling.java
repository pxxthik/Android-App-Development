class ClassA{
    public void sum(){
        System.out.println("The sum of 2 and 3 is: "+ (2+3));
    }
}

class ClassB{
    public void product(){
        System.out.println("The product of 2 and 3 is: "+ 2*3);
    }
}

public class ObjectCalling extends ClassA {
    public static void main(String[] args) {
        ObjectCalling obj1 = new ObjectCalling();
        ClassB obj2 = new ClassB();

        obj1.sum();
        obj2.product();
    }
}
