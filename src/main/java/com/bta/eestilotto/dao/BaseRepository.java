package com.bta.eestilotto.dao;

public interface BaseRepository<E> {
    int saveOrUpdate(E entity);
}
