package com.yml.binarysearchtree;

public class MyBinarySearchTree<K extends Comparable<K>> {
    private MyBinaryNode<K> root;


    
    /** 
     * @param key
     * external method to add a element into the binary search tree
     */
    public void add(K key){
        this.root = this.addRecursively(root, key);
    }


    
    /** 
     * @param current
     * @param key
     * @return MyBinaryNode<K>
     * Internal method called inside add method to add the elements recursively in the binary search tree based on the value
     * of the element
     */
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

    /**
     * external method called in main class to print the entire binary search tree 
     */
    public void printBinarySearchTree(){
        this.printBinaryNode(root);
    }

    
    /** 
     * @param temp
     * Method to print the nodes of the binary tree called internally
     */
    public void printBinaryNode(MyBinaryNode<K> temp){
        if(temp == null)
            return;
        printBinaryNode(temp.left);
        System.out.println(temp.getKey()+" ");
        printBinaryNode(temp.right);
    }

    
    /** 
     * @return int
     * Method defined to get the size of the binary tree
     */
    public int getSize() {
		return this.getSizeRecursive(root);
	}

	
    /** 
     * @param curr
     * @return int
     * Internal method called recursively to traverse through the tree and calculate the size
     */
    private int getSizeRecursive(MyBinaryNode<K> curr) {
		return curr == null ? 0 : 1+getSizeRecursive(curr.left)+getSizeRecursive(curr.right);
	}

    
    /** 
     * @param key
     * This method is called in the main class. It checks if the given key/element is present in the binarySearchTree or not
     */
    public void search(K key){
        this.searchRecursive(key,root);
    }



    
    /** 
     * @param key
     * @param current
     * This method is called recursively until the element is found, it traverses left if key is smaller than parent,
     * and traverses right if it is greater than parent
     */
    private void searchRecursive(K key, MyBinaryNode<K> current) {
        if(current == null){
            System.out.println("Element is not present in the binary search tree");
            return;
        }
        int value = key.compareTo(current.getKey());
        if(value == 0){
            System.out.println("Element "+key+ " is found");
        }else if(value < 0){
            searchRecursive(key, current.left);
        }else{
            searchRecursive(key, current.right);
        }
    }
    
}
