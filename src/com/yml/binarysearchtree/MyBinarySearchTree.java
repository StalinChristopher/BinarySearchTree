package com.yml.binarysearchtree;

public class MyBinarySearchTree<K extends Comparable<K>> {
    private MyBinaryNode<K> root;


    public void add(K key){
        this.root = this.addRecursively(root, key);
    }


    private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
        if(current == null){
            return new MyBinaryNode<>(key);
        }
        int compareResult = key.compareTo(current.key);
        if( compareResult == 0) return current;
        if( compareResult < 0 ){
            current.left = addRecursively(current.left, key);
        }
        else{
            current.right = addRecursively(current.right, key);
        }  
        return current;
    }

    public void printBinarySearchTree(){
        this.printBinaryNode(root);
    }

    public void printBinaryNode(MyBinaryNode<K> temp){
        if(temp == null)
            return;
        printBinaryNode(temp.left);
        System.out.println(temp.getKey()+" ");
        printBinaryNode(temp.right);
    }

    public int getSize() {
		return this.getSizeRecursive(root);
	}

	private int getSizeRecursive(MyBinaryNode<K> curr) {
		return curr == null ? 0 : 1+getSizeRecursive(curr.left)+getSizeRecursive(curr.right);
	}
    
}
