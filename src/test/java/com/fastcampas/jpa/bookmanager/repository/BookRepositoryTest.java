package com.fastcampas.jpa.bookmanager.repository;

import com.fastcampas.jpa.bookmanager.domain.Book;
<<<<<<< HEAD
import com.fastcampas.jpa.bookmanager.domain.Publisher;
import com.fastcampas.jpa.bookmanager.domain.Review;
import com.fastcampas.jpa.bookmanager.domain.User;
=======
>>>>>>> 031853dd75e73a8d6cdb61621a47ac76c60b4215
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

<<<<<<< HEAD
import javax.transaction.Transactional;

=======
>>>>>>> 031853dd75e73a8d6cdb61621a47ac76c60b4215
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

<<<<<<< HEAD
    @Autowired
    private PublisherRepository publisherRepository;

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private UserRepository userRepository;

=======
>>>>>>> 031853dd75e73a8d6cdb61621a47ac76c60b4215
    @Test
    void bookTest() {
        Book book = new Book();
        book.setName("jpa 초격차 패키지");
<<<<<<< HEAD
        book.setAuthorId(1L);
//        book.setPublisherId(1L);
=======
        book.setAuthor("패스트캠퍼스");
>>>>>>> 031853dd75e73a8d6cdb61621a47ac76c60b4215

        bookRepository.save(book);

        System.out.println(bookRepository.findAll());
    }

<<<<<<< HEAD
    @Test
    @Transactional
    void bookRelationTest() {
        givenBookAndReview();

        User user = userRepository.findByEmail("aaa@fastcampus.com");

        System.out.println("Review : " + user.getReviews());
        System.out.println("Book : " + user.getReviews().get(0).getBook());
        System.out.println("Publisher : " + user.getReviews().get(0).getBook().getPublisher());
    }

    private void givenBookAndReview() {
        givenReview(givenUser(), givenBook(givenPublisher()));
    }

    private void givenReview(User user, Book book) {
        Review review = new Review();
        review.setTitle("내 인생을 바꾼 책");
        review.setContent("너무너무 재미있고 즐거운 책이었어요.");
        review.setScore(5.0f);
        review.setUser(user);
        review.setBook(book);

        reviewRepository.save(review);
    }

    private User givenUser() {
        return userRepository.findByEmail("aaa@fastcampus.com");
    }

    private Book givenBook(Publisher publisher) {
        Book book = new Book();
        book.setName("jpa 초격차 패키지");
        book.setPublisher(publisher);

        return bookRepository.save(book);
    }

    private Publisher givenPublisher() {
        Publisher publisher = new Publisher();
        publisher.setName("패스트캠퍼스");

        return publisherRepository.save(publisher);
    }

=======
>>>>>>> 031853dd75e73a8d6cdb61621a47ac76c60b4215
}