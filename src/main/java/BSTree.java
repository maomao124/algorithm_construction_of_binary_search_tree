/**
 * Project name(项目名称)：算法_二叉搜索树的构建
 * Package(包名): PACKAGE_NAME
 * Class(类名): BSTree
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/17
 * Time(创建时间)： 19:51
 * Version(版本): 1.0
 * Description(描述)：
 * 构建一棵二叉搜索树，实际是构建一棵二叉树，但在添加结点时，需要满足二叉搜索树的性质。
 * 以输入序列5 3 7 2 4 8为例，构建一棵二叉搜索树。
 * (1)二叉搜索树为空，5为根结点；
 * (2)输入值3比根结点5小，且此时根结点的左结点为空，所以3添加为根结点的左结点；
 * (3)输入值7比根结点5大，添加为根结点的右结点；
 * (4)输入值2比根结点5小，应添加至根结点的左结点，但此时根结点的左结点是3，2与3比较，小于，所以添加为3的左结点；
 * (5)输入值4比根结点5小，应添加至根结点的左结点，但此时根结点的左结点是3，4与3比较，大于，所以添加为3的右结点；
 * (6)输入值8比根结点5大，应添加至根结点的右结点，但此时根结点的左结点是7，8与7比较，大于，所以添加为7的右结点。
 */

public class BSTree
{
    private TreeNode root;//根结点

    public BSTree()
    {
        root = null;
    }

    /**
     * 向树root中插入key
     *
     * @param key 要插入的值
     */
    public void insert(int key)
    {
        /********** Begin *********/
        TreeNode treeNode = root;
        TreeNode treeNode1 = null;//始终指向treeNode的父结点
        while (treeNode != null)          //遍历，直到没有子树
        {
            treeNode1 = treeNode;
            if (key < treeNode.item)       //传入的值小于父节点
            {
                treeNode = treeNode.leftChild;  //遍历左子树
            }
            else                   //大于父节点
            {
                treeNode = treeNode.rightChild;   //遍历右子树
            }
        }
        if (null == treeNode1)
        {//空树
            root = new TreeNode(key);      //空
        }
        else if (key < treeNode1.item)         //小
        {
            treeNode1.leftChild = new TreeNode(key);
        }
        else                                //大
        {
            treeNode1.rightChild = new TreeNode(key);
        }

        /********** End *********/
    }

    public void preOrder()
    {
        preOrder(root);
    }

    public void inOrder()
    {
        inOrder(root);
    }

    public void postOrder()
    {
        postOrder(root);
    }

    private void preOrder(TreeNode node)
    {
        if (node != null)
        {
            System.out.print(node.item + " ");
            preOrder(node.leftChild);
            preOrder(node.rightChild);
        }
    }

    private void inOrder(TreeNode node)
    {
        if (node != null)
        {
            inOrder(node.leftChild);
            System.out.print(node.item + " ");
            inOrder(node.rightChild);
        }
    }

    private void postOrder(TreeNode node)
    {
        if (node != null)
        {
            postOrder(node.leftChild);
            postOrder(node.rightChild);
            System.out.print(node.item + " ");
        }
    }

    //节点内部类，树
    public static class TreeNode
    {
        private TreeNode leftChild;
        private TreeNode rightChild;
        private int item;

        public TreeNode(int item)
        {
            this(null, null, item);
        }

        public TreeNode(TreeNode leftChild, TreeNode rightChild, int item)
        {
            this.leftChild = leftChild;
            this.rightChild = rightChild;
            this.item = item;
        }
    }
}
