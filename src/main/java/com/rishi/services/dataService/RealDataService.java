package com.rishi.services.dataService;

public class RealDataService implements DataService{
    @Override
    public String getData(String key) {
        System.out.println("Fetching real data from the database...");
        return "Data for key " + key;
    }
}
