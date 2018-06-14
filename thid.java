import java.util.*;
class Slip
 {
	 Scanner sc=new Scanner(System.in);
	 int total=sc.nextInt();
	 int a[]=new int[total];
void array()
	{
System.out.println("enter the size of the array");
 int total=sc.nextInt();
	 int a[]=new int[total];
System.out.println("enter the elements");
for(int i=0;i<total;i++)
{
a[i]=sc.nextInt();
}
}
 int getSecondLargest()
{  
int temp;  
for (int i = 0;i <total;i++)   
        {  
            for (int j=i+1;j<total;j++)   
            {  
                if (a[i]>a[j])   
                {  
                    temp=a[i];  
                    a[i]=a[j];  
                    a[j]=temp;  
                }  
            }  
        }  
       return a[total-2];  
}
 }
class Ming
{
  public static void main(String args[])
  
  {  
  
  Slip b=new Slip();
  b.array();
System.out.println("Second Largest: "+b.getSecondLargest());  
}
} 
