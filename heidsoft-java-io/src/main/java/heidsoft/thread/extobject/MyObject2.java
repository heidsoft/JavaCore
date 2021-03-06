package heidsoft.thread.extobject;

/**
 * 证明线程锁是对象
 */
public class MyObject2 {
    //1.调用关键字synchronized声明的方法一定是排队运行
    //2,只有共享的读写访问才需要同步化
    public synchronized void methodA(){
        try {
            System.out.println("begin methodA threadName=" +
                Thread.currentThread().getName());
            Thread.sleep(5000);

            System.out.println("end endTime=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void methodB(){
        try {
            System.out.println("begin methodB threadName=" +
                    Thread.currentThread().getName() + "begin time=" +
                    System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
