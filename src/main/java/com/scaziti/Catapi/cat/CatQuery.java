package com.scaziti.Catapi.cat;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@AllArgsConstructor
@Transactional(readOnly = true)
public class CatQuery {

    private final CatRepository catRepository;

    public List<Cat> findAll(){
        return catRepository.findAll();
    }

    public Cat findById(Long id){
        Optional<Cat> cat = catRepository.findById(id);

        if(cat.isEmpty()){
            throw new RuntimeException("Cat not found with ID: " + id);
        }

        return cat.get();
    }

}
