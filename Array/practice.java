

public class practice{


    static void printArray(int[] arr) {
    
    for (int num : arr) {
        System.out.print(num + " ");
    }
    
    System.out.println();
}



    static void swapNumbers(int i,int j,int arr[]){
        if (i == j) {
        return;
    }
       arr[i] = arr[i]+arr[j]; 
       arr[j] = arr[i]-arr[j];
       arr[i]= arr[i]-arr[j];

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



        static int[] sortArr(int[] arr){
            for(int j=0;j<arr.length;j++){
            for (int i =j+ 1; i < arr.length; i++) {
                if(arr[j]> arr[i]){
                    swapNumbers(i, j, arr);
                    
                }

                
            }}
            return arr;
        }

        static int[] sortZerosOnes(int[] arr){
            int lefft = 0;
            int right = arr.length-1;
            while(lefft<right){
                if (arr[lefft] == 1 && arr[right]==0){
                    swapNumbers(lefft, right, arr);
                    lefft++;
                    right--;
                }
                if(arr[lefft]==0){
                    lefft++;
                }
                if(arr[right]==1){
                    right--;
                }
            } return arr;
        }






    
    public static void main(String[] args) {
        int arr[] = {1,0,0,1};
        // reverseArray(arr);
        int t =1002;
        // rotateInPlace(arr, t);

        // Scanner sc = new Scanner(System.in);

        // int[] freq = makeFrequencyArr(arr);

        // System.out.println("enter a number of querries");
        // int q = sc.nextInt();
        // while(q>0){
        //     System.out.println("enter element to be searched");
        //     int x = sc.nextInt();
        //     if (freq[x]>0){
        //         System.out.println("yes");
        //     }
        //     else{
        //         System.out.println("No");
        //     }
        //     q--;
        // }



     //System.out.println(sortArr(arr));
     printArray(arr);
     System.out.println(sortZerosOnes(arr));
     System.out.println("sorted array");
     printArray(arr);

    }
    
}