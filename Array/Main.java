
// public class Main{
//     public static void main(String[] args){
//         int sum=0;
//         int [] arr={5,1,3,18};
        
//         for (int i=0; i<arr.length; i++){
//             sum +=arr[i];
//         }System.out.print(sum);
//     }
// }



// ========max element in array

// public class Main{
//     public static void main(String [] args){
//         int [] arr= {77,10,12,67,8,9};
        
//         int max = arr[0];
//         for (int i=0; i<arr.length;i++){
//             if (max<arr[i]){
//                 max= arr[i];
                
//             }
            
            
//         }
//         System.out.println(max+" ");
        
        
//     }
// }

//linear search ======================

public class Main{
    public static void main(String[] args){
        int [] arr={10,8,3,5,15};
        int x = 98;
        int ans=-1;
        for(int i=0; i<arr.length; i++){
            if (arr[i]==x){
                ans=i;
                break;
            }
        } 
        System.out.println(ans);
    }
}