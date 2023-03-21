// ques1. Write a program which takes the values of length and breadth from user and check if it is
//        a square or not.

//import java.util.Scanner;
//public class ifelse
//{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int length = sc.nextInt();
//        int breadth = sc.nextInt();
//        if(length==breadth){
//            System.out.println("square");
//        }else {
//            System.out.println("rectangle");
//        }
//    }
//}





// ques2. Write a program to print absolute value of a number entered by the user.

//import java.util.*;
//public class ques3{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number:-");
//        int num = sc.nextInt();
//        if (num<0){
//            num=num*-1;
//        }
//        System.out.println("the absolute value of num is :-" + num);
//    }
//}





// ques3. Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and
//      calculate Profit or Loss.
//
//import java.util.Scanner;
//public class ques2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter cost price:-");
//        int cost_pice = sc.nextInt();
//        System.out.print("enter selling price:-");
//        int selling_price = sc.nextInt();
//        int profit = selling_price - cost_pice;
//        int loss = cost_pice - selling_price;
//        if (selling_price > cost_pice){
//            System.out.println("profit is :-" + profit);
//        }else{
//            System.out.println("loss is :-" + loss);
//        }
//
//    }
//}





// ques4. Write a program to print positive number entered by the user, if user enters a negative
//number, it is skipped

//import java.util.Scanner;
//public class ques3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        if (num>0){
//            System.out.println("number is:-" +num);
//        }else{
//            System.out.println("number is negative and skipped");
//        }
//    }
//}





// ques5. Create a calculator using switch statement to perform addition, subtraction, multiplication
//and division.

//import java.util.Scanner;
//public class ques5
//{
//    public static void main(String[] args)
//    {
//        char opr;
//        double ans;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter an operator (+,-,*,/) :-");
//        opr = sc.next().charAt(0);
//        System.out.print("enter two number:-");
//        double num1 = sc.nextInt();
//        double num2 = sc.nextInt();
//
//        switch (opr){
//            case '+':
//                ans = num1+num2;
//                System.out.println(num1 + "+" + num2 + "=" +ans);
//                break;
//            case '-':
//                ans = num1-num2;
//                System.out.println(num1 + "-" + num2 + "=" +ans);
//                break;
//            case '*':
//                ans = num1*num2;
//                System.out.println(num1 + "*" + num2 + "=" +ans);
//                break;
//            case '/':
//                ans = num1/num2;
//                System.out.println(num1 + "/" + num2 + "=" +ans);
//                break;
//            default:
//                System.out.println("invalid input");
//                break;
//        }
//    }
//}






// ques6. Write a program to calculate marks to grades . Follow the conversion rule as given below

//import java.util.Scanner;
//public class ques6
//{
//    public static void main(String[] args)
//    {
//        Scanner sc =new Scanner(System.in);
//        System.out.print("enter your marks:-");
//        int marks = sc.nextInt();
//        if (marks>90 && marks<100){
//            System.out.println("your grade is A+");
//        } else if ((marks>80 && marks<90)) {
//            System.out.println("your grade is A");
//        }else if (marks>70 && marks<80){
//            System.out.println("your grade is B+");
//        }else if (marks>60 && marks<70){
//            System.out.println("your grade is B");
//        }else if (marks>50 && marks<60){
//            System.out.println("your grade is C");
//        }else if (marks>40 && marks<50){
//            System.out.println("your grade is D");
//        }else if (marks>30 && marks<40){
//            System.out.println("your grade is E");
//        }else if (marks>0 && marks<30){
//            System.out.println("your grade is E");
//        }
//    }
//}
