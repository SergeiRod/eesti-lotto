package com.bta.eestilotto.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class VikingLottoResultService implements ResultService {
    @Override
    public Set<Integer> getResults() {
        //TODO Implement at home Math.random
        return null; //Set
    }

    @Override
    public Integer evaluatePrise(Set<Integer> results, Set<Integer> bets) {
        int count = (int) bets.stream().filter(integer -> results.contains(integer)).count();
        switch (count) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 5;
            case 3:
                return 50;
            case 4:
                return 500;
            case 5:
                return 5000;
            case 6:
                return 50_000;
            default:
                return 0;
        }
    }

    // result : 1,3,8,6
    //bets: 0,6,1,9


}
