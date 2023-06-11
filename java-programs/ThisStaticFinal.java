final class FinalClass{
    // This class cant be inherited
}

class ThisStaticFinal{
    int a;
    static int counter = 0;

    final int var = 50;
    // var = 60 this will throws an error

    ThisStaticFinal(){
        counter++;
        System.out.println("Value of counter is: "+ counter);
    }

    public void setA(int a){
        this.a = a;
        System.out.println("Value of a is: "+ this.a);
    }

    final void greet(){
        // This method cant be overrided
        // final method can be inherited but cant be overrided
        System.out.println("Good Morning");
    }

    public static void main(String[] args) {

        System.out.println(counter);

        ThisStaticFinal obj1 = new ThisStaticFinal();
        ThisStaticFinal obj2 = new ThisStaticFinal();
        ThisStaticFinal obj3 = new ThisStaticFinal();

        obj1.setA(10);
        obj2.setA(10);
        obj3.setA(10);
    }
}