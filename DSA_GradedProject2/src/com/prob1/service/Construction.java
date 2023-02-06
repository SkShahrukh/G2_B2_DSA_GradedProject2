package com.prob1.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Construction {
	private int totalFloor;
	List<Integer> floors = new ArrayList<>();
	Set<Integer> constructed = new HashSet<>();
	Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
	Scanner sc = new Scanner(System.in);

	public void getData() {
		System.out.println("Enter the total number of floors in the building");
		totalFloor = sc.nextInt();
		for (int i = 0; i < totalFloor; i++) {
			System.out.println("Enter the floor size given on day : " + (i + 1));
			floors.add(sc.nextInt());
		}
		sc.close();
		for (int f : floors)
			maxHeap.add(f);
		System.out.println();
	}

	public void assembledFloor() {
		System.out.println("The order of construction is as follows\n");
		for (int i = 0; i < totalFloor; i++) {
			constructed.add(floors.get(i));
			System.out.println("Day: " + (i + 1));
			while (constructed.contains(maxHeap.peek())) {
				System.out.print(maxHeap.remove() + " ");
			}
			System.out.println();
		}
	}
}
