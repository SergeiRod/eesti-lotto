package com.bta.eestilotto;

import com.bta.eestilotto.dao.UserAccountRepository;
import com.bta.eestilotto.domain.UserAccount;
import com.bta.eestilotto.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EestiLottoApplication implements CommandLineRunner {

    @Autowired
    private UserAccountService userAccountService;

    @Autowired
    private UserAccountRepository userAccountRepository;

    public static void main(String[] args) {


        System.out.println("Hello from Boot App!");
        SpringApplication.run(EestiLottoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*UserAccount user1 = new UserAccount();
        user1.setUserName("artjom.gg@gmail.com");
        user1.setUserPassword("artjomgg");
        user1.setFirstName("Artjom");
        user1.setLastName("Guguljan");
        user1.setIsikuKood(38205050248l);
        user1.setEmail("artjom.gg@gmail.com");*/

        boolean loginChek1 = userAccountService.login("adggadj", "hhuhuhu");
        System.out.println(loginChek1);
        boolean artjomgg = userAccountService.login("artjom.gg@gmail.com", "artjomgg");
        System.out.println(artjomgg);


    }
}
