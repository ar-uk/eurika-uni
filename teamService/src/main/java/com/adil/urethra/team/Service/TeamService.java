package com.adil.urethra.team.Service;

import com.adil.urethra.team.Client.DriverClient;
import com.adil.urethra.team.Model.Team;
import com.adil.urethra.team.Repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeamService {

    private final TeamRepository teamRepository;
    private final DriverClient driverClient;

    public TeamService(TeamRepository teamRepository, DriverClient driverClient) {
        this.teamRepository = teamRepository;
        this.driverClient = driverClient;
    }

    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    public Team getTeamById(Long id) {
        Team team = teamRepository.findById(id).orElse(null);
        if (team != null) {
            // Fetch drivers from driver-service and filter based on team name.
            List<Team.Driver> drivers = driverClient.getAllDrivers()
                    .stream()
                    .filter(driver -> driver.getTeam() != null && driver.getTeam().equalsIgnoreCase(team.getName()))
                    .map(driver -> new Team.Driver(driver.getId(), driver.getName(), driver.getNationality()))
                    .collect(Collectors.toList());
            team.setDrivers(drivers);
        }
        return team;
    }

    public Team createTeam(Team team) {
        return teamRepository.save(team);
    }
}