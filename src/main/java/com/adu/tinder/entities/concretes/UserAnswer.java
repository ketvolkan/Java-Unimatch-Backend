package com.adu.tinder.entities.concretes;

import com.adu.tinder.entities.abstracts.Entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user_answer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAnswer implements Entities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "question_id")
    private int question;

    @Column(name = "answer")
    private int answer;


}
