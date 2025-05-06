package ru.serple;

import ru.serple.data.Card;
import ru.serple.data.Country;
import ru.serple.data.VisaCard;

import static ru.serple.data.Country.RU;

public class Main {
    public static void main(String[] args) {

        Card visaCard = new VisaCard(); // Создание объекта (экземпляра) класса Card. masterCard - это переменная, которая будет хранить ссылку на объект. new Card() — создает новый объект (экземпляр) класса Card в памяти.
        visaCard.setBalance(100);
        visaCard.payInCountry(RU, 50);
        System.out.println(visaCard.getBalance());
    }

}