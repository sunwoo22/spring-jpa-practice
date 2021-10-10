package com.fastcampas.jpa.bookmanager.domain;

import com.fastcampas.jpa.bookmanager.domain.listener.Auditable;
import com.fastcampas.jpa.bookmanager.domain.listener.UserEntityListener;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data // @ToString @Getter @Setter @EqualsAndHashCode 포함
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Builder
@Entity
@EntityListeners(value = {UserEntityListener.class})
//@Table(name = "user", indexes = {@Index(columnList = "name")}, uniqueConstraints = {@UniqueConstraint(columnNames = "email")})
public class User extends BaseEntity implements Auditable {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String email;

    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    /*
//    @Column(name = "crtdat")
//    @Column(nullable = false)
    @Column(updatable = false)
    @CreatedDate
    private LocalDateTime createdAt;

//    @Column(insertable = false)
    @LastModifiedDate
    private LocalDateTime updatedAt;

     */

//    @Transient
//    private String testData;

//    @OneToMany(fetch = FetchType.EAGER)
//    private List<Address> address;

//    @PrePersist
//    @PreUpdate
//    @PreRemove
//    @PostPersist
//    @PostUpdate
//    @PostRemove
//    @PostLoad

    /*
    @PrePersist
    public void prePersist() {
        System.out.println(">>> prePersist");

        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        System.out.println(">>> preUpdate");

        this.updatedAt = LocalDateTime.now();
    }

     */

    /*
    @PostPersist
    public void postPersist() {
        System.out.println(">>> postPersist");
    }

    @PostUpdate
    public void postUpdate() {
        System.out.println(">>> postUpdate");
    }

    @PreRemove
    public void preRemove() {
        System.out.println(">>> preRemove");
    }

    @PostRemove
    public void postRemove() {
        System.out.println(">>> postRemove");
    }

    @PostLoad
    public void postLoad() {
        System.out.println(">>> postLoad");
    }

     */
}
