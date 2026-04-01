
import java.util.Scanner;

public class Prefix{


    static void printArray(int[] arr) {
    
    for (int num : arr) {
        System.out.print(num + " ");
    }
    
    System.out.println();
}



    static int[] prefixArray(int[] a){
        int n = a.length;
        //int[] pref = new int[n];
        
        int i =1;
    
        while(i<n){
            a[i] = a[i-1] + a[i];
            i++;
        }return a;
    }


    static int prefixSelectedSum(int l,int r, int[] a ){
        //a[0] = 0;
        while (l<r){
            a[l] = a[l-1] + a[l];
            l++;
        }return a[l-1];
    }



    


public static void main(String[] args) {
    int[] arr = {2,1,3,4,5};

    Scanner sc = new Scanner(System.in);
    
    int prefSum []=prefixArray(arr);
    System.out.println("Enter number of querries");
    int q = sc.nextInt();

    while (q-->0){
        System.out.println("Enter L and R respectively");
        int l= sc.nextInt();
        int r = sc.nextInt();
        int ans = prefSum[r] - prefSum[l-1];
        System.out.println("SUM = "+ans);
    }

    System.out.println();



}
}