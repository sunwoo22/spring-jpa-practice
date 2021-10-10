package com.fastcampas.jpa.bookmanager.repository;

import com.fastcampas.jpa.bookmanager.domain.Gender;
import com.fastcampas.jpa.bookmanager.domain.User;
import com.fastcampas.jpa.bookmanager.domain.UserHistory;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.contains;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.endsWith;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserHistoryRepository userHistoryRepository;

    @Test
<<<<<<< HEAD
    void userRelationTest() {
        User user = new User();
        user.setName("david");
        user.setEmail("david@fastcampus.com");
        user.setGender(Gender.MALE);
        userRepository.save(user);

        user.setName("daniel");
        userRepository.save(user);

        user.setEmail("daniel@fastcampus.com");
        userRepository.save(user);

        userHistoryRepository.findAll().forEach(System.out::println);

//        List<UserHistory> result = userHistoryRepository.findByUserId(
//                userRepository.findByEmail("daniel@fastcampus.com").getId());

        List<UserHistory> result = userRepository.findByEmail(
                "daniel@fastcampus.com").getUserHistories();

        result.forEach(System.out::println);

        System.out.println("UserHistory.getUser() : " + userHistoryRepository.findAll().get(0).getUser());
    }

    @Test
=======
>>>>>>> 031853dd75e73a8d6cdb61621a47ac76c60b4215
    void userHistoryTest() {
        User user = new User();
        user.setName("abcd");
        user.setEmail("abcd@fastcampus.com");

        userRepository.save(user);

        user.setName("abcd-new");

        userRepository.save(user);

        userHistoryRepository.findAll().forEach(System.out::println);
    }

    @Test
    void select() {
//        System.out.println(userRepository.findByName("aaa"));
//
//        System.out.println("findByEmail : " + userRepository.findByEmail("aaa@fastcampus.com"));
//        System.out.println("getByEmail : " + userRepository.getByEmail("aaa@fastcampus.com"));
//        System.out.println("readByEmail : " + userRepository.readByEmail("aaa@fastcampus.com"));
//        System.out.println("queryByEmail : " + userRepository.queryByEmail("aaa@fastcampus.com"));
//        System.out.println("searchByEmail : " + userRepository.searchByEmail("aaa@fastcampus.com"));
//        System.out.println("streamByEmail : " + userRepository.streamByEmail("aaa@fastcampus.com"));
//        System.out.println("findUserByEmail : " + userRepository.findUserByEmail("aaa@fastcampus.com"));
//        System.out.println("findSomethingByEmail : " + userRepository.findSomethingByEmail("aaa@fastcampus.com"));
//
//        System.out.println("findFirst1ByName : " + userRepository.findFirst1ByName("aaa"));
//        System.out.println("findTopByName : " + userRepository.findTopByName("aaa"));
//        System.out.println("findLast1ByName : " + userRepository.findLast1ByName("aaa"));

//        System.out.println("findByEmailAndName : " + userRepository.findByEmailAndName("aaa@fastcampus.com", "aaa"));
//        System.out.println("findByEmailOrName : " + userRepository.findByEmailOrName("aaa@fastcampus.com", "bbb"));
//
//        System.out.println("findByCreatedAtAfter : " + userRepository.findByCreatedAtAfter(LocalDateTime.now().minusDays(1L)));
//        System.out.println("findByIdAfter : " + userRepository.findByIdAfter(4L));
//
//        System.out.println("findByCreatedAtGreaterThan : " + userRepository.findByCreatedAtGreaterThan(LocalDateTime.now().minusDays(1L)));
//        System.out.println("findByCreatedAtGreaterThanEqual : " + userRepository.findByCreatedAtGreaterThanEqual(LocalDateTime.now().minusDays(1L)));

//        System.out.println("findByCreatedAtBetween : " + userRepository.findByCreatedAtBetween(LocalDateTime.now().minusDays(1L), LocalDateTime.now().plusDays(1L)));
//        System.out.println("findByIdBetween : " + userRepository.findByIdBetween(1L, 3L));
//
//        System.out.println("findByIdGreaterThanEqualAndIdLessThanEqual : " + userRepository.findByIdGreaterThanEqualAndIdLessThanEqual(1L, 3L));
//
//        System.out.println("findByIdIsNotNull : " + userRepository.findByIdIsNotNull());
//        System.out.println("findByAddressIsNotEmpty : " + userRepository.findByAddressIsNotEmpty());

        System.out.println("findByNameIn : " + userRepository.findByNameIn(Lists.newArrayList("aaa", "bbb")));

        System.out.println("findByNameStartingWith : " + userRepository.findByNameStartingWith("a"));
        System.out.println("findByNameEndingWith : " + userRepository.findByNameEndingWith("c"));
        System.out.println("findByNameContains : " + userRepository.findByNameContains("b"));

        System.out.println("findByNameLike : " + userRepository.findByNameLike("%" + "b" + "%"));
    }

    private Sort getSort() {
        return Sort.by(
                Order.desc("id"),
                Order.asc("email")
        );
    }

    @Test
    void pagingAndSortingTest() {
//        System.out.println("findTop1ByName : " + userRepository.findTop1ByName("aaa"));
//        System.out.println("findLast1ByName : " + userRepository.findLast1ByName("aaa"));
//        System.out.println("findTop1ByNameOrderByIdDesc : " + userRepository.findTop1ByNameOrderByIdDesc("aaa"));
//        System.out.println("findFirstByNameOrderByIdDescEmailAsc : " + userRepository.findFirstByNameOrderByIdDescEmailAsc("aaa"));
//        System.out.println("findFirstByNameSortParams : " + userRepository.findFirstByName("aaa", Sort.by(Order.desc("id"))));
//        System.out.println("findFirstByNameSortParams : " + userRepository.findFirstByName("aaa", Sort.by(Order.desc("id"), Order.asc("email"))));
//        System.out.println("findFirstByNameSortParams : " + userRepository.findFirstByName("aaa", getSort()));

        System.out.println("findByNameWithPaging : " + userRepository.findByName("aaa", PageRequest.of(1, 1, Sort.by(Order.desc("id")))).getTotalElements());
    }

    @Test
    void insertAndUpdateTest() {
        User user = new User();
        user.setName("aaa");
        user.setEmail("aaab@fastcampus.com");

        userRepository.save(user);

        User user2 = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        user2.setName("aaaaaaab");

        userRepository.save(user2);
    }

    @Test
    void enumTest() {
        User user = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        user.setGender(Gender.MALE);

        userRepository.save(user);

        userRepository.findAll().forEach(System.out::println);

        System.out.println(userRepository.findRawRecord().get("gender"));
    }

    @Test
    void listenerTest() {
        User user = new User();
        user.setName("abcd");
        user.setEmail("abcd@fastcampus.com");

        userRepository.save(user);

        User user2 = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        user2.setName("abcdeee");

        userRepository.save(user2);

        userRepository.deleteById(4L);
    }

    @Test
    void prePersistTest() {
        User user = new User();
        user.setName("abcd");
        user.setEmail("abcd@fastcampus.com");
//        user.setCreatedAt(LocalDateTime.now());
//        user.setUpdatedAt(LocalDateTime.now());

        userRepository.save(user);

        System.out.println(userRepository.findByEmail("abcd@fastcampus.com"));
    }

    @Test
    void preUpdateTest() {
        User user = userRepository.findById(1L).orElseThrow(RuntimeException::new);

        System.out.println("as-is : " + user);

        user.setName("abcdeee");
        userRepository.save(user);

        System.out.println("to-be : " + userRepository.findAll().get(0));
    }



    @Test
    void crud() {
        userRepository.save(new User("david", "david@fastcampus.com"));

        User user = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        user.setEmail("aaa-updated@fastcampus.com");

        userRepository.save(user);
    }

    /*
    @Test
    void crud() {
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withIgnorePaths("name")
                .withMatcher("email", endsWith());

        Example<User> example = Example.of(new User("aa", "fastcampus.com"), matcher);

        userRepository.findAll(example).forEach(System.out::println);


        User user = new User();
        user.setEmail("naver");

        ExampleMatcher matcher1 = ExampleMatcher.matching()
                .withMatcher("email", contains());
        Example<User> example1 = Example.of(user, matcher1);

        userRepository.findAll(example1).forEach(System.out::println)
    }

     */


    /*
    @Test
    void crud() {
        Page<User> users = userRepository.findAll(PageRequest.of(1, 3));

        System.out.println("page : " + users);
        System.out.println("totalElements : " + users.getTotalElements());
        System.out.println("totalPages : " + users.getTotalPages());
        System.out.println("numberOfElements : " + users.getNumberOfElements());
        System.out.println("sort : " + users.getSort());
        System.out.println("size : " + users.getSize());

        users.getContent().forEach(System.out::println);
    }

     */


    /*
    @Test
    void crud() { // create, read, update, delete

        User user1 = new User("jack", "jack@fastcampus.com");
        User user2 = new User("steve", "steve@fastcampus.com");
        userRepository.saveAll(Lists.newArrayList(user1, user2));
        List<User> users = userRepository.findAll();
        users.forEach(System.out::println);

        User user = userRepository.findById(1L).orElse(null);
        System.out.println(user);

        userRepository.saveAndFlush(new User("new aaa", "new@fastcampus.com"));
        userRepository.findAll().forEach(System.out::println);

        long count = userRepository.count();
        System.out.println(count);

        boolean exists = userRepository.existsById(1L);
        System.out.println(exists);

        userRepository.delete(userRepository.findById(1L).orElseThrow(RuntimeException::new));
        userRepository.deleteById(2L);
        userRepository.findAll().forEach(System.out::println);
        userRepository.deleteAll(userRepository.findAllById(Lists.newArrayList(3L, 4L)));
        userRepository.findAll().forEach(System.out::println);
        userRepository.deleteAllInBatch();
        userRepository.findAll().forEach(System.out::println);

    }

     */
}