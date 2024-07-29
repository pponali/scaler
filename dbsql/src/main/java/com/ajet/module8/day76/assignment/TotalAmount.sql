/*

Problem Description:
Write a query to calculate the sub_total for each order, return the details of the orderNumber, productCode, and sub_total.
Note : Please ensure to read the sample out explanation.

First by the orderNumber column in ascending order.
Then by the sub_total column in descending order by using the DESC keyword.


*/

    select orderNumber, productCode, round((quantityOrdered * priceEach), 2) as sub_total from orderdetails order by orderNumber, sub_total desc;
-- floor 2 after round
-- round to 2 decimal places
-- select round(123.456, 2);


select orderNumber, productCode, round((quantityOrdered * priceEach), 2) as sub_total from orderdetails order by orderNumber desc;
