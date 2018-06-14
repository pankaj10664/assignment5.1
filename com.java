import java.util.*;

class complex

{
int real;
int imaginary;

void display(int r,int z)
{
real=r;
imaginary=z;

System.out.println("the comlex no.will be "+r +"+"+z+"i");
}
}
class Pank
{
	public static void main(String args[])
	{
		complex c=new complex();
		c.display(2,5);
		
	}
}

