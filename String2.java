class String2
{
 public static void main(String args[])
 {
 StringBuffer s = new StringBuffer("silent");
 int a=s.length();

 StringBuffer s1 = new StringBuffer("listen");
 int b=s1.length();
 System.out.println(a+" "+b);
 System.out.println(a==b);

  char[] array1 = s.toCharArray();
  char[] array2 = s.toCharArray();
    Arrays.sort(array1);
    Arrays.sort(array2);

  System.out.println(array1==array2);

}
}