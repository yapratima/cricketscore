package com.letsstartcoding.restapi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.letsstartcoding.restapi.dao.Score_dao;
import com.letsstartcoding.restapi.model.Score;

@RestController
@RequestMapping("/crickScore")
public class Score_controller {
	@Autowired
	Score_dao ScoreDao;
	@PostMapping("/matchlist")
	public Score createScore(@Valid @RequestBody Score sc)
	{
		return ScoreDao.save(sc);
	
	}
	/*getAll matches*/
	@GetMapping("/allmatches/{id}")
	public List<Score> getallmatches(){
		return ScoreDao.findAll();
	}
	
	@GetMapping("/match/id")
	public ResponseEntity<Score> getmatchbyid(@PathVariable(value="id") Long matchid)
	{
		Score sc=ScoreDao.findOne(matchid);
		if(sc==null)
		{
			return ResponseEntity.notFound().build();
			
		}
		
		return ResponseEntity.ok().body(sc);
	}
	@PutMapping("/allmatches/{id}")
	public ResponseEntity<Score> updaeScore(@PathVariable(value="id") Long matchid,@Valid @RequestBody Score matchetails)
	{
		Score sc=ScoreDao.findOne(matchid);
		if(sc==null)
		{
			return ResponseEntity.notFound().build();
			
		}
		sc.setId(matchetails.getId());
		sc.setTeamA(matchetails.getTeamA());
		sc.setTeamB(matchetails.getTeamB());
		sc.setMatchstarted(matchetails.getMatchstarted());
		Score updatescore=ScoreDao.save(sc);
		return ResponseEntity.ok().body(updatescore);
		
	}

}
