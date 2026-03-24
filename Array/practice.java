
public class practice{
    static void swapNumbers(int i,int j,int arr[]){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;

    }





    static void reverse(int arr[],int i,int j){
        // int j = 0;
        // int i= arr.length-1;
      while(i<j){
        swapNumbers(i, j, arr);
        ++i;
        --j;


      }
        } 





        static int[] arrayRotations(int arr[], int k){
            int n = arr.length;
            int[] ans = new int [n];
            k = k%n;
            int j = 0 ;
            for (int i=n-k; i<n; i++){
                ans[j] = arr[i];
                j++;

            }
            for (int i=0; i<n-k; i++){
                ans[j] = arr[i];
                j++;

            }return ans;
        }



        static void rotateInPlace(int arr[],int k){
            int n = arr.length;
            k= k%n;
            reverse(arr, n-k, n-1);
            reverse(arr, 0, n-k-1);
            reverse(arr, 0, n-1);


        }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        // reverseArray(arr);
        int t =2;
        rotateInPlace(arr, t);
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }


        
    }
}