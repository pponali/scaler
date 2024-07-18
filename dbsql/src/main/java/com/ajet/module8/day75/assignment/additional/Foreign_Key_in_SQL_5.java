package com.ajet.module8.day75.assignment.additional;

/**
 * Author prakashponali @pponali
 * <p>
 * Date   18/07/24 6:42 pm
 *
 *
 * Consider the following scenario
 * ----------------------------------
 * Students Table
 * ----------------------------------
 * | id | student_name | branch_id |
 * |----|--------------|-----------|
 * |  1 | Jay          |    10     |
 * |----|--------------|-----------|
 * |  2 | Mohit        |     1     |
 * |----|--------------|-----------|
 * |  3 | Deepak       |    13     |
 * ----------------------------------
 *
 *Branch Table
 *
 * ---------------------------------------
 * | branch_id | branch_name            |
 * |-----------|------------------------|
 * |    10     | Computer Science       |
 * |-----------|------------------------|
 * |    13     | Electronics            |
 * |-----------|------------------------|
 * |     1     | Civil                  |
 * ---------------------------------------
 *
 * If a foreign key is set with the ON UPDATE SET NULL option,
 * what happens when a branch with branch_id 13 is updated from the “Branch” table?
 *
 * Choose the correct answer from below:
 * Your score for this problem will be decided based on your FIRST SUBMISSION ONLY
 * 1) All Students with branch_id 13 will have their branch_id set to NULL.
 * 2) All Students with branch_id 13 will be updated in the "Students" table.
 * 3) The update of the branch with branch_id 13 will not affect the "Students" table.
 * 4) All Students in the "Students" table will be updated with branch_id 13.
 *
 *
 */
public class Foreign_Key_in_SQL_5 {
}
