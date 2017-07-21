package lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by stan.zhang on 7/20/17.
 */
class AddTwoNumbersTest {
    public ListNode constructList(int[] nums){
        ListNode dummyNode = new ListNode(0);
        ListNode currNode = dummyNode;
        for (int i = 0; i < nums.length; i++) {
            ListNode nextNode = new ListNode(nums[i]);
            currNode.next = nextNode;
            currNode = nextNode;
        }
        return dummyNode.next;
    }

    public void printList(ListNode listnode){
        while (listnode != null){
            System.out.print(listnode.val + " -> ");
            listnode = listnode.next;
        }
    }

    @Test
    public void test (){
        int[] l1s = {2,4,3};
        int[] l2s = {5,6,7};
        ListNode l1 = constructList(l1s);
        ListNode l2 = constructList(l2s);
        AddTwoNumbers sol = new AddTwoNumbers();
        ListNode node = new ListNode(0);
        node = sol.addTwoNumbers(l1, l2);
        printList(node);
    }

}