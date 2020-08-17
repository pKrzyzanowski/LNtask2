## Usage
Put sequence of numbers followed by a letter and press enter.

## How it works

Because we want to compare numbers, it's easier and faster to have them sorted. Since first number of a pair should not be grater, a list is split on two parts, where point of division is desired number divided by 2. Then program iterate for every position from the first part and checks if second part contains its equivalent (x + (desiredNumber - x) = desiredNumber).