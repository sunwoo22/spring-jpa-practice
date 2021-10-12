-- call next value for hibernate_sequence;
insert into user (`id`, `name`, `email`, `created_at`, `updated_at`) values (1, 'aaa', 'abc@fastcampus.com', now(), now());

-- call next value for hibernate_sequence;
insert into user (`id`, `name`, `email`, `created_at`, `updated_at`) values (2, 'bbb', 'abc@naver.com', now(), now());

-- call next value for hibernate_sequence;
insert into user (`id`, `name`, `email`, `created_at`, `updated_at`) values (3, 'ccc', 'ccc@fastcampus.com', now(), now());

-- call next value for hibernate_sequence;
insert into user (`id`, `name`, `email`, `created_at`, `updated_at`) values (4, 'ddd', 'abc12@fastcampus.com', now(), now());

-- call next value for hibernate_sequence;
insert into user (`id`, `name`, `email`, `created_at`, `updated_at`) values (5, 'aaa', 'aaa@fastcampus.com', now(), now());


insert into publisher(`id`, `name`) values (1, '패스트캠퍼스');

insert into book(`id`, `name`, `publisher_id`, `deleted`) values (1, 'JPA 초격차 패키지', 1, false);

insert into book(`id`, `name`, `publisher_id`, `deleted`) values (2, 'Spring Security 초격차 패키지', 1, false);

insert into book(`id`, `name`, `publisher_id`, `deleted`) values (3, 'SpringBoot 올인원 패키지', 1, true);
