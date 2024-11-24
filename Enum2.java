class Enum2
{
 enum Season2
 {
  WINTER(5),SPRING(10),SUMMER(15),FALL(20);

 private int value;
 private Season2(int value)
 {
  this.value=value;
 }
 }
 public static void main(String args[])
 {
  for(Season2 b : Season2.values())
  System.out.println(b+" "+b.value);
  System.out.println("value of WINTER is:"+Season2.valueOf("WINTER(5)"));
 }
}
