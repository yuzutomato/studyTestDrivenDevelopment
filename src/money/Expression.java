package money;

public interface Expression {
	public Money reduce(Bank bank, String to);
}
