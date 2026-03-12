package com.yui.parkfinder;

public class Park {

    private int id;
    private String name;
    private String address;
    private int minAge;
    private int maxAge;
    private boolean hasParking;

    public Park(int id, String name, String address, int minAge, int maxAge, boolean hasParking) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.hasParking = hasParking;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getMinAge() {
        return minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public boolean isHasParking() {
        return hasParking;
    }
}