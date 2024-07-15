package javaclass11;

public class welcome 
{
public static void main(String args[])
{
	System.out.println("welcome to java");
	String s = "hello";
	String h = "bro";
	System.out.println(s.concat(h));
	
	String w = "Welcome";
	String rev ="";
	char a[] = w.toCharArray();
	for (int i=a.length-1;i>=0;i--)
	{
		 rev = rev + a[i];
		 
	}
	System.out.println(rev);
}
}
