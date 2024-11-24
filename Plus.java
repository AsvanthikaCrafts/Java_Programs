public class Plus{
 static int plusmethod(int x,int y){
 return x+y;
}

static double plusmethod(double x,double y){
 return x+y;
}

public static void main(String[]args){
 int mynum1=plusmethod(8,5);
 double mynum2=plusmethod(8.3,5.7);
 System.out.println("int:"+mynum1);
 System.out.println("double:"+mynum2);
}
}