
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




    static boolean  isSorted(int [] arr ,int x){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1]>arr[i]){
                return false;
            } 
            
        } 
        return true;
    }









    public static void main(String [] args){

        int t =5;
        int arr [] ={1,4,5,6,8,4};

        if(isSorted(arr, t)){
            
        }
        

    }
}
