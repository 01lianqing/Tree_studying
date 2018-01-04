package com.easy.me;

import java.util.Vector;

public class Tree {

	private Integer num;
	private String value=null;
	private Integer father;
	private Vector<Integer> son;
	public Tree() {
		// TODO Auto-generated constructor stub
		
	}
	public Tree(Integer n,String v,Integer f) {
		num=n;
		value=v;
		father=f;
	}
	
}
