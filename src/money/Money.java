package money;

public class Money implements Expression {
	protected int amount;
	protected String currency;

	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount
				&& currency().equals(money.currency());
	}

	public String currency() {
		return currency;
	}

	static Money dollar(int amount) {
		return new Money(amount, "USD");
	}

	static Money franc(int amount) {
		return new Money(amount, "CHF");
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}

	public Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}

	public Expression plus(Money added) {
		return new Sum(this, added);
	}
}
