package com.wokivovich.tacocloud.repo;

import com.wokivovich.tacocloud.entity.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}
