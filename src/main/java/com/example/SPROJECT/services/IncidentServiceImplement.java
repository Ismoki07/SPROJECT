package com.example.SPROJECT.services;

import com.example.SPROJECT.models.Incident;
import com.example.SPROJECT.models.User;
import com.example.SPROJECT.repositories.IncidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncidentServiceImplement implements IncidentService{

    @Autowired
    IncidentRepository RepIncident;

    @Override
    public Incident addIncident(Incident inc) {
        RepIncident.save(inc);
        return inc;
    }

    @Override
    public void deleteIncident(Incident inc) {
        RepIncident.delete(inc);

    }

    @Override
    public void deleteById(Long id) {
        RepIncident.deleteById(id);

    }

    @Override
    public Incident getIncident(Long id) {
        return RepIncident.findById(id).orElse(null);
    }

    @Override
    public List<Incident> getAllIncident() {
        return (List<Incident>) RepIncident.findAll();
    }
}
