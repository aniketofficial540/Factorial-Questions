import java.lang.*;
import java.util.InputMismatchException;
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
        try{
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
        catch (java.util.InputMismatchException e){
            System.out.print("Invalid Input! Please enter the valid Input Integer.");
        }
    }
}
*/

/*
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
*/

/*
//Binary to Decimal
public class practice {

    public static int bin(int num){
        int f_num = 0;
        int rem;
        int i = 0;
        while (num > 0){
            rem = num%10;
            f_num = f_num + rem*(int)Math.pow(2, i);
            num = num/10;
            i++;
        }
        return f_num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Binary Number: ");
        int num = sc.nextInt();

        int result = bin(num);
        System.out.println("The decimal number is: " + result);
    }
}
*/

/*
//Decimal to Binary
public class practice {
    public static int dec(int num){
    int f_num = 0;
    int i = 0;
    int rem;
    while (num > 0){
        rem = num%2;
        f_num = f_num + rem*(int)Math.pow(10, i);
        num = num/2;
        i++;
    }
    return f_num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Decimal Number: ");
        int num = sc.nextInt();

        int result = dec(num);

        System.out.println("The Binary number is: " + result);
    }
  
}
*/
