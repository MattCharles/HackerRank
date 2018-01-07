/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    boolean checkBST(Node root) {
        return boundedCheck(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean boundedCheck(Node node, int min, int max){
        if(node==null){
            return true;
        } else if(node.data >= max || node.data <= min){
            return false;
        } else {
            return boundedCheck(node.right, node.data, max) &&
                boundedCheck(node.left, min, node.data);
        }
    }

