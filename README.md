# LeetCode Solution Repository

| **Number** | **Title** | **Solution** | **Description** |
| ------ | ----- | -------- | ----------- |
| 0001 | [Two Sum](https://leetcode.com/problems/two-sum/) | [Java](https://github.com/christttto/LeetCode/blob/master/Problems/0001_Two_Sum/0001_Two_Sum.java) [JavaScript](https://github.com/christttto/LeetCode/blob/master/Problems/0001_Two_Sum/0001_Two_Sum.js) | hashmap problem. make sure to think about edge cases, about duplicates and null. HashMap<TYPE,TYPE> to instanciate. map.containsKey, map.put(a,b), map.get(a) are the key methods |
| 0002 | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) | [Java](https://github.com/christttto/LeetCode/blob/master/Problems/0002_Add_Two_Numbers/0002_Add_Two_Numbers.java) [JavaScript](https://github.com/christttto/LeetCode/blob/master/Problems/0002_Add_Two_Numbers/0002_Add_Two_Numbers.js) | The first thought was that I needed to handle carry-overs. Created helper function to add extra parameter. Every recursion, created new ListNode and made myListNode.next equal to call for helper function that would return a ListNode. Created if cases to filter out null parameters. From several iterations, my code changed be more legible. |
| 0003 | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | [Java](https://github.com/christttto/LeetCode/blob/master/Problems/0003_Longest_Substring_Without_Repeating_Characters/0003_Longest_Substring_Without_Repeating_Character.java) [JavaScript](https://github.com/christttto/LeetCode/blob/master/Problems/0003_Longest_Substring_Without_Repeating_Characters/0003_Longest_Substring_Without_Repeating_Characters.js) |  |
| 0004 | [Median_of_Two_Sorted_Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/) | [JavaScript](https://github.com/christttto/LeetCode/blob/master/Problems/0004_Median_of_Two_Sorted_Arrays/0004_Median_of_Two_Sorted_Arrays.js) |  |
| 0007 | [Reverse Integer](https://leetcode.com/problems/reverse-integer/) | [JavaScript](https://github.com/christttto/LeetCode/blob/master/Problems/0007_Reverse_Integer/0007_Reverse_Integer.js) |  |
| 0009 | [Palindrome Number](https://leetcode.com/problems/palindrome-number/) | [JavaScript](https://github.com/christttto/LeetCode/blob/master/Problems/0009_Palindrome_Number/0009_Palindrome_Number.js) |  |
| 0011 | [Container_With_Most_Water](https://leetcode.com/problems/container-with-most-water/) | [Java](https://github.com/christttto/LeetCode/blob/master/Problems/0011_Container_With_Most_Water/0011_Container_With_Most_Water.java) |  |
| 0013 | [Roman to Integer](https://leetcode.com/problems/roman-to-integer/) | [JavaScript](https://github.com/christttto/LeetCode/blob/master/Problems/0009_Palindrome_Number/0009_Palindrome_Number.js) |  |
| 0014 | [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/) | [JavaScript](https://github.com/christttto/LeetCode/blob/master/Problems/0014_Longest_Common_Prefix/0014_Longest_Common_Prefix.js) |  |
| 0020 | [Valid_Parentheses](https://leetcode.com/problems/valid-parentheses/) | [Java](https://github.com/christttto/LeetCode/blob/master/Problems/0020_Valid_Parentheses/0020_Valid_Parentheses.java) [JavaScript](https://github.com/christttto/LeetCode/blob/master/Problems/0020_Valid_Parentheses/0020_Valid_Parentheses.js) |  |
| 0021 | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | [Java](https://github.com/christttto/LeetCode/blob/master/Problems/0021_Merge_Two_Sorted_Lists/0021_Merge_Two_Sorted_Lists.java)[JavaScript](https://github.com/christttto/LeetCode/blob/master/Problems/0021_Merge_Two_Sorted_Lists/0021_Merge_Two_Sorted_Lists.js) | Recursive approach. Wanted to cover all the base case, but with the return statements, we can notice that there will never be a case where both .next will be called. Therefore, no need for if both null, which can be removed. |
| 0026 | [Remove Duplicates From Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | [JavaScript](https://github.com/christttto/LeetCode/blob/master/Problems/0026_Remove_Duplicates_From_Sorted_Array/0026_Remove_Duplicates_From_Sorted_Array.js) |  |
| 0027 | [Remove Element](https://leetcode.com/problems/remove-element/) | [JavaScript](https://github.com/christttto/LeetCode/blob/master/Problems/0027_Remove_Element/0027_Remove_Element.js) |  |
| 0028 | [Implement strStr()](https://leetcode.com/problems/implement-strstr/) | [JavaScript](https://github.com/christttto/LeetCode/blob/master/Problems/0028_Implement_strStr/0028_Implement_strStr.js) |  |
| 0035 | [Search_Insert_Position](https://leetcode.com/problems/search-insert-position/) | [JavaScript](https://github.com/christttto/LeetCode/blob/master/Problems/0035_Search_Insert_Position/0035_Search_Insert_Position.js) |  |
| 0036 | [Valid_Sudoku](https://leetcode.com/problems/valid-sudoku/) | [Java](https://github.com/christttto/LeetCode/blob/master/Problems/0036_Valid_Sudoku/0036_Valid_Sudoku.java) | Got it to work in one try, but it is the naive solution. A better way of solving the problem would be initailizing all three set and use double forloop once. Should do it again later. |
| 0038 | [Count and Say](https://leetcode.com/problems/count-and-say/) | [JavaScript](https://github.com/christttto/LeetCode/blob/master/Problems/0038_Count_And_Say/0038_Count_And_Say.js) |  |
| 0048 | [Rotate Image](https://leetcode.com/problems/rotate-image/) | [Java](https://github.com/christttto/LeetCode/blob/master/Problems/0048_Rotate_Image/0048_Rotate_Image.java) | I think I can say good job to myself on this one. It is easier than other questions, but I still practiced a good approach. To Flip, first inverted the matrix, than x-axis flipped to get same flip. This would have taken O(2n), but to optimized I thought about the question little longer. Than, I realized that I could start x-axis rotation on the rows that has already been inverted, instead of starting another double forloop. I could not get rid of the forloop, but managed to get the speed to O(n) |
| 0053 | [Maximum_Subarray](https://leetcode.com/problems/maximum-subarray/) | [JavaScript](https://github.com/christttto/LeetCode/blob/master/Problems/0053_Maximum_Subarray/0053_Maximum_Subarray.js) |  |
| 0058 | [Length_of_Last_Word](https://leetcode.com/problems/Length_of_Last_Word/) | [JavaScript](https://github.com/christttto/LeetCode/blob/master/Problems/0058_Length_of_Last_Word/0058_Length_of_Last_Word.js) |  |
| 0066 | [Plus_One](https://leetcode.com/problems/plus-one/) | [JavaScript](https://github.com/christttto/LeetCode/blob/master/Problems/0066_Plus_One/0066_Plus_One.js) |  |
| 0067 | [Add_Binary](https://leetcode.com/problems/add-binary/) | [JavaScript](https://github.com/christttto/LeetCode/blob/master/Problems/0067_Add_Binary/0067_Add_Binary.js) |  |
| 0069 | [Sqrt](https://leetcode.com/problems/sqrtx/) | [JavaScript](https://github.com/christttto/LeetCode/blob/master/Problems/0069_Sqrt/0069_Sqrt.js) |  |
| 0070 | [Climbing_Stairs](https://leetcode.com/problems/climbing-stairs/) | [JavaScript](https://github.com/christttto/LeetCode/blob/master/Problems/0070_Climbing_Stairs/0070_Climbing_Stairs.js) |  |
| 0079 | [Word_Search](https://leetcode.com/problems/word-search/submissions/) | [Java](https://github.com/christttto/LeetCode/blob/master/Problems/0079_Word_Search/0079_Word_Search.java) | Did not finish. logical error. |
| 0083 | [Remove_Duplicates_from_Sorted_List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/) | [JavaScript](https://github.com/christttto/LeetCode/blob/master/Problems/0083_Remove_Duplicates_from_Sorted_List/0083_Remove_Duplicates_from_Sorted_List.js) |  |
| 0100 | [Same_Tree](https://leetcode.com/problems/same-tree/) | [JavaScript](https://github.com/christttto/LeetCode/blob/master/Problems/0100_Same_Tree/0100_Same_Tree.js) |  |
| 0101 | [Symmetric_Tree](https://leetcode.com/problems/symmetric-tree/) | [Java](https://github.com/christttto/LeetCode/blob/master/Problems/0101_Symmetric_Tree/0101_Symmetric_Tree.java) |  |
| 0118 | [Pascals_Triangle](https://leetcode.com/problems/pascals-triangle/) | [Java](https://github.com/christttto/LeetCode/blob/master/Problems/0118_Pascals_Triangle/0118_Pascals_Triangle.java) |  |
| 0121 | [Best_Time_to_Buy_and_Sell_Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | [Java](https://github.com/christttto/LeetCode/blob/master/Problems/0121_Best_Time_to_Buy_and_Sell_Stock/0121_Best_Time_to_Buy_and_Sell_Stock.java) |  |
| 0125 | [Valid_Palindrome](https://leetcode.com/problems/valid-palindrome/) | [Java](https://github.com/christttto/LeetCode/blob/master/Problems/0125_Valid_Palindrome/0125_Valid_Palindrome.java) |  |
| 0167 | [The_Sky_Line_Problem](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) | [Java](https://github.com/christttto/LeetCode/blob/master/Problems/0167_Two_Sum_II/0167_Two_Sum_II.java) |  |
| 0175 | [Combine_Two_Tables](https://leetcode.com/problems/combine-two-tables/) | [SQL](https://github.com/christttto/LeetCode/blob/master/Problems/0175_Combine_Two_Tables/0175_Combine_Two_Tables.sql) |  |
| 0176 | [Second_Highest_Salary](https://leetcode.com/problems/second-highest-salary/) | [SQL](https://github.com/christttto/LeetCode/blob/master/Problems/0176_Second_Highest_Salary/0176_Second_Highest_Salary.sql) |  |
| 0218 | [The_Sky_Line_Problem](https://leetcode.com/problems/the-skyline-problem/) | [Java](https://github.com/christttto/LeetCode/blob/master/Problems/0218_The_Skyline_Problem/0218_The_Skyline_Problem.java) |  |
| 0230 | [Kth_Smallest_Element_in_a_BST](https://leetcode.com/problems/kth-smallest-element-in-a-bst/) | [Java](https://github.com/christttto/LeetCode/blob/master/Problems/0230_Kth_Smallest_Element_in_a_BST/0230_Kth_Smallest_Element_in_a_BST.java) |  |
| 0257 | [Binary_Tree_Paths](https://leetcode.com/problems/binary-tree-paths/) | [Java](https://github.com/christttto/LeetCode/blob/master/Problems/0257_Binary_Tree_Paths/0257_Binary_Tree_Paths.java) | Took longer than expected. Creating helper function and considering edge cases because I have to think about adding the arrows in. For this purpose, I just made node before leaf take care of it, but it might be cleaner to do it other way around. Worked with void function that edits same list, which was harder to think about in the beginnning. Good question. |
| 0326 | [Power_of_Three](https://leetcode.com/problems/power-of-three/) | [Java](https://github.com/christttto/LeetCode/blob/master/Problems/0326_Power_of_Three/0326_Power_of_Three.java) |  |
| 0338 | [Counting_Bits](https://leetcode.com/problems/counting-bits/) | [Java](https://github.com/christttto/LeetCode/blob/master/Problems/0338_Counting_Bits/0338_Counting_Bits.java) |  |
| 0343 | [Integer_Break](https://leetcode.com/problems/integer-break/) | [Java](https://github.com/christttto/LeetCode/blob/master/Problems/0343_Integer_Break/0343_Integer_Break.java) |  |
| 0347 | [Top_K_Frequent_Elements](https://leetcode.com/problems/top-k-frequent-elements/) | [Java](https://github.com/christttto/LeetCode/blob/master/Problems/0347_Top_K_Frequent_Elements/0347_Top_K_Frequent_Elements.java) |  |
| 0349 | [Intersection_of_Two_Arrays](https://leetcode.com/problems/intersection-of-two-arrays/) | [Java](https://github.com/christttto/LeetCode/blob/master/Problems/0349_Intersection_of_Two_Arrays/0349_Intersection_of_Two_Arrays.java) |  |
| 0455 | [Assign_Cookies](https://leetcode.com/problems/assign-cookies/) | [Java](https://github.com/christttto/LeetCode/blob/master/Problems/0455_Assign_Cookies/0455_Assign_Cookies.java) | It works, but sorting two arrays and forlooping once sounds pretty inefficient. I will now look at the answer to see if there was a better way to optimize. |
| 0496 | [Next_Greater_Element_I](https://leetcode.com/problems/next-greater-element-i/) | [Java](https://github.com/christttto/LeetCode/blob/master/Problems/0496_Next_Greater_Element_I/0496_Next_Greater_Element_I.java) | Attempted, understood the question wrong. It should be tried again. |
| 0507 | [Perfect_Number](https://leetcode.com/problems/perfect-number/) | [Java](https://github.com/christttto/LeetCode/blob/master/Problems/0507_Perfect_Number/0507_Perfect_Number.java) | Faster way to get all the divisor is by iterating upto sqrt(n) to find all the divisors |
| 0592 | [Fraction_Addition_and_Subtraction](https://leetcode.com/problems/fraction-addition-and-subtraction/) | [Java](https://github.com/christttto/LeetCode/blob/master/Problems/0592_Fraction_Addition_and_Subtraction/0592_Fraction_Addition_and_Subtraction.java) |  |
| 0605 | [Can_Place_Flowers](https://leetcode.com/problems/can-place-flowers/) | [Java](https://github.com/christttto/LeetCode/blob/master/Problems/0605_Can_Place_Flowers/0605_Can_Place_Flowers.java) | Rule of thumb, is to start with the individual, than dive into the specific iterable, than take a look at edges. In this case, if I had first looked at the location, than worked to check if the sides are 0 or edge, it would be lot more concise and legible. Practice again! |
| 0707 | [Design_Linked_List](https://leetcode.com/problems/design-linked-list/) | [Java](https://github.com/christttto/LeetCode/blob/master/Problems/0707_Design_Linked_List/0707_Design_Linked_List.java) | Need to practice creating ood. Do it again, after re-writing solution. |
| 0793 | [Fraction_Addition_and_Subtraction](https://leetcode.com/problems/preimage-size-of-factorial-zeroes-function/) | [Java](https://github.com/christttto/LeetCode/blob/master/Problems/0793_Preimage_Size_of_Factorial_Zeros_Function/0793_Preimage_Size_of_Factorial_Zeros_Function.java) | Did a mock. Got the logic out, but not enough time to write it up. Wasted first minutes trying to brute-force. Should try to get the algorithm first. |







































