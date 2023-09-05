import java.util.Scanner; 
class CountCharacter    
 {    
    public static void main(String[] args) 
    {   
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER THE STRING:"); 
        String string =s.next();   
        int count = 0;    
            
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ')    
                count++;    
        }    
            
        System.out.println("Total number of characters in a string: " + count);    
    }    
} 