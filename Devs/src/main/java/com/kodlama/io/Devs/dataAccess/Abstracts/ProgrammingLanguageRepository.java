package com.kodlama.io.Devs.dataAccess.Abstracts;

import com.kodlama.io.Devs.entities.Concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageRepository {
    List<ProgrammingLanguage> getAll();

    void add(ProgrammingLanguage programmingLanguage);

    void delete(int id);

    void update(ProgrammingLanguage programmingLanguage);

    ProgrammingLanguage getId(int id);
}
