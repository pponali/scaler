package com.ajet.module8.day75.assignment.additional;

/**
 * Author prakashponali @pponali
 * <p>
 * Date   18/07/24 6:49 pm
 *
 * Consider the following scenario
 *  * ----------------------------------
 *  * Students Table
 *  * ----------------------------------
 *  * | id | student_name | branch_id |
 *  * |----|--------------|-----------|
 *  * |  1 | Jay          |    10     |
 *  * |----|--------------|-----------|
 *  * |  2 | Mohit        |     1     |
 *  * |----|--------------|-----------|
 *  * |  3 | Deepak       |    13     |
 *  * ----------------------------------
 *  *
 *  *Branch Table
 *  *
 *  * ---------------------------------------
 *  * | branch_id | branch_name            |
 *  * |-----------|------------------------|
 *  * |    10     | Computer Science       |
 *  * |-----------|------------------------|
 *  * |    13     | Electronics            |
 *  * |-----------|------------------------|
 *  * |     1     | Civil                  |
 *  * ---------------------------------------
 *
 *  What is the default action taken by the MySQL database when a foreign
 *  key is defined without any explicit ON DELETE or ON UPDATE options?
 *
 *  Choose the correct answer from below:
 * Your score for this problem will be decided based on your FIRST SUBMISSION ONLY
 * 1) All students with matching branch_id will be deleted.
 * 2) The update or deletion of the department will not affect the "Students" table.
 * 3) All students with matching branch_id will have their branch_id set to NULL.
 * 4) All students with matching branch_id will have their branch_id set to the default value.
 *
 * Ans: 3
 */
public class Foreign_Key_in_SQL_6 {
}
