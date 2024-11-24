class Bike{
 int id;
 String name;
 Bike(int i,String n){
 id=i;
 name=n;
 System.out.println(id+" "+name);
 }
 public static void main(String args[]){
 Bike b1=new Bike(11,"kaviya");
 Bike b2=new Bike(22,"asvanthika");
 }
}