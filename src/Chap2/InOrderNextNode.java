package Chap2;
/**
 * ����һ�������������е�һ����㣬���ҳ��������˳�����һ����㲢�ҷ��ء�
 * ע�⣬���еĽ�㲻�����������ӽ�㣬ͬʱ����ָ�򸸽���ָ�롣
 */

/**
 * ���������LDR���Ƕ�����������һ�֣�Ҳ�����и��������������Ρ��ڶ������У�����������ȱ�����������Ȼ����ʸ���㣬��������������
 * ��һ�֣����Һ��ӣ��ҵ��Һ��ӣ�ѭ�������Һ��ӵ���ڵ�
 * �ڶ��֣�û���Һ��ӣ������Ǹ������ӣ����ظ��׽ڵ�
 * �����֣��Ǹ��׽ڵ���Һ��ӣ�����û���Һ��ӣ��򷵻ظ��׽ڵ�ĸ��ڵ�
 * @author wwq
 *
 */
public class InOrderNextNode {

    private class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        // nextָ�򸸽�㣬��Ŀ�и�����
        TreeLinkNode next = null;
        TreeLinkNode(int val) {
            this.val = val;
        }
    }

    public TreeLinkNode GetNext(TreeLinkNode pNode) {
    	//��һ�������
        // �����ǰ������������գ���ô������һ��������������������ӽ�㣨����еĻ��������������û�����ӽ��ͷ��������������
        if (pNode.right != null) {
            pNode = pNode.right;
            while (pNode.left != null) {
                pNode = pNode.left;
            }
            return pNode;
        }
        //���������
        // �����ǰ�ӽ��pNode������Ϊ��
        // �����ϲ�ĸ���㣬������������ӽ����ǵ�ǰ��㣬�������ص��ϲ�ĸ����...ֱ�����������ӽ����ڵ�ǰ���
        while (pNode.next != null && pNode.next.right == pNode) {
            pNode =  pNode.next;
        }
        //�ڶ���
        // ������������ӽ����ڵ�ǰ��㣬˵����һ��Ҫ�����Ľ����Ǹ�����ˣ����߸����Ϊ�գ�˵����ǰ�����root�������Ƿ��ظ���㣨null��
        // pNode.next == null ���� pNode.next.left == pNode
        return pNode.next;
    }
}
