INSERT into POST (id, title, content, author)
VALUES (1, 'MIU', 'Life is structured in layers', 'Dean');
INSERT into POST (id, title, content, author)
VALUES (2, 'React', 'React is a good SPA library', 'Dean');
INSERT into POST (id, title, content, author)
VALUES (3, 'Spring', 'Spring is awesome', 'Dean');
INSERT into POST (id, title, content, author)
VALUES (4, 'SpringBoot', 'This is a module that works over spring modules', 'John');


INSERT into POSTV2 (id, title, content, author)
VALUES (1, 'MIU', 'Life is structured in layers', 'Dean');

INSERT into USER (id, name)
VALUES (101, 'Sam');
INSERT into USER (id, name)
VALUES (102, 'Mathew');
INSERT into USER (id, name)
VALUES (103, 'Jack');

INSERT INTO USER_POSTS(USER_ID, POSTS_ID)
VALUES (101, 1);
INSERT INTO USER_POSTS(USER_ID, POSTS_ID)
VALUES (102, 2);
INSERT INTO USER_POSTS(USER_ID, POSTS_ID)
VALUES (102, 3);
INSERT INTO USER_POSTS(USER_ID, POSTS_ID)
VALUES (103, 4);