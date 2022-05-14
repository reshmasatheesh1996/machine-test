package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.dao.RankingRepository;
import com.faith.app.dto.RankStudentDto;
import com.faith.app.entity.Ranking;

@Service
public class RankingServiceImple implements IRankingService {
	
	@Autowired
	private RankingRepository rankingRepo;
	
	@Override
	public List<Ranking> getRanking() {
		return (List<Ranking>) rankingRepo.findAll();
	}

	@Override
	public void saveRanking(Ranking ranking) {
		rankingRepo.save(ranking);

	}

	@Override
	public Optional<Ranking> getRank(int id) {
		return rankingRepo.findById(id);
	}

	@Override
	public void deleteRank(int id) {
		rankingRepo.deleteById(id);

	}

	@Override
	public List<Ranking> getRankingByCourseName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RankStudentDto> geAllDTORankings() {

		return (List<RankStudentDto>) rankingRepo.geAllDTORankings();
	}

}
