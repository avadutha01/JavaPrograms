import java.util.*;
class Ar1{
	public static void main(String arg[]){
	ArrayList<String> list=new ArrayList<String>();
list.add("Ravi");
list.add("Vijay");
list.add("Ravi");
list.add("Ajay");


Iterator itr=list.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}