package com.yml.binarysearchtree;

public class Node<K> implements INode<K> {
	private K key;
	private INode<K> next;
	
	public Node(K key) {
		
	}
	@Override
	public K getKey() {
		return this.key;
	}

	@Override
	public void setKey(K key) {
		this.key = key;
		
	}

	@Override
	public INode<K> getNext() {
		return next;
	}

	@Override
	public void setNext(INode<K> next) {
		this.next = next;
		
	}
	@Override
	public String toString() {
		StringBuilder builder =new StringBuilder();
		builder.append("MyNode}"+"Key=").append(key).append("}");
		if(next != null)
			builder.append("->").append(next);
		return builder.toString();
	}
	
}	
