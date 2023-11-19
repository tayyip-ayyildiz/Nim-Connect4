package modele;

import java.util.Random;

public class Tas  {

    private int[] lesTas;
    private int[] nbCoup;
    private Random NumAlea;
    private int numT;
    private int numJ;

    public int getNumT() {
        return numT;
    }
    public int getNumJ() {
        return numJ;
    }

    public int[] getNbCoup() {
        return nbCoup;
    }
    public Tas(int nbTas){
        nbCoup=new  int[nbTas];
        lesTas = new int[nbTas];
        NumAlea= new Random();
    }

    public void initialiser(){
        for (int i = 0; i < lesTas.length; i++) {
            lesTas[i] = 2 * i + 1;
        }
    }


    public boolean partieTerminee() {

        return nbAllumette() == 0;
    }

    public int nbAllumettes(int numeroTas) {

        return lesTas[numeroTas - 1];
    }


    public int nbAllumette(){

    int total = 0;
    for (int nb : lesTas)
        total+=nb;
    return total;
    }

    @Override
    public String toString() {
        String s="";
        for (int nbAllumettes : lesTas) {
            for (int i = 1; i <= nbAllumettes; i++) {
                s+="| ";
            }
           s+="\n";
        }
        return s;
    }


    public void gererCoup(CoupNim coup,int contrainte) throws CoupInvalideException {
        int numeroTas= coup.getNumeroTas();
        int nb = coup.getNbAllumettes();

        if (numeroTas >= 1 && numeroTas <= lesTas.length && nb >= 1 && nb <= nbAllumettes(numeroTas)) {
            if(contrainte==0) {
                lesTas[numeroTas - 1] -= nb;
            }
            else if(nb<=contrainte){
                lesTas[numeroTas - 1] -= nb;
            }
            else {
                throw new CoupInvalideException("Le coup est invalide, rejouez");
            }

        }
        else {
            throw new CoupInvalideException("Le coup est invalide, rejouez");
        }
    }

    public void nbCoups(int contrainte){
        for(int i=0;i<lesTas.length;i++){
            if(lesTas[i]<=contrainte){
                nbCoup[i]=lesTas[i];
            }
            else if (contrainte==0){
                nbCoup[i]=lesTas[i];
            }
            else{
                nbCoup[i]=contrainte;
            }
        }
        numT=NumAlea.nextInt(nbCoup.length)+1;
        while(lesTas[numT-1]==0){
            numT=NumAlea.nextInt(nbCoup.length)+1;
        }
        numJ=NumAlea.nextInt(nbCoup[numT-1])+1;
        while(lesTas[numT-1]<numJ){
            numJ=NumAlea.nextInt(nbCoup[numT-1])+1;
        }

    }
    }
