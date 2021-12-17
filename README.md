# ScienceFiction-Server

## Database:
```sql
create DATABASE science_fiction DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

create table science_fiction.SCIENCE_FICTION_AUTHOR
(
    id                  bigint auto_increment
        primary key,
    author_first_name   varchar(200) null,
    author_last_name    varchar(200) null,
    author_nation       varchar(10)  null,
    author_informations text         null
);

create table science_fiction.SCIENCE_FICTION_BOOK
(
    id             bigint auto_increment
        primary key,
    book_name      varchar(200)  null,
    book_author    bigint        null,
    book_category  bigint        null,
    book_tags      json          null,
    book_images    varchar(1024) null,
    book_file_path bigint        null
);

create table science_fiction.SCIENCE_FICTION_CATEGORY
(
    id            bigint auto_increment
        primary key,
    category_name varchar(200) not null
);

create table science_fiction.SCIENCE_FICTION_FILE
(
    id        bigint auto_increment
        primary key,
    path      varchar(500) not null,
    file_name varchar(100) not null,
    file_size bigint       null
);

create table science_fiction.User
(
    id          bigint unsigned auto_increment
        primary key,
    name        varchar(100)                        null,
    nickname    varchar(30)                         null,
    email       varchar(100)                        null,
    is_delete   tinyint   default 0                 not null,
    create_date datetime  default CURRENT_TIMESTAMP not null,
    update_date timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP
)
    collate = utf8_unicode_ci;





DELETE from  SCIENCE_FICTION_BOOK where 1=1;
DELETE from  SCIENCE_FICTION_CATEGORY where 1=1;
DELETE from  SCIENCE_FICTION_AUTHOR where 1=1;
DELETE from  SCIENCE_FICTION_FILE where 1=1;

alter table SCIENCE_FICTION_BOOK auto_increment = 1;
alter table SCIENCE_FICTION_CATEGORY auto_increment = 1;
alter table SCIENCE_FICTION_AUTHOR auto_increment = 1;
alter table SCIENCE_FICTION_FILE auto_increment = 1;
```