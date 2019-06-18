package pe.etg.bbva.evalua.java8.view.quiz2;

class CM0201SampleDemo implements Runnable{
    private Thread t;
    private String threadName;
    
    CM0201SampleDemo(String threadName){
        this.threadName = threadName;
    }

    @Override
    public  void run() {
        while(true)
            System.out.println(threadName);
    }
    
    public void start(){
        if (t==null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

public class CV0201EvaluarThread {

    public static void main(String[] args) {
        CM0201SampleDemo A = new CM0201SampleDemo("A");
        CM0201SampleDemo B = new CM0201SampleDemo("B");
        
        System.out.println(A);
        System.out.println(B);
        B.start();
        A.start();
    }
    
}
