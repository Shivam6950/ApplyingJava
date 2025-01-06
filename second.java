import java.util.Scanner;
public class second {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int x=sc.nextInt();
        boolean isPrime = true;
        if(x<=1 ){
            isPrime = false;
        } else{
                for(int i=2; i<=Math.sqrt(x); i++){
                    if(x%i==0){
                        isPrime = false;
                        break;
                    }
                }
        }
        if (isPrime) {
            System.out.println(x + " is a prime number");
        } else {
            System.out.println(x + " is not a prime number");
        }
        sc.close();
    }
}

