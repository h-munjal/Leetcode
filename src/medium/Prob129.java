package medium;

public class Prob129 {

    private int sumNumbersHelper(TreeNode root, String sum) {
        //Base case
        if (root.left == null && root.right == null) {
            return Integer.valueOf(sum);
        }
        int sumLeft = 0;
        int sumRight = 0;
        if (root.left != null) {
            sumLeft = sumNumbersHelper(root.left, sum + root.left.val);
        }
        if (root.right != null) {
            sumRight = sumNumbersHelper(root.right, sum + root.right.val);
        }
        return sumLeft + sumRight;

    }
    public int sumNumbers(TreeNode root) {
        if (root == null){
            return 0;
        }
        return sumNumbersHelper(root,String.valueOf(root.val));
    }

    public static void main(String[] args) {

    }
}
