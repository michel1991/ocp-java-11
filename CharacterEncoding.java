import java.nio.charset.*;
class CharacterEncoding{
  static void sample(){
    Charset usAsciiCharset = Charset.forName("US-ASCII");
    Charset utf8Charset = Charset.forName("UTF-8");
    Charset utf16Charset = Charset.forName("UTF-16");
  }
}
