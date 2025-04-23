package com.adil.urethra.race.Controller;

import com.adil.urethra.race.Model.Race;
import com.adil.urethra.race.Service.RaceService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/races")
public class RaceController {

    private final RaceService raceService;

    public RaceController(RaceService raceService) {
        this.raceService = raceService;
    }

    @PostMapping
    public Race createRace(@RequestBody Race race) {
        return raceService.createRace(race);
    }

    @GetMapping("/{id}")
    public Race getRace(@PathVariable Long id) {
        return raceService.getRaceById(id);
    }

    @GetMapping("/winner")
    public Race getLatestRaceAndWinner() {
        return raceService.getLatestRace();
    }
}