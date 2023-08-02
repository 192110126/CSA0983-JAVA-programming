import java.util.Scanner;
public class sort
{
public static void main(String[] arg)
{
int i,n,temp=0,j;
Scanner sc=new Scanner(System.in);
System.out.print("Enter n:");
n=sc.nextInt();
int x[]=new int[n];
for(i=0;i<n;i++){
x[i]=sc.nextInt();
}
for(i=0;i<n;i++){
for(j=i+1;j<n;j++){
if(x[i]<x[j]){
temp=x[i];
x[i]=x[j];
x[j]=temp;
}
}
}
for(i=0;i<=n;i++){
System.out.print(x[i]+",");
}
}
}
