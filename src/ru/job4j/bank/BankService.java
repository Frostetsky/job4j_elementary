package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user == null) {
            return;
        }
        List<Account> accounts = users.get(user);
        if (!accounts.contains(account)) {
            accounts.add(account);
        }
    }

    public User findByPassport(String passport) {
        User user = null;
        for (User  useri:  users.keySet()) {
            if (useri.getPassport().equals(passport)) {
                user = useri;
                break;
            }
        }
        return user;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account myAccount = null;
        User user = findByPassport(passport);
        if (user == null) {
            return null;
        }
        List<Account> accounts = users.get(user);
        for (Account account : accounts) {
            if (account.getRequisite().equals(requisite)) {
                myAccount = account;
                break;
            }
        }
        return myAccount;
    }

    /**
     *
     * @param srcPassport - паспорт того, кто переводит.
     * @param srcRequisite - реквизиты того, кому переводят.
     * @param destPassport - паспорт того, кому переводят.
     * @param destRequisite - реквизиты того, кому переводят.
     * @param amount - сумма.
     * @return - результат перевода.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean result = false;
        Account srcAccount = findByRequisite(srcPassport,srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount == null || destAccount == null) {
            return false;
        }
        if (srcAccount.getBalance() >= amount) {
            destAccount.setBalance(destAccount.getBalance() + amount);
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            result = true;
        }
        return result;
    }
}
