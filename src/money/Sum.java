package money;

public class Sum implements Expression {
	Expression augend;
	Expression addend;

	Sum(Expression augend, Expression added) {
		this.augend = augend;
		this.addend = added;
	}

	public Expression plus(Expression addend) {
		return null;
	}

	public Money reduce(Bank bank, String to) {
		int amount = augend.reduce(bank, to).amount
				+ addend.reduce(bank, to).amount;
		return new Money(amount, to);
	}
}
