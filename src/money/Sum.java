package money;

public class Sum implements Expression {
	Money augend;
	Money added;

	Sum(Money augend, Money added) {
		this.augend = augend;
		this.added = added;
	}

	public Money reduce(Bank bank, String to) {
		int amount = augend.reduce(bank, to).amount
				+ added.reduce(bank, to).amount;
		return new Money(amount, to);
	}
}
