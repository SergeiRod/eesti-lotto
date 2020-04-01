package com.bta.eestilotto.service;

import com.bta.eestilotto.dao.VikingLottoResultRepository;
import com.bta.eestilotto.domain.VikingLottoResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class VikingLottoResultService implements ResultService {

    @Autowired
    private VikingLottoResultRepository vikingLottoResultRepository;

    @Override
    public VikingLottoResult getResults() {
        Set<Integer> results = new HashSet<>();
        Random random = new Random();
        while (results.size() < 6) {
            results.add(random.nextInt(49) + 1);
        }

        Iterator<Integer> iterator = results.iterator();
        int number1 = iterator.next();
        int number2 = iterator.next();
        int number3 = iterator.next();
        int number4 = iterator.next();
        int number5 = iterator.next();
        int number6 = iterator.next();
        VikingLottoResult vikingLottoResult = new VikingLottoResult(null, number1, number2,
                number3, number4, number5, number6, LocalDateTime.now());
        vikingLottoResultRepository.saveOrUpdate(vikingLottoResult);

        return vikingLottoResult;
    }

    @Override
    public Integer evaluatePrise(Set<Integer> results, Set<Integer> bets) {
        int count = (int) bets.stream().filter(integer -> results.contains(integer)).count();
        int prise = 0;
        switch (count) {
            case 2:
                prise = 5;
                break;
            case 3:
                prise = 50;
                break;
            case 4:
                prise = 500;
                break;
            case 5:
                prise = 5_000;
                break;
            case 6:
                prise = 5_000;
                break;
        }
        System.out.println("Your bets " + bets);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Lotto results " + results);
        System.out.println("You have " + count + " matches");
        System.out.println("Your prise " + prise + " eur");
        return prise;
    }

    @Override
    public List<VikingLottoResult> getAllResults() {
        //TODO implement at home jdbctempalate findAll
        return null;
    }

    // result : 1,3,8,6
    //bets: 0,6,1,9


}
