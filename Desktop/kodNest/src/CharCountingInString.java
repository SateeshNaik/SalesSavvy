public class CharCountingInString {
    public static void main(String[] args) {
        String str = "banana";

        boolean[] visited = new boolean[str.length()];
        System.out.println("Character Frenquncies:");
        for(int i=0; i<str.length(); i++){
            if(visited[i]){
                continue;
            }
            char c=str.charAt(i);
            int count=1;
            for(int j=i+1; j<str.length(); j++){
                if(str.charAt(j)==c){
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(c+":"+count);

        }

    }
}
