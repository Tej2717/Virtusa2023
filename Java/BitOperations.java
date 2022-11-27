package Bit_Manipulation;
class BitOperations{
    
    public static void main(String[] args){
        
        int a=15; 
        int b=21; 
        
        
        int f=(a&(a-1));
        System.out.println("Power of 2 Operation : "+f+" Binary value: "+Integer.toBinaryString(f));
        
        int and=a&b;
        System.out.println("AND Operation : "+and+" Binary value: "+Integer.toBinaryString(and));
        
        int or=a|b;
        System.out.println("OR Operation : "+or+" Binary value: "+Integer.toBinaryString(or));
        
        int xor=a^b;
        System.out.println("XOR Operation : "+xor+" Binary value: "+Integer.toBinaryString(xor));
        int x=7;
      
        int not=~x;
        System.out.println("NOT Operation : "+not+" Binary value: "+Integer.toBinaryString(not));

    }
}
