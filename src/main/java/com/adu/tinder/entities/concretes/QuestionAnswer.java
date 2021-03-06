package com.adu.tinder.entities.concretes;

import com.adu.tinder.entities.abstracts.Entities;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "question_answer")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","JobAdvertisement"})
public class QuestionAnswer implements Entities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private UserQuestion questionId;

    @Column(name = "answer")
    private String answer;

    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)
    @OneToMany(mappedBy="answerId")
    private List<UserAnswer> answerId;


}
