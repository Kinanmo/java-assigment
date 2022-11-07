
import java.util.ArrayList;
import java.util.List;

/*
 * 
 * javac Lotto.java &&  java Lotto 6 49
 * n = number of choices (6)
 * m = max number (49)
 */

public class Lotto {

    public static void main(String[] args) {

        // checking for false input
        if (args.length != 2) {
            System.out.println("Please insert proper input!");
            System.exit(0);
        }

        // input
        // number of choices
        Integer n = Integer.parseInt(args[0]);
        // max number
        Integer m = Integer.parseInt(args[1]);

        // validate input
        if (n < 1 || m < 1 || n > m) {
            System.out.println("Please insert proper input!");
            System.exit(0);
        }
        // we have valid n and m

        // create an empty list to store unique numbers
        List<Long> list = new ArrayList<Long>();

        // stop when the list is complete
        while (list.size() < n) {
            double randomDouble = Math.random() * m; // random 0=>1 0.11 0.21 0.91
            Long randomInteger = Math.round(randomDouble);

            System.out.println(randomInteger);

            // avoid duplication
            if (!list.contains(randomInteger)) {
                list.add(randomInteger);
            }

        }
        // we have a unique list
        System.out.println(list);

    }

}
