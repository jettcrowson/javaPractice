class Switch{ 
       
    public static void main(String[] args){
        System.out.println(swap("Peter piper pickeled peppers", "p", "t"));
        System.out.println(swap("Sally sold sea shells by the sea shore shore", "sea", "shore"));
    }

    public static String swap(String str, String swapA, String swapB){

        String changedString = "";
        
        //Used to replace one of the strings so the other can be swapped without dificulty
        String placeholder = "!_";

        changedString = replacer(str, swapA, placeholder);
        puts("1)" + changedString);
        changedString = replacer(changedString, swapB, swapA);
        puts("2)" + changedString);
        changedString = replacer(changedString, placeholder, swapB);

        return changedString;
    }
    
    public static String replacer(String str, String toReplace, String toReplaceWith){
        
        //Create a copy of the original string to alter
        String changedStr = "";

        //Stop when the index is the length of the area being scanned (length of toReplace) away, since we'll be scanning areas of toReplace's length
        for(int i = 0; i < str.length() - toReplace.length() + 1; i++){
            
            //If the section (that is the length of the term we are looking to replace) equals the term we are looking to replace
            if(str.substring(i, i + toReplace.length()).equals(toReplace)){

                //If we are at a place we want to replace, add the full toReplaceWith string
                changedStr += toReplaceWith;

                //Then move the index so we aren't looking at places we already replaced
                i += toReplace.length() - 1;

            }else{

                //Otherwise, normally add the character to the new string
                changedStr += str.charAt(i);

            }

        }



        return changedStr;
    }

    public static void puts(String s){
        System.out.println(s);
    }
}