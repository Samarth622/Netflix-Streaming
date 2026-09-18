package com.netflix.contentService.service;

import com.netflix.contentService.dto.MovieRequest;
import com.netflix.contentService.dto.MovieResponse;
import com.netflix.contentService.model.Movie;
import com.netflix.contentService.model.VideoStatus;
import com.netflix.contentService.repository.ContentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ContentService {

    private final ContentRepository contentRepository;

    /**
     * Add a new Movie to the catalog
     * Video is not uploaded yet at this stage
     */
    public MovieResponse addMovie(MovieRequest movieRequest) {
        log.info("Adding new movie: {}", movieRequest.getTitle());

        Movie movie = new Movie();
        movie.setTitle(movieRequest.getTitle());
        movie.setDescription(movieRequest.getDescription());
        movie.setCaste(movieRequest.getCaste());
        movie.setGenre(movieRequest.getGenre());
        movie.setDirector(movieRequest.getDirector());
        movie.setRating(movieRequest.getRating());
        movie.setDurationMinutes(movieRequest.getDurationMinutes());
        movie.setReleaseYear(movieRequest.getReleaseYear());
        movie.setThumbnailUrl(movieRequest.getThumbnailUrl());
        movie.setVideoStatus(VideoStatus.PENDING);

        Movie savedMovie = contentRepository.save(movie);
        log.info("Movie added with Id: {}", savedMovie.getId());

        return mapToResponse(savedMovie);
    }


    private MovieResponse mapToResponse(Movie movie) {
        MovieResponse movieResponse = new MovieResponse();
        movieResponse.setId(movie.getId());
        movieResponse.setTitle(movie.getTitle());
        movieResponse.setDescription(movie.getDescription());
        movieResponse.setCaste(movie.getCaste());
        movieResponse.setGenre(movie.getGenre());
        movieResponse.setDirector(movie.getDirector());
        movieResponse.setRating(movie.getRating());
        movieResponse.setDurationMinutes(movie.getDurationMinutes());
        movieResponse.setReleaseYear(movie.getReleaseYear());
        movieResponse.setThumbnailUrl(movie.getThumbnailUrl());
        movieResponse.setVideoStatus(movie.getVideoStatus());
        movieResponse.setVideoKey(movie.getVideoKey());
        movieResponse.setHslUrl(movie.getHslUrl());
        movieResponse.setCreatedAt(movie.getCreatedAt());
        return movieResponse;
    }
}
