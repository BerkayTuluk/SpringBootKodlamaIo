package com.kodlama.io.Devs.business.Concretes;

import com.kodlama.io.Devs.business.Abstract.ProgrammingLanguageService;
import com.kodlama.io.Devs.dataAccess.Abstracts.ProgrammingLanguageRepository;
import com.kodlama.io.Devs.entities.Concretes.ProgrammingLanguage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingLanguageManger implements ProgrammingLanguageService {
    private ProgrammingLanguageRepository programmingLanguageRepository;

    public ProgrammingLanguageManger(ProgrammingLanguageRepository programmingLanguageRepository){
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageRepository.getAll();
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        if (programmingLanguage.getName() != "" && programmingLanguage.getName() == "Java"){
            programmingLanguageRepository.add(programmingLanguage);
        }
    }

    @Override
    public void delete(int id) {
        programmingLanguageRepository.delete(id);
    }

    @Override
    public void update(ProgrammingLanguage language) {
        programmingLanguageRepository.update(language);
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return programmingLanguageRepository.getId(id);
    }
}
