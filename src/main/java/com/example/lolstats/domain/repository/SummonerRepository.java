package com.example.lolstats.domain.repository;

import com.example.lolstats.domain.entity.Summoner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SummonerRepository extends JpaRepository<Summoner, String> {

}