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
            sb.append("#,");  //注意这边是#,
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
            node = new TreeNode(Integer.valueOf(strr[index]));  //不能直接改变值,要赋给新的节点
            node.left = Deserialize(str);//都在if中,如果不存在节点,没有必要找子节点
            node.right = Deserialize(str);  //这边是参数为str字符串,不是分割后的字符数组
        }//同一个str.
        return node;
    }
//原方法在code里超时,下面是code通过方法.
//    public String serialize(TreeNode root) {
//        return serial(new StringBuilder(), root).toString();
//    }
//    private StringBuilder serial(StringBuilder sb, TreeNode root){
//        if(root == null){
//            return sb.append("null");
//        }
//        sb.append(root.val).append(",");
//        serial(sb, root.left).append(",");  //直接递归不多BB.
//        serial(sb, root.right);  //右节点被上层的,写好啦.
//        return sb;   //序列化得到:1,2,null,null,3,4,5.没要求常规遍历,能回去就恶性
//    }
//
//    // Decodes your encoded data to tree.
//    public TreeNode deserialize(String data) {
//        return deserial(new LinkedList<>(Arrays.asList(data.split(","))));  //##注意别马虎!
//    }
//    private TreeNode deserial(LinkedList<String> list){  //不需要也没有根节点
//        String sb = list.poll();  //##先提出第一部分子串
//        if("null".equals(sb)){
//            return null;
//        }
//        //不为空就转换成节点
//        TreeNode root = new TreeNode(Integer.valueOf(sb));  //sb为数值
//        root.left = deserial(list);
//        root.right = deserial(list);
//        return root;
//    }
}