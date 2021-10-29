package com.adu.tinder.entities.concretes;

import com.adu.tinder.entities.abstracts.Entities;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","JobAdvertisement"})
public class User implements Entities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "nationality_id")
    private String nationalityId;

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

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    //ilişkiler
    @OneToMany(mappedBy="blockedId")
    private List<Blocked> blockedId;

    @OneToMany(mappedBy="blockingId")
    private List<Blocked> blockingId;

    @OneToMany(mappedBy="dislikeId")
    private List<Dislike> dislikeId;

    @OneToMany(mappedBy="outOfFavorId")
    private List<Dislike> outOfFavorId;

    @OneToMany(mappedBy="popularId")
    private List<Like> popularId;

    @OneToMany(mappedBy="likesId")
    private List<Like> likesId;

    @OneToMany(mappedBy="userId")
    private List<MailVerification> mailVerificationUserId;

    @OneToMany(mappedBy="userId1")
    private List<Match> matchUserId1;

    @OneToMany(mappedBy="userId2")
    private List<Match> matchUserId2;

    @OneToMany(mappedBy="userId")
    private List<PhoneNumberVerification> phoneNumberVerificationsUserId;

    @OneToMany(mappedBy="userId")
    private List<Report> reportUserId;

    @OneToMany(mappedBy="userId")
    private List<UserAnswer> userAnswersUserId;

    @OneToMany(mappedBy="userId")
    private List<UserPhoto> userPhotoUserId;
}
