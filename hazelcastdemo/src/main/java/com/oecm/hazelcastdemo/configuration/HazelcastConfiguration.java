package com.oecm.hazelcastdemo.configuration;

import com.hazelcast.config.Config;
import com.hazelcast.config.ManagementCenterConfig;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HazelcastConfiguration {

    @Bean
    public Config hazelCastConfiguration() {
        Config config = new Config();
        config.getManagementCenterConfig().setEnabled(true);
        config.getManagementCenterConfig().setUrl("http://localhost:8080/hazelcast-mancenter");
        config.getNetworkConfig().setPortAutoIncrement(true);
        config.getNetworkConfig().setPort(10555);
        config.getNetworkConfig().getJoin().getMulticastConfig().setEnabled(false);
        config.getNetworkConfig().getJoin().getTcpIpConfig().setEnabled(true);
        config.getNetworkConfig().getJoin().getTcpIpConfig().addMember("127.0.0.1");
        return config;
    }

    @Bean
    public IMap<String, String> nameMap(HazelcastInstance hazelcastInstance) {
        return hazelcastInstance.getMap("nameMap");
    }
}
