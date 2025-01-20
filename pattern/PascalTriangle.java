public class PascalTriangle {
    public static void main(String args[]){
        int rows=10;
        System.out.println("Pascal's Triangle");
        for(int i=0; i<rows; i++){
            //Print spaces
            for(int j=0; j<rows-i-1; j++){
                System.out.print(" ");
            }

            //Loop for values
            int value=1;
            for(int j=0; j<=i; j++){
                System.out.print(value + "  ");
                value = value*(i-j)/(j+1);    
            }
            System.out.println();
        }
    }
}
