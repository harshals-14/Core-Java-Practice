import java.util.Scanner;

public class LargestOfThree{

   public  static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.println("Taking three numbers as input from the user");

       System.out.println("Enter the first number");
       int a = sc.nextInt();

       System.out.println("Enter the second number");
       int b = sc.nextInt();

       System.out.println("Enter the Third number");
       int c = sc.nextInt();

       if (a >= b && a >= c) {
           System.out.println(a + "is the maximum");
       } else if (b >= c) {
           System.out.println(b + "is the maximum");

       } else
           System.out.println(c + "is the maximum");
   }}

//2nd approch i.e a King of the Hill
//The "King of the Hill" approach assumes the first number is the current leader, then challenges that leader with each remaining number one by one.
//       int a = 15;
//       int b = 42;
//       int c = 27;
//
//// Step 1: Assume 'a' is the initial champion on the hill
//       int largest = a;
//
//// Step 2: Challenge the leader with 'b'
//       if (b > largest) {
//           largest = b; // 'b' takes over the hill
//       }
//
//// Step 3: Challenge the leader with 'c'
//       if (c > largest) {
//           largest = c; // 'c' takes over the hill
//       }
//
//       System.out.println("Largest number is " + largest);
//
//
//   }
//}
