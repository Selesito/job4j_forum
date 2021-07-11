insert into posts (name) values ('О чем этот форум?');
insert into posts (name) values ('Правила форума.');

insert into authorities (authority) values ('ROLE_USER');
insert into authorities (authority) values ('ROLE_ADMIN');

insert into users (username, enabled, password, authority_id)
values ('Admin', true, '$2a$10$Vt44.TGBGRn0IBmfWGttVuyBf7.a4FUz.Aby.DggAEo01Mr626tHi',
        (select id from authorities where authority = 'ROLE_ADMIN'));