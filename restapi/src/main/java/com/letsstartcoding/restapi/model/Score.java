package com.letsstartcoding.restapi.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="matchlist")
@EntityListeners(AuditingEntityListener.class)

public class Score {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String teamA;
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the teamA
	 */
	public String getTeamA() {
		return teamA;
	}
	/**
	 * @param teamA the teamA to set
	 */
	public void setTeamA(String teamA) {
		this.teamA = teamA;
	}
	/**
	 * @return the teamB
	 */
	public String getTeamB() {
		return teamB;
	}
	/**
	 * @param teamB the teamB to set
	 */
	public void setTeamB(String teamB) {
		this.teamB = teamB;
	}
	/**
	 * @return the matchstarted
	 */
	public Boolean getMatchstarted() {
		return matchstarted;
	}
	/**
	 * @param matchstarted the matchstarted to set
	 */
	public void setMatchstarted(Boolean matchstarted) {
		this.matchstarted = matchstarted;
	}
	private String teamB;
	private Boolean matchstarted;
	
	

}
