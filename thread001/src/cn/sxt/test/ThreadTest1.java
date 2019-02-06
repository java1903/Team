package cn.sxt.test;

public class ThreadTest1 {
    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();
        Thread td1 = new Thread(td,"窗口1");
        Thread td2 = new Thread(td,"窗口2");
        td1.start();
        td2.start();
    }
}

class ThreadDemo implements Runnable {

    private int count = 100;

    @Override
    public void run() {
        // TODO Auto-generated method stub
        try {
            Thread.sleep(50);
        } catch (Exception e) {
            // TODO: handle exception
        }
        while(count > 0) {
            sale();
        }

    }

    private synchronized void sale() {
        // TODO Auto-generated method stub
        if (count > 0) {
            System.out.println(Thread.currentThread().getName() + "售出：" + (100 - count + 1) + "张票");
            count--;
        }
    }

}