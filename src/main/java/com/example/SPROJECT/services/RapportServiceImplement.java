package com.example.SPROJECT.services;

import com.example.SPROJECT.models.Rapport;
import com.example.SPROJECT.repositories.RapportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RapportServiceImplement implements RapportService {

    @Autowired
    private RapportRepository rapportRepository;

    @Override
    public Rapport addRapport(Rapport rapport) {
        rapportRepository.save(rapport);
        return rapport;
    }

    @Override
    public void deleteRapport(Rapport rapport) {
        rapportRepository.delete(rapport);
    }

    @Override
    public void deleteById(Long id) {
        rapportRepository.deleteById(id);
    }

    @Override
    public List<Rapport> getAllRapports() {
        return rapportRepository.findAll();
    }
}
