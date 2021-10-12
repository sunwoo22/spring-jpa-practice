package com.fastcampas.jpa.bookmanager.service;

import com.fastcampas.jpa.bookmanager.domain.Author;
import com.fastcampas.jpa.bookmanager.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AuthorService {

    private final AuthorRepository authorRepository;

    @Transactional(propagation = Propagation.NESTED)
    public void putAuthor() {
        Author author = new Author();
        author.setName("aaa");

        authorRepository.save(author);

//        throw new RuntimeException("오류가 발생하였습니다. transaction 은 어떻게 될까요?");
    }

}
