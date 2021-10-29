package com.adu.tinder.entities.concretes;

import com.adu.tinder.entities.abstracts.Entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "blockeds")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blocked implements Entities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @Column(name = "blocked_id")
    private User blockedId;

    @ManyToOne
    @Column(name = "blocking_id")
    private User blockingId;

    @Column(name = "active")
    private boolean active;
}
