package com.scaziti.Catapi.cat;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class CatCommand {

    private final CatRepository catRepository;

    public Cat create(Cat cat){
        if (catRepository.findById(cat.getId()).isPresent()){
            throw new RuntimeException("Cat already registered");
        }

        return catRepository.save(cat);
    }
}
