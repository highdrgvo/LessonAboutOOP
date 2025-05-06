package ru.serple.data;

public class MirCard extends Card {

    public MirCard() { // если конструктор есть в родительском классе, то и в наследниках он должен быть
        super(PaymentSystem.MIR);
    }

    protected boolean isCountryValidForThisCard(Country country) {
        if (country == Country.RU) {
            return true;
        } else {
            return false;
        }
    }
}
