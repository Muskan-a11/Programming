public class deep_clone {

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    class SolutionOptimized {

    public Node copyRandomList(Node head) {
        if (head == null) return null;

        // Step 1: Insert cloned nodes
        Node curr = head;
        while (curr != null) {
            Node clone = new Node(curr.val);
            clone.next = curr.next;
            curr.next = clone;
            curr = clone.next;
        }

        // Step 2: Set random pointers for cloned nodes
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        // Step 3: Separate original and cloned lists
        curr = head;
        Node dummy = new Node(0);
        Node copyCurr = dummy;

        while (curr != null) {
            Node clone = curr.next;
            copyCurr.next = clone;
            copyCurr = clone;

            curr.next = clone.next; // restore original list
            curr = curr.next;
        }

        return dummy.next;
    }
}

}
