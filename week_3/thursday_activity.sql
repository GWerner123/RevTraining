
--QUESTION 1
drop table if exists question_one;
create table question_one (id serial primary key, value int);

insert into question_one values(default,-56);
insert into question_one values(default,76);
insert into question_one values(default,-84);
insert into question_one values(default,96);
insert into question_one values(default,-47);

select id, value*-1 as opposite_value from question_one;


--QUESTION 2
drop table if exists question_two;
create table question_two (division_id int, year int, revenue int);

insert into question_two values(1, 2018, 60);
insert into question_two values(1, 2021, 40);
insert into question_two values(1, 2020, 70);
insert into question_two values(2, 2021, -10);
insert into question_two values(3, 2018, 20);
insert into question_two values(3, 2016, 40);
insert into question_two values(4, 2021, 50);

select division_id from question_two where year = 2021 and revenue >= 0;


--QUESTION 3
drop table if exists question_three;
create table question_three (id serial primary key, year int);

insert into question_three values(default, 1776);
insert into question_three values(default, 2001);
insert into question_three values(default, 1643);
insert into question_three values(default, 1865);
insert into question_three values(default, 1969);

select year/100 + 1 as century from question_three;


--QUESTION 4
drop table if exists question_four;
create table question_four (id serial primary key, value int);

insert into question_four values (default, 4);
insert into question_four values (default, 11);
insert into question_four values (default, 57);
insert into question_four values (default, 24);
insert into question_four values (default, 47);

select case when value % 2 = 0 then 'Even' else 'Odd' end as even_or_odd from question_four;


--QUESTION 5
drop table if exists question_five;
create table question_five (id serial primary key, name varchar(50), age int);

insert into question_five values(default, 'Bob', 21);
insert into question_five values(default, 'Sam', 19);
insert into question_five values(default, 'Jill', 18);
insert into question_five values(default, 'Jim', 21);
insert into question_five values(default, 'Sally', 19);
insert into question_five values(default, 'Jess', 20);
insert into question_five values(default, 'Will', 21);

select age, count(age) from question_five group by age order by age;


--QUESTION 6
drop table if exists question_six;
create table question_six (id serial primary key, name varchar(50));

insert into question_six values(default, 'Bob');
insert into question_six values(default, 'Sam');
insert into question_six values(default, 'Jill');
insert into question_six values(default, 'Jim');
insert into question_six values(default, 'Sally');
insert into question_six values(default, 'Jess');
insert into question_six values(default, 'Will');

select *, concat('Hi ', name, '! How are you today?') as greeting from question_six;


--QUESTION 7
drop table if exists question_seven;
create table question_seven (id serial primary key, name varchar(50), amount_sold int);

insert into question_seven values(default, 'cup', 11);
insert into question_seven values(default, 'saucer', 22);
insert into question_seven values(default, 'plate', 46);
insert into question_seven values(default, 'fork', 34);
insert into question_seven values(default, 'spoon', 45);
insert into question_seven values(default, 'knife', 78);
insert into question_seven values(default, 'mug', 23);
insert into question_seven values(default, 'glass', 64);
insert into question_seven values(default, 'tumbler', 24);

select * from question_seven order by amount_sold desc limit 5;


--QUESTION 8
drop table if exists question_eight;
create table question_eight (id serial primary key, name varchar(50), country varchar(50));

insert into question_eight values(default, 'Bob Smith', 'United States');
insert into question_eight values(default, 'Jim Jones', 'China');
insert into question_eight values(default, 'Sam White', 'Japan');
insert into question_eight values(default, 'Jess Black', 'Canada');
insert into question_eight values(default, 'Will Wilson', 'Germany');
insert into question_eight values(default, 'Wilson Scott', 'England');
insert into question_eight values(default, 'Scott Daniels', 'France');
insert into question_eight values(default, 'Daniel Jackson', 'Canada');
insert into question_eight values(default, 'Jack Johnson', 'United States');

select name from question_eight
except
select name from question_eight where country = 'United States' or country = 'Canada';


--QUESTION 9
drop table if exists question_nine;
create table question_nine (id serial primary key, name varchar(50), age int);

insert into question_nine values(default, 'Bob', 21);
insert into question_nine values(default, 'Sam', 19);
insert into question_nine values(default, 'Jill', 18);
insert into question_nine values(default, 'Jim', 21);
insert into question_nine values(default, 'Sally', 19);
insert into question_nine values(default, 'Jess', 20);
insert into question_nine values(default, 'Will', 21);

select distinct age from question_nine order by age;


--QUESTION 10
drop table if exists question_ten;
create table question_ten (id serial primary key, name varchar(50), age int);

insert into question_ten values(default, 'Bob', 21);
insert into question_ten values(default, 'Sam', 19);
insert into question_ten values(default, 'Jill', 18);
insert into question_ten values(default, 'Jim', 21);
insert into question_ten values(default, 'Sally', 19);
insert into question_ten values(default, 'Jess', 20);
insert into question_ten values(default, 'Will', 21);

select sum(age) as sum_of_ages from question_ten;