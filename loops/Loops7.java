class Loops7{
static void prime (int j){
int n=j%2;
int m=j%3;
int o=j%5;

if (n==0){
System.out.println("not prime number");

if(m==0){
System.out.println("not prime number");

if(o==0){
System.out.println("not prime number");

}

}

}

else{
System.out.println("prime number");
}
}


public static void main(String args[]){
for(int i=2;i<=20;i++){
prime();
System.out.println("number:"+i);
}
}
}