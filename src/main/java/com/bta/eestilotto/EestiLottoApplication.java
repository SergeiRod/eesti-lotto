package com.bta.eestilotto;

import com.bta.eestilotto.dao.UserAccountRepository;
import com.bta.eestilotto.domain.LotteryTicket;
import com.bta.eestilotto.domain.UserAccount;
import com.bta.eestilotto.domain.VikingLottoResult;
import com.bta.eestilotto.service.ResultService;
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

    @Autowired
    private ResultService resultService;

    public static void main(String[] args) {


        System.out.println("Hello from Boot App!");
        SpringApplication.run(EestiLottoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        boolean loginChek1 = userAccountService.login("adggadj", "hhuhuhu");
        System.out.println(loginChek1);
        boolean serod = userAccountService.login("srvsilver@yahoo.com", "heLLo1!");
        System.out.println(serod);

        /*Set<Integer> bets = new HashSet<>(10);
        bets.add(2);
        bets.add(5);
        bets.add(18);
        bets.add(48);
        bets.add(35);
        bets.add(22);*/

        LotteryTicket lotteryTicket= new LotteryTicket(null, 1L, 1L,
                16, 34, 44, 15, 20, 21);
        System.out.println(lotteryTicket.getResultId());


        VikingLottoResult results = resultService.getResults();


        //Integer prise = resultService.evaluatePrise(results, bets);


    }

}
