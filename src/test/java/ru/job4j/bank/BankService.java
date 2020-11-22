package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<Account>());
        }
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        String dataRequisite = account.getRequisite();
        List<Account> dataAccount = users.get(user);
        if (!dataAccount.contains(account)) {
            dataAccount.add(account);
        }
    }

    public User findByPassport(String passport) {
        Set<User> bankUsers = this.users.keySet();
        for (User user : bankUsers) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }

        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User bankUser = findByPassport(passport);
        if (bankUser == null) {
            return null;
        }
        List<Account> dataAccountBankUser = users.get(bankUser);
        for (Account account : dataAccountBankUser) {
            if (account.getRequisite().equals(requisite)) {
                return account;
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String requisiteUser, double amount) {

        if (findByRequisite(destPassport, requisiteUser) == null) {
            return false;
        }

        Account user = findByRequisite(srcPassport, srcRequisite);
        if (user.getBalance() < amount) {
            return false;
        }
        Account source = findByRequisite(srcPassport, srcRequisite);
        double sourceBalance = source.getBalance() - amount;
        source.setBalance(sourceBalance);
        Account dest = findByRequisite(destPassport, requisiteUser);
        double destBalance = dest.getBalance() + amount;
        dest.setBalance(destBalance);
        return true;
    }
}
