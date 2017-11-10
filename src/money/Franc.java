package money;

public class Franc extends Money {

	public Franc(int amount, String currency) {
		this.amount = amount;
		this.currency = "CHF";
	}

	public Money times(int multiplier) {
		return new Franc(amount * multiplier, null); // FrancのメソッドがFrancを呼び出している？？
	}
}
