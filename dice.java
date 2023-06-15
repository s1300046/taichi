import java.util.Random;

public class dice{
    public static void main(String[] args){
	int[] size = new int[2];
	Random num = new Random();

	for(int i = 0; i < 2; i++){
	    size[i] = num.nextInt(6) + 1;
	}

	int sum = size[0] + size[1];

	System.out.println("Rolling dice...");
	System.out.println("Die 1: " + size[0]);
	System.out.println("Die 2: " + size[1]);
	System.out.println("Total value: " + sum);
    }
}
