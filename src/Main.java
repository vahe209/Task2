import java.util.Scanner;
import java.util.InputMismatchException;
import static java.lang.Integer.parseInt;

public class Main  {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Your Name");
        String a1 = sc.nextLine();
        System.out.println("How old are you?");
        int a2 = sc.nextInt();
        boolean isString = false;
        try {
            int i = parseInt(a1);
        } catch (NumberFormatException ex) {
            isString = true;
        }


        Student student1 = new Student(a1, a2);
        if (isString) {
            System.out.println("My name is " + student1.getName() + ", I'm " + student1.getYear());
        } else {
           throw new InputMismatchException("In name field you can't write numbers");
        }
    }
}
