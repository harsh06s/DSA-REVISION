public class Main_02{
    public static void fibonacci(int n){
        int a =0;
        int b =1;
        System.out.println(a +"\n" + b);
        int next=0;
        for (int i=0; i<n-2 ; i++){
            next= a+b;
            a=b;
            b= next;
            System.out.println(next);
        }
        
    }
    
    public static void main ( String[] args){
        fibonacci(6);
        
        
    }
}