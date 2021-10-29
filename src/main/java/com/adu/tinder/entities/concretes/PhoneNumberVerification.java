package com.adu.tinder.entities.concretes;

import com.adu.tinder.entities.abstracts.Entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "phone_number_verification")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhoneNumberVerification implements Entities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @Column(name = "user_id")
    private User userId;

    @Column(name = "approved")
    private boolean approved;

    @Column(name = "code")
    private String code;

}
