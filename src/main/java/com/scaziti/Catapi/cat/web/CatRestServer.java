package com.scaziti.Catapi.cat.web;

import com.scaziti.Catapi.cat.Cat;
import com.scaziti.Catapi.cat.CatQuery;
import lombok.AllArgsConstructor;
import org.springframework.hateoas.server.ExposesResourceFor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@ExposesResourceFor(Cat.class)
@RequestMapping("api/v1/cats")
public class CatRestServer {

    private final CatQuery catQuery;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Cat> findAll(){
        return catQuery.findAll();
    }
}
