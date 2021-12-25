package ru.job4j.bank;

import java.util.Objects;

/**
 *Этот класс описывает модель клиента банка
 * @author Artem Reshetnikov
 * @version 1.0
 */
public class User {
    /**
     * Паспортные данные
     */
    private String passport;
    /**
     * Имя клиента
     */
    private String username;

    /**
     * Конструктор для инициализации переменных класса
     * @param passport - паспортные данные
     * @param username - имя клиента
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Геттер для получения паспотных данных
     * @return - возвращает паспортные данные
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Сеттер для установки(изменения) паспортных данных
     * @param passport - принимает новые паспортные данные
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Геттер для получения имени клиента
     * @return - возвращает имя клиента
     */
    public String getUsername() {
        return username;
    }

    /**
     * Сеттер для установки(изменения) имени клиента
     * @param username - принимает новое имя клиента
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Проверяет идентичны ли паспортные данные объектов
     * @param o - принимает объект который нужно сравнить
     * @return - возвращает результат сравнения
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Инфа для проверки на идентичность
     * @return возвращает хэш-код объекта
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}