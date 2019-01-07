package com.icome.dao;

import com.icome.pojo.Luck;

/**
 * describe:
 *
 * @date: 2019/01/05 08:34:8:34
 * @version: V1.0
 * @review:
 */
public interface ILuckDAO {

    /**
     * 查询当前要抽取的奖品信息
     * @return
     */
    Luck getLuckInfo();

    /**
     * 抽奖完成，更新抽奖状态
     * @param pojo
     * @return
     */
    int update(Luck pojo);

    Luck getLuck(int id);
}
