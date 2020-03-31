package com.bta.eestilotto.service;

import com.bta.eestilotto.domain.LotteryTicket;
import com.bta.eestilotto.domain.UserAccount;

public interface UserAccountService {
    boolean login(String userName, String userPassword);
    void registerTicket(LotteryTicket ticket);
    int registration(UserAccount userAccount);
}
