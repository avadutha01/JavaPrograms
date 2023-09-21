import java.util.*;
public class demostack{
public static void main(String arg[]){
Stack<String> stack=new Stack<String>();
stack.push("Ravi");
stack.push("Vijay");
stack.push("Ravi");
stack.push("Ajay");
stack.push("Raju");

Iterator<String>  itr=stack.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
stack.pop();
System.out.println("After pop");

Iterator<String> itr2=stack.iterator();
while(itr2.hasNext()){
System.out.println(itr2.next());
}
}
}