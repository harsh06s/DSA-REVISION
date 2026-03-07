 //public class Main_02{
 //   public static void fibonacci(int n){
 //       int a =0;
 //       int b =1;
 //       System.out.println(a +"\n" + b);
 //       int next=0;
 //       for (int i=0; i<n-2 ; i++){
 //           next= a+b;
 //           a=b;
 //           b= next;
 //           System.out.println(next);
 //       }
        
 //   }
    
 //   public static void main ( String[] args){
 //       fibonacci(6);
        
        
//    }
// } 

// day 3 =======================================================================================
public class Main_02 {
    public static void main(String[] args) {
        int size = 5; // Change this value to adjust the size of the square

        // Outer loop for rows
        for (int i = 1; i <= size; i++) {
            // Inner loop for columns
            for (int j = 1; j <= size; j++) {
                System.out.print("* ");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}