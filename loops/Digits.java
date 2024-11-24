class Digits{
public static void main(String []args){
int number=986347542;
int noofdigits=0;
while(number!=0){
number=number/10;
noofdigits++;
}
System.out.println("number of the digits in given:" +noofdigits);
}
}