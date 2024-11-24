class Stream1
{
 public static void main(String args[])
 {
  int arr[]={18,17,16,19,20,21,24,29,22};
  	
   arr.stream1().map((x)->{
     if(x%2==0){
       return x;
     }
        return null;
   }
   )

  .tolist();

 }
}