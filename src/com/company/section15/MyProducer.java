package com.company.section15;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class MyProducer {
    public static void main() {
        ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<String>(5);
        ReentrantLock bufferLock = new ReentrantLock();

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        MyRunnableProducer myRunnableProducer = new MyRunnableProducer(buffer, ThreadColor.ANSI_YELLOW);
        MyRunnableConsumer myRunnableConsumer = new MyRunnableConsumer(buffer, ThreadColor.ANSI_PURPLE);
        MyRunnableConsumer myRunnableConsumer2 = new MyRunnableConsumer(buffer, ThreadColor.ANSI_CYAN);


        executorService.execute(myRunnableProducer);
        executorService.execute(myRunnableConsumer);
        executorService.execute(myRunnableConsumer2);

        Future<String> future = executorService.submit(() -> {
            System.out.println(ThreadColor.ANSI_WHITE + "I'm being printed for the callable class");
            return "callable result";
        });

        try {
            System.out.println(future.get());
        } catch (ExecutionException | InterruptedException e) {
            System.out.println("error");
        }

        executorService.shutdown();
    }
}

class MyRunnableProducer implements Runnable {
    private ArrayBlockingQueue<String> buffer;
    private String color;

    public MyRunnableProducer(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }


    @Override
    public void run() {
        Random random = new Random();
        String[] numbs = {"1", "2", "3", "4", "5"};
        for(String num : numbs) {
            try {
                System.out.println(color + "Adding..." + num);
                buffer.put(num);

                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                System.out.println("Producer was interrupted");
            }
        }

        System.out.println(color + "Adding EOF and exiting...");
        try {
            buffer.put("EOF");
        } catch (InterruptedException e) {

        }

    }
}

class MyRunnableConsumer implements Runnable {
    private ArrayBlockingQueue<String> buffer;
    private String color;

    public MyRunnableConsumer(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }


    @Override
    public void run() {
        while(true) {
            synchronized (buffer) {
                try {
                    if(buffer.isEmpty()) {
                        continue;
                    }
                    if(buffer.peek().equals("EOF")) {
                        System.out.println(color + "Exiting...");
                        break;
                    } else {
                        System.out.println(color + "Removed" + buffer.take());
                    }
                } catch (InterruptedException e) {

                }
            }

        }
    }
}