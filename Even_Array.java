import java.util.Scanner;
class Even_Array
{
public static void main(String[]arg)
{
Scanner sc=new Scanner(System.in);
int a[]=new int[5];

// for taking user input
System.out.println("enter the int array");
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
 //for checking even elements of array
for(int i=0;i<a.length;i++)
{
if(a[i]%2==0)
{
System.out.println("its a even elements of array:"+a[i]);
}
else
{
System.out.println("its a odd elements of array:"+a[i]);
}
}

}
}