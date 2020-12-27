package com.hukston.gmall.service;

import java.util.List;

import com.hukston.gmall.bean.UserAddress;

public interface UserService {
public List<UserAddress> getUserAddressesList(String userId);
}
