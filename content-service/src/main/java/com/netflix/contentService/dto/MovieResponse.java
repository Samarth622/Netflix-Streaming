package com.netflix.contentService.dto;

import com.netflix.contentService.model.Genre;
import com.netflix.contentService.model.VideoStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieResponse {

    private String id;

    private String title;

    private String description;

    private Genre genre;

    private String director;

    private String caste;

    private int releaseYear;

    private Double rating;
    private String thumbnailUrl;
    private int durationMinutes;

    private String videoKey;

    private String hslUrl;

    private VideoStatus videoStatus;

    private LocalDateTime createdAt;
}
