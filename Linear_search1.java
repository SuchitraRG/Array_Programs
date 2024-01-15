import java.util.Scanner;
class Linear_search1
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
char c[]=new char[10];

for(int i=0;i<c.length;i++)
{
c[i]=sc.next().charAt(0);
}

// for checking s letter in array
for(int i=0;i<c.length;i++)
{
if(c[i]=='s')
{
System.out.println(i);
break;
}
}
}}
