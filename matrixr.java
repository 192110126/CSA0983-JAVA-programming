import java.util.Scanner;
import java.util.Arrays;
public class matrixr
{
public  static void main(String[] arg){
int i=0,j=0;
int a[][]=new int[3][3];
int b[][]=new int[3][3];
int c[][]=new int[3][3];
int d[][]=new int[3][3];
Scanner sc=new Scanner(System.in);
System.out.print("enter matrix of 1st");
for (i=0;i<3;i++){
for (j=0;j<3;j++){
a[i][j]=sc.nextInt();
}
}
//second matrix
System.out.print("enter matrix of 2st");
for (i=0;i<3;i++){
for (j=0;j<3;j++){
b[i][j]=sc.nextInt();
}
}
//sum of matrix
for( i=0;i<3;i++){    
for( j=0;j<3;j++){    
c[i][j]=a[i][j]+b[i][j];     
}
}
System.out.print( Arrays.deepToString(c));
// sub
for(i=0;i<3;i++){    
for(j=0;j<3;j++){    
d[i][j]=a[i][j]-b[i][j];     
}
}
System.out.print( Arrays.deepToString(d));

}
}