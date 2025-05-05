package Zoho.set1;

public class Ronaldo {
    public static void main(String[] args) {
        String[][] father = { {"luke", "shaw"},
                              {"wayne", "rooney" },
                              {"rooney", "ronaldo"},
                              {"shaw", "rooney"} };

        System.out.println(find(father, "ronaldo"));
    }

    public static int find(String[][] f, String s){
        String ss = "";
        int count = 0;
        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f[0].length; j++) {
                if(f[i][j].equals(s)){
                    ss = f[i - 1][j];
                }
            }
        }

        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f[0].length; j++) {
                if( j == 1 && f[i][j].equals(ss)){
                    count++;
                }
            }
        }
        return count;
    }
}
