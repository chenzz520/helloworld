package com.hukston.gmall.service;

import java.util.List;

import com.hukston.gmall.bean.UserAddress;

public interface OrderService {
	/**
	 * 初始化订单
	 * @param userId
	 */
public List<UserAddress> initOrder(String userId);
}
