public class Prefix{


    static void printArray(int[] arr) {
    
    for (int num : arr) {
        System.out.print(num + " ");
    }
    
    System.out.println();
}



    static int[] prefixArray(int[] a){
        int n = a.length;
        int[] pref = new int[n];
        pref[0] = a[0];
        int i =1;
    
        while(i<n){
            pref[i] = pref[i-1] + a[i];
            i++;
        }return pref;
    }


public static void main(String[] args) {
    int[] arr = {2,3,4,5};
    System.err.println("hello world");
    int[] pref =prefixArray(arr);
    printArray(pref);
}
}