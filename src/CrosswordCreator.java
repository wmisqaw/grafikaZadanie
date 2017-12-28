import java.util.Scanner;

public class CrosswordCreator {


    public static void main(String[] args) {
        String temp;
        boolean pom = false;
        char arrayChanged[];
        /*char words[][] = {  {'A','A','S','P','O','D','L','Z','N','O','S','T','O','H','R','A','D','A','S',},
                            {'B','N','L','C','A','D','A','R','O','P','A','E','S','L','L','C','K','O','K',},
                            {'I','I','A','R','I','T','A','S','M','O','V','P','R','A','V','I','D','L','O',},
                            {'L','L','L','M','A','T','K','A','J','M','A','N','R','V','P','N','I','A','K',},
                            {'O','I','O','N','K','K','P','R','O','G','R','E','S','O','S','E','L','R','A',},
                            {'K','Z','M','L','O','A','Z','A','N','A','O','O','S','L','T','S','I','B','N',},
                            {'O','O','G','E','S','T','O','O','Z','L','M','T','O','A','R','T','S','R','O',},
                            {'K','T','A','V','T','U','L','P','N','A','R','N','J','M','I','S','T','O','P',},
                            {'R','S','R','I','O','K','C','O','T','O','L','O','K','K','G','E','I','Z','E',},
                            {'E','E','A','C','L','O','A','E','J','K','P','K','A','Z','A','R','N','U','R',},
                            {'S','M','Z','E','V','P','O','K','O','J','Y','R','A','V','O','T','A','M','A',}};*/

        char words[][] = { {'S','E','O','E','D','U','T','I','G','N','O','L',},
                {'I','I','N','T','E','R','N','E','T','S','A','G',},
                {'N','H','G','T','I','I','O','S','P','N','O','G',},
                {'O','R','N','N','O','C','E','O','D','E','T','U',},
                {'I','E','F','C','A','E','I','M','S','W','R','B',},
                {'T','W','O','H','K','L','A','K','A','A','O','L',},
                {'A','E','E','U','E','R','O','D','T','R','F','E',},
                {'G','I','I','R','K','O','E','H','E','V','S','V',},
                {'I','V','E','O','B','N','L','E','L','S','P','A',},
                {'V','E','I','G','N','I','T','S','I','L','A','R',},
                {'A','R','O','X','S','H','I','N','T','S','M','T',},
                {'N','L','A','T','I','T','U','D','E','D','I','H',}};


        show_box(words);
        temp = input_data();
        arrayChanged = temp.toCharArray();
        int length = temp.length();
        boolean searching = searching(words, length, temp, arrayChanged, pom);
        result_checker(searching, temp);

        //nahradit namiesto 11 a 19 ....done
        System.out.println(words.length);
        System.out.println(words[0].length);


    }

    public static void show_box(char[][] words){
        System.out.println("Search words");
        System.out.println("-----------------------------------------");


        for (int i = 0; i < words.length; i++){
            System.out.print("| ");
            for (int j = 0; j < words[0].length; j++){
                System.out.print(words[i][j]+" ");
            }
            System.out.println("|");
        }
        System.out.println("-----------------------------------------");
    }

    public static String input_data(){
        Scanner input = new Scanner(System.in);
        System.out.print("input data : ");
        String input_word = input.next();
        String upper = input_word.toUpperCase();
        return  upper;
    }

    public static boolean searching(char words[][], int length, String temp, char[] arrayChanged, boolean pom){
        int x = 0;
        for (int i = 0; i < words.length; i++){
            for (int j = 0; j < words[0].length; j++){
                if (words[i][j] == arrayChanged[x]){
                    x = x + 1;
                    if (x == length){
                        pom = true;
                        return pom;
                    }
                }
                else {
                    x = 0;
                }
            }
        }
        for (int i = 0; i < words[0].length; i++){
            for (int j = 0; j < words.length; j++){
                if (words[j][i] == arrayChanged[x]){
                    x = x + 1;
                    if (x == length){
                        pom = true;
                        return  pom;
                    }

                }
                else {
                    x = 0;
                }
            }
        }
        return false;
    }

    public static void result_checker(boolean a, String temp){
        if (a){
            System.out.println(temp + " = Exists");
        }
        else {
            System.out.println(temp + " = Does not exists");
        }
    }
}



