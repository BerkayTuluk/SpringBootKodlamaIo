package com.kodlama.io.Devs.business.Abstract;

import com.kodlama.io.Devs.entities.Concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    List<ProgrammingLanguage> getAll();
    void add(ProgrammingLanguage programmingLanguage);
    void delete(int id );
    void update(ProgrammingLanguage language);
    ProgrammingLanguage getById(int id);
}
