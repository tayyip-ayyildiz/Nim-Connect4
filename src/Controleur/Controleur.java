package Controleur;

import modele.*;
import vue.Ihm;

import java.util.Random;

public class Controleur implements Interface{
    private Tas tas;
    public Ihm ihm;
    private CoupNim Coup;
    private Joueur JoueurActuel;
    private Joueur nomJ1;
    private Joueur nomJ2;
    private Joueur ia;
    public Grille LaGrille;
    private String joueurActuel;
    private CoupP4 coup;
    private boolean reini=true;
    private Random numAlea;

    public Joueur getIa() {
        return ia;
    }

    public Joueur getNomJ1() {
        return nomJ1;
    }

    public Joueur getNomJ2() {
        return nomJ2;
    }

    public Controleur(Ihm ihm){
        this.ihm=ihm;
    }


    public void FinP4(){
        joueurActuel= LaGrille.getJouerActuel();
        if(ihm.getChoix2().equals("deux")){
            if(joueurActuel.equals("J1")){
                joueurActuel= nomJ1.getNom();
            }
            else{
                joueurActuel = nomJ2.getNom();
            }
            if(joueurActuel.equals(nomJ1.getNom())){
                nomJ1.gagnePartie();
                ihm.afficheGagnant(nomJ1.getNom());
                ihm.rejouer();
                if(ihm.getChoix().equals("oui")){
                    LaGrille=new Grille();
                    LaGrille.initialiser();
                    jouerP4();

                }
                else if (ihm.getChoix().equals("non")){
                    if(nomJ2.getNbPartiesGagnees()== nomJ1.getNbPartiesGagnees()){
                        ihm.égalité();
                    }
                    else if(nomJ2.getNbPartiesGagnees() > nomJ1.getNbPartiesGagnees()){
                        ihm.fin(nomJ2.getNom());
                        ihm.afficherNbpartie(nomJ2.getNom(), nomJ2.getNbPartiesGagnees());
                    }
                    else {
                        ihm.fin(nomJ1.getNom());
                        ihm.afficherNbpartie(nomJ1.getNom(), nomJ1.getNbPartiesGagnees());
                    }
                }
            }
            else{
                nomJ2.gagnePartie();
                ihm.afficheGagnant(nomJ2.getNom());
                ihm.rejouer();
                if(ihm.getChoix().equals("oui")){
                    LaGrille=new Grille();
                    LaGrille.initialiser();
                    jouerP4();
                }
                else if (ihm.getChoix().equals("non")){
                    if(nomJ2.getNbPartiesGagnees()== nomJ1.getNbPartiesGagnees()){
                        ihm.égalité();
                    }
                    else if(nomJ2.getNbPartiesGagnees() > nomJ1.getNbPartiesGagnees()){
                        ihm.fin(nomJ2.getNom());
                        ihm.afficherNbpartie(nomJ2.getNom(), nomJ2.getNbPartiesGagnees());
                    }
                    else {
                        ihm.fin(nomJ1.getNom());
                        ihm.afficherNbpartie(nomJ1.getNom(), nomJ1.getNbPartiesGagnees());
                    }

                }
            }
        }
        else{
            if(joueurActuel.equals("J1")){
                joueurActuel= nomJ1.getNom();
            }
            else{
                joueurActuel = ia.getNom();
            }
            if(joueurActuel.equals(nomJ1.getNom())){
                nomJ1.gagnePartie();
                ihm.afficheGagnant(nomJ1.getNom());
                ihm.rejouer();
                if(ihm.getChoix().equals("oui")){
                    LaGrille=new Grille();
                    LaGrille.initialiser();
                    jouerP4();

                }
                else if (ihm.getChoix().equals("non")){
                    if(ia.getNbPartiesGagnees()== nomJ1.getNbPartiesGagnees()){
                        ihm.égalité();
                    }
                    else if(ia.getNbPartiesGagnees() > nomJ1.getNbPartiesGagnees()){
                        ihm.fin(ia.getNom());
                        ihm.afficherNbpartie(ia.getNom(), ia.getNbPartiesGagnees());
                    }
                    else {
                        ihm.fin(nomJ1.getNom());
                        ihm.afficherNbpartie(nomJ1.getNom(), nomJ1.getNbPartiesGagnees());
                    }
                }
            }
            else{
                ia.gagnePartie();
                ihm.afficheGagnant(ia.getNom());
                ihm.rejouer();
                if(ihm.getChoix().equals("oui")){
                    LaGrille=new Grille();
                    LaGrille.initialiser();
                    jouerP4();
                }
                else if (ihm.getChoix().equals("non")){
                    if(ia.getNbPartiesGagnees()== nomJ1.getNbPartiesGagnees()){
                        ihm.égalité();
                    }
                    else if(ia.getNbPartiesGagnees() > nomJ1.getNbPartiesGagnees()){
                        ihm.fin(ia.getNom());
                        ihm.afficherNbpartie(ia.getNom(), ia.getNbPartiesGagnees());
                    }
                    else {
                        ihm.fin(nomJ1.getNom());
                        ihm.afficherNbpartie(nomJ1.getNom(), nomJ1.getNbPartiesGagnees());
                    }

                }
            }
        }
    }

