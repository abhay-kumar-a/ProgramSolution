package dsabootcamp.fileHandling_IO_Stream;

public class StringCharCount {
    public static void main(String[] args) {
        String s =" \u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n" +
                "\u000B\f\n" +
                "\u000E\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001A\u001B\u001C\u001D\u001E\u001F !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007F€\u0081‚ƒ„…†‡ˆ‰Š‹Œ\u008DŽ\u008F\u0090‘’“”•–—˜™š›œ\u009DžŸ ¡¢£¤¥¦§¨©ª«¬\u00AD®¯°±²³´µ¶·¸¹º»¼½¾¿ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÜÝÞßàáâãäåæçèéêëìíîïðñòóôõö÷øùúûüýþÿ\0";
        s=s.replace(" ","");  // also use for this ...
        int count = 0;
        int i =0;
        while (s.charAt(i) !='\0')
        {
//            if(s.charAt(i) ==' ') /// fro remove spaces....
//            {
//                i++;
//            }
            count++;
            i++;
        }
        System.out.println("Cont is : "+ count);
    }
}
