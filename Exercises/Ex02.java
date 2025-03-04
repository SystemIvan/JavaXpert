import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputText = new Scanner(System.in);
        int i = input.nextInt();
        double d = input.nextDouble();
        String s = inputText.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        inputText.close();
        input.close();

    }
}
