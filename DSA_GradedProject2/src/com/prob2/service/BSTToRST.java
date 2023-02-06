package com.prob2.service;

public class BSTToRST {
	public Node node, prevNode, headNode;

	public void bSTToRST(Node root) {
		if (root == null)
			return;
		bSTToRST(root.left);
		if (headNode == null)
			headNode = root;
		else
			prevNode.right = root;
		root.left = null;
		prevNode = root;
		bSTToRST(root.right);
	}

	public void printRST(Node root) {
		Node ptr = root;
		while (ptr != null) {
			System.out.print(ptr.val + " ");
			ptr = ptr.right;
		}
	}
}
