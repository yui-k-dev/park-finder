package com.yui.parkfinder;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ParkController {

    private final ParkService parkService;

    public ParkController(ParkService parkService) {
        this.parkService = parkService;
    }

    @GetMapping("/parks")
    public List<Park> getParks() {
        return parkService.getParks();
    }

    @GetMapping("/parks/search")
    public List<Park> searchParks(@RequestParam int age) {
        return parkService.searchByAge(age);
    }

    @GetMapping("/parks/{id}")
    public Park getPark(@PathVariable int id) {
        return parkService.getParkById(id);
    }
}