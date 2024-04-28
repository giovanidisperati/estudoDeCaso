package main;

import model.Clock;
import repository.InMemoryTransactionRepository;
import service.AccountService;

public class Main {

	public static void main(String[] args) {
		Clock clock = new Clock(); 
		Console console = new Console();
		InMemoryTransactionRepository repository = new InMemoryTransactionRepository();
		AccountService service = new AccountService(repository, clock, console);
		
		service.deposit(500);
		service.withdraw(200);
		service.printStatement();
	}

}