    public void FinNim() {
        if (ihm.getChoix2().equals("deux")){
            if (JoueurActuel.equals(nomJ1)) {
                nomJ1.gagnePartie();
                ihm.afficheGagnant(nomJ1.getNom());
                ihm.rejouer();
                if (ihm.getChoix().equals("oui")) {
                    reini=false;
                    tas = new Tas(ihm.getNbtas());
                    tas.initialiser();
                    jouerNim();

                } else if (ihm.getChoix().equals("non")) {
                    if (nomJ2.getNbPartiesGagnees() == nomJ1.getNbPartiesGagnees()) {
                        ihm.égalité();
                    } else if (nomJ2.getNbPartiesGagnees() > nomJ1.getNbPartiesGagnees()) {
                        ihm.fin(nomJ2.getNom());
                        ihm.afficherNbpartie(nomJ2.getNom(), nomJ2.getNbPartiesGagnees());
                    } else {
                        ihm.fin(nomJ1.getNom());
                        ihm.afficherNbpartie(nomJ1.getNom(), nomJ1.getNbPartiesGagnees());
                    }
                }
            } else {
                nomJ2.gagnePartie();
                ihm.afficheGagnant(nomJ2.getNom());
                ihm.rejouer();
                if (ihm.getChoix().equals("oui")) {
                    reini=false;
                    tas = new Tas(ihm.getNbtas());
                    tas.initialiser();
                    jouerNim();
                } else if (ihm.getChoix().equals("non")) {
                    if (nomJ2.getNbPartiesGagnees() == nomJ1.getNbPartiesGagnees()) {
                        ihm.égalité();
                    } else if (nomJ2.getNbPartiesGagnees() > nomJ1.getNbPartiesGagnees()) {
                        ihm.fin(nomJ2.getNom());
                        ihm.afficherNbpartie(nomJ2.getNom(), nomJ2.getNbPartiesGagnees());
                    } else {
                        ihm.fin(nomJ1.getNom());
                        ihm.afficherNbpartie(nomJ1.getNom(), nomJ1.getNbPartiesGagnees());
                    }

                }

            }
    }
        else{
            if (JoueurActuel.equals(nomJ1)) {
                nomJ1.gagnePartie();
                ihm.afficheGagnant(nomJ1.getNom());
                ihm.rejouer();
                if (ihm.getChoix().equals("oui")) {
                    reini=false;
                    tas = new Tas(ihm.getNbtas());
                    tas.initialiser();
                    jouerNim();

                } else if (ihm.getChoix().equals("non")) {
                    if (ia.getNbPartiesGagnees() == nomJ1.getNbPartiesGagnees()) {
                        ihm.égalité();
                    } else if (ia.getNbPartiesGagnees() > nomJ1.getNbPartiesGagnees()) {
                        ihm.fin(ia.getNom());
                        ihm.afficherNbpartie(ia.getNom(), ia.getNbPartiesGagnees());
                    } else {
                        ihm.fin(nomJ1.getNom());
                        ihm.afficherNbpartie(nomJ1.getNom(), nomJ1.getNbPartiesGagnees());
                    }
                }
            } else {
                ia.gagnePartie();
                ihm.afficheGagnant(ia.getNom());
                ihm.rejouer();
                if (ihm.getChoix().equals("oui")) {
                    reini=false;
                    tas = new Tas(ihm.getNbtas());
                    tas.initialiser();
                    jouerNim();
                } else if (ihm.getChoix().equals("non")) {
                    if (ia.getNbPartiesGagnees() == nomJ1.getNbPartiesGagnees()) {
                        ihm.égalité();
                    } else if (ia.getNbPartiesGagnees() > nomJ1.getNbPartiesGagnees()) {
                        ihm.fin(ia.getNom());
                        ihm.afficherNbpartie(ia.getNom(), ia.getNbPartiesGagnees());
                    } else {
                        ihm.fin(nomJ1.getNom());
                        ihm.afficherNbpartie(nomJ1.getNom(), nomJ1.getNbPartiesGagnees());
                    }

                }

            }
        }

    }

