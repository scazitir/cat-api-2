package com.scaziti.Catapi.cat;

import lombok.AllArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@AllArgsConstructor
@Transactional(readOnly = true)
public class CatQuery {

    private final CatRepository catRepository;

    public List<Cat> findAll(){
        return catRepository.findAll();
    }
}
