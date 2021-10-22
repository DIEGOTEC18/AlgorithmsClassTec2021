class Exam {

    public static String intToRoman(int num) {
        
        String romanResult = "";
        
        int[] decimal = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        for(int i = 0; i < decimal.length; i++){
            
            int currentSymbolQuantity = num / decimal[i];
            
            if(currentSymbolQuantity != 0){
                
                for(int j = 0; j < currentSymbolQuantity; j++){
                    
                    romanResult += roman[i];
                    
                }
                
                num = num % decimal[i];
                
            }
            
        }
        
        return romanResult;
        
    }

    public static void main(String args[]){

        int test = 2021;
        System.out.println(test + " is " + intToRoman(test));

        test = 1999;
        System.out.println(test + " is " + intToRoman(test));

        test = 3049;
        System.out.println(test + " is " + intToRoman(test));

    }

}