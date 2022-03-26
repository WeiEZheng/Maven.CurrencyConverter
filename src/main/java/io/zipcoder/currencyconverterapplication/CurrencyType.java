package io.zipcoder.currencyconverterapplication;

public enum CurrencyType {
    AUSTRALIAN_DOLLAR(2.70),
    CANADIAN_DOLLAR(2.64),
    CHINESE_YR(13.84),
    EURO(1.88),
    FRANC(2.02),
    POUND(1.64),
    RINGGIT(8.94),
    RUPEE(136.64),
    SINGAPORE_DOLLAR(1.86),
    US_DOLLAR(2.0),
    UNIVERSAL_CURRENCY(1.0),
    YEN(231.68);

    private final double rate;

    CurrencyType(double rate) {
        this.rate = rate;
    }

    public Double getRate() {
        return rate;
    }

    public static CurrencyType getTypeOfCurrency(ConvertableCurrency currency) {
        CurrencyType type = null;
        String className = currency.getClass().getSimpleName();
        switch (className){
            case "AustralianDollar": type = AUSTRALIAN_DOLLAR; break;
            case "CanadianDollar": type = CANADIAN_DOLLAR; break;
            case "ChineseYR": type = CHINESE_YR; break;
            case "Euro": type = EURO; break;
            case "Franc": type = FRANC; break;
            case "Pound": type = POUND; break;
            case "Ringgit": type = RINGGIT; break;
            case "Rupee": type = RUPEE; break;
            case "SingaporeDollar": type = SINGAPORE_DOLLAR; break;
            case "USDollar": type=US_DOLLAR; break;
            case "Yen": type=YEN; break;
            case "UniversalCurrency": type =UNIVERSAL_CURRENCY; break;
        }
        return type;
    }
}
