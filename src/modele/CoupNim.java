package modele;

/**
 * Created by kahlem .
 * Classe permettant d'enregistrer un coup
 *
 * @author lkahlem
 */
public class CoupNim {
    private int numeroTas;
    private int nbAllumettes;


    public CoupNim(int numeroTas, int nbAllumettes) {
        this.numeroTas = numeroTas;
        this.nbAllumettes = nbAllumettes;
    }


    public int getNumeroTas() {

        return numeroTas;
    }

    public int getNbAllumettes() {

        return nbAllumettes;
    }


}


