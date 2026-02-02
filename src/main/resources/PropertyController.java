package com.example.springbooot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/properties")
public class PropertyController {

    @Autowired
    private PropertyRepository repository;

    @GetMapping
    public List<ResidentialProperty> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public ResidentialProperty addProperty(@RequestBody ResidentialProperty property) {
        return repository.save(property);
    }
}