import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        //Given an integer,n, perform the following conditional actions:
        //If n is odd, print Weird
        //If n is even and in the inclusive range of  to , print Not Weird
        //If n is even and in the inclusive range of  to , print Weird
        //If n is even and greater than n , print Not Weird
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (n % 2 == 1) {
            System.out.println("Weird");
        } else if (n <= 5 && n >= 2) {
            System.out.println("Not Weird");
        } else if (n >= 6 && n <= 20) {
            System.out.println("Weird");
        } else if (n > 20) {
            System.out.println("Not Weird");
        }
        input.close();

    }
}
