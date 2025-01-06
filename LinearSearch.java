import java.util.Scanner;
public class LinearSearch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array :");
        int size=sc.nextInt();
        int arr[]=new int[size];

        //Loop for inserting array value
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter a value for linaer match :");
        int x=sc.nextInt();

        //Loop for Output
        boolean found=false;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                System.out.println(x + " is found at index " + i);
                found=true;
            }
        } if(!found){
                System.out.println("There is no " + x + " at any index");
            }
            sc.close();
        }
    }