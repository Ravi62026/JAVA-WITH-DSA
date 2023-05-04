// Ques1 - Write a program to print Fibonacci series of n terms where n is input by user.

import java.util.Scanner;
//public class assignment_question_loops
//{
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter value of n:-");
//        int n = sc.nextInt();
//        int a = -1;
//        int b = 1;
//        int sum = a+b;
//        for (int i=1;i<=n;i++){
//            a=b;
//            b=sum;
//            sum=a+b;
//            System.out.print(sum + " ");
//        }
//
//    }
//}




// Ques2 - Write a program to enter the numbers till the user wants, the number can be positive,
//negative or zero. Calculate the sum of numbers until a negative number is encountered.
//If the input is a negative number, current sum is discarded and print -1.


//import java.util.Scanner;
//public class assignment_question_loops {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int sum = 0;
//        while(sc.hasNextInt()){
//            int num = sc.nextInt();
//            if (num >= 0) {
//                sum=sum+num;
//            }
//            else{
//                sum=-1;
//                break;
//            }
//        }
//        System.out.println(sum);
//    }
//}
//




// Ques3- Write a program to calculate the factorial of a number.
//public class assignment_question_loops {
//    public static void main(String[] args) {
//        int fact = 1 ;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the target number:-");
//        int n = sc.nextInt();
//
//        for(int i = 1 ; i <= n ; i++){
//            fact = fact*i;
//        }
//        System.out.println(fact);
//    }
//}


// Ques4 - Write a program to print all Armstrong numbers between 1 to n.

//public class assignment_question_loops {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int num = 1;
//        while (num <= n) {
//            int count = 0;
//            int i = num;
//            while (i > 0) {
//                count++;
//                i /= 10;
//            }
//            int val = num;
//            int sum = 0;
//            while (val > 0) {
//                int digit = val % 10;
//                sum += Math.pow(digit, count);
//                val /= 10;
//                if (sum > val) {
//                    continue;
//                }
//            }
//            if (sum == num) {
//                System.out.println(num + " is armstrong");
//            }
//            num++;
//        }
//    }
//}


// Ques5 - Write a program to print the cross pattern given below (in the shape of X).


//public class assignment_question_loops {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        for(int i = 0 ; i < row ; i++){
//            for(int j = 0 ; j < row ; j ++){
//                if( i == j || i + j == row - 1){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//
//        }
//    }
//}




// Ques6 - Write a program to print alphabet diamond pattern.
//public class assignment_question_loops {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        int alpha = 65;
//        int num = 0;
//        for(int i = 0 ; i < row ; i++){
//            for(int j = 0 ; j < row-i-1 ; j++){
//                System.out.print("  ");
//            }
//            for(int j = 0 ; j < 2*i+1 ; j++){
//                System.out.print((char)(alpha+num++));
//            }
//            num = 0;
//            System.out.println();
//        }
//        for(int i = 1 ; i < row+1 ; i++){
//            for(int j = 0 ; j < i ; j++){
//                System.out.print("  ");
//            }
//            for(int j = 0 ; j < 2*(row-i) - 1 ; j++){
//                System.out.print((char)(alpha+num++));
//            }
//            num = 0;
//            System.out.println();
//
//        }
//    }
//}



// Ques7 - Write a program to print pattern given below.

//public class assignment_question_loops {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        for(int i = 0 ; i < row ; i++){
//            for(int j = 0 ; j < row; j++){
//                if(i == row/2){
//                    System.out.print("*");
//                }else {
//                    if (j == row / 2) {
//                        System.out.print("*");
//                    } else {
//                        System.out.print(" ");
//                    }
//                }
//            }
//            System.out.println();
//        }
//    }
//}