    public void initialiserGrille(){
        LaGrille=new Grille();
        LaGrille.initialiser();
    }

    @Override
    public void initialiserTas() {
        ihm.Tas();
        tas = new Tas(ihm.getNbtas());
        tas.initialiser();
    }

    public void Initialiser() {
        ihm.creationPartie();
        if(ihm.getChoix2().equals("deux")) {
            nomJ1 = new Joueur(ihm.getNom1());
            nomJ2 = new Joueur(ihm.getNom2());

        }
        else{
            nomJ1 = new Joueur(ihm.getNom1());
            ia=new Joueur("ia");
        }
    }

    public void jouerP4() {
        initialiserGrille();
        boolean boucleR=true;
        boolean boucleJ=true;
        ihm.ChoixRota();
        if(ihm.getChoix2().equals("deux")){
            if(ihm.getRota().equals("non")){
                while(LaGrille.partieTerminee(nomJ1.getNom())==false) {
                    while (boucleR) {
                        joueurActuel = nomJ1.getNom();
                        ihm.Coup(joueurActuel, LaGrille);
                        coup = new CoupP4(ihm.getA());
                        try {
                            LaGrille.gererCoup(coup, "J1");
                            ihm.afficheGrille(LaGrille);
                            boucleR = false;
                            boucleJ = true;
                        }
                        catch (CoupInvalideException e) {
                            ihm.afficherErreur();
                        }
                    }
                    if(LaGrille.partieTerminee(nomJ2.getNom())==false){
                        while(boucleJ){
                            joueurActuel = nomJ2.getNom();
                            ihm.Coup(joueurActuel, LaGrille);
                            coup = new CoupP4(ihm.getA());
                            try {
                                LaGrille.gererCoup(coup, "J2");
                                ihm.afficheGrille(LaGrille);
                                boucleR=true;
                                boucleJ=false;
                            } catch (CoupInvalideException e) {
                                ihm.afficherErreur();
                            }
                        }
                    }
                    else{
                        break;
                    }
                }
            }
            else{
                while(LaGrille.partieTerminee(nomJ1.getNom())==false) {
                    while(boucleR){
                        joueurActuel = nomJ1.getNom();
                        if(nomJ1.getNbRota()!=0){
                            ihm.AfficherJoueur(joueurActuel);
                            ihm.Rota();
                            if(ihm.getRotaChoix().equals("j")){
                                ihm.Coup(joueurActuel, LaGrille);
                                coup = new CoupP4(ihm.getA());
                                try {
                                    LaGrille.gererCoup(coup, "J1");
                                    ihm.afficheGrille(LaGrille);
                                    boucleR=false;
                                    boucleJ=true;
                                } catch (CoupInvalideException e) {
                                    ihm.afficherErreur();
                                }
                            }
                            else{
                                ihm.Sens();
                                if(ihm.getSens().equals("d")){
                                    LaGrille.çaTourneD(LaGrille);
                                    ihm.afficheGrille(LaGrille);
                                    boucleR=false;
                                    boucleJ=true;
                                    nomJ1.EffectueRota();
                                    ihm.AfficherRota(nomJ1.getNbRota());
                                }
                                else{
                                    LaGrille.çaTourneG(LaGrille);
                                    ihm.afficheGrille(LaGrille);
                                    boucleR=false;
                                    boucleJ=true;
                                    nomJ1.EffectueRota();
                                    ihm.AfficherRota(nomJ1.getNbRota());
                                }
                            }
                        }
                        else{
                            ihm.Coup(joueurActuel, LaGrille);
                            coup = new CoupP4(ihm.getA());
                            try {
                                LaGrille.gererCoup(coup, "J1");
                                ihm.afficheGrille(LaGrille);
                                boucleR=false;
                                boucleJ=true;
                            } catch (CoupInvalideException e) {
                                ihm.afficherErreur();
                            }

                        }
                    }
                    if(LaGrille.partieTerminee(nomJ2.getNom())==false){
                        while(boucleJ){
                            joueurActuel = nomJ2.getNom();
                            if(nomJ2.getNbRota()!=0){
                                ihm.AfficherJoueur(joueurActuel);
                                ihm.Rota();
                                if(ihm.getRotaChoix().equals("j")){
                                    ihm.Coup(joueurActuel, LaGrille);
                                    coup = new CoupP4(ihm.getA());
                                    try {
                                        LaGrille.gererCoup(coup, "J2");
                                        ihm.afficheGrille(LaGrille);
                                        boucleR=true;
                                        boucleJ=false;
                                    } catch (CoupInvalideException e) {
                                        ihm.afficherErreur();
                                    }
                                }
                                else{

                                    ihm.Sens();
                                    if(ihm.getSens().equals("d")){
                                        LaGrille.çaTourneD(LaGrille);
                                        ihm.afficheGrille(LaGrille);
                                        boucleR=true;
                                        boucleJ=false;
                                        nomJ2.EffectueRota();
                                        ihm.AfficherRota(nomJ2.getNbRota());
                                    }
                                    else{
                                        LaGrille.çaTourneG(LaGrille);
                                        ihm.afficheGrille(LaGrille);
                                        boucleR=true;
                                        boucleJ=false;
                                        nomJ2.EffectueRota();
                                        ihm.AfficherRota(nomJ2.getNbRota());
                                    }
                                }
                            }
                            else{
                                ihm.Coup(joueurActuel, LaGrille);
                                coup = new CoupP4(ihm.getA());
                                try {
                                    LaGrille.gererCoup(coup, "J2");
                                    ihm.afficheGrille(LaGrille);
                                    boucleR=true;
                                    boucleJ=false;
                                } catch (CoupInvalideException e) {
                                    ihm.afficherErreur();
                                }
                            }
                        }
                    }
                    else{
                        break;
                    }
                }
            }
        }
        else{
            numAlea= new Random();
            int Numjeu=0;
            int num=numAlea.nextInt(3)+1;
            if(ihm.getRota().equals("non")){
                while(LaGrille.partieTerminee(nomJ1.getNom())==false) {
                    while (boucleR) {
                        joueurActuel = nomJ1.getNom();
                        ihm.Coup(joueurActuel, LaGrille);
                        coup = new CoupP4(ihm.getA());
                        try {
                            LaGrille.gererCoup(coup, "J1");
                            ihm.afficheGrille(LaGrille);
                            boucleR = false;
                            boucleJ = true;
                        }
                        catch (CoupInvalideException e) {
                            ihm.afficherErreur();
                        }
                    }
                    if(LaGrille.partieTerminee(ia.getNom())==false){
                        while(boucleJ){
                            num=numAlea.nextInt(3)+1;
                            joueurActuel = ia.getNom();
                            Numjeu=LaGrille.CoupIaOpti(num);
                            if(Numjeu==7){
                                coup = new CoupP4(LaGrille.getColonneIa());
                                try {
                                    LaGrille.gererCoupIa(coup, "J1");
                                    ihm.afficheGrille(LaGrille);
                                    boucleR = true;
                                    boucleJ = false;
                                }
                                catch (CoupInvalideException e) {
                                    ihm.afficherErreur();
                                }
                            }
                            else if(Numjeu==6){
                                coup = new CoupP4(LaGrille.getColonneIa());
                                try {
                                    LaGrille.gererCoupIa(coup, "Ia");
                                    ihm.afficheGrille(LaGrille);
                                    boucleR = true;
                                    boucleJ = false;
                                }
                                catch (CoupInvalideException e) {
                                    ihm.afficherErreur();
                                }}
                            else if(Numjeu==5){
                                coup = new CoupP4(LaGrille.getColonneIa());
                                try {
                                    LaGrille.gererCoupIa(coup, "Ia");
                                    ihm.afficheGrille(LaGrille);
                                    boucleR = true;
                                    boucleJ = false;
                                }
                                catch (CoupInvalideException e) {
                                    ihm.afficherErreur();
                                }
                            }
                            else if(Numjeu==4){
                                coup = new CoupP4(LaGrille.getColonneIa());
                                try {
                                    LaGrille.gererCoupIa(coup, "Ia");
                                    ihm.afficheGrille(LaGrille);
                                    boucleR = true;
                                    boucleJ = false;
                                }
                                catch (CoupInvalideException e) {
                                    ihm.afficherErreur();
                                }
                            }
                            else if(Numjeu==3){
                                coup = new CoupP4(LaGrille.getColonneIa());
                                try {
                                    LaGrille.gererCoupIa(coup, "Ia");
                                    ihm.afficheGrille(LaGrille);
                                    boucleR = true;
                                    boucleJ = false;
                                }
                                catch (CoupInvalideException e) {
                                    ihm.afficherErreur();
                                }
                            }
                            else if(Numjeu==2){
                                coup = new CoupP4(LaGrille.getColonneIa());
                                try {
                                    LaGrille.gererCoupIa(coup, "Ia");
                                    ihm.afficheGrille(LaGrille);
                                    boucleR = true;
                                    boucleJ = false;
                                }
                                catch (CoupInvalideException e) {
                                    ihm.afficherErreur();
                                }
                            }
                            else{
                                coup = new CoupP4(LaGrille.getColonneIa());
                                try {
                                    LaGrille.gererCoupIa(coup, "Ia");
                                    ihm.afficheGrille(LaGrille);
                                    boucleR = true;
                                    boucleJ = false;
                                }
                                catch (CoupInvalideException e) {
                                    ihm.afficherErreur();
                                }
                            }
                        }
                    }
                    else{
                        joueurActuel="Ia";
                        break;
                    }
                }
            }
            else{
                while(LaGrille.partieTerminee(nomJ1.getNom())==false) {
                    while(boucleR){
                        joueurActuel = nomJ1.getNom();
                        if(nomJ1.getNbRota()!=0){
                            ihm.AfficherJoueur(joueurActuel);
                            ihm.Rota();
                            if(ihm.getRotaChoix().equals("j")){
                                ihm.Coup(joueurActuel, LaGrille);
                                coup = new CoupP4(ihm.getA());
                                try {
                                    LaGrille.gererCoup(coup, "J1");
                                    ihm.afficheGrille(LaGrille);
                                    boucleR=false;
                                    boucleJ=true;
                                } catch (CoupInvalideException e) {
                                    ihm.afficherErreur();
                                }
                            }
                            else{
                                ihm.Sens();
                                if(ihm.getSens().equals("d")){
                                    LaGrille.çaTourneD(LaGrille);
                                    ihm.afficheGrille(LaGrille);
                                    boucleR=false;
                                    boucleJ=true;
                                    nomJ1.EffectueRota();
                                    ihm.AfficherRota(nomJ1.getNbRota());
                                }
                                else{
                                    LaGrille.çaTourneG(LaGrille);
                                    ihm.afficheGrille(LaGrille);
                                    boucleR=false;
                                    boucleJ=true;
                                    nomJ1.EffectueRota();
                                    ihm.AfficherRota(nomJ1.getNbRota());
                                }
                            }
                        }
                        else{
                            ihm.Coup(joueurActuel, LaGrille);
                            coup = new CoupP4(ihm.getA());
                            try {
                                LaGrille.gererCoup(coup, "J1");
                                ihm.afficheGrille(LaGrille);
                                boucleR=false;
                                boucleJ=true;
                            } catch (CoupInvalideException e) {
                                ihm.afficherErreur();
                            }

                        }
                    }
                    if(LaGrille.partieTerminee(ia.getNom())==false){
                        while(boucleJ){
                            joueurActuel = ia.getNom();
                            if(LaGrille.IaRota(LaGrille)==true){
                                if(LaGrille.getGouD().equals("D")){
                                    LaGrille.çaTourneD(LaGrille);
                                    boucleR=true;
                                    boucleJ=false;
                                }
                                else{
                                    LaGrille.çaTourneG(LaGrille);
                                    boucleR=true;
                                    boucleJ=false;
                                }
                            }
                            else{
                                Numjeu=LaGrille.CoupIa(num);
                                if(Numjeu==7){
                                    coup = new CoupP4(LaGrille.getColonneIa());
                                    try {
                                        LaGrille.gererCoupIa(coup, "J1");
                                        ihm.afficheGrille(LaGrille);
                                        boucleR = true;
                                        boucleJ = false;
                                    }
                                    catch (CoupInvalideException e) {
                                        ihm.afficherErreur();
                                    }
                                }

                                else if(Numjeu==6){
                                    coup = new CoupP4(LaGrille.getColonneIa());
                                    try {
                                        LaGrille.gererCoupIa(coup, "J1");
                                        ihm.afficheGrille(LaGrille);
                                        boucleR = true;
                                        boucleJ = false;
                                    }
                                    catch (CoupInvalideException e) {
                                        ihm.afficherErreur();
                                    }
                                }
                                else if(Numjeu==5){
                                    if(LaGrille.IaRota(LaGrille)==true){
                                        num=numAlea.nextInt(3)+1;
                                        Numjeu=LaGrille.CoupIa(num);
                                    }
                                    else{
                                        coup = new CoupP4(LaGrille.getColonneIa());
                                        try {
                                            LaGrille.gererCoupIa(coup, "J1");
                                            ihm.afficheGrille(LaGrille);
                                            boucleR = true;
                                            boucleJ = false;
                                        }
                                        catch (CoupInvalideException e) {
                                            ihm.afficherErreur();
                                        }
                                    }
                                }
                                else if(Numjeu==4){
                                    if(LaGrille.IaRota(LaGrille)==true){
                                        num=numAlea.nextInt(3)+1;
                                        Numjeu=LaGrille.CoupIa(num);
                                    }
                                    else{
                                        coup = new CoupP4(LaGrille.getColonneIa());
                                        try {
                                            LaGrille.gererCoupIa(coup, "J1");
                                            ihm.afficheGrille(LaGrille);
                                            boucleR = true;
                                            boucleJ = false;
                                        }
                                        catch (CoupInvalideException e) {
                                            ihm.afficherErreur();
                                        }
                                    }
                                }
                                else if(Numjeu==3){
                                    if(LaGrille.IaRota(LaGrille)==true){
                                        num=numAlea.nextInt(3)+1;
                                        Numjeu=LaGrille.CoupIa(num);
                                    }
                                    else{
                                        coup = new CoupP4(LaGrille.getColonneIa());
                                        try {
                                            LaGrille.gererCoupIa(coup, "J1");
                                            ihm.afficheGrille(LaGrille);
                                            boucleR = true;
                                            boucleJ = false;
                                        }
                                        catch (CoupInvalideException e) {
                                            ihm.afficherErreur();
                                        }
                                    }
                                }
                                else if(Numjeu==2){
                                    if(LaGrille.IaRota(LaGrille)==true){
                                        num=numAlea.nextInt(3)+1;
                                        Numjeu=LaGrille.CoupIa(num);
                                    }
                                    else{
                                        coup = new CoupP4(LaGrille.getColonneIa());
                                        try {
                                            LaGrille.gererCoupIa(coup, "J1");
                                            ihm.afficheGrille(LaGrille);
                                            boucleR = true;
                                            boucleJ = false;
                                        }
                                        catch (CoupInvalideException e) {
                                            ihm.afficherErreur();
                                        }
                                    }
                                }
                                else{
                                    if(LaGrille.IaRota(LaGrille)==true){
                                        num=numAlea.nextInt(3)+1;
                                        Numjeu=LaGrille.CoupIa(num);
                                    }
                                    else{
                                        coup = new CoupP4(LaGrille.getColonneIa());
                                        try {
                                            LaGrille.gererCoupIa(coup, "J1");
                                            ihm.afficheGrille(LaGrille);
                                            boucleR = true;
                                            boucleJ = false;
                                        }
                                        catch (CoupInvalideException e) {
                                            ihm.afficherErreur();
                                        }
                                    }
                                }
                            }
                        }
                    }

                    else{
                        break;
                    }
                }
            }
        }
        FinP4();
    }

