package com.paket.service.repository;

import com.paket.service.model.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProviderRepository extends JpaRepository<Provider,Integer> {
    List<Provider> findByKartu(String kartu);
}
