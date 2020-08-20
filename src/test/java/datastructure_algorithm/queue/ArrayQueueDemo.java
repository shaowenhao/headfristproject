package datastructure_algorithm.queue;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

/**
 * Description:数组实现队列
 * 数组不能复用 有待改进
 * date: 2020 2020/7/22 15:49
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class ArrayQueueDemo {
    @Test
    void testArrayQueue(){
        ArrayQueue queue = new ArrayQueue(2);
        queue.addQueue(1);
        queue.addQueue(2);
        queue.showQueue();
//        queue.addQueue(3);
//        queue.getQueue();
//        queue.addQueue(3);
//        System.out.println(queue.isEmpty());
//        System.out.println(queue.headQueue());
    }

}

//使用数组模拟队列 编写一个ArrayQueue

class ArrayQueue{
    private int maxSize;  //数组最大容量
    int front; //队列头
    int end; //队列尾
    int[] arr;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = -1;  //指向队列头的前一个位置
        end = -1;   // 指向队列尾的数据即最后一个数据
    }

    public boolean isFull(){
        return end == maxSize - 1;
    }

    public boolean isEmpty(){
        return front == end;
    }

    public void addQueue(int n){
        if (isFull()){
            System.out.println("Queue is full can not add");
            return;
        }
        end++; //指针后移
        arr[end] = n;
    }

    public int getQueue(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty can not get");
        }
        front++;
        return arr[front];
    }

    public void showQueue(){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }
    }
    //显示头数据
    public int headQueue(){
        if (isEmpty()){
            throw new RuntimeException("Queue is empty can not get");
        }
        return arr[front+1];
    }
}

