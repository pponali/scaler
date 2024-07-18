package com.ajet.module8.day75.assignment.additional;

/**
 * Author prakashponali @pponali
 * <p>
 * Date   18/07/24 6:54 pm
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
 * Branch Table
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
 * The ON DELETE SET DEFAULT option is only functional under which circumstances?
 *
 * Choose the correct answer from below:
 * Your score for this problem will be decided based on your FIRST SUBMISSION ONLY
 * 1) When the branch_id of the "Branch" table is updated, employees with matching branch_id will be set to their default branch_id.
 * 2) When the branch_id of the "Branch" table is updated, employees with matching branch_id will be updated to NULL.
 * 3) When the branch_id of the "Branch" table is deleted, employees with matching branch_id will be deleted as well.
 * 4) When the branch_id of the "Branch" table is deleted, employees with matching branch_id will be set to their default branch_id.
 *
 * Ans: 4
 *
 */
public class Foreign_Key_in_SQL_7 {
}
