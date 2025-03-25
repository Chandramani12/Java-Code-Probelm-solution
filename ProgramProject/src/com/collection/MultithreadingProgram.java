package com.collection;


class TaskEvenOdd{
	private int number=1;
	private final int maxNumber;
	
	public TaskEvenOdd(int maxNumber) {
		
		this.maxNumber=maxNumber;
	}
	
	public synchronized void printOdd() {
        while (number <= maxNumber) {
            if (number % 2 == 1) {
                System.out.println("Odd: " + number);
                number++;
                notify(); // Notify even thread to proceed
                try {
                    if (number <= maxNumber) {
                        wait(); // Wait for even thread to print
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    // Method to print even numbers
    public synchronized void printEven() {
        while (number <= maxNumber) {
            if (number % 2 == 0) {
                System.out.println("Even: " + number);
                number++;
                notify(); // Notify odd thread to proceed
                try {
                    if (number <= maxNumber) {
                        wait(); // Wait for odd thread to print
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
	


public class MultithreadingProgram{
	public static void main(String[] args) {
		int maxNumber=11;
		TaskEvenOdd obj=new TaskEvenOdd(maxNumber);
		Thread objthread=new Thread(()->obj.printOdd());
		Thread objthread1=new Thread(()->obj.printEven());
		objthread.start();
		objthread1.start();
	}
	
	
}
