class Maximinarray{
public static void main(String args[]){
int array[]={2,8,0,-3,11,5};
int max=array[0];
int min=array[0];
for(int i=1;i<array.length;i++){
if(array[i]>max){
max=array[i];
}
if(array[i]<min){
min=array[i];
}
}
System.out.println("maximum element:" +max);
System.out.println("minimum element:" +min);
}
}