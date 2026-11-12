public class TreeNode<T extends Comparable<T>> {
     T element;
     TreeNode<T> left;
     TreeNode<T> right;

    public TreeNode(T o) {
        this.element = o;
        this.left = null;
        this.right = null;
    }

    public TreeNode(){
        this.element = null;
        this.left = null;
        this.right = null;
    }

    static void inorder(TreeNode root){
        if(root != null){
            inorder(root.left);
            System.out.println(root.element);
            inorder(root.right);
        }
    }

    static void preorder(TreeNode root){
    if(root != null){
        System.out.println(root.element);
        preorder(root.left);
        preorder(root.right);
    }
    }

    static void postorder(TreeNode root){
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.element);
        }
    }

    public void insert(T o){
        if(this.element.compareTo(o) < 0 ){
            if(right == null){
                right = new TreeNode<>(o);
            }else{
                right.insert(o);
            }
        }else if(this.element.compareTo(o) > 0){
            if(left == null){
                left = new TreeNode<>(o);
            }else{
                left.insert(o);
            }
        }
    }

    TreeNode delete(TreeNode root, T key){
    if(root == null)return root;

    if(root.element.compareTo(key) < 0){
        root.left = delete(root.left, key);
    }else if(root.element.compareTo(key) < 0){
        root.right = delete(root.right, key);
    } else {
        if (root.left == null) {
            return root.left;
        } else if (root.right == null) {
            return root.right;
        }
        root.element = inSucc(root.right);
        root.right = delete(root.right, this.element);
    }
    return root;
    }

    T inSucc(TreeNode root){
        T minv = this.element;
        while(root.left != null){
            minv = this.left.element;
            root = root.left;
        }
        return minv;
    }

    TreeNode search( T key){
        if(this == null) return null;

        if(this.element.compareTo(key) == 0){
            return this;
        } else {
            if(this.element.compareTo(key) > 0){
                if(this.left == null) return null;
                return this.left.search(key);
            }else{
                if(this.right == null) return null;
                return this.right.search(key);
            }
        }
    }
    void search_result(T key){
        if(search(key)== null ){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("FOUND");
        }
    }
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<Integer>(1);
        root.insert(5);
        root.insert(7);
        root.insert(4);
        inorder(root);
        System.out.println();
        preorder (root);
        System.out.println();
        postorder (root);
        System.out.println();
        root.delete(root ,5);
        inorder (root);
        System.out.println();

        root.search_result(7);
        root.search_result(12);
        root.search_result(-112);
    }
}
