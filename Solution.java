public class Solution(){
  
  public sataic void main(String[] args){
}
  /*  Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).

factorial(1) → 1
factorial(2) → 2
factorial(3) → 6
*/
  public int factorial(int n) {
  if(n<1 || n==0)
  return 1;
  else 
  return n*factorial(n-1);
}
/**
We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

bunnyEars(0) → 0
bunnyEars(1) → 2
bunnyEars(2) → 4
**/
  public int bunnyEars(int bunnies) {
  if(bunnies ==0)
  return 0;
  else 
  return 2+ bunnyEars(bunnies-1);
}
/*The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition. The first two values in the sequence are 0 and 1 (essentially 2 base cases). Each subsequent value is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. Define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing the start of the sequence.

fibonacci(0) → 0
fibonacci(1) → 1
fibonacci(2) → 1
*/
  public int fibonacci(int n) {
  if(n==0)
  return 0;
  else if(n==1 || n==2)
  return 1;
  else return fibonacci(n-1) + fibonacci(n-2);
}

  /*
  We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

bunnyEars2(0) → 0
bunnyEars2(1) → 2
bunnyEars2(2) → 5
  */
  
  public int bunnyEars2(int bunnies) {
  if(bunnies == 0)
  return 0;
  else if(bunnies%2 ==0)
  return 3 + bunnyEars2(bunnies -1);
  else
   return 2 + bunnyEars2(bunnies-1);
}
  
  /*
  Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

sumDigits(126) → 9
sumDigits(49) → 13
sumDigits(12) → 3
  */
public int sumDigits(int n) {
 
  if(n<10)
  return n;
 int end = n/10;
 int last = n%10;
  
  return sumDigits(end) + last;
}

/*  Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

count7(717) → 2
count7(7) → 1
count7(123) → 0
*/
  public int count7(int n) {
  if(n==0)
  return 0;
  int last = n%10; //rightmost digit
  int end = n/10; // end digit
  if(last ==7)
  return count7(end) + 1;
  return count7(end) ;
}


  
}
