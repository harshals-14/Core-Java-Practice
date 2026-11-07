import java.util.Scanner;

public class EvenOdd {

    static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Taking input from the user");

        int result = sc.nextInt();

        if(result % 2 == 0  ) {
            System.out.println( result + " Number is even ");

        }else{
            System.out.println("Number is odd");

        }
    }
}
