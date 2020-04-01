package com.bta.eestilotto.service;

import com.bta.eestilotto.domain.VikingLottoResult;

import java.util.List;
import java.util.Set;

public interface ResultService {
    VikingLottoResult getResults();
    Integer evaluatePrise(Set<Integer> results, Set<Integer> bets);
    List<VikingLottoResult>getAllResults();
}
