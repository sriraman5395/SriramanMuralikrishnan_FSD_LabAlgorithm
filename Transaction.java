package com.greatlearning.lab;


public class Transaction {
	public static int targetCheck(int[] transactions, int target) {
		int sum = 0;
		for (int i = 0; i <= transactions.length-1; i++) {
			sum += transactions[i];
			if (sum >= target)
				return i;
		}
		return -1;
	}

	public int targetCheckWithSub(int[] transactions,int target) {
		for(int  i=0;i<transactions.length;i++) {
			target=target-transactions[i];
			if(target<=0) {
				return i;
			}											
		}
		return -1;
	}


}
