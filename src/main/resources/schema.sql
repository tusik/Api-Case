CREATE TABLE if not exists links(
uid INTEGER not null primary key auto_increment,
uri varchar(512),
rid INTEGER not null
);
CREATE TABLE if not exists response(
rid INTEGER not null primary key auto_increment,
rtype INTEGER not null,
status INTEGER,
content Text,
response Text
);
CREATE TABLE if not exists resptype(
rtid INTEGER not null primary key auto_increment,
code INTEGER,
name varchar(32)
);