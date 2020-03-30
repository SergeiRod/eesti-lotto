package com.bta.eestilotto.dao;

import com.bta.eestilotto.domain.VikingLottoResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VikingLottoResultRepository implements  BaseRepository<VikingLottoResult>{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public int saveOrUpdate(VikingLottoResult entity) {
        return jdbcTemplate.update("insert into viking_lotto_result (number1, " +
                        "number2, " +
                        "number3, " +
                        "number4, " +
                        "number5, " +
                        "number6, " +
                        "game_date) " +
                        "values (?, ?, ?, ?, ?, ?, ?)",
                entity.getNumber1(),
                entity.getNumber2(),
                entity.getNumber3(),
                entity.getNumber4(),
                entity.getNumber5(),
                entity.getNumber6(),
                entity.getGameDate());
    }

    @Override
    public int delete(VikingLottoResult entity) {
        return 0;
    }

    @Override
    public List<VikingLottoResult> findAll() {
        return null;
    }
}
