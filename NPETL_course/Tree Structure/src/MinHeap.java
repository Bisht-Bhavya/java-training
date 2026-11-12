//This Code Uses 1-based indexing so that is why Heap[0] is left null intentionally
public class MinHeap<T extends Comparable<T>> {

    private T[] Heap;
    private int size;
    private int maxsize;

    private static final int FRONT = 1;

    public MinHeap(T[] arr, T node) {
        this.maxsize = arr.length - 1;
        this.size = 1;
        this.Heap = arr;

        Heap[FRONT] = node;
    }

    private int parent(int pos) {
        return pos / 2;
    }

    private int leftChild(int pos) {
        return 2 * pos;
    }

    private int rightChild(int pos) {
        return 2 * pos + 1;
    }

    private void swap(int fpos, int spos) {
        T temp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = temp;
    }

    public void print() {
        for (int i = 1; i <= size / 2; i++) {

            System.out.print("Parent: " + Heap[i]);

            if (leftChild(i) <= size) {
                System.out.print(
                        " Left Child: " + Heap[leftChild(i)]
                );
            }

            if (rightChild(i) <= size) {
                System.out.print(
                        " Right Child: " + Heap[rightChild(i)]
                );
            }

            System.out.println();
        }
    }

    private void minHeapify(int pos) {

        int left = leftChild(pos);
        int right = rightChild(pos);

        // No children
        if (left > size) {
            return;
        }

        // Assume left child is smaller
        int smallest = left;

        // Check if right child exists and is smaller
        if (right <= size &&
                Heap[right].compareTo(Heap[left]) < 0) {

            smallest = right;
        }

        // If parent is greater than smallest child, swap
        if (Heap[pos].compareTo(Heap[smallest]) > 0) {
            swap(pos, smallest);
            minHeapify(smallest);
        }
    }

    public void insert(T element) {

        if (size >= maxsize) {
            return;
        }

        Heap[++size] = element;

        int current = size;

        while (current > FRONT &&
                Heap[current].compareTo(Heap[parent(current)]) < 0) {

            swap(current, parent(current));
            current = parent(current);
        }
    }

    public T remove() {

        if (size == 0) {
            return null;
        }

        T popped = Heap[FRONT];

        Heap[FRONT] = Heap[size];
        Heap[size] = null;
        size--;

        if (size > 0) {
            minHeapify(FRONT);
        }

        return popped;
    }

    public void minHeap() {

        for (int pos = size / 2; pos >= FRONT; pos--) {
            minHeapify(pos);
        }
    }

    public static void main(String[] args) {

        System.out.println("The Min Heap is ");

        // Index 0 is unused, so allocate one extra position
        Integer[] a = new Integer[16];

        MinHeap<Integer> minheap = new MinHeap<>(a, 5);

        minheap.insert(3);
        minheap.insert(16);
        minheap.insert(10);
        minheap.insert(84);
        minheap.insert(19);
        minheap.insert(6);
        minheap.insert(22);
        minheap.insert(9);
        minheap.insert(32);

        minheap.minHeap();

        minheap.print();

        System.out.println("The min val is: " + minheap.remove());
    }
}