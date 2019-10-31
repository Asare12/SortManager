package com.sparta.da.Sorters;

import com.sparta.da.Binary.BinarySearchTree;

public class BinaryTreeSorter implements Sorter {

    @Override
    public int[] getSortingArray(int[] arrayToSort) {
        BinarySearchTree binarySearchTree = new BinarySearchTree(arrayToSort);
        return binarySearchTree.getSortedTreeAsc();
    }

    @Override
    public String toString(){
        return "Binary Tree Sorter";
    }
}
