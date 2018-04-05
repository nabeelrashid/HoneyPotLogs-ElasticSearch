package com.logs;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
//import org.elasticsearch.node.NodeBuilder;
//import org.elasticsearch.node.NodeBuilder;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

/**
 * @class for configuration of elasticsearch
 */

@Configuration
@EnableElasticsearchRepositories(basePackages="com.logs.repository")
public class ElasticSetting 
{

	@Value("${spring.data.elasticsearch.cluster-name}")
	String clusterName;

	 @Bean
	public ElasticsearchOperations elasticsearchTemplate() throws Exception {

		Settings settings = Settings.builder()
		        .put("cluster.name", clusterName).build();
		System.out.println("name is  "+clusterName);
		TransportClient client = new PreBuiltTransportClient(settings);
		return new ElasticsearchTemplate(client);
	}
	 
	 
	 
	 

	
}
