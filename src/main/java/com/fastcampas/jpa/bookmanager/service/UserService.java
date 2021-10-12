package com.fastcampas.jpa.bookmanager.service;

import com.fastcampas.jpa.bookmanager.domain.User;
import com.fastcampas.jpa.bookmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Service
public class UserService {

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void put() {
        User user = new User();
        user.setName("newUser");
        user.setEmail("newUser@fastcampus.com");

//        userRepository.save(user);

        entityManager.persist(user);
//        entityManager.detach(user);

        user.setName("newUserAfterPersist");
        entityManager.merge(user);
//        entityManager.flush();
//        entityManager.clear();

        User user1 = userRepository.findById(1L).get();
        entityManager.remove(user1);

        user1.setName("aaaaaaa");
        entityManager.merge(user1);
    }
}
