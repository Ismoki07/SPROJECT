package com.example.SPROJECT.controllers;


import com.example.SPROJECT.models.Incident;
import com.example.SPROJECT.services.IncidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/incidents")
public class IncidentController {

    @Autowired
    IncidentService IncService;

    @GetMapping("/getAll")
    @ResponseBody
    public List<Incident> getAllIncident(){
        return IncService.getAllIncident();
    }

    @PostMapping("/create")
    @ResponseBody
    public Incident createIncident(@RequestBody Incident inc){
        return IncService.addIncident(inc);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public void deleteIncident(@PathVariable("id") Long idIncident){
        IncService.deleteById(idIncident);

    }
}

