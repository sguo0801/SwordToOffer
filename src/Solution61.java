/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution61 {
    int index = -1;  //主要是为了后面反序列化.

    String Serialize(TreeNode root) {
        StringBuffer sb = new StringBuffer();
        if (root == null) {
            sb.append("#,");
            return sb.toString();
        }
        sb.append(root.val + ",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }

    TreeNode Deserialize(String str) {
        index++;  //全局变量,所以一直在变!
        String[] strr = str.split(",");  //以","来划分成各个对应节点的小字符串.
        TreeNode node = null;
        if (!strr[index].equals("#")) {
            node = new TreeNode(Integer.valueOf(strr[index]));
            node.left = Deserialize(str);//都在if中,如果不存在节点,没有必要找子节点
            node.right = Deserialize(str);
        }//同一个str.
        return node;
    }
}