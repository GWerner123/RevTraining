--querying practice

select * from "Employee";

select * from "Employee" where "LastName" like 'King';

select * from "Employee" where "FirstName" like 'Andrew' and "ReportsTo" isnull;

select * from "Album" order by "Title" desc;

select "FirstName" from "Customer" order by "City" asc;

select * from "Invoice" where "BillingAddress" like 'T%';

select * from "Invoice" where "Total" > 15 and "Total" < 50;

select * from "Employee" where "HireDate" > '2003,06,01' and "HireDate" < '2004,03,01';



--inserting practice

insert into "Genre" values (26, 'Soft Rock');
insert into "Genre" values (27, 'Musical Theater');

select * from "Genre";


insert into "Employee" values (9, 'Scott', 'Michael', 'Regional Manager', 1, '1965,03,15', '1995,01,01', '123 Paper ST', 'Scranton', 'PA', 'United States', '67545', '(345) 876-9845', '(765) 745-6789', 'mscott@dundermifflin.com');
insert into "Employee" values (10, 'Schrute', 'Dwight', 'Assistant to Regional Manager', 1, '1972,06,30', '2003,01,01', '123 Pennsylvania ST', 'Scranton', 'PA', 'United States', '67545', '(645) 847-7834', '(847) 746-9076', 'dschrute@dundermifflin.com');

select * from "Employee" where "City" like 'Scranton';



insert into "Customer" values (60, 'Jake', 'Smith', 'Walmart', '234 Road ST', 'Houston', 'TX', 'United States', '89770', '(808) 867-5309', null, 'jsmith@gmail.com', 4);
insert into "Customer" values (61, 'Joe', 'Shmoe', 'Target', '345 Street RD', 'Houston', 'TX', 'United States', '76554', '(808) 876-9087', null, 'jshmoe@yahoo.com', 5);

select * from "Customer";



--updating practice

update "Customer" set "FirstName" = 'Robert', "LastName" = 'Walker' where "FirstName" = 'Aaron' and "LastName" = 'Mitchell';
update "Artist" set "Name" = 'CCR' where "Name" = 'Creedence Clearwater Revival';

select * from "Customer";
select * from "Artist" order by "Name" asc;
