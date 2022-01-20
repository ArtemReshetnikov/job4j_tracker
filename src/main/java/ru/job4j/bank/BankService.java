package ru.job4j.bank;

import java.util.*;

/**
 * Класс описывает работу банковского сервиса
 * @author Artem Reshsetnikov
 * @version 1.1
 */
public class BankService {
    /**
     * Хранение клиентской базы осуществляется в коллекции типа HashMap
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод используется для добавления нового клиента
     * Проверяет есть ли уже такой пользователь в клиентской базе
     * @param user - принимает имя клиента
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод для добавления нового счета клиенту
     * Находит клиента в базе по паспортным данным
     * Проверяет есть ли уже у клиента счет с такими реквизитами
     * @param passport - принимает паспортные данные
     * @param account - принимает реквизиты счета
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent() && !users.get(user.get()).contains(account)) {
            users.get(user.get()).add(account);
        }
    }

    /**
     * Метод для поиска клиента по паспортным данным
     * @param passport - принимает паспортные данные
     * @return - возвращает информацию о клиенте(найдет или не найден)
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод для поиска счета клиента
     * Проверяет есть ли такой клиент в базе по паспортным данным
     * Проверяеь есть ли у клиента счет с введенными реквизитами
     * @param passport - принимает паспортные данные
     * @param requisite - принимает реквизиты счета
     * @return - возвращает информацию о счете клиента(найден или не найден)
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<Account> rsl = Optional.empty();
        Optional<User> user = findByPassport(passport);
        return user.map(value -> users.get(value)
                .stream()
                .filter(s -> s.getRequisite().equals(requisite))
                .findFirst()).orElse(rsl);
    }

    /**
     * Метод для перевода денег с одного счета на другой
     * Проверяет существует ли счет с которого будет произведен перевод
     * Проверяет существует ли счет на который будет осуществлен перевод
     * @param srcPassport - принимает паспортные данные отправителя денег
     * @param srcRequisite - принимает реквизиты счета с которого производится перевод
     * @param destPassport - принимает паспортные данные получаетля денег
     * @param destRequisite - принимает реквизиты счета на который производится перевод
     * @param amount - принимает сумму денег которую нужно перевести
     * @return возвращает информацию осуществлен перевод или нет
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> src = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> dest = findByRequisite(destPassport, destRequisite);
        if (src.isPresent() && dest.isPresent() && src.get().getBalance() >= amount) {
            src.get().setBalance(src.get().getBalance() - amount);
            dest.get().setBalance(dest.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}