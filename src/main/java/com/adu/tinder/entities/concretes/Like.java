package com.adu.tinder.entities.concretes;

import com.adu.tinder.entities.abstracts.Entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "likes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Like implements Entities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @Column(name = "popular_id")
    private User popularId;

    @ManyToOne
    @Column(name = "likes_id")
    private User likesId;
}
