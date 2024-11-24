
import java.lang.*;
class String3
{
  static String str="banana";
  static char z='a';
   static int count=0;
 public static void main(String args[])
  {
   for(int i=0;i<str.length();i++)
   {
    if(str.charAt(i)==z)
     {
      count++;
     }
    }
     System.out.println("the character"+z+"appears"+count+"times.");
  }
} 

