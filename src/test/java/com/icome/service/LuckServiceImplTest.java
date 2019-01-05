package com.icome.service;

import com.icome.base.BaseTestClass;
import com.icome.pojo.Luck;
import org.junit.Test;

/**
 * describe:
 *
 * @author: shi_lei@suixingpay.com
 * @date: 2019/01/05 11:02:11:02
 * @version: V1.0
 * @review:
 */
public class LuckServiceImplTest extends BaseTestClass {

    private ILuckService luckService = (ILuckService) getInstance("luckService");

    @Test
    public void getLuckInfo() {
        Luck luck = luckService.getLuckInfo();
        System.out.println(luck);
    }

    @Test
    public void getLuck() {
        Luck luck = luckService.getLuck(1);
        System.out.println(luck);
    }

    @Test
    public void update() {
        Luck luck = luckService.getLuck(4);
        luck.setStatus(Luck.STATUS_INIT);
        luckService.update(luck);
    }

    @Test
    public void luckDraw() {
        int luckId = 4;
        int joinNum = 1000;
        int rewardNum = 100;

        luckService.luckDraw(luckId, joinNum, rewardNum);
    }
}