package M.Testing8583;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       // String cadena = "@@@@@@@@@@@@@@@ñâæÃÈÄóöó@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ÔÁâãÅÙÃÁÙÄ@ÄÅÂÉã@âæÉãÃÈ@@@@@@@@";
         String cadena = "ñâæÃÈÄóöó";
        System.out.println(Convert(cadena,"CP1047","ISO-8859-1"));
        cadena = "1SWCHD363";
        System.out.println(Convert(cadena,"ISO-8859-1","CP1047"));
    }
    
        public static String Convert (String strToConvert,String in, String out){
           try {

            Charset charset_in = Charset.forName(out);
            Charset charset_out = Charset.forName(in);

            CharsetDecoder decoder = charset_out.newDecoder();

            CharsetEncoder encoder = charset_in.newEncoder();

            CharBuffer uCharBuffer = CharBuffer.wrap(strToConvert);

            ByteBuffer bbuf = encoder.encode(uCharBuffer);

            CharBuffer cbuf = decoder.decode(bbuf);

            String s = cbuf.toString();

            //System.out.println("Original String is: " + s);
            return s;

        } catch (CharacterCodingException e) {

            //System.out.println("Character Coding Error: " + e.getMessage());
            return "";

        }


    }

    }
