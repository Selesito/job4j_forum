insert into posts (name, description) values ('О чем этот форум?', 'Новый форум');
insert into posts (name, description) values ('Правила форума.', 'Форум' );

insert into authorities (authority) values ('ROLE_USER');
insert into authorities (authority) values ('ROLE_ADMIN');

insert into users (username, enabled, password, authority_id)
values ('admin', true, '$2a$10$niVHRW/hgEyEjDkXUlqh3uw2xP1Bc9TM5xxVYNhpLj3aeaSVe8xsq',
        (select id from authorities where authority = 'ROLE_ADMIN'));
