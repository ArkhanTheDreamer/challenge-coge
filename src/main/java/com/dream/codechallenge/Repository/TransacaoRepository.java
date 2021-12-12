package com.dream.codechallenge.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dream.codechallenge.domain.Transacao;

@Repository
public interface TransacaoRepository extends MongoRepository<Transacao, String> {
	
}
