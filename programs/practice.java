import java.util.Scanner;
public class practice{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number to Find Factorial");
      // to take input from user
      int number = sc.nextInt();
     int i,fact=1;
     for(i=1;i<=number;i++){
        fact=fact*i;
     }
     System.out.println("Factorial is:"+fact);

               }
}