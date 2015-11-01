/*
There are N gas stations along a circular route, where the amount of gas at station i is gas[i].

You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station (i+1). You begin the journey with an empty tank at one of the gas stations.

Return the starting gas station's index if you can travel around the circuit once, otherwise return -1.

Note:
The solution is guaranteed to be unique.

==idea==
The reason why I think this works: 
1, if sum of gas is more than sum of cost, then there must be a solution. And the question guaranteed that the solution is unique(The first one I found is the right one). 
2, The tank should never be negative, so restart whenever there is a negative number.
*/

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0, tank = 0, totalGas = 0, totalCost = 0;
        
        for (int i = 0; i < gas.length; i++) {
            tank = tank + gas[i] - cost[i];
            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
            totalGas += gas[i];
            totalCost += cost[i];
        }
        
        return totalGas >= totalCost ? start : -1;
    }
}
