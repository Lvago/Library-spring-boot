package com.lucas.library.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data // Generates getters, setters, toString, equals, hashCode
@NoArgsConstructor // Generates no-arg constructor
@AllArgsConstructor // Generates constructor with all fields
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String author;

    @Column(unique = true)
    private String isbn;

    private boolean available = true;
}