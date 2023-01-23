package com.wokivovich.tacocloud.repo;

import com.wokivovich.tacocloud.entity.TacoOrder;

public interface OrderRepository {

    TacoOrder save(TacoOrder order);
}
