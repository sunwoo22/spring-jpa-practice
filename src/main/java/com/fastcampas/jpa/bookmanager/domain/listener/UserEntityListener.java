package com.fastcampas.jpa.bookmanager.domain.listener;

import com.fastcampas.jpa.bookmanager.domain.User;
import com.fastcampas.jpa.bookmanager.domain.UserHistory;
import com.fastcampas.jpa.bookmanager.repository.UserHistoryRepository;
import com.fastcampas.jpa.bookmanager.support.BeanUtils;

import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;

public class UserEntityListener {

    @PostPersist
    @PostUpdate
    public void prePersistAndPreUpdate(Object o) {
        UserHistoryRepository userHistoryRepository = BeanUtils.getBean(UserHistoryRepository.class);

        User user = (User) o;

        UserHistory userHistory = new UserHistory();
        userHistory.setName(user.getName());
        userHistory.setEmail(user.getEmail());
        userHistory.setUser(user);

        userHistoryRepository.save(userHistory);
    }
}