    public void jouerNim(){
        if(reini){
        initialiserTas();
        }
        if(ihm.getChoix2().equals("deux")){
        boolean boucle1=true;
        boolean boucle2=false;
        ihm.Contrainte();
        tas.nbCoups(ihm.getNbContrainte());
        while(tas.partieTerminee()==false){
            while(boucle1){
                ihm.afficherTas(tas.toString());
                ihm.CoupNim(nomJ1.getNom());
                Coup=new CoupNim(ihm.getA(),ihm.getB());
                try {
                    tas.gererCoup(Coup,ihm.getNbContrainte());
                    JoueurActuel=getNomJ1();
                    boucle1=false;
                    boucle2=true;
                } catch (CoupInvalideException e) {
                    ihm.afficherErreur();
                }
            }
            while(boucle2){
                if(tas.partieTerminee()==false){
                    ihm.afficherTas(tas.toString());
                    ihm.CoupNim(nomJ2.getNom());
                    Coup=new CoupNim(ihm.getA(),ihm.getB());
                    try {
                        tas.gererCoup(Coup,ihm.getNbContrainte());
                        JoueurActuel=getNomJ2();
                        boucle2=false;
                        boucle1=true;
                    } catch (CoupInvalideException e) {
                        ihm.afficherErreur();
                    }
                }
                else
                    break;
            }
        }
        }



        else{
            boolean boucle1=true;
            boolean boucle2=false;
            ihm.Contrainte();
            while(tas.partieTerminee()==false){
                while(boucle1){
                    ihm.afficherTas(tas.toString());
                    ihm.CoupNim(nomJ1.getNom());
                    Coup=new CoupNim(ihm.getA(),ihm.getB());
                    try {
                        tas.gererCoup(Coup,ihm.getNbContrainte());
                        JoueurActuel=getNomJ1();
                        boucle1=false;
                        boucle2=true;
                    } catch (CoupInvalideException e) {
                        ihm.afficherErreur();
                    }
                }
                while(boucle2){
                    if(tas.partieTerminee()==false){
                       tas.nbCoups(ihm.getNbContrainte());
                        Coup=new CoupNim(tas.getNumT(), tas.getNumJ());
                        try {
                            tas.gererCoup(Coup,ihm.getNbContrainte());
                            JoueurActuel=getIa();
                            boucle2=false;
                            boucle1=true;
                        } catch (CoupInvalideException e) {
                            ihm.afficherErreur();
                        }
                    }
                    else
                        break;
                }
            }

        }
        FinNim();

}
}
