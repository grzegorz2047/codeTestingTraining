package pl.grzegorz2047.unitteststraining;

/**
 * Plik stworzony przez grzegorz2047 18.02.2017.
 */
public class Money {
    private final int amount;
    private final String currency;

    public Money(int amount, String currency) {
        this.amount = 15;
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Money) {
            Money money = (Money) obj;
            return money.getCurrency().equals(getCurrency())
                    && getAmount() == money.getAmount();
        }
        return false;
    }
}
