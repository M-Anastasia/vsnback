package com.nasmas.vsnback.service;

import com.nasmas.vsnback.model.PersonInfo;
import com.nasmas.vsnback.repository.PersonInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonInfoService {

    @Autowired
    private PersonInfoRepository personInfoRepository;

    public PersonInfo getPersonInfoById(Long id) {
        return personInfoRepository.findById(id).orElse(null);
    }
}
