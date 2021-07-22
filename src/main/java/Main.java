public class Main {
    public static void main(String[] args) {
        int i = 0;
        StringBuffer strBuff = new StringBuffer("testString");
        while(i<7){
            strBuff.append("z-/-");
            System.out.println(strBuff);
            i++;
        }
    }
}
