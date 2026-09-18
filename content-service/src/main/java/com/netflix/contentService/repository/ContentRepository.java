package com.netflix.contentService.repository;

import com.netflix.contentService.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<Movie, String> {
}
