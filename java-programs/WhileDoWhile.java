public class WhileDoWhile {
    public static void main(String[] args) {
        int a = 5;
        while(a<10){
            System.out.println(a+ " is less than 10");
            a++;
        }

        int b = 0;
        do{
            System.out.println("do while loop"+ b);
            b++;
        }while(b < -100);
    }
}
