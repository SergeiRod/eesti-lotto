package com.bta.eestilotto.service;

import java.util.Set;

public interface ResultService {
    Set<Integer> getResults();
    Integer evaluatePrise(Set<Integer> results, Set<Integer> bets);
}
