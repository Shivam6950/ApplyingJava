import java.util.*;
    public class function {
        public static void PrintFactorial(int x){
            if(x<0){
                System.out.println("invalid number");
                return;
            }
            int factorial=1;
            for(int i=x; i>=1; i--){
                factorial = factorial*i;
            }
            System.out.println("factorial of a given mo. is "+factorial);
        }
        public static void main (String[] args){
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            PrintFactorial(x);
            sc.close();
        }
    }

