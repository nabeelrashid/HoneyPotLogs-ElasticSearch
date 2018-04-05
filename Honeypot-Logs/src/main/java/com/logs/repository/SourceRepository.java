package com.logs.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.logs.model.Source;

@Repository
public interface SourceRepository extends ElasticsearchRepository<Source, Long> 
{
	List<Source> findAll();
	
}
