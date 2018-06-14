import java.util.*;
class Seen
{
	int temp;
	void array()
	{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of the array");
int size=sc.nextInt();
int a[]=new int[size];
System.out.println("enter the elements");
for(int i=0;i<size;i++)
{
a[i]=sc.nextInt();
}
for (int i=0;i<a.length;i++) 
        {
            for (int j=i+1;j<a.length;j++) 
            {
                if (a[i]>a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
		for(int i=0;i<a.length;i+=2)
		{
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}


}
}


class Bad
{
public static void main(String args[])
{
Seen f=new Seen();
f.array();
}
}