import java.util.*;
class Rectangle
{
double	length;
double  breath;
 void calculate_Area(double l,double b)
 {
 length=l;
 breath=b;
 double c=l*b;
 System.out.println("the area of rectangle="+c);
 }
}
class Main
{
public static void main(String args[])
{
Rectangle r=new Rectangle();
r.calculate_Area(13,20);
}
}

