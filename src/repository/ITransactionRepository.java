package repository;

import java.util.List;
import model.Transaction;

public interface ITransactionRepository {
    void add(Transaction transaction);
    List<Transaction> all();
}
