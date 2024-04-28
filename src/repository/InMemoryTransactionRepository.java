package repository;

import java.util.ArrayList;
import java.util.List;

import model.Transaction;

public class InMemoryTransactionRepository implements ITransactionRepository {

	private List<Transaction> transactions;
	
	public InMemoryTransactionRepository() {
		this.transactions = new ArrayList<Transaction>();
	}
	
	@Override
	public void add(Transaction transaction) {
		transactions.add(transaction);
	}

	@Override
	public List<Transaction> all() {
		return transactions;
	}

}
