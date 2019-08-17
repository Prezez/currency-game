package com.sda.javagda21.currencygame.repository;


import com.sda.javagda21.currencygame.entity.CurrencyRank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRankRepo extends JpaRepository <CurrencyRank, Long> {




}
