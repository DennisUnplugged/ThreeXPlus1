# ThreeXPlus1
A program that checks for the 3x + 1 mathematical algorithm.

3x + 1 is an unsolved mathematical problem. It basically means that you choose a number and then if it's odd you multiply it by 3 and add 1 otherwise you devise it by 2. The point of this program is to do the necessary calculations for you so you don't waste your time checking each number by hand.

The point of this problem is that we don't know if all numbers till infinity end up at the same path. So far numbers up to 2^96 have been checked and they all end up at the 4, 2, 1 loop. This loop never ends for the obvious reason that 1 is odd so multiplied by 3 + 1 gives us 4 and then it keeps going. Some mathematicians claim that we don't know and understand enough about math to solve this problem (at least for now) which is most certenly true considering that we as hummans can't fully understand infinity. Some people still work on this though they are still waisting their time and trying to solve a probelm that never ends. A good aproach to think of this problem is as a tree of numbers on top there are the greatest numbers we've checked so far and at then end there's the 4 2 1 loop.

This program can check up to the maximum ammount of java's float datatype so it's not the best solution for insanly large numbers but in most cases it's enough.
