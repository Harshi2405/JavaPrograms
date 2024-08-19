Given a string S and an array A of indices, reverse specific parts of S based on the values in A.

The first integer in A tells you to reverse the first A[0] characters of S. For each subsequent integer in A, reverse the next set of characters as determined by the difference between the current and previous index.

Sample Input and Outputs:
1.
S: abcdef
A[]: [2,5]
o/p: baedcf
2.
S: abcdefghij
A: [2,5,9]
o/p: baedcighfj
