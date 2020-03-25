package com.bta.eestilotto.service;

import com.bta.eestilotto.dao.UserAccountRepository;
import com.bta.eestilotto.domain.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserAccountImpl implements UserAccountService {
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
}
