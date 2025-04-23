package com.adil.urethra.team.Client;

import com.adil.urethra.team.Model.DTO.DriverDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(name = "driver-service", url = "http://localhost:8081")
public interface DriverClient {
    
    @GetMapping("/drivers")
    List<DriverDTO> getAllDrivers();
}
