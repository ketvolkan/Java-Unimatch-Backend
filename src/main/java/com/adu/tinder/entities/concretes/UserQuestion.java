package com.adu.tinder.entities.concretes;

import com.adu.tinder.entities.abstracts.Entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user_questions")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserQuestion implements Entities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "answer_1")
    private int answer1;

    @Column(name = "answer_2")
    private int answer2;

    @Column(name = "answer_3")
    private int answer3;

    @Column(name = "answer_4")
    private int answer4;

    @Column(name = "answer_5")
    private int answer5;

    @Column(name = "answer_6")
    private int answer6;

    @Column(name = "answer_7")
    private int answer7;

    @Column(name = "answer_8")
    private int answer8;

    @Column(name = "answer_9")
    private int answer9;

    @Column(name = "answer_10")
    private int answer10;

}
