package com.oecm.hazelcastdemo.controllers;

import com.hazelcast.core.IMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HazelcastController {

    @Autowired
    IMap<String, String> nameMap;

    @RequestMapping("/putValue")
    public String putValue(@RequestParam("key") String key, @RequestParam("value") String value) {
        nameMap.put(key, value);
        return "Thank you for your parameters!";
    }

    @RequestMapping("/getValue")
    public String getValue(@RequestParam("key") String key) {
        return nameMap.get(key);
    }
}
