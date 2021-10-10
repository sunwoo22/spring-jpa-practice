package com.fastcampas.jpa.bookmanager.repository;

<<<<<<< HEAD
import com.fastcampas.jpa.bookmanager.domain.User;
import com.fastcampas.jpa.bookmanager.domain.UserHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserHistoryRepository extends JpaRepository<UserHistory, Long> {
    List<UserHistory> findByUserId(Long userId);
=======
import com.fastcampas.jpa.bookmanager.domain.UserHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserHistoryRepository extends JpaRepository<UserHistory, Long> {
>>>>>>> 031853dd75e73a8d6cdb61621a47ac76c60b4215
}
