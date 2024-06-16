import java.lang.*;
import java.util.Scanner;

/*

finding product
public class practice {

    //function for findng the product of two number
    public static int product(int a, int b){
        int c = a * b;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd number: ");
        int num2 = sc.nextInt();

        int result = product(num1, num2);

        System.out.println("The product is: " + result);
    }
}
*/


/*

//factorial
public class practice {
    public static int fact(int num){
        int result = 1;
        if (num == 0 ){
            return 1;
        }
        else if (num == 1){
            return 1;
        }
        else {
            for (int i = 1; i <=num ; i++){
                result = result * i;
            }
            return result;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int result = fact(num);

        System.out.println("The factorial of " + num + " is " + result);
    }    
}

*/

/*
//checking prime or not

public class practice {
    public static int prime(int num) {
        if (num <= 1) {
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();
         
        int result = prime(num);

        if (result == 1) {
            System.out.println(num + " is a prime number");
        } 
        else {
            System.out.println(num + " is not a prime number");
        }
    }
}
*/


// prime in range
public class practice {
    public static int prime(int num) {
        if (num <= 1) {
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the starting number: ");
        int snum = sc.nextInt();
         
        System.out.println("Enter the end number: ");
        int endnum = sc.nextInt();

        for (int i = snum; i <= endnum; i++){
            if (prime(i) == 1){
                System.out.println(i + " is a prime number");
            }
        }
    }
}

