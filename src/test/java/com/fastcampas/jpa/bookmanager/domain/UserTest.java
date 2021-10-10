package com.fastcampas.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void test() {
        // @NoArgsConstructor
        User user = new User();
        user.setEmail("abc@fastcampas.com");
        user.setName("aaa");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

        // @AllArgsConstructor
//        User user1 = new User(null, "abc@fastcampas.com", "aaa", LocalDateTime.now(), LocalDateTime.now());
        // @RequiredArgsConstructor
        User user2 = new User("abc@fastcampas.com", "aaa");

        // @Data
        User user3 = User.builder()
                .name("aaa")
                .email("abc@fastcampas.com")
                .build();

        System.out.println(">>>" + user.toString());
//        System.out.println(">>>" + user1.toString());
        System.out.println(">>>" + user2.toString());
        System.out.println(">>>" + user3.toString());
    }

}