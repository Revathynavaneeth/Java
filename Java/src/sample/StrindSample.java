package sample;

public class StrindSample
{

	public static void main(String[] args) 
	{
	String s1="Welcome";
	String s2="Hello";
	String s3="Sachin";
	String s4=new String("Welcome to world");
	String s5=new String("Revathy");
			int a=10;
	System.out.println(s1);
	System.out.println(s2.length());
	s3=s3.concat("Tendulkar");
			System.out.println(s3);
			System.out.println(s1.equals(s5));
			System.out.println(s1.equalsIgnoreCase(s4));
			System.out.println(s1==s4);
			System.out.println(s1.compareTo(s2));
			System.out.println(3+s1+s2+5);
	System.out.println(s2.toUpperCase());
	System.out.println(s4.charAt(2));
	System.out.println(s3.trim());
	System.out.println(s2.replace("Hello","Hello Java"));
	System.out.println(s4.startsWith("we"));
	System.out.println(s4.endsWith("e"));
			 String s=String.valueOf(a);
			 System.out.println(s+11);
			 System.out.println(s4.contains("a"));
	}
			 	
			 }


