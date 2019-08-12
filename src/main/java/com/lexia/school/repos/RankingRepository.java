package com.lexia.school.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lexia.school.domain.Ranking;

@Repository
public interface RankingRepository extends JpaRepository<Ranking, Long> {

}
