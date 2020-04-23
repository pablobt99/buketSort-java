package buketSort;

import java.util.Scanner;

public class buketSort {
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int bucket[] = new int[10];
		int sortedNum[] = new int[10];
		int num;
		
		System.out.println("introduce un numero del 0-9");
		num = input.nextInt();
		
		System.out.println("introduce " +num+ " numeros");
		
		for (int ctr=0; ctr<num; ctr++) { 
			bucket[ctr] = input.nextInt();
		}
		
		for (int ctr=0; ctr<num;ctr++) {
			for (int x=0; x<num;x++) {  
				if (ctr == bucket[x])
					sortedNum[ctr]++;
		
			}
		}
		
		System.out.println();
		
		for (int x=0; x<10; x++) { 
			while(sortedNum[x]!=0) {
				System.out.print(x + " ");
				sortedNum[x]--;		
			}
		}
		
	}

	}

