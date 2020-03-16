package org.gomezrondon;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FruitRepository extends CrudRepository<Fruit, Long> {
    List<Fruit> findAllByName(String name);
    List<Fruit> findByColor(String color);
}