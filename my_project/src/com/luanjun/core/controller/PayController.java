package com.luanjun.core.controller;

import com.luanjun.core.annotation.BuyWay;
import com.luanjun.core.bean.BuyWayEnum;
import com.luanjun.core.service.impl.PayServiceImpl;

public class PayController {

	@BuyWay(BuyWayEnum.rewardBuy)
	public static void main(String[] args) {
		new PayServiceImpl().pay();
	}
}
