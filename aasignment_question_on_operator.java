////Q1 - Write a program to add 8 to the number x and then divide it by 3. Now, the modulus of the quotient
////is taken with 5 and then multiply the resultant value by 5. Display the final result.
//
////import java.util.Scanner;
////public class aasignment_question_on_operator
////{
////    public static void main(String[] args)
////    {
////        Scanner sc = new Scanner(System.in);
////        int x = sc.nextInt();
////        // add 8 to x
////        int sum = 8 + x;
////        // divide sum by 8
////        int div = sum / 3;
////        // modulus of quetient by 5
////        int mod = div % 5;
////        // multiply mod by 5
////        int result = mod * 5;
////        System.out.println("result = " + result);
////    }
////}




////Q2 - Swap two numbers without the use of third variable.
//
//import java.util.Scanner;
//public class aasignment_question_on_operator
//{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();  //10
//        int y = sc.nextInt();  //5
//
//        //swap x and y
//
//        x=x+y;
//        y=x-y;
//        x=x-y;
//        System.out.println(x);
//        System.out.println(y);
//
//    }
//}




//Q - Write a program to calculate the sum of the digits of a 3-digit number.

import org.w3c.dom.ls.LSOutput;

//import java.util.Scanner;
//public class aasignment_question_on_operator {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();  // 123
//        int sum = 0;
//        while(x>0)
//        {
//            int t = x % 10;
//             sum+= t ;
//             x = x / 10;
//        }
//        System.out.println(sum);
//    }
//}




//Q4 - Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if:
//  i) both the conditions 'a < 50' and 'a < b' are true.
//  ii) at least one of the conditions 'a < 50' or 'a < b' is true.

//1.
//import java.util.Scanner;
//public class aasignment_question_on_operator {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();  // 55
//        int b = sc.nextInt();  // 70
//
//        System.out.println(a < 50 && a < b);
//    }
//}


//2.
//import java.util.Scanner;
//public class aasignment_question_on_operator {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();  // 55
//        int b = sc.nextInt();  // 70
//
//        System.out.println(a < 50 || a < b);
//    }
//}



//Q5 - Find the total number of bits needed to be flipped to convert x to y.

//import java.util.Scanner;
//public class aasignment_question_on_operator {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();  // 65
//        int b = sc.nextInt();  // 80
//        int x = a^b;
//        int count = 0;
//        while(x!=0){
//            x = x & (x-1);
//            count ++;
//        }
//        System.out.println(count);
//    }
//}








