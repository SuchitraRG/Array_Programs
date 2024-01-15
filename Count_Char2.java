import java.util.Scanner;
class Count_Char2
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
char c[]=new char[5];
 
// for user input
for(int i=0;i<c.length;i++)
{
c[i]=sc.next().charAt(0);
}

//for checking even character array or not
int count=0;
for(int j=0;j<c.length;j++)
{
if(c[j]%2==0)
{
System.out.println("the even character is:"+c[j]); 
count++;
}
}
System.out.println(count);   // count of even character
}}
 