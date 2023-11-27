/* The following code was generated by JFlex 1.4.3 on 26/11/23 22:55 */

package lexico;
import static lexico.Tokens.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 26/11/23 22:55 from the specification file
 * <tt>../Analizador/src/lexico/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\12\0\1\62\2\0\1\25\22\0\1\25\1\16\1\60\1\4\1\0"+
    "\1\12\1\14\1\57\1\21\1\22\1\2\1\11\1\7\1\10\1\56"+
    "\1\1\1\55\11\54\1\6\1\3\1\17\1\5\1\20\2\0\5\63"+
    "\1\32\13\63\1\51\1\63\1\26\6\63\1\0\1\61\1\0\1\13"+
    "\1\64\1\0\1\33\1\43\1\44\1\47\1\31\1\41\1\46\1\45"+
    "\1\36\1\63\1\53\1\34\1\52\1\37\1\42\2\63\1\27\1\35"+
    "\1\40\1\30\1\63\1\50\3\63\1\23\1\15\1\24\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\15\27"+
    "\2\30\2\1\1\31\1\32\1\0\1\33\1\34\1\0"+
    "\1\35\1\36\1\37\1\40\7\27\1\41\12\27\3\0"+
    "\1\42\2\0\7\27\1\43\12\27\1\44\1\45\1\46"+
    "\1\47\1\50\1\27\1\51\6\27\1\52\1\53\1\54"+
    "\3\27\1\55\1\27\1\56\2\27\1\57\1\27\1\60"+
    "\1\27\1\61\1\62\1\63\1\64\1\65\3\27\1\66"+
    "\1\67";

  private static int [] zzUnpackAction() {
    int [] result = new int[130];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\65\0\152\0\65\0\65\0\65\0\237\0\65"+
    "\0\65\0\324\0\u0109\0\65\0\65\0\65\0\65\0\u013e"+
    "\0\u0173\0\u01a8\0\65\0\65\0\65\0\65\0\65\0\u01dd"+
    "\0\u0212\0\u0247\0\u027c\0\u02b1\0\u02e6\0\u031b\0\u0350\0\u0385"+
    "\0\u03ba\0\u03ef\0\u0424\0\u0459\0\u048e\0\u04c3\0\u04f8\0\u052d"+
    "\0\65\0\u0562\0\u0597\0\65\0\65\0\u04c3\0\65\0\65"+
    "\0\65\0\65\0\u05cc\0\u0601\0\u0636\0\u066b\0\u06a0\0\u06d5"+
    "\0\u070a\0\u0247\0\u073f\0\u0774\0\u07a9\0\u07de\0\u0813\0\u0848"+
    "\0\u087d\0\u08b2\0\u08e7\0\u091c\0\u0951\0\u0986\0\u052d\0\65"+
    "\0\u09bb\0\u09f0\0\u0a25\0\u0a5a\0\u0a8f\0\u0ac4\0\u0af9\0\u0b2e"+
    "\0\u0b63\0\u0247\0\u0b98\0\u0bcd\0\u0c02\0\u0c37\0\u0c6c\0\u0ca1"+
    "\0\u0cd6\0\u0d0b\0\u0d40\0\u0d75\0\u0daa\0\65\0\65\0\u0247"+
    "\0\u0247\0\u0ddf\0\u0247\0\u0e14\0\u0e49\0\u0e7e\0\u0eb3\0\u0ee8"+
    "\0\u0f1d\0\u0247\0\u0247\0\u0247\0\u0f52\0\u0f87\0\u0fbc\0\u0247"+
    "\0\u0ff1\0\u0247\0\u1026\0\u105b\0\u0247\0\u1090\0\u0247\0\u10c5"+
    "\0\u0247\0\u0247\0\u0247\0\u0247\0\u0247\0\u10fa\0\u112f\0\u1164"+
    "\0\u0247\0\u0247";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[130];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\2\32\1\35\1\36\2\32\1\37"+
    "\1\32\1\40\1\41\2\32\1\42\1\43\1\32\1\44"+
    "\1\32\1\45\1\46\1\2\1\47\1\50\1\2\1\51"+
    "\1\32\1\2\66\0\1\52\1\53\67\0\1\54\67\0"+
    "\1\55\43\0\1\45\1\56\20\0\1\57\60\0\1\60"+
    "\64\0\1\61\64\0\1\62\105\0\1\32\1\63\26\32"+
    "\5\0\2\32\26\0\3\32\1\64\24\32\5\0\2\32"+
    "\26\0\30\32\5\0\2\32\26\0\6\32\1\65\21\32"+
    "\5\0\2\32\26\0\5\32\1\66\22\32\5\0\2\32"+
    "\26\0\12\32\1\67\7\32\1\70\5\32\5\0\2\32"+
    "\26\0\11\32\1\71\1\32\1\72\14\32\5\0\2\32"+
    "\26\0\6\32\1\73\5\32\1\74\13\32\5\0\2\32"+
    "\26\0\1\32\1\75\12\32\1\76\13\32\5\0\2\32"+
    "\26\0\5\32\1\77\11\32\1\100\10\32\5\0\2\32"+
    "\26\0\3\32\1\101\24\32\5\0\2\32\26\0\1\32"+
    "\1\102\15\32\1\103\10\32\5\0\2\32\26\0\5\32"+
    "\1\104\22\32\5\0\2\32\54\0\2\45\1\105\64\0"+
    "\1\105\6\0\57\106\1\0\5\106\60\107\1\110\1\111"+
    "\3\107\62\52\1\0\2\52\2\53\1\112\62\53\26\0"+
    "\2\32\1\113\25\32\5\0\2\32\26\0\5\32\1\114"+
    "\4\32\1\115\15\32\5\0\2\32\26\0\7\32\1\116"+
    "\20\32\5\0\2\32\26\0\6\32\1\117\21\32\5\0"+
    "\2\32\26\0\1\32\1\120\26\32\5\0\2\32\26\0"+
    "\10\32\1\121\17\32\5\0\2\32\26\0\12\32\1\122"+
    "\15\32\5\0\2\32\26\0\14\32\1\123\13\32\5\0"+
    "\2\32\26\0\1\32\1\124\26\32\5\0\2\32\26\0"+
    "\3\32\1\125\24\32\5\0\2\32\26\0\14\32\1\126"+
    "\13\32\5\0\2\32\26\0\7\32\1\127\20\32\5\0"+
    "\2\32\26\0\5\32\1\130\22\32\5\0\2\32\26\0"+
    "\13\32\1\131\14\32\5\0\2\32\26\0\10\32\1\132"+
    "\17\32\5\0\2\32\26\0\10\32\1\133\17\32\5\0"+
    "\2\32\26\0\10\32\1\134\17\32\5\0\2\32\54\0"+
    "\2\135\66\0\1\136\5\0\62\107\1\0\2\107\1\53"+
    "\1\137\1\112\62\53\26\0\3\32\1\140\24\32\5\0"+
    "\2\32\26\0\21\32\1\141\6\32\5\0\2\32\26\0"+
    "\2\32\1\142\25\32\5\0\2\32\26\0\3\32\1\143"+
    "\24\32\5\0\2\32\26\0\7\32\1\144\20\32\5\0"+
    "\2\32\26\0\10\32\1\145\17\32\5\0\2\32\26\0"+
    "\12\32\1\146\15\32\5\0\2\32\26\0\5\32\1\147"+
    "\22\32\5\0\2\32\26\0\23\32\1\150\4\32\5\0"+
    "\2\32\26\0\5\32\1\151\22\32\5\0\2\32\26\0"+
    "\6\32\1\152\21\32\5\0\2\32\26\0\3\32\1\153"+
    "\24\32\5\0\2\32\26\0\1\32\1\154\26\32\5\0"+
    "\2\32\26\0\5\32\1\155\22\32\5\0\2\32\26\0"+
    "\12\32\1\156\15\32\5\0\2\32\26\0\6\32\1\157"+
    "\21\32\5\0\2\32\26\0\11\32\1\160\16\32\5\0"+
    "\2\32\54\0\1\135\36\0\1\32\1\161\26\32\5\0"+
    "\2\32\26\0\3\32\1\162\24\32\5\0\2\32\26\0"+
    "\11\32\1\163\16\32\5\0\2\32\26\0\16\32\1\164"+
    "\11\32\5\0\2\32\26\0\12\32\1\165\15\32\5\0"+
    "\2\32\26\0\5\32\1\166\22\32\5\0\2\32\26\0"+
    "\25\32\1\167\2\32\5\0\2\32\26\0\2\32\1\170"+
    "\25\32\5\0\2\32\26\0\3\32\1\171\24\32\5\0"+
    "\2\32\26\0\3\32\1\172\24\32\5\0\2\32\26\0"+
    "\11\32\1\173\16\32\5\0\2\32\26\0\20\32\1\174"+
    "\7\32\5\0\2\32\26\0\17\32\1\175\10\32\5\0"+
    "\2\32\26\0\11\32\1\176\16\32\5\0\2\32\26\0"+
    "\6\32\1\177\21\32\5\0\2\32\26\0\20\32\1\200"+
    "\7\32\5\0\2\32\26\0\12\32\1\201\15\32\5\0"+
    "\2\32\26\0\3\32\1\202\24\32\5\0\2\32";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4505];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\3\11\1\1\2\11\2\1\4\11"+
    "\3\1\5\11\21\1\1\11\1\1\1\0\2\11\1\0"+
    "\4\11\22\1\3\0\1\11\2\0\23\1\2\11\43\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[130];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 138) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 14: 
          { lexeme=yytext(); return DISYUNSION;
          }
        case 56: break;
        case 3: 
          { lexeme=yytext(); return SIGMULTIPLICACION;
          }
        case 57: break;
        case 48: 
          { lexeme=yytext(); return RESERVBREAK;
          }
        case 58: break;
        case 39: 
          { lexeme=yytext(); return LITTRUE;
          }
        case 59: break;
        case 47: 
          { lexeme=yytext(); return TIPOFlOAT;
          }
        case 60: break;
        case 30: 
          { lexeme=yytext(); return DIFERENTE;
          }
        case 61: break;
        case 31: 
          { lexeme=yytext(); return MENORIGUAL;
          }
        case 62: break;
        case 2: 
          { lexeme=yytext(); return SIGDIVISION;
          }
        case 63: break;
        case 15: 
          { lexeme=yytext(); return NEGACION;
          }
        case 64: break;
        case 44: 
          { lexeme=yytext(); return TIPOCHAR;
          }
        case 65: break;
        case 35: 
          { lexeme=yytext(); return TIPOINT;
          }
        case 66: break;
        case 53: 
          { lexeme=yytext(); return RESERVSWITCH;
          }
        case 67: break;
        case 7: 
          { lexeme=yytext(); return DOSPUNTOS;
          }
        case 68: break;
        case 49: 
          { lexeme=yytext(); return RESERVWRITE;
          }
        case 69: break;
        case 34: 
          { lexeme=yytext(); return LITSTRING;
          }
        case 70: break;
        case 40: 
          { lexeme=yytext(); return RESERVREAD;
          }
        case 71: break;
        case 41: 
          { lexeme=yytext(); return RESERVELSE;
          }
        case 72: break;
        case 43: 
          { lexeme=yytext(); return RESERVCASE;
          }
        case 73: break;
        case 17: 
          { lexeme=yytext(); return MAYOR;
          }
        case 74: break;
        case 46: 
          { lexeme=yytext(); return LITFALSE;
          }
        case 75: break;
        case 12: 
          { lexeme=yytext(); return SIGPOTENCIA;
          }
        case 76: break;
        case 6: 
          { lexeme=yytext(); return SIGNOIGUAL;
          }
        case 77: break;
        case 33: 
          { lexeme=yytext(); return RESERVIF;
          }
        case 78: break;
        case 11: 
          { lexeme=yytext(); return SIGMODULO;
          }
        case 79: break;
        case 9: 
          { lexeme=yytext(); return SIGRESTA;
          }
        case 80: break;
        case 4: 
          { lexeme=yytext(); return ENDLINE;
          }
        case 81: break;
        case 5: 
          { lexeme=yytext(); return SEPARADOR;
          }
        case 82: break;
        case 51: 
          { lexeme=yytext(); return RESERVRETURN;
          }
        case 83: break;
        case 10: 
          { lexeme=yytext(); return SIGSUMA;
          }
        case 84: break;
        case 42: 
          { lexeme=yytext(); return TIPOBOOL;
          }
        case 85: break;
        case 27: 
          { lexeme=yytext(); return IGUAL;
          }
        case 86: break;
        case 25: 
          { lexeme=yytext(); return SALTOLINEA;
          }
        case 87: break;
        case 37: 
          { lexeme=yytext(); return LITCHAR;
          }
        case 88: break;
        case 13: 
          { lexeme=yytext(); return CONGUNCION;
          }
        case 89: break;
        case 52: 
          { lexeme=yytext(); return TIPOSTRING;
          }
        case 90: break;
        case 29: 
          { lexeme=yytext(); return AUMENTAR;
          }
        case 91: break;
        case 23: 
          { lexeme=yytext(); return IDENTIFICADOR;
          }
        case 92: break;
        case 26: 
          { lexeme=yytext(); return COMENTARIO;
          }
        case 93: break;
        case 55: 
          { lexeme=yytext(); return RESERVFORRANGE;
          }
        case 94: break;
        case 18: 
          { lexeme=yytext(); return ABREPARENTESIS;
          }
        case 95: break;
        case 54: 
          { lexeme=yytext(); return RESERVDEFAULT;
          }
        case 96: break;
        case 16: 
          { lexeme=yytext(); return MENOR;
          }
        case 97: break;
        case 38: 
          { return COMENTARIOBLOQUE;
          }
        case 98: break;
        case 20: 
          { lexeme=yytext(); return ABRELLAVE;
          }
        case 99: break;
        case 1: 
          { return ERROR;
          }
        case 100: break;
        case 36: 
          { lexeme=yytext(); return LITFLOAT;
          }
        case 101: break;
        case 45: 
          { lexeme=yytext(); return RESERVMAIN;
          }
        case 102: break;
        case 8: 
          { lexeme=yytext(); return COMA;
          }
        case 103: break;
        case 19: 
          { lexeme=yytext(); return CIERRAPARENTESIS;
          }
        case 104: break;
        case 28: 
          { lexeme=yytext(); return DISMINUIR;
          }
        case 105: break;
        case 50: 
          { lexeme=yytext(); return RESERVWHILE;
          }
        case 106: break;
        case 32: 
          { lexeme=yytext(); return MAYORIGUAL;
          }
        case 107: break;
        case 22: 
          { lexeme=yytext();
          }
        case 108: break;
        case 21: 
          { lexeme=yytext(); return CIERRALLAVE;
          }
        case 109: break;
        case 24: 
          { lexeme=yytext(); return LITINT;
          }
        case 110: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
