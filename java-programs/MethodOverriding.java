class BaseClass{
    public void show(){
        System.out.println("Iam parent class function");
    }
}

class InheritedClass extends BaseClass{
    @Override
    public void show(){
        System.out.println("Iam Inherited class function");
    }
}

public class MethodOverriding {
    public static void main(String[] args){
        BaseClass baseClassObj = new BaseClass();
        baseClassObj.show();

        BaseClass inheritedCLassObj = new InheritedClass();
        inheritedCLassObj.show();
    }
}
