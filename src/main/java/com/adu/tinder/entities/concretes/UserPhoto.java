package com.adu.tinder.entities.concretes;

import com.adu.tinder.entities.abstracts.Entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user_photo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPhoto  implements Entities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId;

    @Column(name = "photo_url")
    private String photoUrl;

    @Column(name = "active")
    private boolean active;
}
