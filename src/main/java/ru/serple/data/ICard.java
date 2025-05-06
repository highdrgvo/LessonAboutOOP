package ru.serple.data;

public interface ICard {

    void payInCountry(Country country,  int amount);

    // В интерфейсе просто говорим, описываем какое поведение будет у объектов, которые будут его наследовать
    // Интерфейсы были придуманы для того, чтобы упростить написание полиморфного кода
}
