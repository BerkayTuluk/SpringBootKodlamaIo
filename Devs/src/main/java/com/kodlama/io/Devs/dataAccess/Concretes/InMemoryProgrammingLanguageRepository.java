package com.kodlama.io.Devs.dataAccess.Concretes;

import com.kodlama.io.Devs.dataAccess.Abstracts.ProgrammingLanguageRepository;
import com.kodlama.io.Devs.entities.Concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {
    List<ProgrammingLanguage> programmingLanguages;

    public InMemoryProgrammingLanguageRepository(){
        programmingLanguages = new ArrayList<ProgrammingLanguage>();
        programmingLanguages.add(new ProgrammingLanguage(1, "Java"));
        programmingLanguages.add(new ProgrammingLanguage(2, "Golang"));
        programmingLanguages.add(new ProgrammingLanguage(3, "C#"));
        programmingLanguages.add(new ProgrammingLanguage(4, "Python"));
    }
    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        this.programmingLanguages.add(programmingLanguage);
    }

    @Override
    public void delete(int id) {
        for (ProgrammingLanguage programmingLanguage : programmingLanguages){
            if (programmingLanguage.getId() == id){
                programmingLanguages.remove(programmingLanguage);
            }
        }
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        for (ProgrammingLanguage programmingLanguage1 : programmingLanguages){
            if (programmingLanguage1.getId() == programmingLanguage.getId()){
                programmingLanguage1.setName(programmingLanguage.getName());
            }
        }
    }

    @Override
    public ProgrammingLanguage getId(int id) {
        ProgrammingLanguage language = new ProgrammingLanguage();
        for (ProgrammingLanguage programmingLanguage : programmingLanguages){
            if (programmingLanguage.getId() == id) {
                language = programmingLanguage;
                System.out.println(language.getId() + " - " + language.getName());
            }
        }
        return language;
    }
}
