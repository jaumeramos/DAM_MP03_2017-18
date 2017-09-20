
package dia_20170920;



public class TipusDeDades {

    public void mostrarTipusDades(){
          /**
         *
         * byte: 8-bit signed two's complement integer. Minimum value of -128
         * and a maximum value of 127 (inclusive). Useful for saving memory in
         * large arrays
         *
         * short: 16-bit signed two's complement integer. Minimum value of
         * -32,768 maximum value of 32,767 (inclusive).
         *
         * int: 32-bit signed two's complement integer minimum value of -2^31
         * and a maximum value of (2^31)-1.
         *
         * long: 64-bit two's complement integer. Minimum value of -2^63 and a
         * maximum value of (2^63)-1.
         *
         * float: single-precision 32-bit IEEE 754 floating point. use a float
         * (instead of double) if you need to save memory Should never be used
         * for precise values, such as currency. For that, is better to use the
         * java.math.BigDecimal class
         *
         * double: double-precision 64-bit IEEE 754 floating point. For decimal
         * values, this is generally the default choice.
         *
         * boolean: Only two possible values: true and false.
         *
         * char: single 16-bit Unicode character. Minimum value of '\u0000' (or
         * 0) Maximum value of '\uffff' (or 65,535 inclusive).
         *
         */

        // Tipus primitius
        int numInt = 10;
        byte numByte = 127;
        short numShort = 2;
        long numLong = 1233455624L;
        float numFloat = 3.4f;
        double numDouble = 3.9D;
        boolean unBoolean = true;
        char unChar = 'c';

        // Es poden mostrar i es converteixen en String
        System.out.println(numInt);
        System.out.println(numByte);
        System.out.println(numShort);
        System.out.println(numLong);
        System.out.println(numFloat);
        System.out.println(numDouble);
        System.out.println(unBoolean);
        System.out.println(unChar);

        // Cadenes, sempre són un objecte
        String cadena = "Hola String";
        String cadena1 = new String("També és una cadena");

        System.out.println(cadena + " " + numInt);
        System.out.println(cadena1);

        // Classes Wrapper (envoltori) de tipus primitius                
        // Autoboxing   Tipus primitius --> Objectes
        Boolean b = unBoolean;
        Character c = unChar;
        Byte by = numByte;
        Short s = numShort;
        Integer i = numInt;
        Long l = numLong;
        Float f = numFloat;
        Double d = numDouble;

        // Unboxing     Objectes --> Tipus primitius
        numInt = new Integer(10);
        numByte = new Byte("120");
        numShort = new Short("2");
        numLong = new Long(12334556);
        numFloat = new Float(3.4f);
        numDouble = new Double(3.9);
        unBoolean = new Boolean(true);
        unChar = new Character('c');

        // Els nombres enters es poden expressar de diferents maneres: binari, octal, decimal i hexadecimal
        int binInt = 0b000101;      // Valors binaris començen per 0b
        int octInt = 01234567;  // Valors octals començen per 0 i només van del 0 al 7        
        int decInt = 26;        // Valors Decimals (base 10)
        int hexInt = 0x1a;      // Valors Hexadecimals començen per 0x i van del 0 a la lletra F

        // Els nombres amb coma flotant es poden expressar en notació científica
        double sciDouble = 1.23e4D;
        float sciFloat = 1.23e4f;

        // Hi ha caràcters amb significat especial (cal escapar-los amb \)
        char backspace = '\b';
        char tab = '\t';
        char lineFeed = '\n';
        char carriageReturn = '\r';
        char formFeed = '\f';
        char doubleQuote = '\"';
        char singleQuote = '\'';
        char backslash = '\\';
        
        
    }
    
    public static void main(String[] args){
        TipusDeDades t = new TipusDeDades();
        
        t.mostrarTipusDades();
        
    }
    
    
}
