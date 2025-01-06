public class Swap {
    public static void main(String agr[]){
        int x=2;
        int y=3;
        //Values before swapping
        System.out.println("Value of x: "+ x +" and value of y: "+ y + " before swapping");
        x=x+y; //2+3=5=x
        y=x-y; //5-3=2=y
        x=x-y; //5-2=3=x
        System.out.println("Value of x: "+ x +" and value of y: "+ y + " after swapping");
    }
}
