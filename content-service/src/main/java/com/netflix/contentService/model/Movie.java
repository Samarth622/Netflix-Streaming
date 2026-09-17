package com.netflix.contentService.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "movies")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
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

    private LocalDateTime updatedAt;

}
