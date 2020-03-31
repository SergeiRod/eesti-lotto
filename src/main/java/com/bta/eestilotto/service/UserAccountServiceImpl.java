package com.bta.eestilotto.service;

import com.bta.eestilotto.dao.LotteryTicketRepository;
import com.bta.eestilotto.dao.UserAccountRepository;
import com.bta.eestilotto.domain.LotteryTicket;
import com.bta.eestilotto.domain.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserAccountServiceImpl implements UserAccountService {

    @Autowired
    private LotteryTicketRepository lotteryTicketRepository;

    @Autowired
    private UserAccountRepository userAccountRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public boolean login(String userName, String userPassword) {
        List<UserAccount> userAccounts = userAccountRepository.findUserAccountByUserName(userName);
        if (userAccounts.isEmpty()) return false;

        UserAccount userAccount1 = userAccounts.get(0);
        if (bCryptPasswordEncoder.matches(userPassword, userAccount1.getUserPassword())) {
            return true;
        }

        return false;
    }

    @Override
    public void registerTicket(LotteryTicket ticket) {

    }

    @Override
    public int registration(UserAccount userAccount) {
        List<UserAccount> userAccounts = userAccountRepository.findUserAccountByUserName(userAccount.getUserName());
        if (!userAccounts.isEmpty()) {
            throw new RuntimeException("Use with " + userAccount.getUserName() + " already exists!");
        }
        String encodedPassword = bCryptPasswordEncoder.encode(userAccount.getUserPassword());
        userAccount.setUserPassword(encodedPassword);

        return userAccountRepository.saveOrUpdate(userAccount);
    }
}
