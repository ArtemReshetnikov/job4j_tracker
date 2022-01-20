package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        User user = findByPassport(passport);
        if (user != null && !users.get(user).contains(account)) {
            users.get(user).add(account);
        }
    }

    /**
     * Метод для поиска клиента по паспортным данным
     * @param passport - принимает паспортные данные
     * @return - возвращает информацию о клиенте(найдет или не найден)
     */
    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод для поиска счета клиента
     * Проверяет есть ли такой клиент в базе по паспортным данным
     * Проверяеь есть ли у клиента счет с введенными реквизитами
     * @param passport - принимает паспортные данные
     * @param requisite - принимает реквизиты счета
     * @return - возвращает информацию о счете клиента(найден или не найден)
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
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
        Account src = findByRequisite(srcPassport, srcRequisite);
        Account dest = findByRequisite(destPassport, destRequisite);
        if (src != null && dest != null && src.getBalance() >= amount) {
            src.setBalance(src.getBalance() - amount);
            dest.setBalance(dest.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}