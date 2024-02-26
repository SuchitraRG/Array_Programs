import java.util.Scanner;
class Char_Count1
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
char c[]=new char[10];
System.out.println("enter the char array");

// for user inputS
for(int i=0;i<c.length;i++)
{
c[i]=sc.next().charAt(0);
}
 
// for checking character array whether it is vowel or not
int count=0;
for(int j=0;j<c.length;j++)
{
if(c[j]=='a'||c[j]=='e'||c[j]=='i'||c[j]=='o'||c[j]=='u')
{
count++;
}
}
System.out.println(count);
}}
