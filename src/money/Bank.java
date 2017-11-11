package money;

public class Bank {
	public Money reduce(Expression source, String to) {
		Sum sum = (Sum) source;
		int amount = sum.augend.amount + sum.added.amount;
		return new Money(amount, to);
	}
}
