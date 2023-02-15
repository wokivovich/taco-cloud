package com.wokivovich.tacocloud.repo;

import com.wokivovich.tacocloud.entity.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {

}
