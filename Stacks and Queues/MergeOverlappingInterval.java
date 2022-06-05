
import java.util.*;

import jdk.internal.util.xml.impl.Pair;

import java.io.*;

public class MergeOverlappingIntervals {
	public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverlappingIntervals(arr);
    }

    public static void mergeOverlappingIntervals(int[][] arr) {
        // merge overlapping intervals and print in increasing order of start time
    	Pair[] pairs = new Pair[arr.length];  //objects array
    	for(int i = 0; i < arr.length; i++) {
    		pairs[i] = new Pair(arr[i][0], arr[i][1]);
    	}
    	
    	Arrays.sort(pairs);
    	Stack<Pair> st = new Stack<>();
    	for(int i = 0; i < pairs.length; i++) {
    		if(i == 0) {
    			st.push(pairs[i]);
    		} else {
    			Pair top = st.peek();
    			
    			if(pairs[i].startTime > top.endTime) {
    				st.push(pairs[i]);
    			} else {
    				top.endTime = Math.max(top.endTime,  pairs[i].endTime);
    				
    			}
    		}
    	}
    	
    	Stack<Pair> resultStack = new Stack<>();
    	while(st.size() > 0) {
    		resultStack.push(st.pop());
    	}
    	
    	while(resultStack.size() > 0) {
    			Pair p = resultStack.pop();
    			System.out.println(p.startTime + " " + p.endTime);
    	}
    }
    
    public static class Pair implements Comparable<Pair> {
    	int startTime;
    	int endTime;
    	
    	//constructor
    	Pair(int startTime, int endTime) {
    		this.startTime = startTime;
    		this.endTime = endTime;
    	}
    	
    	//this > other return +ve
    	//this  = other return 0
    	//this < other return -ve
    	public int compareTo(Pair other) {
    		if(this.startTime != other.startTime) {
    			return this.startTime - other.startTime;
    		} else {
    			return this.endTime - other.endTime;
    		}
    	}
    }
}
