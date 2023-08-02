import java.util.Scanner;
public class simple
{
public static void main(String[] arg)
{
int age,amount,rate;
Scanner sc=new Scanner(System.in);
System.out.print("Enter your age:");
age=sc.nextInt();
System.out.print("Enter the amount:");
amount=sc.nextInt();
if (age<60){
System.out.print(amount/100*12);
}
else{
System.out.print(amount/100*10);
}
}
} 
