import java.util.Scanner;
public class number{
    
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner s= new Scanner(System.in);
        int num=s.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}