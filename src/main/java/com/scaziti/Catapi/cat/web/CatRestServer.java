package com.scaziti.Catapi.cat.web;

import com.scaziti.Catapi.cat.Cat;
import com.scaziti.Catapi.cat.CatQuery;
import lombok.AllArgsConstructor;
import org.springframework.hateoas.server.ExposesResourceFor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@ExposesResourceFor(Cat.class)
@RequestMapping("api/v1/cats/")
public class CatRestServer {

    private final CatQuery catQuery;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Cat> findAll(){
        return catQuery.findAll();
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public Cat findById(@PathVariable Long id){
        return catQuery.findById(id);
    }
}
