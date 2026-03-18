
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









    public static void main(String [] args){

        int t =7;
        int arr [] ={4,6,3,5,8,2};

        // if(isSorted(arr, t)){
        //     System.out.println("sorted");
        // }

        System.out.println( pairsSum(arr, t));

    }
}
