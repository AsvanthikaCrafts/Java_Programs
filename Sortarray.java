class Sortarray{
public static void main(String args[]){
int a[]={2,8,0,-3,11,5};
for(int i=0;i<a.length;i++){
int j=i;
for(;j<a.length;j++){
if(a[i]<a[j]){
a[i]=a[j];
}
}
}
for(int i:a){
System.out.println("sorting the array:" +i);
}
}
}