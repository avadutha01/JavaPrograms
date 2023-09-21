import java.util.*;
public class TestArray1{
	public static void main(String arg[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array : "); 
int size = sc.nextInt();
int[] arr=new int[size];
System.out.println("Elements the elements in array : ");

for(int i=0;i<size;i++){

arr[i]=sc.nextInt();
}
System.out.println("Elements in array : ");

for(int i=0;i<arr.length;i++){
System.out.println(arr[i] + " ");
}
}
}

	