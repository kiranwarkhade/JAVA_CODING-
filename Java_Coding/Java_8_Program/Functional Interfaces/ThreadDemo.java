public class ThreadDemo {
    public static void main(String[] args) {
        
        Runnable thread=()-> 
        {
         for(int i=1;i<=10;i++)
         {
             System.out.println("Value of i is: "+i);
             try {
                Thread.sleep(1000);
                Thread.onSpinWait();
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
         }
        }; Thread t=new Thread(thread);
           t.setName("Kiran");
           t.start();


           Runnable t2=()->
           {
           try
           {
           for(int i=1;i<=10;i++)
           {
               System.out.println(i*2);
            Thread.sleep(2000);   
           }
           }catch(InterruptedException e)
           {
              e.printStackTrace();
           }
           };
           Thread t3=new Thread(t2);
           t3.start();
    }
}
