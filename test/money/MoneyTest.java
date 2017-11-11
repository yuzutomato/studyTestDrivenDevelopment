package money;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoneyTest {

	@Test
	void testMultiplication() {
		Money five = Money.dollar(5);
		assertEquals(Money.dollar(10), five.times(2));
		assertEquals(Money.dollar(15), five.times(3));
	}

	@Test
	public void testEquality() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6))); // 2つめの実例

		assertFalse(Money.franc(5).equals(Money.dollar(5)));
	}

	@Test
	public void testCurrency() {
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
	}

	@Test
	public void testSimpleAddition() {
		// Money sum = Money.dollar(5).plus(Money.dollar(5)); // 元のテスト
		Money five = Money.dollar(5);
		Expression sum = five.plus(five);
		Bank bank = new Bank();
		Money reduce = bank.reduce(sum, "USD");
		assertEquals(Money.dollar(10), reduce); // reduce: 簡約する
	}
}
