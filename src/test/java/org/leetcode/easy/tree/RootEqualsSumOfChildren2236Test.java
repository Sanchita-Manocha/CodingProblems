package org.leetcode.easy.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RootEqualsSumOfChildren2236Test {

    @Test
    public void testcase1(){
        RootEqualsSumOfChildren2236 sut =new RootEqualsSumOfChildren2236();
        RootEqualsSumOfChildren2236.TreeNode treeNodeLeft = new RootEqualsSumOfChildren2236.TreeNode(4);
        RootEqualsSumOfChildren2236.TreeNode treeNodeRight = new RootEqualsSumOfChildren2236.TreeNode(6);
        RootEqualsSumOfChildren2236.TreeNode root = new RootEqualsSumOfChildren2236.TreeNode(10,treeNodeLeft,treeNodeRight);

        assertTrue(sut.checkTree(root));
    }
    @Test
    public void testcase2(){
        RootEqualsSumOfChildren2236 sut =new RootEqualsSumOfChildren2236();
        RootEqualsSumOfChildren2236.TreeNode treeNodeLeft = new RootEqualsSumOfChildren2236.TreeNode(3);
        RootEqualsSumOfChildren2236.TreeNode treeNodeRight = new RootEqualsSumOfChildren2236.TreeNode(1);
        RootEqualsSumOfChildren2236.TreeNode root = new RootEqualsSumOfChildren2236.TreeNode(5,treeNodeLeft,treeNodeRight);

        assertFalse(sut.checkTree(root));
    }

}