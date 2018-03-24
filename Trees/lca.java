
 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node lca(Node root,int v1,int v2){
    HashSet<Node> seen = new HashSet<Node>();
    storeParents(root, v1, seen, false, null);
    return storeParents(root, v2, seen, true, null);
}

//
static Node storeParents(Node node, int needle, HashSet<Node> seen, boolean following, Node previous){
    if(node.data == needle){
        seen.add(node);
        return previous;
    } else if(node.data > needle){
        if(seen.add(node) && following){
            return previous;
        }
        return storeParents(node.left, needle, seen, following, node);
    } else {
        if(seen.add(node) && following){
            return previous;
        }
        return storeParents(node.right, needle, seen, following, node);
    }
}



