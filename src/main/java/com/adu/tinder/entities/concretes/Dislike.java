package com.adu.tinder.entities.concretes;

import com.adu.tinder.entities.abstracts.Entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "dislikes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dislike implements Entities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @Column(name = "dislike_id")
    private int dislikeId;

    @Column(name = "out_of_favor_id")
    private int outOfFavorId;
}

