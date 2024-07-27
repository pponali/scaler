-- Write an SQL query to report the unique customers with postive revenue in the year 2021.
-- Note: Use distinct operator to get unique values.

create table customers(
    customer_id int,
    revenue int,
    year int
);

insert into customers values(108, 100, 2021);
insert into customers values(109, 200, 2021);
insert into customers values(110, -300, 2021);
insert into customers values(111, -400, 2021);
insert into customers values(112, 500, 2021);

select distinct customer_id from customers where revenue > 0 and year = 2021;
