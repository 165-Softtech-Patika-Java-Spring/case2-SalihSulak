package com.salihsulak.addressregistrationsystem.country.repository;

import com.salihsulak.addressregistrationsystem.country.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Short> {
}
