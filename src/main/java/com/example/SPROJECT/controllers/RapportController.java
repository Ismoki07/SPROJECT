package com.example.SPROJECT.controllers;

import com.example.SPROJECT.models.Rapport;
import com.example.SPROJECT.services.RapportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rapports")
public class RapportController {

    @Autowired
    private RapportService rapportService;

    @GetMapping("/getAll")
    @ResponseBody
    public List<Rapport> getAllRapports() {
        return rapportService.getAllRapports();
    }
    @GetMapping("/{id}")
    @ResponseBody
    public Rapport getRapport(@PathVariable ("id") Long rapportId) {
        return rapportService.getRapport(rapportId);
    }

    @PostMapping("/create")
    @ResponseBody
    public Rapport createRapport(@RequestBody Rapport rapport) {
        return rapportService.addRapport(rapport);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public void deleteRapport(@PathVariable("id") Long rapportId) {
        rapportService.deleteById(rapportId);
    }
}
