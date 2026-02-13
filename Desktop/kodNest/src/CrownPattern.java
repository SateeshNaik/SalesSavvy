public class CrownPattern {
    public static void main(String[] args) {
        int length=13;

        for(int j=0; j<13; j++){
            if(j==0 || j==12 || j==13/2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        for(int j=1; j<=4; j++){
            for(int k=1; k<=j; k++){
                System.out.print("|");
            }
            int midStartPos=length/2-j+1;
            int endPos=length/2+j;
            for(int k=j; k<midStartPos; k++){
                System.out.print(" ");
            }
            for(int k=midStartPos; k<endPos; k++){
                System.out.print("|");
            }
            for(int k=endPos; k<length-j; k++){
                System.out.print(" ");
            }
            int startPos= length-j<endPos ? endPos+1 : length-j;
            for(int s=startPos; s<length; s++){
                System.out.print("|");
            }
            System.out.println();
        }
        for(int j=0; j<13; j++){
            System.out.print("*");

        }

    }

}
