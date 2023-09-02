import java.util.Scanner;
class Pec
{
int i=0,f=0;
Pec(int n)									
{
for(i=0;i<n;i++){
if(n%i==0){
f=f+i;
}
}
if(f==n){
System.out.print("give is perfect number");
}
else{
System.out.print("give is not perfect number");
}
}
}
public class num
{
public static void main(String[] arg)
{
int n,f=0;
Scanner sc=new Scanner(System.in);
System.out.print("enter a num");
n=sc.nextInt();
Pec obj=new Pec(n);
}
}
