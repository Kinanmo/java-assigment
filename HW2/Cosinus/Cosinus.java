/*
 * 
 * javac Cosinus.java &&  java Cosinus 1 
 * 
 */

public class Cosinus {

    public static void main(String[] args) {

        // checking for false input
        if (args.length == 0) {
            System.out.println("Please insert proper input!");
            System.exit(0);
        }

        // input
        double x = Double.parseDouble(args[0]);
        // output
        double cosinusSum = 0.0;

        // formula generation
        for (int n = 0; n < 11; n++) {

            // to cover Math.Power (-1,n)
            double a = -1;
            for (int i = 0; i <= n; i++) {
                a = a * -1;
            }

            // to cover factorial

            long b = (2 * n);
            if (b == 0)
                b = 1;
            for (int j = 1; j < (2 * n); j++) {
                b = b * j;
            }

            // to cover Math.Power (x,2n)
            double c = x;
            for (int i = 0; i < (2 * n); i++) {
                c = x * c;
            }

            // System.out.println(a);
            // System.out.println(b);
            // System.out.println(c);
            // System.out.println(cosinusSum);

            cosinusSum = cosinusSum + (a * c) / b;
        }

        System.out.println("manual cosine x");
        System.out.println(cosinusSum);

        System.out.println("built in cosine x");
        System.out.println(Math.cos(x));

    }

}
