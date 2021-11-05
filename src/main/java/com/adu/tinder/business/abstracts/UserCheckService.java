package com.adu.tinder.business.abstracts;

import com.adu.tinder.entities.concretes.User;

public interface UserCheckService {
    boolean allFieldsAreRequired(User user);
    boolean findByMail(User user);
    boolean findByPhoneNumber(User user);
    String allMatch(User user);
    String allMatchForUpdate(User user);
    boolean findByMailForUpdate(User user);
    boolean findByPhoneNumberForUpdate(User user);
}
