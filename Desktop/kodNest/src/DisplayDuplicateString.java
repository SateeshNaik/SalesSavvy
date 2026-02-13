public class DisplayDuplicateString {
    public static void main(String[] args) {
      String str="helloo";
      String characters="";
      String duplicate="";
      for(int i=0; i<str.length();i++){
          String current=Character.toString(str.charAt(i));
          if(characters.contains(current))
          {
              if(!duplicate.contains(current))
              {

                  duplicate+=current;
              }
          }
          characters+=current;
      }
        System.out.println(duplicate);
    }
}
