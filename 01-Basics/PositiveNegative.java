import java.util.Scanner;

public class PositiveNegative {

    //Let's consider 0 at the middle of  line
    // to the left of zero numbers are negetive
    //number  right to the  0 are positive
    //using if ..else if ..else ladder for checking multiple conditions

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Taking input from the user");

        int result = sc.nextInt();

        if(result > 0 )
            System.out.println("Number is positive");

        else if(result < 0)
            System.out.println("Number is negetive");

        else
            System.out.println("Number is zero");


    }
}
