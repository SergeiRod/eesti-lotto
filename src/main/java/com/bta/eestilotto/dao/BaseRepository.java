package com.bta.eestilotto.dao;

import com.bta.eestilotto.domain.BaseEntity;

import java.util.List;

public interface BaseRepository<E extends BaseEntity> {
    int saveOrUpdate(E entity);
    int delete(E entity);
    List<E> findAll();

}
