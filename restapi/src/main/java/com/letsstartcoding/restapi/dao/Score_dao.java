package com.letsstartcoding.restapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.restapi.model.Score;
import com.letsstartcoding.restapi.repository.Score_repository;
@Service
public class Score_dao {
	@Autowired
	Score_repository scorerepository;
	
      /*to save the score*/
	public Score save(Score sc)
	{
		return scorerepository.save(sc);
}
	public List<Score> findAll()
	{
		return scorerepository.findAll();
	}
	public Score findOne(Long matchid)
	{
		return scorerepository.getOne(matchid);
		
	}

	
	
	
}
