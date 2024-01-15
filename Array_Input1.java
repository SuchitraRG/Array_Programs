import java.util.Scanner;
class Array_Input1
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int int_arr[]=new int[5];           // object creation
char char_arr[]=new char[5];

// user input of int and char array simultaneously
for(int i=0;i<int_arr.length;i++)  
{
System.out.println("enter the element of int array");
int_arr[i]=sc.nextInt();
System.out.println("enter the elements of character array");
char_arr[i]=sc.next().charAt(0);
}
}
}