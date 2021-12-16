# ScienceFiction-Server

## Database:
```sql
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
```
```sql
create table science_fiction.SCIENCE_FICTION_BOOK
(
    id             bigint auto_increment
        primary key,
    book_name      varchar(200)  null,
    book_author    bigint        null,
    book_category  bigint        null,
    book_tags      json          null,
    book_images    varchar(1024) null,
    book_file_path varchar(1024) null
);
```
```sql
create table science_fiction.SCIENCE_FICTION_CATEGORY
(
    id            bigint auto_increment
        primary key,
    category_name varchar(200) not null
);
```
```sql
create table science_fiction.SCIENCE_FICTION_AUTHOR
(
    id                  bigint auto_increment
        primary key,
    author_first_name   varchar(200) null,
    author_last_name    varchar(200) null,
    author_nation       varchar(10)  null,
    author_informations text         null
);
```