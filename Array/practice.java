
public class practice{
    static void swapNumbers(int i,int j,int arr[]){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;

    }





    static void reverseArray(int arr[]){
        int j = 0;
        int i= arr.length-1;
      while(i>j){
        swapNumbers(i, j, arr);
        ++j;
        --i;


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
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        // reverseArray(arr);
        int t =4;
        int ans[] = arrayRotations(arr, t);
        for (int i=0; i<ans.length; i++) {
            System.out.println(ans[i]);
        }


        
    }
}