package ru.job4j.bank;

import java.util.Objects;

/**
 * Этот класс описывает модель банковского счета
 * @author Artem Reshetnikov
 * @version 1.0
 */
public class Account {
    /**
     * Реквизиты счета
     */
    private String requisite;
    /**
     * Баланс счета
     */
    private double balance;

    /**
     * Конструктор для инициализации объектов класса
     * @param requisite - реквизиты счета
     * @param balance - информация об остатке на счете
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Геттер для получения реквизитов счета
     * @return - возвращает текущие реквизиты счета
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Сеттер для установки(изменения) реквизитов счета
     * @param requisite - принимает новые реквизиты
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Геттер для получения баланса счета
     * @return - возвращает остаток на счете
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Сеттер для установки(изменения) баланса счета
     * @param balance - принимает новый баланс счета
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Проверяет идентичны ли реквизиты объектов
     * @param o принимает объект который нужно сравнить с текущим объектом
     * @return возвращает результат сравнения
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Инфа для проверки на идентичность
     * @return - возвращает хэш-код объекта
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}