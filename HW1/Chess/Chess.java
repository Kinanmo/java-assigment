
public class Chess {

    public static void main(String[] args) {

        // checking for false input
        if (args.length == 0) {
            System.out.println("Please insert proper input!");
            System.exit(0);
        }

        // parse the string to int
        Integer n = Integer.parseInt(args[0]);

        // loop
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        }

    }

}