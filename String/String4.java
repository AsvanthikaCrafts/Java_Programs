class String4
{   
  static String Str = "level";
   static String s1="";
 public static void main(String args[])
 {
   for(int i=0;i<Str.length();i++)
    {
    
     s1=Str.charAt(i)+s1;
    }
     
     if(s1.equals(Str))
       {
         System.out.println(s1+" "+Str+" "+"it is palindrome");
       }
      else
       {
         System.out.println(s1+" "+Str+" "+"it is not a palindrome");
       }
   
  }
}