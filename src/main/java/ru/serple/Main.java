package ru.serple;

import ru.serple.data.*;

import java.util.ArrayList;
import java.util.List;

import static ru.serple.data.Country.RU;

public class Main {
    public static void main(String[] args) {
        invoke(new MasterCard());
        List<String> aList = new ArrayList<>();

//        Card visaCard = new VisaCard(); // Создание объекта (экземпляра) класса Card. masterCard - это переменная, которая будет хранить ссылку на объект. new Card() — создает новый объект (экземпляр) класса Card в памяти.
//        visaCard.setBalance(100);
//        visaCard.payInCountry(RU, 50);
//        System.out.println("Current balance: " + visaCard.getBalance());
    }

    // Выше не полиморфный код, потому что нужно менять название платежной карты.

    public static void invoke(Card card) {

        card.setBalance(100);
        card.payInCountry(RU, 50);
        System.out.println("Current balance: " + card.getBalance());
    }

    // Если код делает что-то разное для разных объектов, которые от одного супер класса (Card), то этот код называется полиморфным.
    // Этот код полиморфный, потому что с любой картой он делает работу, которая при этом может отличаться для разных карт.

//    Например, есть две разных сущности: картинка и видео. И тем, и другим можно поделиться: отправить в личное сообщение другому человеку.
//    Программист может сделать два разных метода — один для картинки, другой для видео.
//    А может воспользоваться полиморфизмом и создать один метод «Отправить» для обеих сущностей.


}