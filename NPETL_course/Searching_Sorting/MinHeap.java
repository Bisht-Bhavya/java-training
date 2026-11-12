public class MinHeap<T extends Comparable<T>> {
    private T[] Heap;
    private int size;
    private int maxsize;
    private static final int FRONT = 0; // Standardized to index 0

    public MinHeap(T[] arr) {
        this.maxsize = arr.length; // Uses the complete length of the array
        this.size = 0;
        this.Heap = arr;
    }

    // 0-based indexing math conversions
    private int parent(int pos) {
        return (pos - 1) / 2;
    }

    private int leftChild(int pos) {
        return (2 * pos) + 1;
    }

    private int rightChild(int pos) {
        return (2 * pos) + 2;
    }

    private boolean isLeaf(int pos) {
        // If the left child index is out of bounds, it's a leaf node
        return leftChild(pos) >= size;
    }

    private void swap(int lpos, int rpos) {
        T temp = Heap[lpos];
        Heap[lpos] = Heap[rpos];
        Heap[rpos] = temp;
    }

    public void print() {
        // Loops strictly through internal parent nodes
        for (int i = 0; i < size / 2; i++) {
            System.out.print("PARENT : " + Heap[i]);
            if (leftChild(i) < size) System.out.print(" LEFT CHILD : " + Heap[leftChild(i)]);
            if (rightChild(i) < size) System.out.print(" RIGHT CHILD : " + Heap[rightChild(i)]);
            System.out.println();
        }
    }

    // Transforms an arbitrary array configuration into a Min Heap
    public void minHeap() {
        for (int pos = (size / 2) - 1; pos >= 0; pos--) {
            minHeapify(pos);
        }
    }

    private void minHeapify(int pos) {
        if (!isLeaf(pos)) {
            int left = leftChild(pos);
            int right = rightChild(pos);
            int smallest = pos;

            // Compare with left child
            if (left < size && Heap[left].compareTo(Heap[smallest]) < 0) {
                smallest = left;
            }

            // Compare with right child
            if (right < size && Heap[right].compareTo(Heap[smallest]) < 0) {
                smallest = right;
            }

            // If a child is smaller, swap down and recurse
            if (smallest != pos) {
                swap(pos, smallest);
                minHeapify(smallest);
            }
        }
    }

    public void insert(T element) {
        if (size >= maxsize) {
            System.out.println("Heap is full! Cannot insert: " + element);
            return;
        }
        Heap[size] = element;
        int current = size;
        size++; // Increment tracking index

        // Bubble up structural fix: stop at the root node (current > 0)
        while (current > FRONT && Heap[current].compareTo(Heap[parent(current)]) < 0) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public T remove() {
        if (size == 0) return null;

        T popped = Heap[FRONT];
        Heap[FRONT] = Heap[size - 1]; // Move the last added element to root
        size--;

        minHeapify(FRONT); // Rebalance structural property from the root
        return popped;
    }

    public static void main(String[] args) {
        System.out.println("The Min Heap is : ");
        // Space matches the exact payload capacity (9 elements)
        Integer[] a = new Integer[9];
        MinHeap<Integer> minHeap = new MinHeap<>(a);

        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(17);
        minHeap.insert(10);
        minHeap.insert(84);
        minHeap.insert(19);
        minHeap.insert(6);
        minHeap.insert(22);
        minHeap.insert(9);

        minHeap.print();

        System.out.println("\nRemoving elements in sorted order:");
        while (minHeap.size > 0) {
            System.out.print(minHeap.remove() + " ");
        }
        System.out.println();
    }
}
