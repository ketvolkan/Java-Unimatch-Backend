package com.adu.tinder.entities.concretes;

import com.adu.tinder.entities.abstracts.Entities;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","User"})
public class User implements Entities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "gender")
    private char gender;

    @Column(name = "verified_account")
    private boolean verifiedAccount;

    @Column(name = "mail")
    private String mail;

    @Column(name = "active")
    private boolean active;

    @Column(name = "description")
    private String description;
    @Column(name = "password")
    private String password;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    //ilişkiler

    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)
    @OneToMany(mappedBy="blockedId")
    private List<Blocked> blockedId;

    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)
    @OneToMany(mappedBy="blockingId")
    private List<Blocked> blockingId;



    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)
    @OneToMany(mappedBy="userId")
    private List<MailVerification> mailVerificationUserId;

    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)
    @OneToMany(mappedBy="userId1")
    private List<Match> matchUserId1;

    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)
    @OneToMany(mappedBy="userId2")
    private List<Match> matchUserId2;

    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)
    @OneToMany(mappedBy="userId")
    private List<PhoneNumberVerification> phoneNumberVerificationsUserId;

    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)
    @OneToMany(mappedBy="userId")
    private List<Report> reportUserId;

    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)
    @OneToMany(mappedBy="userId")
    private List<UserAnswer> userAnswersUserId;

    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)
    @OneToMany(mappedBy="user")
    private List<UserPhoto> userPhotoUserId;
}
