package main;



import vue.Ihm;
import Controleur.Controleur;

public class Main {
    public static void main(String[] args) {
        Ihm ihm=new Ihm();
        ihm.quelJeu();
        if(ihm.getChoix().equals("nim")){
            Controleur control=new Controleur(ihm);
            control.Initialiser();
            control.jouerNim();
        }

        else{
            Controleur control=new Controleur(ihm);
            control.Initialiser();
            control.jouerP4();
        }


    }

}
