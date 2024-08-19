_Given a string S and an array A of indices, reverse specific parts of S based on the values in A._

The first integer in A tells you to reverse the first A[0] characters of S. For each subsequent integer in A, reverse the next set of characters as determined by the difference between the current and previous index.

_Sample Input and Output 1:_

S: abcdef

n: 2

A: 2 5

o/p: baedcf

_Sample Input and Output 2:_

S: abcdefghij

n: 3

A: 2 5 9

o/p: baedcighfj

