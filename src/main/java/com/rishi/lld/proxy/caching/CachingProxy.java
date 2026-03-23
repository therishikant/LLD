package com.rishi.lld.proxy.caching;

import com.rishi.services.dataService.DataService;
import com.rishi.services.dataService.RealDataService;

import java.util.HashMap;
import java.util.Map;

public class CachingProxy implements DataService {
    private DataService realDataService = new RealDataService();
    private Map<String , String> cache = new HashMap<>();

    @Override
    public String getData(String key) {
        if(cache.containsKey(key)){
            System.out.println("Returning cached data for key: " + key);
            return cache.get(key);
        }
        String data = realDataService.getData(key);
        cache.put(key, data);
        return data;
    }
}
