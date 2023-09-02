class a
{
int x=10;
public void display()
{
System.out.println("10");
}
}
class b extends a
{
int y=100;
public void display1()
{
System.out.println("100");
}
}
class c extends b
{
int x=1000;
public void display2()
{
System.out.println("1000");
}
}
class inheir
{
public static void main(String[] args)
{
c s=new c();
s.display2();
s.display1();
s.display();
}
}
