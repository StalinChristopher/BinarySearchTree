package com.yml.binarysearchtree;

public class BinarySearchTreeMain {

	public static void main(String[] args) {
		System.out.println("Welcome to binary search tree program");
		MyBinarySearchTree<Integer> binarySearchTree = new MyBinarySearchTree<>();
		binarySearchTree.add(56);
		binarySearchTree.add(30);
		binarySearchTree.add(70);
		binarySearchTree.printBinarySearchTree();
	}

}
