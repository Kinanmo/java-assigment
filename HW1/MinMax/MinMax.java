
public class MinMax {

    public static void main(String[] args) {

        // checking for false input
        if (args.length == 0) {
            System.out.println("Please insert proper input!");
            System.exit(0);
        }

        // declaration max and min
        Integer max = -999;
        Integer min = 999;

        // looping over the items
        for (String item : args) {
            // read the string as an integer (parsing)
            Integer number = Integer.parseInt(item);

            // comparing/updating the max value
            if (number > max)
                max = number;

            if (number < min)
                min = number;
        }

        System.out.println(min);
        System.out.println(max);

    }
}
