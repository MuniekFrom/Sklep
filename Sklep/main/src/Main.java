import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------SKLEP----------\n");

        System.out.println("Produkty:\n\n1.mleko-4.99zł     2.jajka-7.99zł\n3.kurczak-4.50zł   4.parówki-6.70zł\n5.miód-12.50zł     6.pomidor-1.30zł\n7.chleb-3.99zł     8.płatki-9.99zł\n");
        Scanner scanner = new Scanner(System.in);
        double mleko = 4.99;
        double jajka = 7.99;
        double kurczak = 4.50;
        double parowki = 6.70;
        double miod = 12.50;
        double pomidor = 1.30;
        double chleb = 3.99;
        double platki = 9.99;

        int liczbmlek = 0;
        int liczbjaj = 0;
        int liczbkur = 0;
        int liczbpar = 0;
        int liczbmiod = 0;
        int liczbpomidor = 0;
        int liczbchleb = 0;
        int liczbplat = 0;
        boolean Continue = true;
        boolean Continueshop = true;
        double cena = 0;

        while (Continue) {
            System.out.println("1.DO KOSZYKA 2.KOSZYK 3.KUP 4.WYJDŹ");
            int decision1 = scanner.nextInt();
            if (decision1 == 1) {
                Continueshop = true;
                while (Continueshop) {
                    System.out.println("1.DODAJ 2.USUŃ 3.POWRÓT");
                    int decision2 = scanner.nextInt();
                    if (decision2 == 1) {
                        System.out.println("Wybierz produkt (1-8): ");
                        int produkt = scanner.nextInt();

                        if (produkt == 1) {
                            cena = cena + mleko;
                            System.out.println("Dodałeś mleko!");
                            liczbmlek++;
                        } else if (produkt == 2) {
                            cena = cena + jajka;
                            System.out.println("Dodałeś jajka!");
                            liczbjaj++;
                        } else if (produkt == 3) {
                            cena = cena + kurczak;
                            System.out.println("Dodałeś kurczaka!");
                            liczbkur++;
                        } else if (produkt == 4) {
                            cena = cena + parowki;
                            System.out.println("Dodałeś parówki!");
                            liczbpar++;
                        } else if (produkt == 5) {
                            cena = cena + miod;
                            System.out.println("Dodałeś miód!");
                            liczbmiod++;
                        } else if (produkt == 6) {
                            cena = cena + pomidor;
                            System.out.println("Dodałęś pomidora!");
                            liczbpomidor++;
                        } else if (produkt == 7) {
                            cena = cena + chleb;
                            System.out.println("Dodałeś chleb!");
                            liczbchleb++;
                        } else if (produkt == 8) {
                            cena = cena + platki;
                            System.out.println("Dodałeś płatki!");
                            liczbplat++;
                        } else {
                            System.out.println("Nie ma takiego produktu!");
                        }
                    } else if (decision2 == 2) {
                        System.out.println("Wybierz produkt,który chcesz usunąć z koszyka (1-8)");
                        int usunprodukt = scanner.nextInt();
                            if (usunprodukt == 1) {
                                if (liczbmlek > 0) {
                                    liczbmlek--;
                                    cena = cena - mleko;
                                    System.out.println("Usunięto mleko z koszyka");
                                } else {
                                    System.out.println("Nie masz mleka w koszyku!");
                                }
                            }
                            else if (usunprodukt == 2) {
                                if (liczbjaj > 0) {
                                    liczbjaj--;
                                    cena = cena - jajka;
                                    System.out.println("Usunięto jajka z koszyka");
                                } else {
                                    System.out.println("Nie masz jaj w koszyku!");
                                }
                            }
                            else if (usunprodukt == 3) {
                                if (liczbkur > 0) {
                                    liczbkur--;
                                    cena = cena - kurczak;
                                    System.out.println("Usunięto kurczaka z koszyka");
                                } else  {
                                    System.out.println("Nie masz kurczaka w koszyku!");
                                }
                            }
                            else if (usunprodukt == 4) {
                                if (liczbpar > 0) {
                                    liczbpar--;
                                    cena = cena - parowki;
                                    System.out.println("Usunięto parówki z koszyka");
                                } else {
                                    System.out.println("Nie masz parówek w koszyku!");
                                }
                            }
                            else if (usunprodukt == 5) {
                                if (liczbmiod > 0) {
                                    liczbmiod--;
                                    cena = cena - miod;
                                    System.out.println("Usunięto miód z koszyka");
                                } else  {
                                    System.out.println("Nie masz miodu w koszyku!");
                                }
                            }
                            else if (usunprodukt == 6) {
                                if (liczbpomidor > 0) {
                                    liczbpomidor--;
                                    cena = cena - pomidor;
                                    System.out.println("Usunięto pomidor z koszyka");
                                } else {
                                    System.out.println("Nie masz pomidora w koszyku!");
                                }
                            }
                            else if (usunprodukt == 7) {
                                if (liczbchleb > 0) {
                                    liczbchleb--;
                                    cena = cena - chleb;
                                    System.out.println("Usunięto chleb z koszyka");
                                } else {
                                    System.out.println("Nie masz chleba w koszyku!");
                                }
                            }
                            else if (usunprodukt == 8) {
                                if (liczbplat > 0) {
                                    liczbplat--;
                                    cena = cena - platki;
                                    System.out.println("Usunięto płatki z koszyka");
                                } else {
                                    System.out.println("Nie masz płatek w koszyku!");
                                }
                            }
                            else {
                                System.out.println("Nie ma takiego produktu");
                            }
                    } else if (decision2 == 3) {
                        System.out.println("Zakończyłeś dodawanie produktów.");
                        Continueshop = false;
                    } else {
                        System.out.println("Nie ma takiej opcji!");
                    }

                }
            } else if (decision1 == 2) {
                System.out.println("TWÓJ KOSZYK:");
                System.out.println("Mleko: " + liczbmlek + " sztuk.");
                System.out.println("Jajka: " + liczbjaj + " sztuk.");
                System.out.println("Kurczak: " + liczbkur + " sztuk.");
                System.out.println("Parówki: " + liczbpar + " sztuk.");
                System.out.println("Miód: " + liczbmiod + " sztuk.");
                System.out.println("Pomidor: " + liczbpomidor + " sztuk.");
                System.out.println("Chleb: " + liczbchleb + " sztuk.");
                System.out.println("Płatki: " + liczbplat + " sztuk.");
                System.out.printf("Cena twojego koszyka wynosi: %.2f zł.\n", cena);
            } else if (decision1 == 3) {
                System.out.println("ZAKUPY: ");
                if (liczbmlek>0){
                    System.out.println(liczbmlek + " mleko   " + liczbmlek*mleko);
                }
                if (liczbjaj>0){
                    System.out.println(liczbjaj + " jajek   " + liczbjaj*jajka);
                }
                if (liczbkur>0){
                    System.out.println(liczbkur + " kurczak   " + liczbkur*kurczak);
                }
                if (liczbpar>0){
                    System.out.println(liczbpar + " parówek   " + liczbpar*parowki);
                }
                if (liczbmiod>0){
                    System.out.println(liczbmiod + " miód   " + liczbmiod*miod);
                }
                if (liczbpomidor>0){
                    System.out.println(liczbpomidor + " pomidorów   " + liczbpomidor*pomidor);
                }
                if (liczbchleb>0){
                    System.out.println(liczbchleb + " chleb   " + liczbchleb*chleb);
                }
                if (liczbplat>0){
                    System.out.println(liczbplat + " płatki   " + liczbplat*platki);
                }
                System.out.printf("CENA: %.2f zł.\n", cena);
                System.out.println("Dziękujemy za zakupy!");
                Continue = false;
            } else if (decision1 == 4) {
                System.out.println("Program zakończony do widzenia!");
                Continue = false;
            } else {
                System.out.println("Nie ma takiej opcji! Spróbuj ponownie.");
            }
        }
    }
}