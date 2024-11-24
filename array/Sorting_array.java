class Sorting_array{
public static void main(String args[]){
int a[]={2,8,0,-3,11,5};
for(int i=0;i<a.length;i++){
int j=i;
for(;j<a.length;j++){
if(a[i]<a[j]){
int q=a[j];;
a[j]=a[i];
a[i]=q;
}
}
}
for(int i:a){
System.out.println("sorting the array:" +i);
}
}
}