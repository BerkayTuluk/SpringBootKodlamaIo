package com.kodlama.io.Devs.webApi.Contorller;

import com.kodlama.io.Devs.dataAccess.Abstracts.ProgrammingLanguageRepository;
import com.kodlama.io.Devs.entities.Concretes.ProgrammingLanguage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programminglanguage")
public class ProgrammingLanguageController {
    private ProgrammingLanguageRepository languageRepository;
    public ProgrammingLanguageController(ProgrammingLanguageRepository programmingLanguageRepository){
        super();
        this.languageRepository = programmingLanguageRepository;
    }

    @GetMapping("/getall")
    public List<ProgrammingLanguage> getAll(){
        return languageRepository.getAll();
    }

    @GetMapping("/getbyid/{id}")
    public ProgrammingLanguage getById(@PathVariable("id") int id){
        return languageRepository.getId(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody ProgrammingLanguage programmingLanguage){
        languageRepository.add(programmingLanguage);
    }

    @PostMapping("/update")
    public void update(@RequestBody ProgrammingLanguage programmingLanguage){
        languageRepository.update(programmingLanguage);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id ){
        languageRepository.delete(id);
    }
}
