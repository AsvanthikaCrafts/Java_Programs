class Occurrence{
static int k;
public static void main(String args[]){
int a[]={3,5,7,3,11,3};
int j=3;
for(int i=0;i<a.length;i++){
if(j==a[i]){
 k=k+1 ;
}
}
System.out.println("occurrence of integer:" +k);
}
}
