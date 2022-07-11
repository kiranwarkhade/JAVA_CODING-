public class Amount {

    static void withdraw(int amount) throws InsufficientAmountException
    {
      if(amount >20000)
      {
          throw new InsufficientAmountException("You dont have sufficent Amount to withdraw");
      }
      else
      {
            System.out.println("Please Withdraw money");
      }
    }
    public static void main(String[] args) {
        
        try
        {
            withdraw(3000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }System.out.println("Thanks for visiting");
    }
}
