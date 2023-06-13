import java.util.Arrays;

public class StringOperations {
    public static void main(String[] args) {
        String name = "Your_name";
        System.out.println("Length of name is "+ name.length());
        System.out.println(name.equals("name"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.concat(" is my_name"));
        System.out.println(name.substring(4,6));

        String[] arr = name.split("_");
        System.out.println(Arrays.toString(arr));

        System.out.println(name);
    }
}
