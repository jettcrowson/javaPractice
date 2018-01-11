class Best {
    public static void main(String[] args){

        int loop = Integer.parseInt(args[0]);
        String toPrint = "Do you know da wae";
        
        if (args.length != 1){
            
            int exclamations = Integer.parseInt(args[1]);
            
            for (int i = 0; i < exclamations; i++){
                
                toPrint += "?";
           
            }
       
        }

        for (int x = 0; x < loop + 1; x++){
            
            System.out.println(toPrint);

        }
    }
}