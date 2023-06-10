class EncapTest{
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}

public class Encapsulation{
    public static void main(String[] args){
        EncapTest obj = new EncapTest();
        obj.setName("James");
        obj.setAge(56);

        System.out.println("The name is "+ obj.getName()+ " and age is "+ obj.getAge());
    }
}