package com.oecm.hazelcastdemo;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.oecm.hazelcastdemo.configuration.HazelcastConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HazelcastdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HazelcastdemoApplication.class, args);
		HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance();
	}

}
