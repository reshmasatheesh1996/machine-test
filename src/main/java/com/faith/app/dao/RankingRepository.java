package com.faith.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.faith.app.dto.RankStudentDto;
import com.faith.app.entity.Ranking;

public interface RankingRepository extends CrudRepository<Ranking, Integer> {	

	@Query("SELECT new com.faith.app.dto.RankStudentDto(r.applicationCode, r.studentId,s.studentName, "
			      + "r.courseName, r.average,r.credits, r.ranks,r.approvedDate)"
			      + "FROM Ranking r INNER JOIN r.student s ORDER BY r.applicationCode")	
	public List<RankStudentDto> geAllDTORankings();

}
