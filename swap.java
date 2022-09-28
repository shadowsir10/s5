import java.io.*;
import java.util.*;
class swap
{ 
 static void swapvalues(int m,int n)
{
 int temp=m;
 m=n;
 n=temp;
 System.out.println("Value of m is "+m+"and Value of n is"+n);
}
public static void main(String args[])
{
 int m=9,n=5;
swapvalues(m,n);
}
}
