import java.util.Arrays;
import java.util.Collections;

public class Reverse {

    public static void main(String[] args) {
        // 1- reverse the input array

        // System.out.print("length: ");
        // System.out.println(args.length);

        Collections.reverse(Arrays.asList(args));
        // 2- looping and pringting

        // for each object on arguments
        // object => string
        for (String item : args) {
            System.out.println(item);
        }

    }
}
