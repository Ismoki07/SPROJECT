package com.example.SPROJECT.services;

import com.example.SPROJECT.models.Incident;
import com.example.SPROJECT.models.Rapport;

import java.util.List;

public interface RapportService {

    Rapport addRapport(Rapport rapport);
    Rapport getRapport(Long id);

    void deleteRapport(Rapport rapport);

    void deleteById(Long id);

    List<Rapport> getAllRapports();
}
