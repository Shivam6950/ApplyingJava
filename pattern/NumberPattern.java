public class NumberPattern {
    public static void main(String args[]){
        //Loop for first half
        for(int i=5; i>0; i--){
            for(int j=1; j<=i; j++){
                    System.out.print(j + " ");
                }
                System.out.println();
            }

            //Loop for second half
            for(int i=2; i<=5; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
