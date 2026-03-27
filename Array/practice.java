import java .util.*;


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


        static int[] makeFrequencyArr(int[] arr){
            int freq [] = new int[100005];
            for (int i=0; i<arr.length;i++){
                freq[arr[i]]++;
            } return freq;
        }






    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        // reverseArray(arr);
        int t =1002;
        // rotateInPlace(arr, t);
        // for (int i=0; i<arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

        Scanner sc = new Scanner(System.in);

        int[] freq = makeFrequencyArr(arr);

        System.out.println("enter a number of querries");
        int q = sc.nextInt();
        while(q>0){
            System.out.println("enter element to be searched");
            int x = sc.nextInt();
            if (freq[x]>0){
                System.out.println("yes");
            }
            else{
                System.out.println("No");
            }
            q--;
        }



        
    }
}