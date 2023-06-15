import java.util.*;

public class dice{
    public static void main(String[] args){
	int[] size = new int[2];
	Random num = new Random();

	Scanner sc = new Scanner(System.in);

	System.out.println("What is your name? ");
	System.out.print(">");
	String name = sc.nextLine();
	System.out.println("Hello, " + name  +"!");

	for(int i = 0; i < 2; i++){
	    size[i] = num.nextInt(6) + 1;
	}

	int sum = size[0] + size[1];

	System.out.println("Rolling dice...");
	System.out.println("Die 1: " + size[0]);
	System.out.println("Die 2: " + size[1]);
	System.out.println("Total value: " + sum);

	if(sum > 7){
	    System.out.println(name + "won!");
	}
	else{
	    System.out.println(name + " lost!");
	}
    }
}
