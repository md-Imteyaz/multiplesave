package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.BranchPremise;
import com.example.demo.entity.PremiseInformation;

@Repository
public interface PremisesRepository extends JpaRepository<BranchPremise, Integer> {

}
