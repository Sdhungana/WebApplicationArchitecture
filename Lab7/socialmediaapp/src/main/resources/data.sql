INSERT INTO POST (id, title, content, author)
VALUES (1, 'MIU', 'Life is structured in layers', 'Dean');
INSERT INTO POST (id, title, content, author)
VALUES (2, 'React', 'React is a good SPA library', 'Dean');
INSERT INTO POST (id, title, content, author)
VALUES (3, 'Spring', 'Spring is awesome', 'Dean');
INSERT INTO POST (id, title, content, author)
VALUES (4, 'SpringBoot', 'This is a module that works over spring modules', 'John');


INSERT INTO POSTV2 (id, title, content, author)
VALUES (1, 'MIU', 'Life is structured in layers', 'Dean');

INSERT INTO USER (id, name, username, password,IS_ENABLED)
VALUES (101, 'Sam', 'sam001', '1234',true);
INSERT INTO USER (id, name, username, password,IS_ENABLED)
VALUES (102, 'Mat', 'mat001', '1234',true);
INSERT INTO USER (id, name, username, password,IS_ENABLED)
VALUES (103, 'Jack', 'jack001', '1234',true);


INSERT INTO ROLE(ROLE_ID, ROLE)
VALUES (1, 'USER');
INSERT INTO ROLE(ROLE_ID, ROLE)
VALUES (2, 'ADMIN');

INSERT INTO USER_ROLES(USER_ID, ROLE_ID)
VALUES (101, 1);
INSERT INTO USER_ROLES(USER_ID, ROLE_ID)
VALUES (102, 2);
INSERT INTO USER_ROLES(USER_ID, ROLE_ID)
VALUES (103, 1);

INSERT INTO USER_POSTS(USER_ID, POSTS_ID)
VALUES (101, 1);
INSERT INTO USER_POSTS(USER_ID, POSTS_ID)
VALUES (102, 2);
INSERT INTO USER_POSTS(USER_ID, POSTS_ID)
VALUES (102, 3);
INSERT INTO USER_POSTS(USER_ID, POSTS_ID)
VALUES (103, 4);