import java.util.Scanner;
public class VowelsCount {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a String :");
        String name=sc.nextLine();
        name=name.toLowerCase();          //converting to lowercase syntax for clear understanding
        int count=0;
        for(int i=0; i<name.length(); i++){
            char ch=name.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.println("Number of vowels in given string " + count);
        sc.close();
    }
}
