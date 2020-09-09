import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        int max1=Math.max(a,b);
        int max2=Math.max(max1,c);
        int min1=Math.min(a,b);
        int min2=Math.min(min1,c);
        return a+b+c-(min2+max2);
    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        int bigger= Math.max(Math.abs(a),Math.abs(b));
        if (bigger== a){
            return a;
        }else if (bigger==-a){
            return a;
        }else{
            return b;
        }

    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        return Math.sqrt(a*a+b*b);
    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        System.out.println(median(1, 2, 3)); // should be 2
        System.out.println(magnitude(-7, -1)); // should be -7
        System.out.println(pythagoras(3, 4)); // should be 5.0

        String med= "median";
        String mag= "magnitude";
        String pyt= "pythagoras";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter function name");
        String funct = scan.nextLine();
        if (funct.equals(med)==true){
            System.out.println("Enter 1st number");
            int first = scan.nextInt();
            System.out.println("Enter 2nd number");
            int second = scan.nextInt();
            System.out.println("Enter 3rd number");
            int third = scan.nextInt();
            System.out.println("The median is " +median(first, second, third));

        }else if (funct.equals(mag)==true){
            System.out.println("Enter 1st number");
            int first = scan.nextInt();
            System.out.println("Enter 2nd number");
            int second = scan.nextInt();
            System.out.println("The number with the larger absolute value is " +magnitude(first, second));

        }else if (funct.equals(pyt)==true){
            System.out.println("Enter 1st number");
            int first = scan.nextInt();
            System.out.println("Enter 2nd number");
            int second = scan.nextInt();
            System.out.println("The c value from the Pythagorean theorem is " +pythagoras(first, second));
        }else{
            System.out.println("The function name you put does not match a function name. Try again.");
        }
    }
}
