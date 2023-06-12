import java.util.ArrayList;

public class ForForEachLoop {
    public static void main(String[] args) {
        // For loop
        for(int i=0; i<100; i++){
            System.out.println(i);
        }

        ArrayList<String> names = new ArrayList<>();
        names.add("Name1");
        names.add("Name2");
        names.add("Name3");
        names.add("Name4");

        // For Each Loop
        for (String item : names) {
            System.out.println(item);
        }
    }
}
