import java.util.*;
class Sorting1
{
 public static void main(String args[])
 {
   Sorting1 app = new Sorting1();   
    
   List<Integer> input = app.value(7);
 
    System.out.println(input);
    System.out.println(app.quicksort(input));
 }
private List<Integer> quicksort(List<Integer> input){

 int middle = (int) Math.ceil((double)input.size() / 2);
 int pivot =input.get(middle);

   List<Integer> less = new ArrayList<Integer>();
   List<Integer> greater = new ArrayList<Integer>();
		
	for (int i = 0; i < input.size(); i++) {
		if(input.get(i) <= pivot){
		        if(i == middle){
				continue;
			}
			less.add(input.get(i));
		}
		else
                {
		  greater.add(input.get(i));
		}
	}
         return concatenate(quicksort(less), pivot, quicksort(greater));
}
 private List<Integer> concatenate(List<Integer> less, int pivot, List<Integer> greater){
		
  List<Integer> list = new ArrayList<Integer>();
		
	for (int i = 0; i < less.size(); i++) 
        {
		list.add(less.get(i));
	}
		
	list.add(pivot);
		
	for (int i = 0; i < greater.size(); i++)
        {
		list.add(greater.get(i));
	}
		
	 return list;
 }
private List<Integer> value(int n){
   ArrayList<Integer> number = new ArrayList<Integer>();
   number.add(6);
   number.add(3);
   number.add(8);
   number.add(5);
   number.add(9);
   number.add(4);
   number.add(1);
    //System.out.println(number);
    return number;
 }
}	

   