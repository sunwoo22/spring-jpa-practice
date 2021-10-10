package com.fastcampas.jpa.bookmanager.domain;

import com.fastcampas.jpa.bookmanager.domain.listener.Auditable;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
@EntityListeners(value = AuditingEntityListener.class)
<<<<<<< HEAD
public class BaseEntity implements Auditable {
=======
public class BaseEntity {
>>>>>>> 031853dd75e73a8d6cdb61621a47ac76c60b4215

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

}
