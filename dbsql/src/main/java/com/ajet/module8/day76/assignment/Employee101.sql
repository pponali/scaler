/*

Context:
Unified Solutions Inc. is a technology consulting firm specialising in workforce management solutions, dedicated to providing tailored staffing solutions to optimise business operations. The company prides itself on deploying highly skilled professionals to meet the staffing needs of various industries. To maintain accurate records of employee career progression and ensure effective human resources management, Unified Solutions Inc. utilizes a comprehensive job history database.
You are a database administrator at Unified Solutions Inc. As part of your responsibility to manage employee records, you need to retrieve details from the job history for all employees except for the employee with ID 101. This data is crucial for tracking career trajectories, facilitating performance evaluations, and supporting strategic workforce planning initiatives.
Problem Statement:
Write a query to get all the details of all the employees from job_history except for the employee with ID 101.
Result:
Return all the fields.
Return the result ordered by employee_id and job_id in ascending order.

*/

select * from job_history where employee_id != 101 order by employee_id, job_id asc;