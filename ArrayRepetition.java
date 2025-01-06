import java.util.Arrays;
public class ArrayRepetition {
        public static void main(String args[]){
        int arr[]={1, 2, 2, 1, 3, 5, 7, 1, 7, 5, 3};
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            int count=1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j])
                count++;
             else
                break;
            }
            if(count>1){
                System.out.println(arr[i] + " -> " + count);
            }
                i +=(count)-1; 
            
        }
    }
} 

