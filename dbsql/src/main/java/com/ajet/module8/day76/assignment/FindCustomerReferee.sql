-- Write an SQL query to fetch the names of the customer that are not referred by the customer with id = 102.

create table customer(
    id int,
    name varchar(255),
    referee_id int
);



-- sample date

insert into customer values(100, 'Z', 101);
insert into customer values(101, 'A', 102);
insert into customer values(102, 'B', null);
insert into customer values(103, 'C', 102);
insert into customer values(104, 'D', 101);
insert into customer values(105, 'E', 101);
insert into customer values(106, 'F', 103);


-- query

select name from customer where referee_id != 102 or referee_id is null;
