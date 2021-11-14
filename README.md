[패스트캠퍼스 온라인 강의](https://fastcampus.co.kr/dev_online_javaend)를 수강하며 작성한 내용입니다.   
<br>


## 도서 및 사용자 관리 프로그램

![](https://img.shields.io/badge/Java-007396?style=flat&logo=Java&logoColor=white)
![](https://img.shields.io/badge/IntelliJ-000000?style=flat&logo=IntelliJIDEA&logoColor=white)
![](https://img.shields.io/badge/SpringBoot-6DB33F?style=flat&logo=SpringBoot&logoColor=white)
![](https://img.shields.io/badge/Gradle-02303A?style=flat&logo=Gradle&logoColor=white)
![](https://img.shields.io/badge/Hibernate-59666C?style=flat&logo=Hibernate&logoColor=white)
![](https://img.shields.io/badge/MySQL-4479A1?style=flat&logo=MySQL&logoColor=white)
<br>

<br>

    src
    ㄴmain
        ㄴjava/com/fastcampus/jpa/bookmanager
            ㄴconfiguration
                ㄴJpaConfiguration.java
            ㄴcontroller
                ㄴHelloWorldController.java
            ㄴdomain
                ㄴconverter
                    ㄴBookStatusConverter.java
                ㄴlistener
                    ㄴAuditable.java
                    ㄴMyEntityListener.java
                    ㄴUserEntityListener.java
                ㄴAddress.java
                ㄴAuthor.java
                ㄴBaseEntity.java
                ㄴBook.java
                ㄴBookAndAuthor.java
                ㄴBookReviewInfo.java
                ㄴComment.java
                ㄴGender.java
                ㄴPublisher.java
                ㄴReview.java
                ㄴUser.java
                ㄴUserHistory.java
            ㄴrepository
                ㄴdto
                    ㄴBookNameAndCategory.java
                    ㄴBookStatus.java
                ㄴAuthorRepository.java
                ㄴBookAndAuthorRepository.java
                ㄴBookRepository.java
                ㄴBookReviewRepository.java
                ㄴCommentRepository.java
                ㄴPublisherRepository.java
                ㄴReviewRepository.java
                ㄴUserHistoryRepository.java
                ㄴUserRepository.java
            ㄴservice
                ㄴAuthorService.java
                ㄴBookService.java
                ㄴCommentService.java
                ㄴUserService.java
            ㄴsupport
                ㄴBeanUtils.java
            ㄴBookmanagerApplication.java
        ㄴresources
            ㄴapplication.yml
    ㄴtest
    build.gradle
