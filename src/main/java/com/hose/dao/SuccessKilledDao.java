package com.hose.dao;

import com.hose.entity.SuccessKilled;

/**
 * Created by chengyuan on 2018/2/24.
 */
public interface SuccessKilledDao {
    /**
     *
     * @param seckillId
     * @param userPhone
     * @return 插入的行数
     */
    int insertSuccessKilled(long seckillId, long userPhone);

    /**
     *
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(long seckillId);
}
