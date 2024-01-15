import java.util.Scanner;
class String_Count
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
String s[]=new String[4];

// for taking user input
for(int i=0;i<s.length;i++)
{
s[i]=sc.next();
}
System.out.println(s[3]);

//for counting even length of string
int count=0;
for(int j=0;j<s.length;j++)
{
if(s[j].length()%2==0)
{
System.out.println("the even length of words are:"+s[j]);
count++;
}
}
System.out.println(count);
}
}