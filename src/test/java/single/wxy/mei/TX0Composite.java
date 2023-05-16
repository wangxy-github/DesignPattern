package single.wxy.mei;

import single.mei.typeX0_Composite.DirectoryNode;
import single.mei.typeX0_Composite.FileNode;

/**
 * @author wxy
 * @date: 2023/5/16 5:43 PM
 * @ClassName: TX0Composite
 */
public class TX0Composite {
    public static void main(String[] args) {
        DirectoryNode fileSystemTree = new DirectoryNode("/");
        DirectoryNode node_wxy = new DirectoryNode("/wxy/");
        DirectoryNode node_wz = new DirectoryNode("/wz/");
        fileSystemTree.addSubNode(node_wxy);
        fileSystemTree.addSubNode(node_wz);

        FileNode node_wxy_a = new FileNode("/wxy/a.txt");
        FileNode node_wxy_b = new FileNode("/wxt/b.txt");

        DirectoryNode node_wxy_pic = new DirectoryNode("/wxy/pic/");

        node_wxy.addSubNode(node_wxy_a);
        node_wxy.addSubNode(node_wxy_b);
        node_wxy.addSubNode(node_wxy_pic);

        FileNode node_wxy_pic_c = new FileNode("/wxy/pic/c.png");
        node_wxy_pic.addSubNode(node_wxy_pic_c);

        DirectoryNode node_wz_docs = new DirectoryNode("/wz/docs/");
        node_wz.addSubNode(node_wz_docs);

        FileNode node_wz_docs_d = new FileNode("/wz/docs/d.word");
        node_wz_docs.addSubNode(node_wz_docs_d);

        System.out.println("/ file nums : " + fileSystemTree.countNumOfFiles());
        System.out.println("/ file size : " + fileSystemTree.countSizeOfFiles());
    }
}
