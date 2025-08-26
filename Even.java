import java.util.Scanner;
public class Even { 
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        int num;
         num=sc.nextInt();
        System.out.println("enter a number: "+num);
       
        String number=(num%2==0) ? "even number " :"odd number";
        System.out.println(number);
        
    }
    
}
