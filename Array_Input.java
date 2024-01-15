import java.util.Scanner;
class Array_Input
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int int_arr[]=new int[10];           // object creation
char char_arr[]=new char[10];
String str_arr[]=new String[10];
double dou_arr[]=new double[10];

//User input of int array
System.out.println("enter the element of int array");
for(int i=0;i<int_arr.length;i++) 
{
int_arr[i]=sc.nextInt();
}

//user input of character array
System.out.println("enter the elements of character array");
for(int i=0;i<char_arr.length;i++)
{
char_arr[i]=sc.next().charAt(0);
}

//user input of string array
System.out.println("enter the elements of string array");
for(int i=0;i<str_arr.length;i++)
{
str_arr[i]=sc.next();
}

// user input of double array
System.out.println("enter the elements of double array");
for(int i=0;i<str_arr.length;i++)
{
dou_arr[i]=sc.nextDouble();
}
}
}




