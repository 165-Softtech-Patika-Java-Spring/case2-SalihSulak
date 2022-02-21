package com.salihsulak.addressregistrationsystem.country.service.entityservice;

import com.salihsulak.addressregistrationsystem.country.entity.Country;
import com.salihsulak.addressregistrationsystem.country.exceptions.CountryNotFoundException;
import com.salihsulak.addressregistrationsystem.country.repository.CountryRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CountryEntityService {

    private final CountryRepository countryRepository;

    public Country save(Country country) {
        return countryRepository.save(country);
    }

    public Country findById(Short countryCode) {

        Optional<Country> country = countryRepository.findById(countryCode);

        if(country.isPresent())
            return country.get();
        else
            throw new CountryNotFoundException();

    }
}
