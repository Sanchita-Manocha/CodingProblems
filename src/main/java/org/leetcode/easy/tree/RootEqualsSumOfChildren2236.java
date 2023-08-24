package org.leetcode.easy.tree;

public class RootEqualsSumOfChildren2236 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}

    git rm -f .gradle/8.2/executionHistory/executionHistory.bin
        git rm -f .gradle/8.2/executionHistory/executionHistory.lock
        git rm -f .gradle/8.2/fileHashes/fileHashes.bin
        git rm -f .gradle/8.2/fileHashes/fileHashes.lock
        git rm -f .gradle/8.2/fileHashes/resourceHashesCache.bin
        git rm -f .gradle/buildOutputCleanup/buildOutputCleanup.lock
        git rm -f build/reports/tests/test/classes/org.leetcode.tree.easy.RootEqualsSumOfChildren2236Test.html
        git rm -f build/reports/tests/test/packages/org.leetcode.tree.easy.html
        git rm -f build/test-results/test/TEST-org.leetcode.tree.easy.RootEqualsSumOfChildren2236Test.xml
        git rm -f build/tmp/compileTestJava/compileTransaction/stash-dir/RootEqualsSumOfChildren2236Test.class.uniqueId0
