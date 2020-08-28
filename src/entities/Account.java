package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;
	
	/*UMA CONTA PODE SER CRIADA COM UM DEP�SITO INICIAL OU SEM, LOGO
	 PODE-SE CRIAR 2 CONSTRUTORES: UM COM O DEPOSITO E OUTRO SEM
	 */	
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit); //A cria��o da conta recebe como argumento, um deposito inicial, n�o o balance. Ent�o deve-se chamar a opera��o deposit recebendo o valor de deposito inicial//
	}


	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}


	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5;
	}
	
	public String toString() {
		return "Account "
		+ number
		+ ", "
		+ "Holder: "
		+ holder
		+ ", "
		+ "Balance: $"
		+ String.format ("%.2f", balance);	
	}
		
		
		
		
		
		
		
	}
	

	
	