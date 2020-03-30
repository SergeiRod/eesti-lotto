package com.bta.eestilotto.dao;

import com.bta.eestilotto.domain.LotteryTicket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LotteryTicketRepository implements BaseRepository<LotteryTicket> {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;


    @Override
    public int saveOrUpdate(LotteryTicket entity) {
        MapSqlParameterSource map = new MapSqlParameterSource();
        map.addValue("vikingLottoResultId", entity.getResultId());
        map.addValue("userAccountId", entity.getUserAccountId());
        map.addValue("number1", entity.getTicketNum1());
        map.addValue("number2", entity.getTicketNum2());
        map.addValue("number3", entity.getTicketNum3());
        map.addValue("number4", entity.getTicketNum4());
        map.addValue("number5", entity.getTicketNum5());
        map.addValue("number6", entity.getTicketNum6());

        return namedParameterJdbcTemplate.update("insert into viking_lotto_ticket (number1, " +
                "viking_lotto_result_id," + //foreign key
                "user_account_id," + //foreign key
                "number2, " +
                "number3, " +
                "number4, " +
                "number5, " +
                "number6, " +
                "game_date) " +
                "values (:vikingLottoResultId, userAccountId, :number1, :number2, :number3," +
                " :number4, :number5, :number6)", map);
    }

    @Override
    public int delete(LotteryTicket entity) {
        return 0;
    }

    @Override
    public List<LotteryTicket> findAll() {
        return null;
    }
}
