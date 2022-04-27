# Oasis XY distance
This is a java based program to show the optimized order that X Y cordinates are from a starting point using distance.
The idea was a program to help optimize friends routes that are involved in delievery, pest control, or law care.

Input:
First line of input are 3 integers n, x, and y where 
n represents number of clients 1<=n<=100,0000; 
x and y represents the xand y coordinate of the start point |x|, |y| <=100,000

The following n lines will each containt 2 intergers and a string
the integers represent x and y coordinate of client <= 00,000
the string represents the name of the client 1<=name<=20

Output:
Contains n lines. In each line will be the name of the clients in order from first to last from starting point.

Sample Input/ Output
3 5 7
3 2 Jacob
5 9 David
10 4 Eric

David
Jacob
Eric
