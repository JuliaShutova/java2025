public class ConversionPractice {
    public static void main(String[] args) {
        String str = "Hello";
        
        StringBuilder sbFromString = new StringBuilder(str);
        sbFromString.append(" World");
        System.out.println("String -> StringBuilder: " + sbFromString);
        
        StringBuffer sbufFromString = new StringBuffer(str);
        sbufFromString.insert(0, ">>> ");
        System.out.println("String -> StringBuffer: " + sbufFromString);
        
        StringBuilder sb = new StringBuilder("Java");
        String strFromSB = sb.toString();
        System.out.println("StringBuilder -> String: " + strFromSB);
        
        StringBuffer sbuf = new StringBuffer("Programming");
        String strFromSBuf = sbuf.toString();
        System.out.println("StringBuffer -> String: " + strFromSBuf);
        
        StringBuilder sbFromSBuf = new StringBuilder(sbuf.toString());
        sbFromSBuf.append(" Language");
        System.out.println("StringBuffer -> StringBuilder: " + sbFromSBuf);
        
        StringBuffer sbufFromSB = new StringBuffer(sb.toString());
        sbufFromSB.reverse();
        System.out.println("StringBuilder -> StringBuffer: " + sbufFromSB);
    }
}