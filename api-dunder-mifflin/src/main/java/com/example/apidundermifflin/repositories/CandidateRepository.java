package com.example.apidundermifflin.repositories;

import com.example.apidundermifflin.entitities.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate, String> {
}
