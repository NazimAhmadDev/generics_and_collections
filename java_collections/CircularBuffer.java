package week4_assignment2;

import java.util.*;

class CircularBuffer {
    private int[] buffer;
    private int size, front, rear, count;

    public CircularBuffer(int size) {
        this.size = size;
        this.buffer = new int[size];
        this.front = 0;
        this.rear = 0;
        this.count = 0;
    }

    public void insert(int value) {
        buffer[rear] = value;
        rear = (rear + 1) % size;
        if (count < size) {
            count++;
        } else {
            front = (front + 1) % size; // Overwrite oldest element
        }
    }

    public List<Integer> getBuffer() {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(buffer[(front + i) % size]);
        }
        return result;
    }

    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        buffer.insert(4);
        System.out.println("Buffer: " + buffer.getBuffer()); // Output: [2, 3, 4]
    }
}
