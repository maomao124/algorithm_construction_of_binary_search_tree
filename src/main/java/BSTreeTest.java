import java.util.Scanner;

/**
 * Project name(项目名称)：算法_二叉搜索树的构建
 * Package(包名): PACKAGE_NAME
 * Class(类名): BSTreeTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/17
 * Time(创建时间)： 19:52
 * Version(版本): 1.0
 * Description(描述)：
 * 平台将创建用户补全后的BSTree类的对象；
 * 调用对象的insert(int key)方法，向树中添加结点；
 * 调用对象的preOrder()方法执行前序遍历；
 * 调用对象的inOrder()方法执行中序遍历；
 * 调用对象的postOrder()方法执行后序遍历；
 * 接着根据程序的输出判断程序是否正确。
 * 测试输入：
 * 3 2 1 0 21
 * 预期输出：
 * 前序遍历: 3 2 1 0 21
 * 中序遍历: 0 1 2 3 21
 * 后序遍历: 0 1 2 21 3
 */

public class BSTreeTest
{
    public static void main(String[] args)
    {
        BSTree tree = new BSTree();
        Scanner in = new Scanner(System.in);
        while (in.hasNext())
        {
            int item = in.nextInt();
            tree.insert(item);
        }

        System.out.print("前序遍历: ");
        tree.preOrder();
        System.out.println();
        System.out.print("中序遍历: ");
        tree.inOrder();
        System.out.println();
        System.out.print("后序遍历: ");
        tree.postOrder();

    }
}
