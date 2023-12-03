package com.practice.day45.additional;

/**
 * @Author prakashponali
 * @Date 03/12/23
 * @Description
 *
 * Given a singly linked list A and an integer B, reverse the nodes of the list B at a time and return the modified linked list.
 *<p></p>
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 103
 *<p></p>
 * B always divides A
 *<p></p>
 *
 *
 * Input Format
 * The first argument of input contains a pointer to the head of the linked list.
 *<p></p>
 * The second arugment of input contains the integer, B.
 *<p></p>
 *
 *
 * Output Format
 * Return a pointer to the head of the modified linked list.
 *<p></p>
 *
 *
 * Example Input
 * Input 1:
 *<p></p>
 *  A = [1, 2, 3, 4, 5, 6]
 *  B = 2
 * Input 2:
 *<p></p>
 *  A = [1, 2, 3, 4, 5, 6]
 *  B = 3
 *<p></p>
 *
 * Example Output
 * Output 1:
 *<p></p>
 *  [2, 1, 4, 3, 6, 5]
 * Output 2:
 *<p></p>
 *  [3, 2, 1, 6, 5, 4]
 *<p></p>
 *
 * Example Explanation
 * Explanation 1:
 *<p></p>
 *  For the first example, the list can be reversed in groups of 2.
 *     [[1, 2], [3, 4], [5, 6]]
 *  After reversing the K-linked list
 *     [[2, 1], [4, 3], [6, 5]]
 * Explanation 2:
 *<p></p>
 *  For the second example, the list can be reversed in groups of 3.
 *     [[1, 2, 3], [4, 5, 6]]
 *  After reversing the K-linked list
 *     [[3, 2, 1], [6, 5, 4]]
 */
public class K_reverse_linked_list {
}
