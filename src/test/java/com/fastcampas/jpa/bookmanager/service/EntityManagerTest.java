package com.fastcampas.jpa.bookmanager.service;

import com.fastcampas.jpa.bookmanager.domain.User;
import com.fastcampas.jpa.bookmanager.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@SpringBootTest
//@Transactional
public class EntityManagerTest {

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    @Test
    void entityManagerTest() {
        System.out.println(entityManager.createQuery("select u from User u").getResultList());
    }

    @Test
    void cacheFindTest() {
//        System.out.println(userRepository.findByEmail("abc@fastcampus.com"));
//        System.out.println(userRepository.findByEmail("abc@fastcampus.com"));
//        System.out.println(userRepository.findByEmail("abc@fastcampus.com"));
//        System.out.println(userRepository.findById(2L).get());
//        System.out.println(userRepository.findById(2L).get());
//        System.out.println(userRepository.findById(2L).get());

        userRepository.deleteById(1L);
    }

    @Test
    void cacheFindTest2() {
        User user = userRepository.findById(1L).get();
        user.setName("aaaaaaaaaaa");
        userRepository.save(user);
//        userRepository.flush();

        System.out.println("--------------------");

        user.setEmail("aaaaaaa@fastcampus.com");
        userRepository.save(user);
//        userRepository.flush();

//        System.out.println(">>> 1 : " + userRepository.findById(1L).get());
//        userRepository.flush();
//        System.out.println(">>> 2 : " + userRepository.findById(1L).get());

        System.out.println(userRepository.findAll()); // select * from user
    }
}
