package com.adnan;

/*
234. Palindrome Linked List
Easy

11213

636

Add to List

Share
Given the head of a singly linked list, return true if it is a palindrome.

Example 1:
Input: head = [1,2,2,1]
Output: true

Example 2:
Input: head = [1,2]
Output: false


Constraints:

The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9


Follow up: Could you do it in O(n) time and O(1) space?
  */

import java.util.LinkedList;

public class _234_Palindrome_Linked_List {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>();
        LL.addLast(1);
        LL.addLast(2);
        LL.addLast(2);
        LL.addLast(1);

        System.out.println(LL);
    }
}
