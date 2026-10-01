import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    IO.println("Mennyi adatot kíván kegyes uram/hölgyem megadni?");
    int db = sc.nextInt();

    double[] szamok = new double[db];
    for (int i = 0; i < db; i++) {
        IO.println("Kérem a(z) " + (i + 1) + ". számot: ");
        szamok[i] = sc.nextDouble();
    }

    for (double szam : szamok) {
        IO.println(szam);
    }
}
