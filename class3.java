
    public class CirculaQuene {
        private int[] queue;
        private int front;
        private int rear;
        private int size;
        private int capacity;

        public CircularQueue(int capacity) {
            this.capacity = capacity;
            this.queue = new int[capacity];
            this.front = 0;
            this.rear = -1;
            this.size = 0;
        }

        public void enqueue(int value) {
            if (isFull()) {
                System.out.println("Queue is full. Unable to enqueue.");
                return;
            }

            rear = (rear + 1) % capacity;
            queue[rear] = value;
            size++;
        }
        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Unable to dequeue.");
                return -1;
            }

            int dequeuedValue = queue[front];
            front = (front + 1) % capacity;
            size--;
            return dequeuedValue;
        }

        public int front() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }

            return queue[front];
        }

        public int rear() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }

            return queue[rear];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == capacity;
        }
    }
}
