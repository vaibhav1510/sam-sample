package Currency;

public class Currency {
    private String name;
    private String currencyCode;

    public String getName() {
        return name;
    }

    public Currency setName(String name) {
        this.name = name;
        return this;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public Currency setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

}
