package com.example.java_web_final_project;
import com.example.myproject.model.Book;
import com.example.myproject.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/dogs")
public class DogsController {

    private final DogsRepository dogsRepository;

    @GetMapping
    public List<Dogs> getAllDogs() {
        return dogsRepository.findAll();
    }


    @PostMapping
    public ResponseEntity<Dogs> createDogs(@RequestBody Dogs dogs) {
        Dogs savedDogs = dogsRepository.save(Dogs);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedDogs);
    }

    @PutMapping("/dogs")
    public ResponseEntity<Dogs> updateDogs(@PathVariable Long id, @RequestBody Dogs dogs) {
        if (!dogsRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        dogs.setId(id);
        Dogs updatedDogs = dogsRepository.save(dogs);
        return ResponseEntity.ok(updatedDogs);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDogs(@PathVariable Long id) {
        if (!dogsRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
       dogsRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

