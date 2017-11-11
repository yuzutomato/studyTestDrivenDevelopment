package money;

public class Sum implements Expression {
	Money augend;
	Money added;

	Sum(Money augend, Money added) {
		this.augend = augend;
		this.added = added;
	}

	Money reduce(String to) {
		int amount = augend.amount + added.amount;
		return new Money(amount, to);
	}
}
