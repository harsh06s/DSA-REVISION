
public class full{

    static int countOccurencies(int []arr, int t){
        int count = 0;
        for (int i=0; i<arr.length;i++){
            if (arr[i]==t){
                count ++;
            }
        }
        return count;
                
    }


    static int lastOccurence(int[] arr, int element){
        int y=-1;
        for (int i=0; i<arr.length; i++){
            if (arr[i]==element){
                y =i;
            }
        } 
        return y;
    }




    static int vaulesGreaterthnX(int[] arr, int x){
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>x){
                count++;
            }
        }
        return count;
    }




    static boolean  isSorted(int[] arr ,int x){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1]>arr[i]){
                return false;
            } 
            
        } 
        return true;
    }


    static int pairsSum(int[] arr, int target){
        int count= 0;
        for (int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                
                if(arr[i] + arr[j]== target){
                    count++;
                    
                }
            }

        }
         return count;
    }



    static int tripletSum(int[] arr, int target){

        int count=0;
        for (int i =0 ;i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    if (arr[i]+arr[j]+arr[k]==target){
                        count++;
                    }
                }
            }
            
        }   return count;
    }





    static void findUnique(int arr[], int target){
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length;j++){
                if (arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j] =-1;

                }
            }

        }for(int i=0; i<arr.length;i++){
            if (arr[i]>0){
                System.out.print(arr[i]+",");
            }
        } System.out.println("");
    } 






    public static void main(String [] args){

        int t =12;
        int arr [] ={1,4,5,6,3,3,6};

        // if(isSorted(arr, t)){
        //     System.out.println("sorted");
        // }

        findUnique(arr, t);

    }
}
