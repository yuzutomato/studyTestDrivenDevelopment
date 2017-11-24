package money;

public class Sum implements Expression {
	Money augend;
	Money addend;

	Sum(Money augend, Money added) {
		this.augend = augend;
		this.addend = added;
	}

	public Money reduce(Bank bank, String to) {
		int amount = augend.reduce(bank, to).amount
				+ addend.reduce(bank, to).amount;
		return new Money(amount, to);
	}
}
