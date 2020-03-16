package org.gomezrondon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FruitResource {

    private final FruitRepository fruitRepository;

    public FruitResource(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    @GetMapping("/greeting")
    public String hello() {
        List<Fruit> green = fruitRepository.findAllByName("Banana2");

        return "hello "+green.size();
    }
}