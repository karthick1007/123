import java.io.*;
import java.util.*;
public class vowel
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char c=s.nextChar().charAt(0);
if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
{
System.out.println("vowel");
}
else
{
System.out.println("consonant");
}
}
}
