public class ReversePattern {
    public static void main(String args[]){
        //loop for entering values
        for(int i=1; i<11; i++){
            int ans=2*i;
            System.out.println("2 * "+ i + " = "+ ans);
        }   
        //Reversing the pattern
        System.out.println();
         for(int j=10; j>=1; j--){
            int ans=2*j;
            System.out.println("2 * "+ j + " = "+ ans);
         }
    }
}

