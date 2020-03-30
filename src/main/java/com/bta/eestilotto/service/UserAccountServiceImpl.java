package com.bta.eestilotto.service;

import com.bta.eestilotto.dao.LotteryTicketRepository;
import com.bta.eestilotto.dao.UserAccountRepository;
import com.bta.eestilotto.domain.LotteryTicket;
import com.bta.eestilotto.domain.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserAccountServiceImpl implements UserAccountService {

    @Autowired
    private LotteryTicketRepository lotteryTicketRepository;

    @Autowired
    private UserAccountRepository userAccountRepository;

    @Override
    public boolean login(String userName, String userPassword) {
        List<UserAccount> userAccount = userAccountRepository.findUserAccountByUserName(userName);
        if (userAccount.isEmpty()) return false;

        UserAccount userAccount1 = userAccount.get(0);
        if (userAccount1.getUserPassword().equals(userPassword)) {
            return true;
        }

        return false;
    }

    @Override
    public void registerTicket(LotteryTicket ticket) {

    }
}
