package com.yui.parkfinder;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ParkService {

    private List<Park> parks = Arrays.asList(
        new Park(1, "さくら公園", "倉敷市1丁目", 0, 6, true),
        new Park(2, "もも公園", "倉敷市2丁目", 3, 12, false),
        new Park(3, "ひまわり公園", "倉敷市3丁目", 1, 8, true)
    );

    public List<Park> getParks() {
        return parks;
    }

    public List<Park> searchByAge(int age) {
        return parks.stream()
                .filter(p -> age >= p.getMinAge() && age <= p.getMaxAge())
                .toList();
    }

    public Park getParkById(int id) {
        return parks.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }
}