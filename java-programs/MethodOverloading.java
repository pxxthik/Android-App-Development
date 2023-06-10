public class MethodOverloading {
    public int add(int a, int b){
        return a+ b;
    }
    public int add(int a, int b, int c){
        return a+ b+ c;
    }

    public static void main(String[] args){

        MethodOverloading obj = new MethodOverloading();

        int sumOfTwoNumbers = obj.add(10, 20);
        int sumOfThreeNumbers = obj.add(100, 200, 300);

        System.out.println("Sum of Two numbers: "+ sumOfTwoNumbers);
        System.out.println("Sum of Three numbers: "+ sumOfThreeNumbers);
    }
}
