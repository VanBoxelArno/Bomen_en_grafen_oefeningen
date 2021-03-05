package domain;

import java.util.ArrayList;

public class BinaryTree<E>{
	E data;
	BinaryTree<E> leftTree, rightTree;
	
	public BinaryTree(E data){
		this(data,null,null);
	}
	
	public BinaryTree(E data, BinaryTree<E> leftTree, BinaryTree<E> rightTree){
		if (data == null) {
			throw new IllegalArgumentException();
		}
		this.data= data;
		this.leftTree= leftTree;
		this.rightTree= rightTree;
	}
	
	public void printPreorder(){
			System.out.print(this.data + " ");
			if (this.leftTree != null) this.leftTree.printPreorder();
			if (this.rightTree != null) this.rightTree.printPreorder();
	}
	public void printInorder(){
		if (this.leftTree != null) {
			this.leftTree.printInorder();
		}
		System.out.print(this.data + " ");
		if (this.rightTree != null) {
			this.rightTree.printInorder();
		}
	}
	public void printPostorder(){
		if (this.leftTree != null) {
			this.leftTree.printPostorder();
		}
		if (this.rightTree != null) {
			this.rightTree.printPostorder();
		}
		System.out.print(this.data + " ");
	}
	public int countNodes() {
		return 1 + (this.leftTree == null ? 0 : this.leftTree.countNodes())
				+ (this.rightTree == null ? 0 : this.rightTree.countNodes());
	}

	public int getDepth() {
		return 1 + Math.max((this.leftTree == null ? 0 : this.leftTree.getDepth()),
				(this.rightTree == null ? 0 : this.rightTree.getDepth()));
	}

	public boolean isLeaf() {
		return this.leftTree == null && this.rightTree == null;
	}

	public int countLeaves() {
		if (this.isLeaf()) {
			return 1;
		} else {
			return (this.leftTree == null ? 0 : this.leftTree.countLeaves())
					+ (this.rightTree == null ? 0 : this.rightTree.countLeaves());
		}
	}
	public ArrayList<E> getDataLeaves() {
		ArrayList<E> res = new ArrayList<>();
		if (this.isLeaf()) {
			res.add(this.data);
		} else {
			res = (this.leftTree == null ? new ArrayList<>() : this.leftTree.getDataLeaves());
			ArrayList<E> rightLeaves =
					(this.rightTree == null ? new ArrayList<>() : this.rightTree.getDataLeaves());
			res.addAll(rightLeaves);
		}
		return res;
	}

	public boolean contains(E s) {
		if (s == null) {
			return false;
		}
		if (s.equals(this.data)) {
			return true;
		} else {
			return (this.leftTree == null ? false : this.leftTree.contains(s)) ||
					(this.rightTree == null ? false : this.rightTree.contains(s));
		}
	}

	public boolean addNode(E data) {
		return true;
	}

	public boolean lookup(E data) {
		return true;
	}

	protected E searchGreatest() {
		E
	}


/*	protected E searchGreatest() {
		E blank = new E[];
		return blank;
	}
	protected boolean removeNode(E grootsteLinks) {
		return true;
	}*/


	/*public boolean addNode(E data) {
		if (data == null) {
			throw new IllegalArgumentException();
		}
		if (this.data.compareTo(data) == 0) {
			return false; //geen twee keer zelfde data in BST
		} else if (this.data.compareTo(data) > 0) {//ga naar linkersubboom
			if (this.leftTree == null) {
				this.leftTree = new BinaryTree<>(data);
				return true;
			} else return (this.leftTree.addNode(data));
		} else if (this.rightTree == null) {
			this.rightTree = new BinaryTree<>(data);
			return true;
		} else return (this.rightTree.addNode(data));
	}*/

}
