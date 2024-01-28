package interviu;

//1. Scrie o functie care sa afiseze toate numerele impare pana cand intalneste primul numar divizibil cu 9, din intervalul [x,y], Nr intregi.
//2. Scrie o functie care afiseaza toate numerele pare incepand de la 0 pana cand intalneste primul numar divizibil cu 13.
public class SimpleExercises {

    public static void main(String[] args) {
        int x = -3;
        int y = 12;

        printOddNumbersBetween(x, y);
    }

    // parcurgem fiecare numar din intreval
    // verificam daca este impar si nu este divizibil cu 9
    // daca da, il afisam
    public static void printOddNumbersBetween(int x, int y) {
        // solutia 2
        // pt  0 => 0 <= 12 && ( 0 % 9 !=0 || 0 ==0)
        // true && ( false || true )
        // true && true = true  corect pt 0 true ca sa mearga mai departe
        for (int i = x; i <= y && (i % 9 != 0 || i==0); i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        // Tema: imbunatatiti for-ul astfel incat sa mergem doar prin numerele impare

        // solutia 1
        // for (int i = x; i <= y; i++) {
//            if (i % 9 == 0 && i != 0) {
//                //    i=y+1;
//                //break;
//                return;
//            }
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }
    }


}
