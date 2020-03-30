package com.bta.eestilotto.dao;

import com.bta.eestilotto.domain.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserAccountRepository implements BaseRepository<UserAccount> {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public int saveOrUpdate(UserAccount entity) {
        return jdbcTemplate.update("insert into user_account (userName, " +
                        "userPassword, " +
                        "firstName, " +
                        "lastName, " +
                        "isikuKood, " +
                        "email) " +
                        "values (?, ?, ?, ?, ?, ?)",
                entity.getUserName(),
                entity.getUserPassword(),
                entity.getFirstName(),
                entity.getLastName(),
                entity.getIsikuKood(),
                entity.getEmail());
    }

    public List<UserAccount> findUserAccountByUserName(String userName) {
        String sql = "select * from user_account where userName = :userName";
        MapSqlParameterSource map = new MapSqlParameterSource();
        map.addValue("userName", userName);

        return namedParameterJdbcTemplate.query(sql, map, (resultSet, i) ->
        new UserAccount(resultSet.getLong("id"),
                resultSet.getString("userName"),
                resultSet.getString("userPassword"),
                resultSet.getString("firstName"),
                resultSet.getString("lastName"),
                resultSet.getLong("isikuKood"),
                resultSet.getString("email")
        ));
    }

    @Override
    public int delete(UserAccount entity) {
        return 0;
    }

    @Override
    public List<UserAccount> findAll() {
        return null;
    }
}
