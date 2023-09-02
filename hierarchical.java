class staff
{
public void display();
{
System.out.print("code");
System.out.print("name");
}
}
class teacher
{
public void display1();
{
System.out.print("subject");
System.out.print("pulication");
}
}
class typist extends staff
{
public void display2();
{
System.out.print("speed");
}
}
class officer extends staff 
{
public void display3();
{
System.out.print("grade");
}
}
class regular extends typist
{
public void display4()
{
System.out.print("salary");
}
}
class casual extends typist
{
public void display5()
{
System.out.print("daily wages");
}
}
class hierarchical
{
public static void main(String[] args)
{
officer c=new officer();
c.display3();
c.display();
teacher n=new teacher();
n.display1();
n.display();
}
}








