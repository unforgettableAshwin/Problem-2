class Main {
  public static void main(String[] args) {
    
    String code;
    code = "10100111001";

    manchesterCode(code);

  }

  public static void manchesterCode(String code)
  { char c;

    for( int i = 0; i < code.length(); i++ )
    { c = code.charAt( i );
      if( c == '1' )
        System.out.print( "10" );
      else
        System.out.print( "01" );
    }
    
    System.out.println();
  }
}