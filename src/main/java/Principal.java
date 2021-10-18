import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();

        menu.menuInicial();


    }
}
