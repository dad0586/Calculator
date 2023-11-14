import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s=scanner.nextLine();
        int index=0, index1=0;
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)=='A'){
                index=i;
                for (int j=i; j<s.length(); j++){
                    if (s.charAt(j)==' '){
                        index1=j;
                            System.out.println(s.substring(index,index1));
                            break;
                    } else if (j== s.length()-1) {
                        System.out.println(s.substring(index , s.length()));
                        break;

                    }

                }
            }

        }
       
    }
}