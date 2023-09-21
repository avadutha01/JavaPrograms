import java.util.*;
public class Test{
	public static void main(String a[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 5 subject marks");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int n3=sc.nextInt();
	int n4=sc.nextInt();
	int n5=sc.nextInt();
	int total=n1+n2+n3+n4+n5;
	float per=(total/500)*100;
	System.out.println("Percentage = "+per);
	if(per<=100 && per>=75){
	ca='A';
	}else if(per<=75 && per>=60){
        ca='B';
	}else if(per<=60 && per>=50){	
	ca='C';
	}else{
	ca='D';
	}
switch(ca){
case 'A':
System.out.println("Distinction");
break;
case 'B':
System.out.println("1st class");
break;
case 'C':
System.out.println("Good");
break;
}


	

