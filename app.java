public class HelloWorld {
    public static void main(String[] args) {
        // This line prints "Hello, World!" to the console.
        System.out.println("Hello, World!"); 
    }
}

//Adding some other code 
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        // Creates a reader instance which takes
        // input from standard input - keyboard
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // nextInt() reads the next integer from the keyboard
        int number = reader.nextInt();

        // println() prints the following line to the output screen
        System.out.println("You entered: " + number);
    }
} 
