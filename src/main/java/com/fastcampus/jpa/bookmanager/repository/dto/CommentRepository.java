package com.fastcampus.jpa.bookmanager.repository.dto;

import com.fastcampus.jpa.bookmanager.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
