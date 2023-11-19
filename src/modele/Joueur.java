package modele;

import java.util.Objects;

/**
 * Created by kahlem .
 */
public class Joueur {
    private String nom;
    private int nbPartiesGagnees;
    private int nbRota=4;

    public void setNbRota(int nbRota) {
        this.nbRota = nbRota;
    }

    public int getNbRota() {
        return nbRota;
    }

    public Joueur(String nom) {
        this.nom = nom;
    }

    public String getNom() {

        return nom;
    }

    public int getNbPartiesGagnees() {
        return nbPartiesGagnees;
    }

    public void gagnePartie() {
        nbPartiesGagnees++;
    }

    public void EffectueRota(){
        nbRota--;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Joueur joueur = (Joueur) o;
        return nbPartiesGagnees == joueur.nbPartiesGagnees && Objects.equals(nom, joueur.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, nbPartiesGagnees);
    }
}

