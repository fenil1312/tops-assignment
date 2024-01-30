package module2;

import java.util.*;

class WithdrawAmountException extends Exception {

	public WithdrawAmountException(String msg) {
		super(msg);
	}
	
}

public class AccountCustomException {

	public static void main(String[] args) throws WithdrawAmountException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account balance : ");
		int balance = sc.nextInt();
		
		System.out.print("Enter withdraw amount : ");
		int withdraw = sc.nextInt();
		
		int amount;
		
		if(withdraw > balance) {
			withdraw -= balance;
			throw new WithdrawAmountException("Sorry, insufficient balance, you need more " + withdraw + "Rs. To perform this transaction.");
		}
		else {
			balance -= withdraw;
			System.out.println("\nBalance after withdraw : " + balance);
		}

	}

}
