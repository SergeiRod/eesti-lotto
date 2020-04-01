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

    /*@Autowired
    private UserAccountService userAccountService;
*/
    /*@Autowired
    private UserAccountRepository userAccountRepository;
    */

    /*@Autowired
    private ResultService resultService;*/


    public static void main(String[] args) {


        System.out.println("Hello from Boot App!");
        SpringApplication.run(EestiLottoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        /*LotteryTicket lotteryTicket= new LotteryTicket(null, 1L, 1L,
                16, 34, 44, 15, 20, 21);
        System.out.println(lotteryTicket.getResultId());


        VikingLottoResult results = resultService.getResults();

        UserAccount userAccount1 = new UserAccount(null, "Sergei", "Rodkin",
                "rod11", "www111", 38210153234L, "srvsilver@yahoo.com");
        //userAccountService.registration(userAccount1);
        boolean login = userAccountService.login("rod11", "www111");
        System.out.println(login ? "Login successful" : "Login failed");
        //Integer prise = resultService.evaluatePrise(results, bets);*/

        //userAccountRepository.delete();
    }

}
