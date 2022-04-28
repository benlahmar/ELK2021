package com.habib.moi.dao;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.habib.moi.models.Bank;

public interface IBank extends ElasticsearchRepository<Bank, String>{

}
