package com.example.modul32023;

import java.util.LinkedList;
import java.util.Queue;

public class Latihan2 {
    public void queaeExample(){
        Queue queue = new LinkedList();
        queue.add("java");
        queue.add("DotNet");
        queue.offer("PHP");
        queue.offer("HTML");
        System.out.println("Remove : " + queue.remove());
        System.out.println("Element : " + queue.element());
        System.out.println("Poll : " + queue.poll());
        System.out.println("Peek : " + queue.peek());
    }

    public static void main(String[] args) {
        new Latihan2().queaeExample();
    }
}
queue = []
queue.append('Java')
queue.append('Dotnet')
queue.append()