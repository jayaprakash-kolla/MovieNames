package com.Movies.MovieNames.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="MovieNames")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieNames {

    @Id
    @Column(name="column_id")
    private int id;
    @Column(name="Movie_Name")
    private String name;

}
