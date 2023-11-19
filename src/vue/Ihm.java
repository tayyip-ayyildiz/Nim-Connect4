package vue;

import modele.Grille;

import java.util.Scanner;

public class Ihm {
    private int nbtas;
    private String nom1;
    private String nom2;
    private int a;
    private int b;
   private String choix;
   private int nbContrainte;
   private String rota;
   private String rotaChoix;
   private String Sens;
   private String choix2;

    public String getChoix2() {
        return choix2;
    }

    public String getSens() {
        return Sens;
    }

    public String getRotaChoix() {
        return rotaChoix;
    }

    public int getNbContrainte() {
        return nbContrainte;
    }
    public String getChoix() {
        return choix;
    }

    public String getRota() {
        return rota;
    }

    public int getNbtas() {
        return nbtas;
    }

    public String getNom1() {
        return nom1;
    }

    public String getNom2() {
        return nom2;
    }

    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public Ihm() {}

    public void quelJeu(){
        boolean boucle1=true;
        boolean boucle2=true;
        while (boucle1){
            System.out.println("A quoi voulez-vous jouer ? Veuillez dire nim ou p4");
            Scanner sc = new Scanner(System.in);
            choix=sc.next();
                if(choix.equals("nim") || choix.equals("p4")){
                    boucle1=false;
                    while(boucle2){
                    System.out.println("Voulez vous jouer solo ou a deux");
                    sc = new Scanner(System.in);
                    choix2= sc.next();
                    if(choix2.equals("solo") || choix2.equals("deux")){
                        boucle2=false;
                }
                    else {
                        System.out.println("Une erreur a été faite");
                    }
                }
                }
                else {
                    System.out.println("Une erreur a été faite");
                }
    }
    }

        public void creationPartie(){
        if(choix2.equals("deux")){
                Scanner sc = new Scanner(System.in);
                System.out.println("Veuillez entrer le nom du joueur 1");
                if (sc.hasNext()) {
                    nom1 = sc.next();
                    sc = new Scanner(System.in);
                    System.out.println("Veuillez entrer le nom du joueur 2");
                    if (sc.hasNext()) {
                        nom2 = sc.next();
                    }
                }
        }
        else{
            Scanner sc = new Scanner(System.in);
            System.out.println("Veuillez entrer le nom du joueur 1");
            if (sc.hasNext()) {
                nom1 = sc.next();
            }
        }
            }

            public void AfficherJoueur(String joueurActuel){
        System.out.println(joueurActuel+" "+"a vous de jouer");
            }


    public void Coup(String actuel,Grille grille){
        boolean boucle=true;
        while (boucle){
        System.out.println(actuel + " " + ":a vous de jouer");
        System.out.println("Veuillez choisir un numéro de colonne");
        System.out.println(grille);
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            a = sc.nextInt();
            if(0<a && a<8){
            boucle=false;
            }
            else {
            System.out.println("Une erreur a été faite");
        }
        }
        }
    }
    public void Tas(){
         Scanner sc = new Scanner(System.in);
        System.out.println("Avec combien de tas voulez vous jouer");
        boolean boucle=true;
        while (boucle){
            if (sc.hasNextInt()) {
                nbtas = sc.nextInt();
                if (nbtas >= 1) {
                    boucle = false;
                }
                else{
                    System.out.println("Une erreur a été faite");
                }
        }
            else{
                System.out.println("Une erreur a été faite");
            }
    }

        }
    public void Contrainte(){
        boolean boucle=true;
        while(boucle){
        Scanner sc = new Scanner(System.in);
        System.out.println("Voulez vous jouer avec une contrainte sur le nombre d'allumettes a retirer au max 0 pour ne pas en avoir");
        if (sc.hasNextInt()) {
        nbContrainte = sc.nextInt();
        if (nbContrainte >= 0) {
            boucle=false;
        }
        else
            System.out.println("Une erreur a été faite Contrainte doit etre positive");
        }
    }
    }

    public void Rota(){
        boolean boucle=true;
        while(boucle){
        Scanner sc=new Scanner(System.in);
        System.out.println("Voulez vous placer un pion dite j ou faire une rotation dite r ?");
        if(sc.hasNext()){
            rotaChoix= sc.next();
            if(rotaChoix.equals("j")){
                boucle=false;
            }
            else if( rotaChoix.equals("r")){
                boucle=false;
            }
            else
                System.out.println("Une erreur a été faite");
        }
        else
            System.out.println("Une erreur a été faite");

    }
    }
    public void Sens(){
        boolean boucle=true;
        while(boucle){
            Scanner sc=new Scanner(System.in);
            System.out.println("Gauche=g ou droite=d");
            if(sc.hasNext()){
                Sens= sc.next();
                if(Sens.equals("g")){
                    boucle=false;
                }
                else if( Sens.equals("d")){
                    boucle=false;
                }
                else
                    System.out.println("Une erreur a été faite");
            }
            else
                System.out.println("Une erreur a été faite");

        }
    }


    public void CoupNim(String actuel){
        boolean boucle=true;
        while (boucle){
            System.out.println(actuel + " " + "a vous de jouer un coup sous la forme 'm n' où m est le tas choisi et n le nombre d'allumettes à retirer dans ce tas");
            System.out.println("Veuillez choisir une ligne non vide");
            System.out.println("Veuillez choisir le nombre d'allumettes a retirer");
            Scanner sc = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            if (sc.hasNextInt() && sc2.hasNextInt()) {
                a = sc.nextInt();
                b = sc2.nextInt();
                boucle=false;
            }
            else {
                System.out.println("Une erreur a été faite");
            }
        }
    }

    public void ChoixRota(){
        boolean boucle=true;
        while(boucle){
        Scanner sc=new Scanner(System.in);
        System.out.println("Voulez vous jouer avec des rotations oui ou non ?");
        if(sc.hasNext()){
            rota= sc.next();
        if(rota.equals("oui")){
            boucle=false;
        }
        else if( rota.equals("non")){
            boucle=false;
        }
        else
            System.out.println("Une erreur a été faite");
        }
        else
            System.out.println("Une erreur a été faite");


    }
    }

public void AfficherRota(int nbrota){
        System.out.println("il vous reste "+nbrota+" rotations");
}

public void afficherErreur(){
        System.out.println("Une erreur a été faite");
    }

    public void afficheGrille(Grille grille){
        System.out.println(grille);
    }
    public void afficherTas(String tas){
        System.out.println(tas);
    }

        public void afficheGagnant(String actuel){
        System.out.println("Le gagnant est"+" "+actuel);
        }

        public void rejouer(){
        boolean boucle=true;
        while(boucle){
        Scanner sc=new Scanner(System.in);
            System.out.println("Voulez vous rejouez oui ou non ?");
        if(sc.hasNext()){
            String test= sc.next();
            if(test.equals("oui") || test.equals("non")){
                choix=test;
                boucle=false;
            }
            else
                System.out.println("Une erreur a été faite");
        }
        else {
            System.out.println("Une erreur a été faite");
        }
        }
}
public void fin(String actuel){
        System.out.println("Le gagnant est "+actuel);
}
public void égalité(){
        System.out.println("ex aequo");
}
public void afficherNbpartie(String joueur,int nbpartie){
        System.out.println("Le joueur "+joueur+" "+"a gagné "+nbpartie+" fois");
}
    }




