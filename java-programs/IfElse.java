public class IfElse {
    public static void main(String[] args) {
        int number = 100;
        if(number <= 100){
            System.out.println("Number is less than or equal to 200");
        }

        if(!(number <= 100)){
            System.out.println("True statement");
        }else{
            System.out.println("False statement");
        }

        int age = 19;
        if(age<6){
            System.out.println("Go and play");
        }else if(age>=6 && age <= 18){
            System.out.println("You cant drive");
        }else{
            System.out.println("You can drive");
        }

        int marks = 95;
        switch (marks) {
            case 95:
                System.out.println("95 condition");
                break;
            case 90:
                System.out.println("90 condition");
                break;
            case 70:
                System.out.println("70 condition");
                break;
        
            default:
                System.out.println("Default statement");
                break;
        }
    }
}
