package com.exercise4;

import java.util.ArrayList;
import java.util.List;

public class Exercise4 {
	//fibonacci sequence
	public static void main(String args[]) {
		int count = 100;
		int first=0,second=1,next;
		for(int x=0; x<count; x++)
		{
			if(x<=1) {
				next = x;
			}
			else {
				next = first + second;
				first = second;
				second = next;
			}
			System.out.println(next);
		}
	}
}