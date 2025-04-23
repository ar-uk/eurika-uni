package com.adil.urethra.driver.Controller;

import com.adil.urethra.driver.Model.Driver;
import com.adil.urethra.driver.Service.DriverService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drivers")
public class DriverController {

    private final DriverService driverService;

    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @GetMapping
    public List<Driver> getAllDrivers() {
        return driverService.getAllDrivers();
    }

    @GetMapping("/{id}")
    public Driver getDriver(@PathVariable Long id) {
        return driverService.getDriverById(id);
    }

    @PostMapping
    public Driver addDriver(@RequestBody Driver driver) {
        return driverService.createDriver(driver);
    }
}