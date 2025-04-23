package com.adil.urethra.race.Service;

import com.adil.urethra.race.Model.Race;
import com.adil.urethra.race.Repository.RaceRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class RaceService {

    private final RaceRepository raceRepository;

    public RaceService(RaceRepository raceRepository) {
        this.raceRepository = raceRepository;
    }

    public Race createRace(Race race) {
        return raceRepository.save(race);
    }

    public Race getRaceById(Long id) {
        return raceRepository.findById(id).orElse(null);
    }

    public Race getLatestRace() {
        // Retrieve the latest race based on the race date.
        List<Race> races = raceRepository.findAll();
        return races.stream()
                .max(Comparator.comparing(Race::getDate))
                .orElse(null);
    }
}