import java.util.Scanner;
public class patternc
{
public static void main(String[] arg)
{
int i,j;
int a=10;
for(i=0;i<4;i++){
for(j=0;j<=i;j++){
System.out.print(a-1+" ");
}
a=a*10;
System.out.println();
}
}
}