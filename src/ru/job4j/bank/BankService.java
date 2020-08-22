package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isEmpty()) {
            System.out.println("User not found");
        }
        List<Account> accounts = users.get(user.get());
        if (!accounts.contains(account)) {
            accounts.add(account);
        }
    }

    public Optional<User> findByPassport(String passport) {
        Optional<User> useri = users.keySet().stream()
                             .filter(user -> user.getPassport().equals(passport))
                             .findFirst();
        if (useri.isEmpty()) {
            System.out.println("User not found");
        }
        return useri;
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        Optional<Account> myAccount = users.get(user.get()).stream()
                                            .filter(account -> account.getRequisite().equals(requisite))
                                            .findFirst();
        if (myAccount.isEmpty()) {
            System.out.println("Account not found");
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
        Optional<Account> srcAccount = findByRequisite(srcPassport,srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isEmpty() || destAccount.isEmpty()) {
            return false;
        }
        if (srcAccount.get().getBalance() >= amount) {
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            result = true;
        }
        return result;
    }
}
