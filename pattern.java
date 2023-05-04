import java.util.Scanner;


//  "i" DENOTED THE ROW IN WHOLE PATTERN QUESTION
//  "j" DENOTED THE COLUMN IN WHOLE PATTERN QUESTION


public class pattern {
    public static void main(String[] args) {
        // int row ;
        // // int col ;
        // Scanner sc = new Scanner(System.in);
        // row = sc.nextInt();
        // col = sc.nextInt();

        // triangular pattern  or half pyramid

        // for(int i = 0 ; i < row ; i++){
        //     for(int j = 0 ; j <= i ; j++){
        //         System.out.print("* ");
        //     }

        // solid rectangle

        // for(int i = 0 ; i < row ; i++){
        //     for(int j = 0 ; j < col ; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // hollow rectangle

        // for(int i = 0 ; i < row ; i++) {
        //     for(int j = 0 ; j < col ; j++){
        //         if(i==0 || i==row-1 || j==0 || j==col-1){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
    // }
// }
        // inverted half pyramid
        // for(int i = 0 ; i < row ; i++){
        //     for(int j = 0 ; j < row-i ; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
            
        // }

        // numeric half pyramid

        // for(int i = 0 ; i < row ; i++){
        //     for(int j = 0 ; j <= i ; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // numeric half pyramid

        // for(int i = 0 ; i < row ; i++){
        //     for(int j = 0 ; j <= i ; j++){
        //         System.out.print(j+1 +" " );
        //     }
        //     System.out.println();
        // }

        // numeric inverted half pyramid

        // for(int i = 0 ; i < row ; i++){
        //     for(int j = 0 ; j < row-i ; j++){
        //         System.out.print(j+1 +" ");
        //     }
        //     System.out.println();
        // }

        // full pyramid

        // for(int i = 0 ; i < row ; i++){
        //     for(int j = 0 ; j < row-i-1 ; j ++){
        //         System.out.print("  ");
        //     }
        //     for(int j = 0 ; j < 2*i+1 ; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //  pyramid

        // for(int i = 0 ; i < row ; i++){
        //     for(int j = 0 ; j < row-i-1 ; j ++){
        //         System.out.print("  ");
        //     }
        //     for(int j = 0 ; j < i+1 ; j++){
        //         System.out.print("*  ");
        //     }
        //     System.out.println();
        // } 
        
        //  inverted pyramid
        
        // for(int i = 0 ; i < row ; i++){
        //     //  print spaces
        //     for(int j = 0 ; j < i ; j ++){
        //         System.out.print(" ");
        //     }
        //     //  print star
        //     for(int j = 0 ; j < row-i ; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //   full diamond

        //  for(int i = 0 ; i < row ; i++){
        //      for(int j = 0 ; j < row-i-1 ; j ++){
        //          System.out.print(" ");
        //      }
        //      for(int j = 0 ; j < i+1 ; j++){
        //          System.out.print("* ");
        //      }
        //      System.out.println();
        //  } 
        // for(int i = 0 ; i < row ; i++){
        //     //  print spaces
        //     for(int j = 0 ; j < i ; j ++){
        //         System.out.print(" ");
        //     }
        //     //  print star
        //     for(int j = 0 ; j < row-i ; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        //  Hollow diamond

        // for(int i = 0 ; i < row ; i ++){
        //     for(int j = 0 ; j < row-i-1 ; j ++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 0 ; j < 2*i+1 ; j ++){
        //         if(j==0){
        //             System.out.print("*");
        //         }
        //         else if(j==2*i){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        // for(int i = 0 ; i < row ; i++){
        //     for(int j = 0 ; j < i ; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 0 ; j < 2*row-2*i-1 ; j++){
        //         if(j == 0 || j == 2*row-2*i-2){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // flipped solid diamond

        // for(int i = 0 ; i < row ; i++){
        //     // half pyramid
        //     for(int j = 0 ; j < row-i ; j++){
        //         System.out.print("*");
        //     }

        //     // spaces wala ful pyramid
        //     for(int j = 0 ; j <2*i+1 ; j++){
        //         System.out.print(" ");
        //     }

        //     //  half pyramid

        //     for(int j = 0 ; j <row-i ; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        // for(int i = 0 ; i < row ; i++){
        //     // half pyramid
        //     for(int j = 0 ; j <= i ; j++){
        //         System.out.print("*");
        //     }

        //     // spaces wala ful pyramid
        //     for(int j = 0 ; j < 2*row-2*i-1 ; j++){
        //         System.out.print(" ");
        //     }

        //     //  half pyramid

        //     for(int j = 0 ; j <= i ; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // fancy pattern

        // for(int i = 0 ; i < row ; i++){
        //     for(int j = 0 ; j <= i ; j++){
        //         System.out.print(i+1);
        //         if(j!=i){
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int i = 0 ; i < row ; i++){
        //     for(int j = 0 ; j < row-i ; j++){
        //         System.out.print(row-i);
        //         if(j!=row-i-1){
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }

        
        // for(int i=0;i<row;i++){
        //     // int j;
        //     for(int j = 0 ; j<=i ; j++){
        //         System.out.print(j+1);
        //     }
        //     // j=j-1;
        //     // System.out.println();
        //     for(int j = i; j>=1 ; j--){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // numeric full pyramid

        // for(int i = 0 ; i < row ; i++){
        //     // spaces

        //     for(int j = 0 ; j< row-i-1 ; j++){
        //         System.out.print(" ");
        //     }
        //     // numbers

        //     for(int j = 0 ; j < i+1 ; j++){
        //         System.out.print(i+j+1);
        //     }
            
        //     // reverse number
        //     int start = 2*i;
        //     for(int j = 0 ; j < i ; j++){
        //         System.out.print(start);
        //         start--;
        //     }
        //     System.out.println();
        // }


        //  numeric hollow pyramid
        //  lengthy

        // for(int i = 0 ; i < row ; i++){
        //     // spaces
        //     for(int j = 0 ; j < row-i-1 ; j++){
        //         System.out.print(" ");
        //     }
        //     // number with spaces in between
        //     int start = 1;
        //     for(int j = 0 ; j < 2*i+1 ; j++){
        //         // first row or last row
        //         if(i == 0 || i == row-1){
        //             if(j % 2 == 0){
        //                 // even
        //                 System.out.print(start) ;
        //                 start++;
        //             }
        //             else{
        //                 // odd
        //                 System.out.print(" ");
        //             }
        //         }
        //         else{
        //             // first col
        //             if(j == 0){
        //                 System.out.print(1);
        //             }
        //             else if(j == 2*i+1-1){
        //                 System.out.print(i+1);
        //             }
        //             else{
        //                 System.out.print(" ");
        //             }
        //         }
        //     }
        //     System.out.println();
        // }


        // int a=5;
        // ++a;
        // System.out.println(a);
        // int b =5;
        // b++;
        // System.out.println(b);

        
        

    }
}