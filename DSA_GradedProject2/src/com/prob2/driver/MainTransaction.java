package com.prob2.driver;

import com.prob2.service.BSTToRST;
import com.prob2.service.Node;

public class MainTransaction {
	public static void main(String[] args) {
		BSTToRST tree = new BSTToRST();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		tree.bSTToRST(tree.node);
		tree.printRST(tree.headNode);
	}
}
