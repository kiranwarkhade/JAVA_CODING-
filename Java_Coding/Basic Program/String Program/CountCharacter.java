public class CountCharacter    
{    
    public static void main(String[] args) {    
        String string = "The best of the worlds";    
        int count = 0;    
            
        //Counts each character except spac    
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ')    
                count++;    
        }    
            
        
        System.out.println("Total number of characters in a string: " + count);    
    }    
}     