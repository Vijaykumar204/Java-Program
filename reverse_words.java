class reverse_words {
        public static void main(String v[]){
            // String s="The sky is blue";
            String s="hello world the   err";
            String s1="";
            int b=0,end=s.length();
            // System.out.println(end);
            for(int i=s.length()-1;i>=0;i--){
                if(s.charAt(i)!=' '){
                    b++;
                    // System.out.println(b);
                }
                else{
                    if(s.charAt(i)!=s.charAt(i-1)){
                    int start=end-b;
                    start=start-1;
                    // System.out.println("Starting value"+start);
                    for(int j=start;j<end;j++){
                        if(s.charAt(j)!=' '){
                        s1+=s.charAt(j);
                        //  System.out.println(s1);
                        }
                    }
                    end=start;
                    
                    s1 += ' '; 
                     
                    
                     b = 1;
                    //  i--;
                
                }}
            }
            for(int i=0;i<b;i++){
                 s1+=s.charAt(i);
            }
             System.out.println(s1.trim());
        }
    }



