package com.fastcampas.jpa.bookmanager.repository;

import com.fastcampas.jpa.bookmanager.domain.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
