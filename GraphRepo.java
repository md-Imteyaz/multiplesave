package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.GraphData;

public interface GraphRepo extends JpaRepository<GraphData, Integer>{

}
