package com.fastcampas.jpa.bookmanager.domain.listener;

import com.fastcampas.jpa.bookmanager.domain.User;
import com.fastcampas.jpa.bookmanager.domain.UserHistory;
import com.fastcampas.jpa.bookmanager.repository.UserHistoryRepository;
import com.fastcampas.jpa.bookmanager.support.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

<<<<<<< HEAD
import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;
=======
>>>>>>> 031853dd75e73a8d6cdb61621a47ac76c60b4215
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

<<<<<<< HEAD
public class UserEntityListener {

    @PostPersist
    @PostUpdate
=======
//@Component
public class UserEntityListener {

//    @Autowired
//    private UserHistoryRepository userHistoryRepository;

    @PrePersist
    @PreUpdate
>>>>>>> 031853dd75e73a8d6cdb61621a47ac76c60b4215
    public void prePersistAndPreUpdate(Object o) {
        UserHistoryRepository userHistoryRepository = BeanUtils.getBean(UserHistoryRepository.class);

        User user = (User) o;

        UserHistory userHistory = new UserHistory();
<<<<<<< HEAD
        userHistory.setName(user.getName());
        userHistory.setEmail(user.getEmail());
        userHistory.setUser(user);
=======
        userHistory.setUserId(user.getId());
        userHistory.setName(user.getName());
        userHistory.setEmail(user.getEmail());
>>>>>>> 031853dd75e73a8d6cdb61621a47ac76c60b4215

        userHistoryRepository.save(userHistory);
    }
}
