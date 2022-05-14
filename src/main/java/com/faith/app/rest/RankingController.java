package com.faith.app.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.dto.RankStudentDto;
import com.faith.app.entity.Ranking;
import com.faith.app.service.IRankingService;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class RankingController {

	
	@Autowired
	private IRankingService rankingService;
	
	//Get all Rankings
	@GetMapping("/rankings")
	public List<Ranking> getAllRanking() {
		return rankingService.getRanking();
		
	}
	
	//Get Ranking by id
	@GetMapping("/rankings/{id}")
	public Optional <Ranking> getRanking(@PathVariable int id) {
		return rankingService.getRank(id);
	}
	
	//Add Ranking
	@PostMapping("/rankings")
	public void addRanking(@RequestBody Ranking ranking) {
		rankingService.saveRanking(ranking);
 
	}
	
	//update Ranking
	@PutMapping("/rankings")
	public void updateRanking(@RequestBody Ranking ranking) {
		rankingService.saveRanking(ranking);

	}
	
	//Delete Ranking
	@DeleteMapping("/rankings/{id}")
	public void deleteRanking(@PathVariable int id) {
		rankingService.deleteRank(id);

	}
	
	//Custom Methods using JPQL
//	@GetMapping("/rankings/search/{name}")
//	public List<Ranking> getAllRankingByName(@PathVariable String name) {
//		return rankingService.getRankingsByRankingName(name);
//		
//	}
	
	//custom method using jpql--DTO--inner join
	@GetMapping("/rankingsdt")
	public List<RankStudentDto> geAllDTORankings() {
		return rankingService.geAllDTORankings();
	}
	

}
