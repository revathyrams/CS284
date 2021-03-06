import java.util.PriorityQueue;

class HuffmanNode {

    int data;
    char c;

    HuffmanNode left;
    HuffmanNode right;
}
public class HuffmanAlgo {

    // recursive function to print the
    // huffman-code through the tree traversal.
    // Here s is the huffman - code generated.
    public static void printCode(HuffmanNode root, String s)
    {

        // base case; if the left and right are null
        // then its a leaf node and we print
        // the code s generated by traversing the tree.
        if (root.left
                == null
                && root.right
                == null
                && Character.isLetter(root.c)) {

            // c is the character in the node
            System.out.println(root.c + ":" + s);

            return;
        }

        // if we go to left then add "0" to the code.
        // if we go to the right add"1" to the code.

        // recursive calls for left and
        // right sub-tree of the generated tree.
        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }

    // main function
    public static void main(String[] args)
    {
        // number of characters.
        //ABRACADBRA
        int n = 5;
        char[] charArray = { 'A', 'B', 'R', 'C', 'D'};
        int[] charfreq = { 5, 2, 2, 1, 1};



        PriorityQueue<HuffmanNode> q = new PriorityQueue<>((a, b) -> {return a.data - b.data;});

        for (int i = 0; i < n; i++) {
            HuffmanNode hn = new HuffmanNode();

                      hn.c = charArray[i];
            hn.data = charfreq[i];

            hn.left = null;
            hn.right = null;
            q.add(hn);
        }

        HuffmanNode root = null;
        while (q.size() > 1) {

            // first min extract.
            HuffmanNode x = q.peek();
            q.poll();

            // second min extarct.
            HuffmanNode y = q.peek();
            q.poll();

            // new node f which is equal
            HuffmanNode f = new HuffmanNode();
//C -> 1, D -> 1
            f.data = x.data + y.data; //2
            f.c = '-'; // -

            f.left = x; //C

            f.right = y;// D

            // marking the f node as the root node.
            root = f;

            // add this node to the priority-queue.
            q.add(f);
        }

        printCode(root, "");
    }
}
