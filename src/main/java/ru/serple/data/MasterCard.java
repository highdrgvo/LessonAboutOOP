package ru.serple.data;

public class MasterCard extends Card implements ICard { // благодаря extends мы можем использовать все вещи из класса Card в MasterCard

    public MasterCard() { // если конструктор есть в родительском классе, то и в наследниках он должен быть
        super(PaymentSystem.MASTERCARD);
    }

    // implements означает, что класс MasterCard реализует интерфейс ICard.
    // implements – это указание, что класс MasterCard обязуется предоставить реализацию всех методов, объявленных в ICard

//    Пример:
//    Допустим, интерфейс ICard выглядит так:
//
//    public interface ICard {
//        String getCardNumber();
//        boolean isValid();
//    }
//
//    Тогда класс MasterCard должен реализовать эти методы:
//
//    public class MasterCard extends Card implements ICard {
//        public MasterCard() {
//            super(PaymentSystem.MASTERCARD);
//        }
//
//        @Override
//        public String getCardNumber() {
//            return "5555-..."; // Пример реализации
//        }
//
//        @Override
//        public boolean isValid() {
//            return true; // Пример реализации
//        }
//    }

    // Override - переопределение метода (англ. Method overriding) в ООП — одна из возможностей языка программирования,
    // позволяющая подклассу или дочернему классу обеспечивать специфическую реализацию метода, уже реализованного
    // в одном из суперклассов или родительских классов. Переопределение позволяет взять какой-то метод родительского класса и написать
    // в каждом классе-наследнике свою реализацию этого метода. Новая реализация «заменит» родительскую в дочернем классе.
    // Пример:
//    public class Animal {
//        public void voice() {
//            System.out.println("Голос!");
//        }
//    }
//    public class Bear extends Animal {
//        @Override
//        public void voice() {
//            System.out.println("Р-р-р!");
//        }
//    }

//    @Override
//    public void payInCountry(Country country, int amount) {
//
//        if(isCountryValidForThisCard(country) && isBalanceGreaterOrEqualThan(amount)) {
//                balance = balance - amount;
//                System.out.println("Accepted");
//            }
//        }
//
//    }

    protected boolean isCountryValidForThisCard(Country country) {
        return true;
    }

}
