public class Test
{
    public static void main(String[] args) {
        
        MyInter my=new MyInterIml();
         
           my.sayHello(); 
        

           MyInter m1=new MyInter() {

            @Override
            public void sayHello() {
               System.out.println("Anonymous type");
                
            }
               
           };        m1.sayHello();

           MyInter m2=new MyInter() {
            public void sayHello() {
                      System.out.println("Second anonymous class");
            }
               
           };m2.toString();m2.sayHello();


         MyInter m3=()->
           System.out.println("Use lambda Expresstion");
           m3.sayHello();
         
        MyInter m4=()->
         System.out.println("This is second time im using lambda");
          m4.sayHello();
   
     
         
          sumInt s1=(a,b)->a+b;
          System.out.println(s1.sum(11, 22));

         StrLengthInt s2=str ->str.length();
        System.out.println("String length: "+s2.GetLength("Kiran Warkhade"));
        
        }
   
}