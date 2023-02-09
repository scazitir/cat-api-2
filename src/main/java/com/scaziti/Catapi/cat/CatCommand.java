package com.scaziti.Catapi.cat;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

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

    public Cat update(Cat cat){
        if(catRepository.findById(cat.getId()).isEmpty()){
            throw new RuntimeException("Cat not found with ID: " + cat.getId());
        }

        return catRepository.save(cat);
    }

    public void delete(Long id){
        Optional<Cat> cat = catRepository.findById(id);
        if(cat.isEmpty()){
            throw new RuntimeException("Cat not found with ID: " + id);
        }
        catRepository.delete(cat.get());
    }
}
