package pe.etg.bbva.evalua.java8.view.quiz;

class CM0201SampleDemo implements Runnable{
    private Thread t;
    private final String threadName;
    
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

public class CV1301v01EvaluarThread {

    public static void main(String[] args) {
        CM0201SampleDemo A = new CM0201SampleDemo("A");
        CM0201SampleDemo B = new CM0201SampleDemo("B");
        
        System.out.println(A.toString());
        System.out.println(B.toString());
        
        B.start();
        A.start();
    }
}
