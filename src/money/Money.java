package money;

public abstract class Money {
	protected int amount;
	protected String currency;

	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount
				&& getClass().equals(money.getClass());
	}

	abstract Money times(int multiplier);

	public String currency() {
		return currency;
	}

	static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}

	static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}
}
