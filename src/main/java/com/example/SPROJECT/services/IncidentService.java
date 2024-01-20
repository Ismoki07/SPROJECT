package com.example.SPROJECT.services;


import com.example.SPROJECT.models.Incident;

import java.util.List;

public interface IncidentService {

    Incident addIncident(Incident inc);

    void deleteIncident(Incident inc);

    void deleteById(Long id);

    List<Incident> getAllIncident();
}

