// Linear Search Algorithm
import java.util.Scanner;
class Linear_search
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
String s[]=new String[5];

// for tahing user input
for(int i=0;i<s.length;i++)
{
s[i]=sc.next();
}

//for check the given string is equal to user input or not
for(int i=0;i<s.length;i++)
{
if(s[i].equals("Suchitra"))
{
System.out.println(i);
break;
}
else
{
System.out.println("no match");
}
}
}}