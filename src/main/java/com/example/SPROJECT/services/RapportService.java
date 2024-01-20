package com.example.SPROJECT.services;

import com.example.SPROJECT.models.Rapport;

import java.util.List;

public interface RapportService {

    Rapport addRapport(Rapport rapport);

    void deleteRapport(Rapport rapport);

    void deleteById(Long id);

    List<Rapport> getAllRapports();
}
