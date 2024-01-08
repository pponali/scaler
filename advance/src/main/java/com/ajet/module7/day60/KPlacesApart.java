package com.ajet.module7.day60;

/**
 * Author prakashponali @pponali
 * <p>
 * Date   08/01/24 1:31 pm
 *<p></p>
 * N people having different priorities are standing in a queue.
 *<p></p>
 * The queue follows the property that each person is standing at most B places away from its position in the sorted queue.
 *<p></p>
 * Your task is to sort the queue in the increasing order of priorities.
 *<p></p>
 * NOTE:
 *<p></p>
 * No two persons can have the same priority.
 * Use the property of the queue to sort the queue with complexity O(NlogB).
 *<p></p>
 *
 * Problem Constraints
 * 1 <= N <= 100000
 * 0 <= B <= N
 *<p></p>
 *
 *
 * Input Format
 * The first argument is an integer array A representing the priorities and initial order of N persons.
 * The second argument is an integer B.
 *<p></p>
 *
 *
 * Output Format
 * Return an integer array representing the sorted queue.
 *<p></p>
 *
 *
 * Example Input
 * Input 1:
 *<p></p>
 *  A = [1, 40, 2, 3]
 *  B = 2
 * Input 2:
 *<p></p>
 *  A = [2, 1, 17, 10, 21, 95]
 *  B = 1
 *<p></p>
 *
 * Example Output
 * Output 1:
 *<p></p>
 *  [1, 2, 3, 40]
 * Output 2:
 *<p></p>
 *  [1, 2, 10, 17, 21, 95]
 *<p></p>
 *
 * Example Explanation
 * Explanation 1:
 *<p></p>
 *  Given array A = [1, 40, 2, 3]
 *  After sorting, A = [1, 2, 3, 40].
 *  We can see that difference between initial position of elements amd the final position <= 2.
 * Explanation 2:
 *<p></p>
 *  After sorting, the array becomes [1, 2, 10, 17, 21, 95].
 */
public class KPlacesApart {
}
