//  public class Main_02{
//    public static void fibonacci(int n){
//        int a =0;
//        int b =1;
//        System.out.println(a +"\n" + b);
//        int next=0;
//        for (int i=0; i<n-2 ; i++){
//            next= a+b;
//            a=b;
//            b= next;
//            System.out.println(next);
//        }
        
//    }
    
//    public static void main ( String[] args){
//        fibonacci(6);
        
        
//    }
// } 

// day 3 =======================================================================================
// public class Main_02 {
//     public static void main(String[] args) {
//         int size = 5; // Change this value to adjust the size of the square

//         // Outer loop for rows
//         for (int i = 1; i <= size; i++) {
//             // Inner loop for columns
//             for (int j = 1; j <= size; j++) {
//                 System.out.print("* ");
//             }
//             // Move to the next line after each row is printed
//             System.out.println();
//         }
//     }
// }




// Day 4 ===========================================================================================

// public class Main_02{
//     public static void main(String[] args){
//         int n = 5;
//         int m = 4;
//         for (int j=1; j<=m; j++ ){
//            // if (j==1 || j==m){
//         for(int i=1; i<=n ; i++){
//             if(i==1||i==n||j==1||j==m){
//             System.out.print("*");
        
        
//             }
//             else {
//                 System.out.print(" ");
//             }
//         }
        

//             System.out.println();
//         }
//     }
// }



//import java.util.*;

// public class Main_02 {
//     public static void main(String[] args){
//         int n=4;
//         for (int i=1; i<=n;i++){
//             for (int j=1 ; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }






// public class Main_02{
//     public static void main(String[] args){
//         int n =4;
//         for (int i = n; i>=1; i--){
//             for (int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// Day 5 ==========================================================================================

// import java.util.*;

// public class Main{
//     public static void main(String [] args){
//         int n= 5;
//         for(int i=1; i<=n; i++){
//             for (int j=1; j<=i; j++){
//                 System.out.print(j);
//             }System.out.println();
            
//         }
        
       
//     }
// }




// public class Main_02{
//     public static void main(String [] args){
        
//         int n =4;
//         for (int i=1; i<=n; i++){
//             for (int j=1; j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for (int j=1; j<=i; j++){
//                 System.out.print("*");
//             }System.out.println();
            
//         } 
        
       
//     }
// }





// public class Main_02{
//     public static void main(String[] args){
//         int n=5;
//         for (int i=n; i>=1; i--){
//             for (int j=1 ; j<=i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }





// public class Main_02{
//     public static void main(String[] args){
//         int n=5;
//         int count=0;
//         for (int i=1; i<=n; i++){
            
//             for(int j =1; j<=i; j++){
//                  count =count+1;
//                 System.out.print(count+" ");
                
//             }
//             System.out.println();
//         }
//     }
// }