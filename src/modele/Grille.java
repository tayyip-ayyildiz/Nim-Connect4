package modele;



public class Grille  {
    String[][] laGrille;
    private String jouerActuel;
    private String GouD;
    private int colonneIa;

    public int getColonneIa() {
        return colonneIa;
    }

    public String getGouD() {
        return GouD;
    }

    public String getJouerActuel() {
        return jouerActuel;
    }

    public Grille(){
        laGrille = new String[7][7];
    }

    public void initialiser(){
        for (int h = 0;h < laGrille.length; h++) {
            for (int f = 0;f < laGrille[h].length;f++) {
                laGrille[h][f] ="[ ]";
            }
        }
    }

    public String RecupElement(int Colonne,int Ligne){
        return laGrille[Colonne][Ligne];
    }

    public boolean partieTerminee(String JoueurActuel){
        for (int c = 0;c < laGrille.length; c++) {
            for (int l = 0;l < laGrille.length;l++) {
                if(l<3 && c<4){
                    if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c + 1].equals("[R]") && laGrille[l + 2][c + 2].equals("[R]") && laGrille[l + 3][c + 3].equals("[R]")) {
                        jouerActuel="J1";
                        return true; // diagonale droite de haut en bas
                    }
                    else if (laGrille[l][c].equals("[R]") && laGrille[l][c+1].equals("[R]") && laGrille[l][c+2].equals("[R]") && laGrille[l][c+3].equals("[R]")) {
                        jouerActuel="J1";
                        return true; // horizontale de gauche a droite
                    }
                    else if (laGrille[l][c].equals("[R]") && laGrille[l+1][c].equals("[R]") && laGrille[l+2][c].equals("[R]") && laGrille[l+3][c].equals("[R]")) {
                        jouerActuel="J1";
                        return true; // verticale de haut en bas
                    }
                    else if(laGrille[l][c].equals("[J]") && laGrille[l + 1][c + 1].equals("[J]") && laGrille[l + 2][c + 2].equals("[J]") && laGrille[l + 3][c + 3].equals("[J]")){
                        jouerActuel="J2";
                        return true; // diagonale droite de haut en bas
                    }
                    else if (laGrille[l][c].equals("[J]") && laGrille[l][c+1].equals("[J]") && laGrille[l][c+2].equals("[J]") && laGrille[l][c+3].equals("[J]")) {
                        jouerActuel="J2";
                        return true; // horizontale de gauche a droite
                    }
                    else if (laGrille[l][c].equals("[J]") && laGrille[l+1][c].equals("[J]") && laGrille[l+2][c].equals("[J]") && laGrille[l+3][c].equals("[J]")) {
                        jouerActuel="J2";
                        return true; // verticale de haut en bas
                    }
                }
                else if(l==3 && c<4){
                    if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c + 1].equals("[R]") && laGrille[l + 2][c + 2].equals("[R]") && laGrille[l + 3][c + 3].equals("[R]")) {
                        jouerActuel="J1";
                        return true; // diagonale droite de haut en bas
                    }
                    else if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[R]") && laGrille[l - 3][c + 3].equals("[R]")) {
                        jouerActuel="J1";
                        return true; // diagonale droite de bas en haut
                    }
                    else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[R]") && laGrille[l][c + 3].equals("[R]")) {
                        jouerActuel="J1";
                        return true;
                    }
                    else if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c].equals("[R]") && laGrille[l + 2][c].equals("[R]") && laGrille[l + 3][c].equals("[R]")) {
                        jouerActuel="J1";
                        return true;
                    }
                    else if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c + 1].equals("[J]") && laGrille[l + 2][c + 2].equals("[J]") && laGrille[l + 3][c + 3].equals("[J]")) {
                        jouerActuel="J2";
                        return true; // diagonale droite de haut en bas
                    }
                    else if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[J]") && laGrille[l - 3][c + 3].equals("[J]")) {
                        jouerActuel="J2";
                        return true; // diagonale droite de bas en haut
                    }
                    else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[J]") && laGrille[l][c + 3].equals("[J]")) {
                        jouerActuel="J2";
                        return true;
                    }
                    else if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c].equals("[J]") && laGrille[l + 2][c].equals("[J]") && laGrille[l + 3][c].equals("[J]")) {
                        jouerActuel="J2";
                        return true;
                    }
                }
                else if(l==4 && c<4){
                     if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[R]") && laGrille[l - 3][c + 3].equals("[R]")) {
                         jouerActuel="J1";
                         return true; // diagonale droite de bas en haut
                    }
                     else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[R]") && laGrille[l][c + 3].equals("[R]")) {
                         jouerActuel="J1";
                         return true;
                     }
                    else if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[J]") && laGrille[l - 3][c + 3].equals("[J]")) {
                         jouerActuel="J2";
                        return true; // diagonale droite de bas en haut
                    }
                     else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[J]") && laGrille[l][c + 3].equals("[J]")) {
                         jouerActuel="J2";
                         return true;
                     }

                }
                else if(l>=5 && c<4){
                    if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[R]") && laGrille[l - 3][c + 3].equals("[R]")) {
                        jouerActuel="J1";
                        return true; // diagonale droite de bas en haut
                    }
                    else if (laGrille[l][c].equals("[R]") && laGrille[l][c+1].equals("[R]") && laGrille[l][c+2].equals("[R]") && laGrille[l][c+3].equals("[R]")) {
                        jouerActuel="J1";
                        return true;
                    }
                    else if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[J]") && laGrille[l - 3][c + 3].equals("[J]")) {
                        jouerActuel="J2";
                        return true; // diagonale droite de bas en haut
                    }
                    else if (laGrille[l][c].equals("[J]") && laGrille[l][c+1].equals("[J]") && laGrille[l][c+2].equals("[J]") && laGrille[l][c+3].equals("[J]")) {
                        jouerActuel="J2";
                        return true;
                    }
                }
                else if(l<4 && c>=4){
                    if (laGrille[l][c].equals("[R]") && laGrille[l+1][c].equals("[R]") && laGrille[l+2][c].equals("[R]") && laGrille[l+3][c].equals("[R]")){
                        jouerActuel="J1";
                        return true;
                    }
                    else if (laGrille[l][c].equals("[J]") && laGrille[l+1][c].equals("[J]") && laGrille[l+2][c].equals("[J]") && laGrille[l+3][c].equals("[J]")){
                        jouerActuel="J2";
                        return true;
                    }
                }
        }

    }
        return false;
    }

    public boolean partieTermineeIA(String JoueurActuel, String[][] G){
        for (int c = 0;c < G.length; c++) {
            for (int l = 0;l < G.length;l++) {
                if(l<3 && c<4){
                    if (G[l][c].equals("[R]") && G[l + 1][c + 1].equals("[R]") && G[l + 2][c + 2].equals("[R]") && G[l + 3][c + 3].equals("[R]")) {
                        jouerActuel="J1";
                        return true; // diagonale droite de haut en bas
                    }
                    else if (G[l][c].equals("[R]") && G[l][c+1].equals("[R]") && G[l][c+2].equals("[R]") && G[l][c+3].equals("[R]")) {
                        jouerActuel="J1";
                        return true; // horizontale de gauche a droite
                    }
                    else if (G[l][c].equals("[R]") && G[l+1][c].equals("[R]") && G[l+2][c].equals("[R]") && G[l+3][c].equals("[R]")) {
                        jouerActuel="J1";
                        return true; // verticale de haut en bas
                    }
                    else if(G[l][c].equals("[J]") && G[l + 1][c + 1].equals("[J]") && G[l + 2][c + 2].equals("[J]") && G[l + 3][c + 3].equals("[J]")){
                        jouerActuel="J2";
                        return true; // diagonale droite de haut en bas
                    }
                    else if (G[l][c].equals("[J]") && G[l][c+1].equals("[J]") && G[l][c+2].equals("[J]") && G[l][c+3].equals("[J]")) {
                        jouerActuel="J2";
                        return true; // horizontale de gauche a droite
                    }
                    else if (G[l][c].equals("[J]") && G[l+1][c].equals("[J]") && G[l+2][c].equals("[J]") && G[l+3][c].equals("[J]")) {
                        jouerActuel="J2";
                        return true; // verticale de haut en bas
                    }
                }
                else if(l==3 && c<4){
                    if (G[l][c].equals("[R]") && G[l + 1][c + 1].equals("[R]") && G[l + 2][c + 2].equals("[R]") && G[l + 3][c + 3].equals("[R]")) {
                        jouerActuel="J1";
                        return true; // diagonale droite de haut en bas
                    }
                    else if (G[l][c].equals("[R]") && G[l - 1][c + 1].equals("[R]") && G[l - 2][c + 2].equals("[R]") && G[l - 3][c + 3].equals("[R]")) {
                        jouerActuel="J1";
                        return true; // diagonale droite de bas en haut
                    }
                    else if (G[l][c].equals("[R]") && G[l][c + 1].equals("[R]") && G[l][c + 2].equals("[R]") && G[l][c + 3].equals("[R]")) {
                        jouerActuel="J1";
                        return true;
                    }
                    else if (G[l][c].equals("[R]") && G[l + 1][c].equals("[R]") && G[l + 2][c].equals("[R]") && G[l + 3][c].equals("[R]")) {
                        jouerActuel="J1";
                        return true;
                    }
                    else if (G[l][c].equals("[J]") && G[l + 1][c + 1].equals("[J]") && G[l + 2][c + 2].equals("[J]") && G[l + 3][c + 3].equals("[J]")) {
                        jouerActuel="J2";
                        return true; // diagonale droite de haut en bas
                    }
                    else if (G[l][c].equals("[J]") && G[l - 1][c + 1].equals("[J]") && G[l - 2][c + 2].equals("[J]") && G[l - 3][c + 3].equals("[J]")) {
                        jouerActuel="J2";
                        return true; // diagonale droite de bas en haut
                    }
                    else if (G[l][c].equals("[J]") && G[l][c + 1].equals("[J]") && G[l][c + 2].equals("[J]") && G[l][c + 3].equals("[J]")) {
                        jouerActuel="J2";
                        return true;
                    }
                    else if (G[l][c].equals("[J]") && G[l + 1][c].equals("[J]") && G[l + 2][c].equals("[J]") && G[l + 3][c].equals("[J]")) {
                        jouerActuel="J2";
                        return true;
                    }
                }
                else if(l==4 && c<4){
                    if (G[l][c].equals("[R]") && G[l - 1][c + 1].equals("[R]") && G[l - 2][c + 2].equals("[R]") && G[l - 3][c + 3].equals("[R]")) {
                        jouerActuel="J1";
                        return true; // diagonale droite de bas en haut
                    }
                    else if (G[l][c].equals("[R]") && G[l][c + 1].equals("[R]") && G[l][c + 2].equals("[R]") && G[l][c + 3].equals("[R]")) {
                        jouerActuel="J1";
                        return true;
                    }
                    else if (G[l][c].equals("[J]") && G[l - 1][c + 1].equals("[J]") && G[l - 2][c + 2].equals("[J]") && G[l - 3][c + 3].equals("[J]")) {
                        jouerActuel="J2";
                        return true; // diagonale droite de bas en haut
                    }
                    else if (G[l][c].equals("[J]") && G[l][c + 1].equals("[J]") && G[l][c + 2].equals("[J]") && G[l][c + 3].equals("[J]")) {
                        jouerActuel="J2";
                        return true;
                    }

                }
                else if(l>=5 && c<4){
                    if (G[l][c].equals("[R]") && G[l - 1][c + 1].equals("[R]") && G[l - 2][c + 2].equals("[R]") && G[l - 3][c + 3].equals("[R]")) {
                        jouerActuel="J1";
                        return true; // diagonale droite de bas en haut
                    }
                    else if (G[l][c].equals("[R]") && G[l][c+1].equals("[R]") && G[l][c+2].equals("[R]") && G[l][c+3].equals("[R]")) {
                        jouerActuel="J1";
                        return true;
                    }
                    else if (G[l][c].equals("[J]") && G[l - 1][c + 1].equals("[J]") && G[l - 2][c + 2].equals("[J]") && G[l - 3][c + 3].equals("[J]")) {
                        jouerActuel="J2";
                        return true; // diagonale droite de bas en haut
                    }
                    else if (G[l][c].equals("[J]") && G[l][c+1].equals("[J]") && G[l][c+2].equals("[J]") && G[l][c+3].equals("[J]")) {
                        jouerActuel="J2";
                        return true;
                    }
                }
                else if(l<4 && c>=4){
                    if (G[l][c].equals("[R]") && G[l+1][c].equals("[R]") && G[l+2][c].equals("[R]") && G[l+3][c].equals("[R]")){
                        jouerActuel="J1";
                        return true;
                    }
                    else if (G[l][c].equals("[J]") && G[l+1][c].equals("[J]") && G[l+2][c].equals("[J]") && G[l+3][c].equals("[J]")){
                        jouerActuel="J2";
                        return true;
                    }
                }
            }

        }
        return false;
    }



    @Override
    public String toString(){
        String s="";
        for (int h = 0;h < laGrille.length; h++) {
            for (int f = 0;f < laGrille[h].length;f++) {
                s+=laGrille[h][f];
            }
            s+="\n";
        }
        return s;
    }

    public void gererCoup(CoupP4 coup,String joueur) throws CoupInvalideException {
        int numeroCol= coup.getNumeroColonne();
        if (numeroCol >= 0 && numeroCol <= laGrille.length) {
            for (int i = 6; i >= 0; i--) {
                if(laGrille[0][numeroCol-1].equals("[ ]")){
                if (laGrille[i][numeroCol-1].equals("[ ]")) {
                    if (joueur.equals("J1")) {
                        laGrille[i][numeroCol-1] = "[R]";
                        break;
                    } else if(joueur.equals("J2")) {
                        laGrille[i][numeroCol-1] = "[J]";
                        break;
                    }
                    else{
                        laGrille[i][numeroCol] = "[J]";
                        break;
                    }
                }
                }
                else{
                    throw new CoupInvalideException("Le coup est invalide, rejouez");
                }
                }



            }

        }

    public void gererCoupIa(CoupP4 coup,String joueur) throws CoupInvalideException {
        int numeroCol= coup.getNumeroColonne()+1;
        if (numeroCol >= 0 && numeroCol <= laGrille.length) {
            for (int i = 6; i >= 0; i--) {
                if(laGrille[0][numeroCol-1].equals("[ ]")){
                    if (laGrille[i][numeroCol-1].equals("[ ]")) {
                            laGrille[i][numeroCol-1] = "[J]";
                            break;
                    }
                }
                else{
                    throw new CoupInvalideException("Le coup est invalide, rejouez");
                }
            }



        }

    }
    public void çaTourneD(Grille G) { //rota droite
        String [][] laGrilleS=new String[7][7];
        //initialisation de la nouvelle grille
        for (int h = 0; h < laGrilleS.length; h++) {
            for (int f = 0; f < laGrilleS[h].length; f++) {
                laGrilleS[h][f] = "[ ]";
            }
        }

        for (int l = 0; l < laGrille.length; l++) {
            int nbRota=0;
            for (int c = 6; c >= 0; c--) {
                 if(laGrille[l][c].equals("[R]")) {
                    for(int k=6;k>=c;k--) {
                        if(laGrille[l][k].equals("[ ]"))
                            nbRota++;
                    }
                     laGrilleS[c + nbRota][6 - l] = "[R]";
                    nbRota=0;
                }
                else if(laGrille[l][c].equals("[J]")){
                    for(int k=6;k>=c;k--) {
                        if(laGrille[l][k].equals("[ ]"))
                            nbRota++;
                    }
                     laGrilleS[c + nbRota][6 - l] = "[J]";
                    nbRota=0;
                }

            }
        }
        laGrille=laGrilleS;
    }
    public void çaTourneG(Grille G) { //rota gauche
        String [][] laGrilleS=new String[7][7];
        //initialisation de la nouvelle grille
        for (int h = 0; h < laGrilleS.length; h++) {
            for (int f = 0; f < laGrilleS[h].length; f++) {
                laGrilleS[h][f] = "[ ]";
            }
        }

        for (int l = 0; l < laGrille.length; l++) {
            int nbRota=0;
            for (int c = 0; c <= 6; c++) {
                if(laGrille[l][c].equals("[R]")) {
                    for(int k=0;k<=c;k++) {
                        if(laGrille[l][k].equals("[ ]"))
                            nbRota++;
                    }
                    laGrilleS[6-c + nbRota][l] = "[R]";
                    nbRota=0;
                }
                else if(laGrille[l][c].equals("[J]")){
                    for(int k=0;k<=c;k++) {
                        if(laGrille[l][k].equals("[ ]"))
                            nbRota++;
                    }
                    laGrilleS[6-c + nbRota][l] = "[J]";
                    nbRota=0;
                }

            }
        }
        laGrille=laGrilleS;
    }


    public int CoupIa(int numero) {
        for (int c = 0; c < laGrille.length; c++) {
            for (int l = 0; l < laGrille.length; l++) {
                //Test si 4 peuvent s'aligner
                if (l < 3 && c < 4) {

                    // J1 peut gagner

                    if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c + 1].equals("[R]") && laGrille[l + 2][c + 2].equals("[R]") && laGrille[l + 3][c + 3].equals("[ ]") && !(laGrille[l + 4][c + 3].equals("[ ]"))) {
                        if(numero==1){
                            colonneIa=c+3;
                            return 6; // diagonale droite de haut en bas 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l + 1][c + 1].equals("[R]") && laGrille[l + 2][c + 2].equals("[R]") && laGrille[l + 3][c + 3].equals("[R]")) {
                        if(numero==1){
                            colonneIa=c;
                            return 6; // diagonale droite de haut en bas 2.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c + 1].equals("[ ]") && !(laGrille[l + 2][c + 1].equals("[ ]")) && laGrille[l + 2][c + 2].equals("[R]") && laGrille[l + 3][c + 3].equals("[R]")) {
                        if(numero==1){
                            colonneIa=c+1;
                            return 6; // diagonale droite de haut en bas 3.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c + 1].equals("[R]") && laGrille[l + 2][c + 2].equals("[ ]") && !(laGrille[l + 3][c + 2].equals("[ ]")) && laGrille[l + 3][c + 3].equals("[R]")) {
                        if(numero==1){
                            colonneIa=c+1;
                            return 6; // diagonale droite de haut en bas 4.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[R]") && laGrille[l][c + 3].equals("[ ]") && !(laGrille[l+1][c + 3].equals("[ ]"))) {
                        if(numero==1){
                            colonneIa=c+3;
                            return 6; // horizontale de gauche a droite 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[R]") && laGrille[l][c + 3].equals("[R]")) {
                        if(numero==1){
                            colonneIa=c+3;
                            return 6; // horizontale de gauche a droite 2.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l+1][c + 1].equals("[ ]")) && laGrille[l][c + 2].equals("[R]") && laGrille[l][c + 3].equals("[R]")) {
                        if(numero==1){
                            colonneIa=c+3;
                            return 6; // horizontale de gauche a droite 3.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[ ]") && !(laGrille[l+1][c + 2].equals("[ ]")) && laGrille[l][c + 3].equals("[R]")) {
                        if(numero==1){
                            colonneIa=c+2;
                            return 6; // horizontale de gauche a droite 4.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c].equals("[R]") && laGrille[l + 2][c].equals("[R]") && laGrille[l + 3][c].equals("[ ]")) {
                        if(numero==1){
                            colonneIa=c;
                            return 6; // verticale de haut en bas 1.
                        }}
                }

                else if (l == 3 && c < 4) {

                    // J1 peut gagner

                    if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c + 1].equals("[R]") && laGrille[l + 2][c + 2].equals("[R]") && laGrille[l + 3][c + 3].equals("[ ]")) {
                        if(numero==1){
                            colonneIa=c+3;
                            return 6; // diagonale droite de haut en bas 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l + 1][c + 1].equals("[R]") && laGrille[l + 2][c + 2].equals("[R]") && laGrille[l + 3][c + 3].equals("[R]")) {
                        if(numero==1){
                            colonneIa=c;
                            return 6; // diagonale droite de haut en bas 2.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c + 1].equals("[ ]") && !(laGrille[l + 2][c + 1].equals("[ ]")) && laGrille[l + 2][c + 2].equals("[R]") && laGrille[l + 3][c + 3].equals("[R]")) {
                        if(numero==1){
                            colonneIa=c+1;
                            return 6; // diagonale droite de haut en bas 3.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c + 1].equals("[R]") && laGrille[l + 2][c + 2].equals("[ ]") && !(laGrille[l + 3][c + 2].equals("[ ]")) && laGrille[l + 3][c + 3].equals("[R]")) {
                        if(numero==1){
                            colonneIa=c+2;
                            return 6; // diagonale droite de haut en bas 4.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[R]") && laGrille[l - 3][c + 3].equals("[ ]") && !(laGrille[l - 2][c + 3].equals("[ ]"))) {
                        if(numero==1){
                            colonneIa=c+3;
                            return 6; // diagonale droite de bas en haut 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[R]") && laGrille[l - 3][c + 3].equals("[R]")) {
                        if(numero==1){
                            colonneIa=c;
                            return 6; // diagonale droite de bas en haut 2.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]")) && laGrille[l - 2][c + 2].equals("[R]") && laGrille[l - 3][c + 3].equals("[R]")) {
                        if(numero==1){
                            colonneIa=c+1;
                            return 6; // diagonale droite de bas en haut 3.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[ ]") && !(laGrille[l - 1][c + 2].equals("[ ]")) && laGrille[l - 3][c + 3].equals("[R]")) {
                        if(numero==1){
                            colonneIa=c+2;
                            return 6; // diagonale droite de bas en haut 4.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[R]") && laGrille[l][c + 3].equals("[ ]") && !(laGrille[l+1][c + 3].equals("[ ]"))) {
                        if(numero==1){
                            colonneIa=c+3;
                            return 6; // horizontale de gauche a droite 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[R]") && laGrille[l][c + 3].equals("[R]")) {
                        if(numero==1){
                            colonneIa=c;
                            return 6; // horizontale de gauche a droite 2.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l+1][c + 1].equals("[ ]")) && laGrille[l][c + 2].equals("[R]") && laGrille[l][c + 3].equals("[R]")) {
                        if(numero==1){
                            colonneIa=c+1;
                            return 6; // horizontale de gauche a droite 3.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[ ]") && !(laGrille[l+1][c + 2].equals("[ ]")) && laGrille[l][c + 3].equals("[R]")) {
                        if(numero==1){
                            colonneIa=c+2;
                            return 6; // horizontale de gauche a droite 4.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[R]") && laGrille[l + 2][c].equals("[R]") && laGrille[l + 3][c].equals("[R]")) {
                        if(numero==1){
                            colonneIa=c; // verticale de haut en bas 1.
                            return 6;
                        }}
                }

                else if (l >=4 && l<6 && c < 4) {

                    //J1 peut gagner

                    if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[R]") && laGrille[l - 3][c + 3].equals("[ ]") && !(laGrille[l - 2][c + 3].equals("[ ]"))) {
                        if(numero==1){
                            colonneIa=c+3;
                            return 6; // diagonale droite de bas en haut 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[R]") && laGrille[l - 3][c + 3].equals("[R]")) {
                        if(numero==1){
                            colonneIa=c;
                            return 6; // diagonale droite de bas en haut 2.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]")) && laGrille[l - 2][c + 2].equals("[R]") && laGrille[l - 3][c + 3].equals("[R]")) {
                        if(numero==1){
                            colonneIa=c+1;
                            return 6; // diagonale droite de bas en haut 3.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[ ]") && !(laGrille[l - 1][c + 2].equals("[ ]")) && laGrille[l - 3][c + 3].equals("[R]")) {
                        if(numero==1){
                            colonneIa=c+2;
                            return 6; // diagonale droite de bas en haut 4.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[R]") && laGrille[l][c + 3].equals("[ ]") && !(laGrille[l+1][c + 3].equals("[ ]"))) {
                        if(numero==1){
                            colonneIa=c+3;
                            return 6; // horizontale de gauche a droite 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[R]") && laGrille[l][c + 3].equals("[R]")) {
                        if(numero==1){
                            colonneIa=c;
                            return 6; // horizontale de gauche a droite 2.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l+1][c + 1].equals("[ ]")) && laGrille[l][c + 2].equals("[R]") && laGrille[l][c + 3].equals("[R]")) {
                        if(numero==1){
                            colonneIa=c+1;
                            return 6; // horizontale de gauche a droite 3.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[ ]") && !(laGrille[l+1][c + 2].equals("[ ]")) && laGrille[l][c + 3].equals("[R]")) {
                        if(numero==1){
                            colonneIa=c+2;
                            return 6; // horizontale de gauche a droite 4.
                        }}

                }
                else if (l == 6 && c < 4) {

                    // J1 peut gagner

                    if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[R]") && laGrille[l - 3][c + 3].equals("[ ]") && !(laGrille[l - 2][c + 3].equals("[ ]"))) {
                        if(numero==1){
                            colonneIa=c+3;
                            return 6; // diagonale droite de bas en haut 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[R]") && laGrille[l - 3][c + 3].equals("[R]")) {
                        if(numero==1){
                            colonneIa=c;
                            return 6; // diagonale droite de bas en haut 2.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]")) && laGrille[l - 2][c + 2].equals("[R]") && laGrille[l - 3][c + 3].equals("[R]")) {
                        if(numero==1){
                            colonneIa=c+1;
                            return 6; // diagonale droite de bas en haut 3.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[ ]") && !(laGrille[l - 1][c + 2].equals("[ ]")) && laGrille[l - 3][c + 3].equals("[R]")) {
                        if(numero==1){
                            colonneIa=c+2;
                            return 6; // diagonale droite de bas en haut 4.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[R]") && laGrille[l][c + 3].equals("[ ]")) {
                        if(numero==1){
                            colonneIa=c+3;
                            return 6; // horizontale de gauche a droite 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[R]") && laGrille[l][c + 3].equals("[R]")) {
                        if(numero==1){
                            colonneIa=c;
                            return 6; // horizontale de gauche a droite 2.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[ ]") && laGrille[l][c + 2].equals("[R]") && laGrille[l][c + 3].equals("[R]")) {
                        if(numero==1){
                            colonneIa=c+1;
                            return 6; // horizontale de gauche a droite 3.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[ ]") && laGrille[l][c + 3].equals("[R]")) {
                        if(numero==1){
                            colonneIa=c+2;
                            return 6; // horizontale de gauche a droite 4.
                        }}
                }
                else if (l < 4 && c >= 4) {

                    // J1 peut gagner

                    if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[R]") && laGrille[l + 2][c].equals("[R]") && laGrille[l + 3][c].equals("[R]")) {
                        if(numero==1){
                            colonneIa=c; // verticale de haut en bas 1.
                            return 6;
                        }}
                }

                //Test si 3 peuvent s'aligner

                if (l < 2 && c < 5) {

                    // J1 peut gagner

                    if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c + 1].equals("[R]") && laGrille[l + 2][c + 2].equals("[ ]") && !(laGrille[l + 3][c + 2].equals("[ ]"))) {
                        if(numero==2){
                            colonneIa=c+2;
                            return 4; // diagonale droite de haut en bas 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l + 1][c + 1].equals("[R]") && laGrille[l + 2][c + 2].equals("[R]")) {
                        if(numero==2){
                            colonneIa=c;
                            return 4; // diagonale droite de haut en bas 2.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c + 1].equals("[ ]") && !(laGrille[l + 2][c + 1].equals("[ ]")) &&laGrille[l + 2][c + 2].equals("[R]")) {
                        if(numero==2){
                            colonneIa=c+1;
                            return 4; // diagonale droite de haut en bas 3.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[ ]") && !(laGrille[l+1][c + 2].equals("[ ]"))) {
                        if(numero==2){
                            colonneIa=c+2;
                            return 4; // horizontale de gauche a droite 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[R]")) {
                        if(numero==2){
                            colonneIa=c;
                            return 4; // horizontale de gauche a droite 2.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l+1][c + 1].equals("[ ]")) && laGrille[l][c + 2].equals("[R]")) {
                        if(numero==2){
                            colonneIa=c+1;
                            return 4; // horizontale de gauche a droite 3.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[R]") && laGrille[l + 2][c].equals("[R]")) {
                        if(numero==2){
                            colonneIa=c;
                            return 4; // verticale de haut en bas 1.
                        }}
                }
                else if (l >=2 && l<4 && c < 5) {

                    // J1 peut gagner

                    if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c + 1].equals("[R]") && laGrille[l + 2][c + 2].equals("[ ]") && !(laGrille[l + 3][c + 2].equals("[ ]"))) {
                        if(numero==2){
                            colonneIa=c+2;
                            return 4; // diagonale droite de haut en bas 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l + 1][c + 1].equals("[R]") && laGrille[l + 2][c + 2].equals("[R]")) {
                        if(numero==2){
                            colonneIa=c;
                            return 4; // diagonale droite de haut en bas 2.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c + 1].equals("[ ]") && !(laGrille[l + 2][c + 1].equals("[ ]")) && laGrille[l + 2][c + 2].equals("[R]")) {
                        if(numero==2){
                            colonneIa=c+1;
                            return 4; // diagonale droite de haut en bas 3.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[ ]") && !(laGrille[l - 1][c + 2].equals("[ ]"))) {
                        if(numero==2){
                            colonneIa=c+2;
                            return 4; // diagonale droite de bas en haut 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[R]")) {
                        if(numero==2){
                            colonneIa=c;
                            return 4; // diagonale droite de bas en haut 2.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]")) && laGrille[l - 2][c + 2].equals("[R]")) {
                        if(numero==2){
                            colonneIa=c+1;
                            return 4; // diagonale droite de bas en haut 3.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[ ]") && !(laGrille[l+1][c + 2].equals("[ ]"))) {
                        if(numero==2){
                            colonneIa=c+2; // horizontale de gauche à droite 1.
                            return 4;
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[R]")) {
                        if(numero==2){
                            colonneIa=c; // horizontale de gauche à droite 2.
                            return 4;
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l+1][c + 1].equals("[ ]")) && laGrille[l][c + 2].equals("[R]")) {
                        if(numero==2){
                            colonneIa=c+1; // horizontale de gauche à droite 3.
                            return 4;
                        }}
                    else if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[R]") && laGrille[l + 2][c].equals("[R]")) {
                        if(numero==2){
                            colonneIa=c; // verticale de haut en bas 1.
                            return 4;
                        }}
                }

                else if(l==4 && c<5){

                    // J1 peut gagner

                    if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c + 1].equals("[R]") && laGrille[l + 2][c + 2].equals("[ ]")) {
                        if(numero==2){
                            colonneIa=c+2;
                            return 4; // diagonale droite de haut en bas 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l + 1][c + 1].equals("[R]") && laGrille[l + 2][c + 2].equals("[R]")) {
                        if(numero==2){
                            colonneIa=c;
                            return 4; // diagonale droite de haut en bas 2.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c + 1].equals("[ ]") && !(laGrille[l + 2][c + 1].equals("[ ]")) && laGrille[l + 2][c + 2].equals("[R]")) {
                        if(numero==2){
                            colonneIa=c+1;
                            return 4; // diagonale droite de haut en bas 3.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[ ]") && !(laGrille[l - 1][c + 2].equals("[ ]"))) {
                        if(numero==2){
                            colonneIa=c+2;
                            return 4; // diagonale droite de bas en haut 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[R]")) {
                        if(numero==2){
                            colonneIa=c;
                            return 4; // diagonale droite de bas en haut 2.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]")) && laGrille[l - 2][c + 2].equals("[R]")) {
                        if(numero==2){
                            colonneIa=c+1;
                            return 4; // diagonale droite de bas en haut 3.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[ ]") && !(laGrille[l+1][c + 2].equals("[ ]"))) {
                        if(numero==2){
                            colonneIa=c+2; // horizontale de gauche à droite 1.
                            return 4;
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[R]")) {
                        if(numero==2){
                            colonneIa=c; // horizontale de gauche à droite 2.
                            return 4;
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l+1][c + 1].equals("[ ]")) && laGrille[l][c + 2].equals("[R]")) {
                        if(numero==2){
                            colonneIa=c+1; // horizontale de gauche à droite 3.
                            return 4;
                        }}
                    else if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[R]") && laGrille[l + 2][c].equals("[R]")) {
                        if(numero==2){
                            colonneIa=c; // verticale de haut en bas 1.
                            return 4;
                        }}
                }
                else if (l == 5 && c < 5) {

                    // J1 peut gagner

                    if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[ ]") && !(laGrille[l - 1][c + 2].equals("[ ]"))) {
                        if(numero==2){
                            colonneIa=c+2;
                            return 4; // diagonale droite de bas en haut 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[R]")) {
                        if(numero==2){
                            colonneIa=c;
                            return 4; // diagonale droite de bas en haut 2.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]")) && laGrille[l - 2][c + 2].equals("[R]")) {
                        if(numero==2){
                            colonneIa=c+1;
                            return 4; // diagonale droite de bas en haut 3.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[ ]") && !(laGrille[l+1][c + 2].equals("[ ]"))) {
                        if(numero==2){
                            colonneIa=c+2; // horizontale de gauche à droite 1.
                            return 4;
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[R]")) {
                        if(numero==2){
                            colonneIa=c; // horizontale de gauche à droite 2.
                            return 4;
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l+1][c + 1].equals("[ ]")) && laGrille[l][c + 2].equals("[R]")) {
                        if(numero==2){
                            colonneIa=c+1; // horizontale de gauche à droite 3.
                            return 4;
                        }}
                }
                else if(l==6 && c<5){

                    // J1 peut gagner

                    if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[ ]") && !(laGrille[l - 1][c + 2].equals("[ ]"))) {
                        if(numero==2){
                            colonneIa=c+2;
                            return 4; // diagonale droite de bas en haut 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[R]")) {
                        if(numero==2){
                            colonneIa=c;
                            return 4; // diagonale droite de bas en haut 2.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]")) && laGrille[l - 2][c + 2].equals("[R]")) {
                        if(numero==2){
                            colonneIa=c+1;
                            return 4; // diagonale droite de bas en haut 3.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[ ]")) {
                        if(numero==2){
                            colonneIa=c+2; // horizontale de gauche à droite 1.
                            return 4;
                        }}
                    else if (laGrille[l][c].equals("[ ]") && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[R]")) {
                        if(numero==2){
                            colonneIa=c; // horizontale de gauche à droite 2.
                            return 4;
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[ ]") && laGrille[l][c + 2].equals("[R]")) {
                        if(numero==2){
                            colonneIa=c+1; // horizontale de gauche à droite 3.
                            return 4;
                        }}
                }
                else if (l < 5 && c >= 5) {

                    // J1 peut gagner

                    if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[R]") && laGrille[l + 2][c].equals("[R]")) {
                        if(numero==2){
                            colonneIa=c; // horizontale de haut en bas 1.
                            return 4;
                        }}
                }

                //Test si 2 peuvent s'aligner

                if (l == 0 && c < 6) {

                    // J1 peut gagner

                    if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c + 1].equals("[ ]") && !(laGrille[l + 2][c + 1].equals("[ ]"))) {
                        if(numero==3){
                            colonneIa=c+1;
                            return 2; // diagonale droite de haut en bas 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l + 1][c + 1].equals("[R]")) {
                        if(numero==3){
                            colonneIa=c;
                            return 2; // diagonale droite de haut en bas 2.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l+1][c + 1].equals("[ ]"))) {
                        if(numero==3){
                            colonneIa=c+1;
                            return 2; // horizontale de gauche a droite 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[R]")) {
                        if(numero==3){
                            colonneIa=c;
                            return 2; // horizontale de gauche a droite 2.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[R]")) {
                        if(numero==3){
                            colonneIa=c;
                            return 2; // verticale de haut en bas 1.
                        }}
                }
                else if (l >=1 && l<5 && c < 6) {

                    // J1 peut gagner

                    if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]"))) {
                        if(numero==3){
                            colonneIa=c+1;
                            return 2; // diagonale droite de bas en haut 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l - 1][c + 1].equals("[R]")) {
                        if(numero==3){
                            colonneIa=c;
                            return 2; // diagonale droite de bas en haut 2.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c + 1].equals("[ ]") && !(laGrille[l + 2][c + 1].equals("[ ]"))) {
                        if(numero==3){
                            colonneIa=c+1;
                            return 2; // diagonale droite de haut en bas 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l + 1][c + 1].equals("[R]")) {
                        if(numero==3){
                            colonneIa=c;
                            return 2; // diagonale droite de haut en bas 2.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l+1][c + 1].equals("[ ]"))) {
                        if(numero==3){
                            colonneIa=c+1;
                            return 2; // horizontale de gauche a droite 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[R]")) {
                        if(numero==3){
                            colonneIa=c;
                            return 2; // horizontale de gauche a droite 2.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[R]")) {
                        if(numero==3){
                            colonneIa=c;
                            return 2; // verticale de haut en bas 1.
                        }}
                }

                else if(l==5 && c<6){

                    // J1 peut gagner

                    if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]"))) {
                        if(numero==3){
                            colonneIa=c+1;
                            return 2; // diagonale droite de bas en haut 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l - 1][c + 1].equals("[R]")) {
                        if(numero==3){
                            colonneIa=c;
                            return 2; // diagonale droite de bas en haut 2.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c + 1].equals("[ ]")) {
                        if(numero==3){
                            colonneIa=c+1;
                            return 2; // diagonale droite de haut en bas 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l + 1][c + 1].equals("[R]")) {
                        if(numero==3){
                            colonneIa=c;
                            return 2; // diagonale droite de haut en bas 2.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l+1][c + 1].equals("[ ]"))) {
                        if(numero==3){
                            colonneIa=c+1;
                            return 2; // horizontale de gauche a droite 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[R]")) {
                        if(numero==3){
                            colonneIa=c;
                            return 2; // horizontale de gauche a droite 2.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[R]")) {
                        if(numero==3){
                            colonneIa=c;
                            return 2; // verticale de haut en bas 1.
                        }}
                }
                else if (l == 6 && c < 6) {

                    // J1 peut gagner

                    if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]"))) {
                        if(numero==3){
                            colonneIa=c+1;
                            return 2; // diagonale droite de bas en haut 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && laGrille[l - 1][c + 1].equals("[R]")) {
                        if(numero==3){
                            colonneIa=c;
                            return 2; // diagonale droite de bas en haut 2.
                        }}
                    else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[ ]")) {
                        if(numero==3){
                            colonneIa=c+1; // horizontale de gauche à droite 1.
                            return 2;
                        }}
                    else if (laGrille[l][c].equals("[ ]") && laGrille[l][c + 1].equals("[R]")) {
                        if(numero==3){
                            colonneIa=c; // horizontale de gauche à droite 2.
                            return 2;
                        }}
                }
                else if (l < 6 && c >= 6) {

                    // J1 peut gagner

                    if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[R]")) {
                        if(numero==3){
                            colonneIa=c; // verticale de haut en bas 1.
                            return 2;
                        }}

                }
            }
        }

            // L'IA peut gagner

            for(int c=0;c< laGrille.length;c++){
                        for (int l = 0; l < laGrille.length; l++) {
                            //Test si 4 peuvent s'aligner
                            if (l < 3 && c < 4) {

                                // L'IA peut gagner

                                if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c + 1].equals("[J]") && laGrille[l + 2][c + 2].equals("[J]") && laGrille[l + 3][c + 3].equals("[ ]") && !(laGrille[l + 4][c + 3].equals("[ ]"))) {
                                    if(numero==1){
                                        colonneIa = c + 3;
                                        return 7; // diagonale droite de haut en bas 1.
                                    }} else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l + 1][c + 1].equals("[J]") && laGrille[l + 2][c + 2].equals("[J]") && laGrille[l + 3][c + 3].equals("[J]")) {
                                    if(numero==1){
                                        colonneIa = c;
                                        return 7; // diagonale droite de haut en bas 2.
                                    } }else if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c + 1].equals("[ ]") && !(laGrille[l + 2][c + 1].equals("[ ]")) && laGrille[l + 2][c + 2].equals("[J]") && laGrille[l + 3][c + 3].equals("[J]")) {
                                    if(numero==1){
                                        colonneIa = c + 1;
                                        return 7; // diagonale droite de haut en bas 3.
                                    } }else if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c + 1].equals("[J]") && laGrille[l + 2][c + 2].equals("[ ]") && !(laGrille[l + 3][c + 2].equals("[ ]")) && laGrille[l + 3][c + 3].equals("[J]")) {
                                    if(numero==1){
                                        colonneIa = c + 2;
                                        return 7; // diagonale droite de haut en bas 4.
                                    } }else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[J]") && laGrille[l][c + 3].equals("[ ]") && !(laGrille[l + 1][c + 3].equals("[ ]"))) {
                                    if(numero==1){
                                        colonneIa = c + 3;
                                        return 7; // horizontale de gauche a droite 1.
                                    }} else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[J]") && laGrille[l][c + 3].equals("[J]")) {
                                    if(numero==1){
                                        colonneIa = c;
                                        return 7; // horizontale de gauche a droite 2.
                                    } }else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l + 1][c + 1].equals("[ ]")) && laGrille[l][c + 2].equals("[J]") && laGrille[l][c + 3].equals("[J]")) {
                                    if(numero==1){
                                        colonneIa = c + 1;
                                        return 7; // horizontale de gauche a droite 3.
                                    } }else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[ ]") && !(laGrille[l + 1][c + 2].equals("[ ]")) && laGrille[l][c + 3].equals("[J]")) {
                                    if(numero==1){
                                        colonneIa = c + 2;
                                        return 7; // horizontale de gauche a droite 4.
                                    } }else if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c].equals("[J]") && laGrille[l + 2][c].equals("[J]") && laGrille[l + 3][c].equals("[ ]")) {
                                    if(numero==1){
                                        colonneIa = c;
                                        return 7; // verticale de haut en bas
                                    }}
                            } else if (l == 3 && c < 4) {

                                //L'IA peut gagner

                                if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c + 1].equals("[J]") && laGrille[l + 2][c + 2].equals("[J]") && laGrille[l + 3][c + 3].equals("[ ]")) {
                                    if(numero==1){
                                        colonneIa = c + 3;
                                        return 7; // diagonale droite de haut en bas 1.
                                    }} else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l + 1][c + 1].equals("[J]") && laGrille[l + 2][c + 2].equals("[J]") && laGrille[l + 3][c + 3].equals("[J]")) {
                                    if(numero==1){
                                        colonneIa = c;
                                        return 7; // diagonale droite de haut en bas 2.
                                    }} else if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c + 1].equals("[ ]") && !(laGrille[l + 2][c + 1].equals("[ ]")) && laGrille[l + 2][c + 2].equals("[J]") && laGrille[l + 3][c + 3].equals("[J]")) {
                                    if(numero==1){
                                        colonneIa = c + 1;
                                        return 7; // diagonale droite de haut en bas 3.
                                    }} else if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c + 1].equals("[J]") && laGrille[l + 2][c + 2].equals("[ ]") && !(laGrille[l + 3][c + 2].equals("[ ]")) && laGrille[l + 3][c + 3].equals("[J]")) {
                                    if(numero==1){
                                        colonneIa = c + 2;
                                        return 7; // diagonale droite de haut en bas 4.
                                    }} else if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[J]") && laGrille[l - 3][c + 3].equals("[ ]") && !(laGrille[l - 2][c + 3].equals("[ ]"))) {
                                    if(numero==1){
                                        colonneIa = c + 3;
                                        return 7; // diagonale droite de bas en haut 1.
                                    }} else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[J]") && laGrille[l - 3][c + 3].equals("[J]")) {
                                    if(numero==1){
                                        colonneIa = c;
                                        return 7; // diagonale droite de bas en haut 2.
                                    }} else if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]")) && laGrille[l - 2][c + 2].equals("[J]") && laGrille[l - 3][c + 3].equals("[J]")) {
                                    if(numero==1){
                                        colonneIa = c + 1;
                                        return 7; // diagonale droite de bas en haut 3.
                                    }} else if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[ ]") && !(laGrille[l - 1][c + 2].equals("[ ]")) && laGrille[l - 3][c + 3].equals("[J]")) {
                                    if(numero==1){
                                        colonneIa = c + 2;
                                        return 7; // diagonale droite de bas en haut 4.
                                    }} else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[J]") && laGrille[l][c + 3].equals("[ ]") && !(laGrille[l + 1][c + 3].equals("[ ]"))) {
                                    if(numero==1){
                                        colonneIa = c + 3;
                                        return 7; // horizontale de gauche a droite 1.
                                    }} else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[J]") && laGrille[l][c + 3].equals("[J]")) {
                                    if(numero==1){
                                        colonneIa = c;
                                        return 7; // horizontale de gauche a droite 2.
                                    }} else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l + 1][c + 1].equals("[ ]")) && laGrille[l][c + 2].equals("[J]") && laGrille[l][c + 3].equals("[J]")) {
                                    colonneIa = c + 1;
                                    return 7; // horizontale de gauche a droite 3.
                                } else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[ ]") && !(laGrille[l + 1][c + 2].equals("[ ]")) && laGrille[l][c + 3].equals("[J]")) {
                                    if(numero==1){
                                        colonneIa = c + 2;
                                        return 7; // horizontale de gauche a droite 4.
                                    } else if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[J]") && laGrille[l + 2][c].equals("[J]") && laGrille[l + 3][c].equals("[J]")) {
                                        if(numero==1){
                                            colonneIa = c;
                                            return 7; // verticale de haut en bas 1.
                                        }
                                    }} else if (l >= 4 && l < 6 && c < 4) {

                                    // L'IA peut gagner

                                    if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[J]") && laGrille[l - 3][c + 3].equals("[ ]") && !(laGrille[l - 2][c + 3].equals("[ ]"))) {
                                        if(numero==1){
                                            colonneIa = c + 3;
                                            return 7; // diagonale droite de bas en haut 1.
                                        }} else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[J]") && laGrille[l - 3][c + 3].equals("[J]")) {
                                        if(numero==1){
                                            colonneIa = c;
                                            return 7; // diagonale droite de bas en haut 2.
                                        }} else if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]")) && laGrille[l - 2][c + 2].equals("[J]") && laGrille[l - 3][c + 3].equals("[J]")) {
                                        if(numero==1){
                                            colonneIa = c + 1;
                                            return 7; // diagonale droite de bas en haut 3.
                                        }} else if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[ ]") && !(laGrille[l - 1][c + 2].equals("[ ]")) && laGrille[l - 3][c + 3].equals("[J]")) {
                                        if(numero==1){
                                            colonneIa = c + 2;
                                            return 7; // diagonale droite de bas en haut 4.
                                        }} else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[J]") && laGrille[l][c + 3].equals("[ ]") && !(laGrille[l + 1][c + 3].equals("[ ]"))) {
                                        if(numero==1){
                                            colonneIa = c + 3;
                                            return 7; // horizontale de gauche a droite 1.
                                        }} else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[J]") && laGrille[l][c + 3].equals("[J]")) {
                                        if(numero==1){
                                            colonneIa = c;
                                            return 7; // horizontale de gauche a droite 2.
                                        }} else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l + 1][c + 1].equals("[ ]")) && laGrille[l][c + 2].equals("[J]") && laGrille[l][c + 3].equals("[J]")) {
                                        if(numero==1){
                                            colonneIa = c + 1;
                                            return 7; // horizontale de gauche a droite 3.
                                        }} else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[ ]") && !(laGrille[l + 1][c + 2].equals("[ ]")) && laGrille[l][c + 3].equals("[J]")) {
                                        if(numero==1){
                                            colonneIa = c + 2;
                                            return 7; // horizontale de gauche a droite 4.
                                        }}
                                }
                                else if (l == 6 && c < 4) {

                                    // L'IA peut gagner

                                    if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[J]") && laGrille[l - 3][c + 3].equals("[ ]") && !(laGrille[l - 2][c + 3].equals("[ ]"))) {
                                        if(numero==1){
                                            colonneIa=c+3;
                                            return 7; // diagonale droite de bas en haut 1.
                                        }}
                                    else if (laGrille[l][c].equals("[ ]") && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[J]") && laGrille[l - 3][c + 3].equals("[J]")) {
                                        if(numero==1){
                                            colonneIa=c;
                                            return 7; // diagonale droite de bas en haut 2.
                                        }}
                                    else if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]")) && laGrille[l - 2][c + 2].equals("[J]") && laGrille[l - 3][c + 3].equals("[J]")) {
                                        if(numero==1){
                                            colonneIa=c+1;
                                            return 7; // diagonale droite de bas en haut 3.
                                        }}
                                    else if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[ ]") && !(laGrille[l - 1][c + 2].equals("[ ]")) && laGrille[l - 3][c + 3].equals("[J]")) {
                                        if(numero==1){
                                            colonneIa=c+2;
                                            return 7; // diagonale droite de bas en haut 4.
                                        }}
                                    else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[J]") && laGrille[l][c + 3].equals("[ ]")) {
                                        if(numero==1){
                                            colonneIa=c+3;
                                            return 7; // horizontale de gauche a droite 1.
                                        }}
                                    else if (laGrille[l][c].equals("[ ]") && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[J]") && laGrille[l][c + 3].equals("[J]")) {
                                        if(numero==1){
                                            colonneIa=c;
                                            return 7; // horizontale de gauche a droite 2.
                                        }}
                                    else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[ ]") && laGrille[l][c + 2].equals("[J]") && laGrille[l][c + 3].equals("[J]")) {
                                        if(numero==1){
                                            colonneIa=c+1;
                                            return 7; // horizontale de gauche a droite 3.
                                        }}
                                    else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[ ]") && laGrille[l][c + 3].equals("[J]")) {
                                        if(numero==1){
                                            colonneIa=c+2;
                                            return 7; // horizontale de gauche a droite 4.
                                        }}
                                }
                                else if (l < 4 && c >= 4) {

                                    // L'IA peut gagner

                                    if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[J]") && laGrille[l + 2][c].equals("[J]") && laGrille[l + 3][c].equals("[J]")) {
                                        if(numero==1){
                                            colonneIa=c; // verticale de haut en bas 1.
                                            return 7;
                                        }}
                                }

                //Test si 3 peuvent s'aligner

                if (l < 2 && c < 5) {

                    // L'IA peut gagner

                    if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c + 1].equals("[J]") && laGrille[l + 2][c + 2].equals("[ ]") && !(laGrille[l + 3][c + 2].equals("[ ]"))) {
                        if(numero==2){
                            colonneIa=c+2;
                            return 5; // diagonale droite de haut en bas 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l + 1][c + 1].equals("[J]") && laGrille[l + 2][c + 2].equals("[J]")) {
                        if(numero==2){
                            colonneIa=c;
                            return 5; // diagonale droite de haut en bas 2.
                        }}
                    else if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c + 1].equals("[ ]") && !(laGrille[l + 2][c + 1].equals("[ ]")) && laGrille[l + 2][c + 2].equals("[J]")) {
                        if(numero==2){
                            colonneIa=c+1;
                            return 5; // diagonale droite de haut en bas 3.
                        }}
                    else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[ ]") && !(laGrille[l+1][c + 2].equals("[ ]"))) {
                        if(numero==2){
                            colonneIa=c+2;
                            return 5; // horizontale de gauche a droite 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[J]")) {
                        if(numero==2){
                            colonneIa=c;
                            return 5; // horizontale de gauche a droite 2.
                        }}
                    else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l+1][c + 1].equals("[ ]")) && laGrille[l][c + 2].equals("[J]")) {
                        if(numero==2){
                            colonneIa=c+1;
                            return 5; // horizontale de gauche a droite 3.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[J]") && laGrille[l + 2][c].equals("[J]")) {
                        if(numero==2){
                            colonneIa=c;
                            return 5; // verticale de haut en bas 1.
                        }}
                }
                else if (l >=2 && l<4 && c < 5) {

                    // L'IA peut gagner

                    if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c + 1].equals("[J]") && laGrille[l + 2][c + 2].equals("[ ]") && !(laGrille[l + 3][c + 2].equals("[ ]"))) {
                        if(numero==2){
                            colonneIa=c+2;
                            return 5; // diagonale droite de haut en bas 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l + 1][c + 1].equals("[J]") && laGrille[l + 2][c + 2].equals("[J]")) {
                        if(numero==2){
                            colonneIa=c;
                            return 5; // diagonale droite de haut en bas 2.
                        }}
                    else if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c + 1].equals("[ ]") && !(laGrille[l + 2][c + 1].equals("[ ]")) && laGrille[l + 2][c + 2].equals("[J]")) {
                        if(numero==2){
                            colonneIa=c+1;
                            return 5; // diagonale droite de haut en bas 3.
                        }}
                    else if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[ ]") && !(laGrille[l - 1][c + 2].equals("[ ]"))) {
                        if(numero==2){
                            colonneIa=c+2;
                            return 5; // diagonale droite de bas en haut 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[J]")) {
                        if(numero==2){
                            colonneIa=c;
                            return 5; // diagonale droite de bas en haut 2.
                        }}
                    else if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]")) && laGrille[l - 2][c + 2].equals("[J]")) {
                        if(numero==2){
                            colonneIa=c+1;
                            return 5; // diagonale droite de bas en haut 3.
                        }}
                    else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[ ]") && !(laGrille[l+1][c + 2].equals("[ ]"))) {
                        if(numero==2){
                            colonneIa=c+2; // horizontale de gauche à droite 1.
                            return 5;
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[J]")) {
                        if(numero==2){
                            colonneIa=c; // horizontale de gauche à droite 2.
                            return 5;
                        }}
                    else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l+1][c + 1].equals("[ ]")) && laGrille[l][c + 2].equals("[J]")) {
                        if(numero==2){
                            colonneIa=c+1; // horizontale de gauche à droite 3.
                            return 5;
                        }}
                    else if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[J]") && laGrille[l + 2][c].equals("[J]")) {
                        if(numero==2){
                            colonneIa=c; // verticale de haut en bas 1.
                            return 5;
                        }}
                }
                else if(l==4 && c<5){

                    // L'IA peut gagner

                    if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c + 1].equals("[J]") && laGrille[l + 2][c + 2].equals("[ ]")) {
                        if(numero==2){
                            colonneIa=c+2;
                            return 5; // diagonale droite de haut en bas 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l + 1][c + 1].equals("[J]") && laGrille[l + 2][c + 2].equals("[J]")) {
                        if(numero==2){
                            colonneIa=c;
                            return 5; // diagonale droite de haut en bas 2.
                        }}
                    else if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c + 1].equals("[ ]") && !(laGrille[l + 2][c + 1].equals("[ ]")) && laGrille[l + 2][c + 2].equals("[J]")) {
                        if(numero==2){
                            colonneIa=c+1;
                            return 5; // diagonale droite de haut en bas 3.
                        }}
                    else if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[ ]") && !(laGrille[l - 1][c + 2].equals("[ ]"))) {
                        if(numero==2){
                            colonneIa=c+2;
                            return 5; // diagonale droite de bas en haut 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[J]")) {
                        if(numero==2){
                            colonneIa=c;
                            return 5; // diagonale droite de bas en haut 2.
                        }}
                    else if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]")) && laGrille[l - 2][c + 2].equals("[J]")) {
                        if(numero==2){
                            colonneIa=c+1;
                            return 5; // diagonale droite de bas en haut 3.
                        }}
                    else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[ ]") && !(laGrille[l+1][c + 2].equals("[ ]"))) {
                        if(numero==2){
                            colonneIa=c+2; // horizontale de gauche à droite 1.
                            return 5;
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[J]")) {
                        if(numero==2){
                            colonneIa=c; // horizontale de gauche à droite 2.
                            return 5;
                        }}
                    else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l+1][c + 1].equals("[ ]")) && laGrille[l][c + 2].equals("[J]")) {
                        if(numero==2){
                            colonneIa=c+1; // horizontale de gauche à droite 3.
                            return 5;
                        }}
                    else if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[J]") && laGrille[l + 2][c].equals("[J]")) {
                        if(numero==2){
                            colonneIa=c; // verticale de haut en bas 1.
                            return 5;
                        }}
                }
                else if (l == 5 && c < 5){

                    // L'IA peut gagner

                    if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[ ]") && !(laGrille[l - 1][c + 2].equals("[ ]"))) {
                        if(numero==2){
                            colonneIa=c+2;
                            return 5; // diagonale droite de bas en haut 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[J]")) {
                        if(numero==2){
                            colonneIa=c;
                            return 5; // diagonale droite de bas en haut 2.
                        }}
                    else if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]")) && laGrille[l - 2][c + 2].equals("[J]")) {
                        if(numero==2){
                            colonneIa=c+1;
                            return 5; // diagonale droite de bas en haut 3.
                        }}
                    else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[ ]") && !(laGrille[l+1][c + 2].equals("[ ]"))) {
                        if(numero==2){
                            colonneIa=c+2; // horizontale de gauche à droite 1.
                            return 5;
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[J]")) {
                        if(numero==2){
                            colonneIa=c; // horizontale de gauche à droite 2.
                            return 5;
                        }}
                    else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l+1][c + 1].equals("[ ]")) && laGrille[l][c + 2].equals("[J]")) {
                        colonneIa=c+1; // horizontale de gauche à droite 3.
                        return 5;
                    }
                }
                else if(l==6 && c<5){

                    // L'IA peut gagner

                    if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[ ]") && !(laGrille[l - 1][c + 2].equals("[ ]"))) {
                        if(numero==2){
                            colonneIa=c+2;
                            return 5; // diagonale droite de bas en haut 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[J]")) {
                        if(numero==2){
                            colonneIa=c;
                            return 5; // diagonale droite de bas en haut 2.
                        }}
                    else if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]")) && laGrille[l - 2][c + 2].equals("[J]")) {
                        if(numero==2){
                            colonneIa=c+1;
                            return 5; // diagonale droite de bas en haut 3.
                        }}
                    else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[ ]")) {
                        if(numero==2){
                            colonneIa=c+2; // horizontale de gauche à droite 1.
                            return 5;
                        }}
                    else if (laGrille[l][c].equals("[ ]") && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[J]")) {
                        if(numero==2){
                            colonneIa=c; // horizontale de gauche à droite 2.
                            return 5;
                        }}
                    else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[ ]") && laGrille[l][c + 2].equals("[J]")) {
                        if(numero==2){
                            colonneIa=c+1; // horizontale de gauche à droite 3.
                            return 5;
                        }}
                }
                else if (l < 5 && c >= 5) {

                    // L'IA peut gagner

                    if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[J]") && laGrille[l + 2][c].equals("[J]")) {
                        if(numero==2){
                            colonneIa=c; // horizontale de haut en bas 1.
                            return 5;
                        }}
                }
                //Test si 2 peuvent s'aligner

                if (l == 0 && c < 6) {

                    // L'IA peut gagner

                    if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c + 1].equals("[ ]") && !(laGrille[l + 2][c + 1].equals("[ ]"))) {
                        if(numero==3){
                            colonneIa=c+1;
                            return 3; // diagonale droite de haut en bas 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l + 1][c + 1].equals("[J]")) {
                        if(numero==3){
                            colonneIa=c;
                            return 3; // diagonale droite de haut en bas 2.
                        }}
                    else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l+1][c + 1].equals("[ ]"))) {
                        if(numero==3){
                            colonneIa=c+1;
                            return 3; // horizontale de gauche a droite 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[J]")) {
                        if(numero==3){
                            colonneIa=c;
                            return 3; // horizontale de gauche a droite 2.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[J]")) {
                        if(numero==3){
                            colonneIa=c;
                            return 3; // verticale de haut en bas 1.
                        }}
                }
                else if (l >=1 && l<5 && c < 6) {

                    // L'IA peut gagner

                    if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]"))) {
                        if(numero==3){
                            colonneIa=c+1;
                            return 3; // diagonale droite de bas en haut 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l - 1][c + 1].equals("[J]")) {
                        if(numero==3){
                            colonneIa=c;
                            return 3; // diagonale droite de bas en haut 2.
                        }}
                    else if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c + 1].equals("[ ]") && !(laGrille[l + 2][c + 1].equals("[ ]"))) {
                        if(numero==3){
                            colonneIa=c+1;
                            return 3; // diagonale droite de haut en bas 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l + 1][c + 1].equals("[J]")) {
                        if(numero==3){
                            colonneIa=c;
                            return 3; // diagonale droite de haut en bas 2.
                        }}
                    else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l+1][c + 1].equals("[ ]"))) {
                        if(numero==3){
                            colonneIa=c+1;
                            return 3; // horizontale de gauche a droite 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[J]")) {
                        if(numero==3){
                            colonneIa=c;
                            return 3; // horizontale de gauche a droite 2.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[J]")) {
                        if(numero==3){
                            colonneIa=c;
                            return 3; // verticale de haut en bas 1.
                        }}
                }
                else if(l==5 && c<6){

                    // L'IA peut gagner

                    if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]"))) {
                        if(numero==3){
                            colonneIa=c+1;
                            return 3; // diagonale droite de bas en haut 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l - 1][c + 1].equals("[J]")) {
                        if(numero==3){
                            colonneIa=c;
                            return 3; // diagonale droite de bas en haut 2.
                        }}
                    else if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c + 1].equals("[ ]")) {
                        if(numero==3){
                            colonneIa=c+1;
                            return 3; // diagonale droite de haut en bas 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l + 1][c + 1].equals("[J]")) {
                        if(numero==3){
                            colonneIa=c;
                            return 3; // diagonale droite de haut en bas 2.
                        }}
                    else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l+1][c + 1].equals("[ ]"))) {
                        if(numero==3){
                            colonneIa=c+1;
                            return 3; // horizontale de gauche a droite 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l+1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[J]")) {
                        if(numero==3){
                            colonneIa=c;
                            return 3; // horizontale de gauche a droite 2.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[J]")) {
                        if(numero==3){
                            colonneIa=c;
                            return 3; // verticale de haut en bas 1.
                        }}
                }
                else if (l == 6 && c < 6) {

                    // L'IA peut gagner

                    if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]"))) {
                        if(numero==3){
                            colonneIa=c+1;
                            return 3; // diagonale droite de bas en haut 1.
                        }}
                    else if (laGrille[l][c].equals("[ ]") && laGrille[l - 1][c + 1].equals("[J]")) {
                        if(numero==3){
                            colonneIa=c;
                            return 3; // diagonale droite de bas en haut 2.
                        }}
                    else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[ ]")) {
                        if(numero==3){
                            colonneIa=c+1; // horizontale de gauche à droite 1.
                            return 3;
                        }}
                    else if (laGrille[l][c].equals("[ ]") && laGrille[l][c + 1].equals("[J]")) {
                        if(numero==3){
                            colonneIa=c; // horizontale de gauche à droite 2.
                            return 3;
                        }}
                }
                else if (l < 6 && c >= 6) {

                    // L'IA peut gagner

                    if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[J]")) {
                        if(numero==3){
                            colonneIa=c; // verticale de haut en bas 1.
                            return 3;
                        }}
                }
            }
        }

    }
            return 1;
                }


    public boolean IaRota(Grille G){
        String [][] laGrilleIA=new String[7][7];
        for (int h = 0; h < laGrilleIA.length; h++) {
            for (int f = 0; f < laGrilleIA[h].length; f++) {
                laGrilleIA[h][f] = "[ ]";
            }
        }
        for (int l = 0; l < laGrille.length; l++) {
            int nbRota=0;
            for (int c = 6; c >= 0; c--) {
                if(laGrille[l][c].equals("[R]")) {
                    for(int k=6;k>=c;k--) {
                        if(laGrille[l][k].equals("[ ]"))
                            nbRota++;
                    }
                    laGrilleIA[c + nbRota][6 - l] = "[R]";
                    nbRota=0;
                }
                else if(laGrille[l][c].equals("[J]")){
                    for(int k=6;k>=c;k--) {
                        if(laGrille[l][k].equals("[ ]"))
                            nbRota++;
                    }
                    laGrilleIA[c + nbRota][6 - l] = "[J]";
                    nbRota=0;
                }

            }
        }
        if(partieTermineeIA("Ia",laGrilleIA)){
            GouD="D";
            return true;
        }
        else{
            for (int h = 0; h < laGrilleIA.length; h++) {
                for (int f = 0; f < laGrilleIA[h].length; f++) {
                    laGrilleIA[h][f] = "[ ]";
                }
            }
            for (int l = 0; l < laGrille.length; l++) {
                int nbRota=0;
                for (int c = 0; c <= 6; c++) {
                    if(laGrille[l][c].equals("[R]")) {
                        for(int k=0;k<=c;k++) {
                            if(laGrille[l][k].equals("[ ]"))
                                nbRota++;
                        }
                        laGrilleIA[6-c + nbRota][l] = "[R]";
                        nbRota=0;
                    }
                    else if(laGrille[l][c].equals("[J]")){
                        for(int k=0;k<=c;k++) {
                            if(laGrille[l][k].equals("[ ]"))
                                nbRota++;
                        }
                        laGrilleIA[6-c + nbRota][l] = "[J]";
                        nbRota=0;
                    }

                }
            }
            if(partieTermineeIA("Ia",laGrilleIA)){
                GouD="G";
                return true;
            }
        }
        return false;

    }


    public int CoupIaOpti(int numero) {
        for (int c = 0; c < laGrille.length; c++) {
            for (int l = 0; l < laGrille.length; l++) {
                //Test si 4 peuvent s'aligner
                if (l < 3 && c < 4) {

                    // J1 peut gagner

                    if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c + 1].equals("[R]") && laGrille[l + 2][c + 2].equals("[R]") && laGrille[l + 3][c + 3].equals("[ ]") && !(laGrille[l + 4][c + 3].equals("[ ]"))) {
                        if (numero == 1) {
                            colonneIa = c + 3;
                            return 6; // diagonale droite de haut en bas 1.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l + 1][c + 1].equals("[R]") && laGrille[l + 2][c + 2].equals("[R]") && laGrille[l + 3][c + 3].equals("[R]")) {
                        if (numero == 1) {
                            colonneIa = c;
                            return 6; // diagonale droite de haut en bas 2.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c + 1].equals("[ ]") && !(laGrille[l + 2][c + 1].equals("[ ]")) && laGrille[l + 2][c + 2].equals("[R]") && laGrille[l + 3][c + 3].equals("[R]")) {
                        if (numero == 1) {
                            colonneIa = c + 1;
                            return 6; // diagonale droite de haut en bas 3.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c + 1].equals("[R]") && laGrille[l + 2][c + 2].equals("[ ]") && !(laGrille[l + 3][c + 2].equals("[ ]")) && laGrille[l + 3][c + 3].equals("[R]")) {
                        if (numero == 1) {
                            colonneIa = c + 1;
                            return 6; // diagonale droite de haut en bas 4.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[R]") && laGrille[l][c + 3].equals("[ ]") && !(laGrille[l + 1][c + 3].equals("[ ]"))) {
                        if (numero == 1) {
                            colonneIa = c + 3;
                            return 6; // horizontale de gauche a droite 1.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[R]") && laGrille[l][c + 3].equals("[R]")) {
                        if (numero == 1) {
                            colonneIa = c + 3;
                            return 6; // horizontale de gauche a droite 2.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l + 1][c + 1].equals("[ ]")) && laGrille[l][c + 2].equals("[R]") && laGrille[l][c + 3].equals("[R]")) {
                        if (numero == 1) {
                            colonneIa = c + 3;
                            return 6; // horizontale de gauche a droite 3.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[ ]") && !(laGrille[l + 1][c + 2].equals("[ ]")) && laGrille[l][c + 3].equals("[R]")) {
                        if (numero == 1) {
                            colonneIa = c + 2;
                            return 6; // horizontale de gauche a droite 4.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c].equals("[R]") && laGrille[l + 2][c].equals("[R]") && laGrille[l + 3][c].equals("[ ]")) {
                        if (numero == 1) {
                            colonneIa = c;
                            return 6; // verticale de haut en bas 1.
                        }
                    }
                } else if (l == 3 && c < 4) {

                    // J1 peut gagner

                    if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c + 1].equals("[R]") && laGrille[l + 2][c + 2].equals("[R]") && laGrille[l + 3][c + 3].equals("[ ]")) {
                        if (numero == 1) {
                            colonneIa = c + 3;
                            return 6; // diagonale droite de haut en bas 1.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l + 1][c + 1].equals("[R]") && laGrille[l + 2][c + 2].equals("[R]") && laGrille[l + 3][c + 3].equals("[R]")) {
                        if (numero == 1) {
                            colonneIa = c;
                            return 6; // diagonale droite de haut en bas 2.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c + 1].equals("[ ]") && !(laGrille[l + 2][c + 1].equals("[ ]")) && laGrille[l + 2][c + 2].equals("[R]") && laGrille[l + 3][c + 3].equals("[R]")) {
                        if (numero == 1) {
                            colonneIa = c + 1;
                            return 6; // diagonale droite de haut en bas 3.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c + 1].equals("[R]") && laGrille[l + 2][c + 2].equals("[ ]") && !(laGrille[l + 3][c + 2].equals("[ ]")) && laGrille[l + 3][c + 3].equals("[R]")) {
                        if (numero == 1) {
                            colonneIa = c + 2;
                            return 6; // diagonale droite de haut en bas 4.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[R]") && laGrille[l - 3][c + 3].equals("[ ]") && !(laGrille[l - 2][c + 3].equals("[ ]"))) {
                        if (numero == 1) {
                            colonneIa = c + 3;
                            return 6; // diagonale droite de bas en haut 1.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[R]") && laGrille[l - 3][c + 3].equals("[R]")) {
                        if (numero == 1) {
                            colonneIa = c;
                            return 6; // diagonale droite de bas en haut 2.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]")) && laGrille[l - 2][c + 2].equals("[R]") && laGrille[l - 3][c + 3].equals("[R]")) {
                        if (numero == 1) {
                            colonneIa = c + 1;
                            return 6; // diagonale droite de bas en haut 3.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[ ]") && !(laGrille[l - 1][c + 2].equals("[ ]")) && laGrille[l - 3][c + 3].equals("[R]")) {
                        if (numero == 1) {
                            colonneIa = c + 2;
                            return 6; // diagonale droite de bas en haut 4.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[R]") && laGrille[l][c + 3].equals("[ ]") && !(laGrille[l + 1][c + 3].equals("[ ]"))) {
                        if (numero == 1) {
                            colonneIa = c + 3;
                            return 6; // horizontale de gauche a droite 1.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[R]") && laGrille[l][c + 3].equals("[R]")) {
                        if (numero == 1) {
                            colonneIa = c;
                            return 6; // horizontale de gauche a droite 2.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l + 1][c + 1].equals("[ ]")) && laGrille[l][c + 2].equals("[R]") && laGrille[l][c + 3].equals("[R]")) {
                        if (numero == 1) {
                            colonneIa = c + 1;
                            return 6; // horizontale de gauche a droite 3.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[ ]") && !(laGrille[l + 1][c + 2].equals("[ ]")) && laGrille[l][c + 3].equals("[R]")) {
                        if (numero == 1) {
                            colonneIa = c + 2;
                            return 6; // horizontale de gauche a droite 4.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[R]") && laGrille[l + 2][c].equals("[R]") && laGrille[l + 3][c].equals("[R]")) {
                        if (numero == 1) {
                            colonneIa = c; // verticale de haut en bas 1.
                            return 6;
                        }
                    }
                } else if (l >= 4 && l < 6 && c < 4) {

                    //J1 peut gagner

                    if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[R]") && laGrille[l - 3][c + 3].equals("[ ]") && !(laGrille[l - 2][c + 3].equals("[ ]"))) {
                        if (numero == 1) {
                            colonneIa = c + 3;
                            return 6; // diagonale droite de bas en haut 1.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[R]") && laGrille[l - 3][c + 3].equals("[R]")) {
                        if (numero == 1) {
                            colonneIa = c;
                            return 6; // diagonale droite de bas en haut 2.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]")) && laGrille[l - 2][c + 2].equals("[R]") && laGrille[l - 3][c + 3].equals("[R]")) {
                        if (numero == 1) {
                            colonneIa = c + 1;
                            return 6; // diagonale droite de bas en haut 3.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[ ]") && !(laGrille[l - 1][c + 2].equals("[ ]")) && laGrille[l - 3][c + 3].equals("[R]")) {
                        if (numero == 1) {
                            colonneIa = c + 2;
                            return 6; // diagonale droite de bas en haut 4.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[R]") && laGrille[l][c + 3].equals("[ ]") && !(laGrille[l + 1][c + 3].equals("[ ]"))) {
                        if (numero == 1) {
                            colonneIa = c + 3;
                            return 6; // horizontale de gauche a droite 1.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[R]") && laGrille[l][c + 3].equals("[R]")) {
                        if (numero == 1) {
                            colonneIa = c;
                            return 6; // horizontale de gauche a droite 2.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l + 1][c + 1].equals("[ ]")) && laGrille[l][c + 2].equals("[R]") && laGrille[l][c + 3].equals("[R]")) {
                        if (numero == 1) {
                            colonneIa = c + 1;
                            return 6; // horizontale de gauche a droite 3.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[ ]") && !(laGrille[l + 1][c + 2].equals("[ ]")) && laGrille[l][c + 3].equals("[R]")) {
                        if (numero == 1) {
                            colonneIa = c + 2;
                            return 6; // horizontale de gauche a droite 4.
                        }
                    }

                } else if (l == 6 && c < 4) {

                    // J1 peut gagner

                    if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[R]") && laGrille[l - 3][c + 3].equals("[ ]") && !(laGrille[l - 2][c + 3].equals("[ ]"))) {
                        if (numero == 1) {
                            colonneIa = c + 3;
                            return 6; // diagonale droite de bas en haut 1.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[R]") && laGrille[l - 3][c + 3].equals("[R]")) {
                        if (numero == 1) {
                            colonneIa = c;
                            return 6; // diagonale droite de bas en haut 2.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]")) && laGrille[l - 2][c + 2].equals("[R]") && laGrille[l - 3][c + 3].equals("[R]")) {
                        if (numero == 1) {
                            colonneIa = c + 1;
                            return 6; // diagonale droite de bas en haut 3.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[ ]") && !(laGrille[l - 1][c + 2].equals("[ ]")) && laGrille[l - 3][c + 3].equals("[R]")) {
                        if (numero == 1) {
                            colonneIa = c + 2;
                            return 6; // diagonale droite de bas en haut 4.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[R]") && laGrille[l][c + 3].equals("[ ]")) {
                        if (numero == 1) {
                            colonneIa = c + 3;
                            return 6; // horizontale de gauche a droite 1.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[R]") && laGrille[l][c + 3].equals("[R]")) {
                        if (numero == 1) {
                            colonneIa = c;
                            return 6; // horizontale de gauche a droite 2.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[ ]") && laGrille[l][c + 2].equals("[R]") && laGrille[l][c + 3].equals("[R]")) {
                        if (numero == 1) {
                            colonneIa = c + 1;
                            return 6; // horizontale de gauche a droite 3.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[ ]") && laGrille[l][c + 3].equals("[R]")) {
                        if (numero == 1) {
                            colonneIa = c + 2;
                            return 6; // horizontale de gauche a droite 4.
                        }
                    }
                } else if (l < 4 && c >= 4) {

                    // J1 peut gagner

                    if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[R]") && laGrille[l + 2][c].equals("[R]") && laGrille[l + 3][c].equals("[R]")) {
                        if (numero == 1) {
                            colonneIa = c; // verticale de haut en bas 1.
                            return 6;
                        }
                    }
                }

                //Test si 3 peuvent s'aligner

                if (l < 2 && c < 5) {

                    // J1 peut gagner

                    if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c + 1].equals("[R]") && laGrille[l + 2][c + 2].equals("[ ]") && !(laGrille[l + 3][c + 2].equals("[ ]"))) {
                        if (numero == 2) {
                            colonneIa = c + 2;
                            return 4; // diagonale droite de haut en bas 1.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l + 1][c + 1].equals("[R]") && laGrille[l + 2][c + 2].equals("[R]")) {
                        if (numero == 2) {
                            colonneIa = c;
                            return 4; // diagonale droite de haut en bas 2.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c + 1].equals("[ ]") && !(laGrille[l + 2][c + 1].equals("[ ]")) && laGrille[l + 2][c + 2].equals("[R]")) {
                        if (numero == 2) {
                            colonneIa = c + 1;
                            return 4; // diagonale droite de haut en bas 3.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[ ]") && !(laGrille[l + 1][c + 2].equals("[ ]"))) {
                        if (numero == 2) {
                            colonneIa = c + 2;
                            return 4; // horizontale de gauche a droite 1.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[R]")) {
                        if (numero == 2) {
                            colonneIa = c;
                            return 4; // horizontale de gauche a droite 2.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l + 1][c + 1].equals("[ ]")) && laGrille[l][c + 2].equals("[R]")) {
                        if (numero == 2) {
                            colonneIa = c + 1;
                            return 4; // horizontale de gauche a droite 3.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[R]") && laGrille[l + 2][c].equals("[R]")) {
                        if (numero == 2) {
                            colonneIa = c;
                            return 4; // verticale de haut en bas 1.
                        }
                    }
                } else if (l >= 2 && l < 4 && c < 5) {

                    // J1 peut gagner

                    if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c + 1].equals("[R]") && laGrille[l + 2][c + 2].equals("[ ]") && !(laGrille[l + 3][c + 2].equals("[ ]"))) {
                        if (numero == 2) {
                            colonneIa = c + 2;
                            return 4; // diagonale droite de haut en bas 1.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l + 1][c + 1].equals("[R]") && laGrille[l + 2][c + 2].equals("[R]")) {
                        if (numero == 2) {
                            colonneIa = c;
                            return 4; // diagonale droite de haut en bas 2.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c + 1].equals("[ ]") && !(laGrille[l + 2][c + 1].equals("[ ]")) && laGrille[l + 2][c + 2].equals("[R]")) {
                        if (numero == 2) {
                            colonneIa = c + 1;
                            return 4; // diagonale droite de haut en bas 3.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[ ]") && !(laGrille[l - 1][c + 2].equals("[ ]"))) {
                        if (numero == 2) {
                            colonneIa = c + 2;
                            return 4; // diagonale droite de bas en haut 1.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[R]")) {
                        if (numero == 2) {
                            colonneIa = c;
                            return 4; // diagonale droite de bas en haut 2.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]")) && laGrille[l - 2][c + 2].equals("[R]")) {
                        if (numero == 2) {
                            colonneIa = c + 1;
                            return 4; // diagonale droite de bas en haut 3.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[ ]") && !(laGrille[l + 1][c + 2].equals("[ ]"))) {
                        if (numero == 2) {
                            colonneIa = c + 2; // horizontale de gauche à droite 1.
                            return 4;
                        }
                    } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[R]")) {
                        if (numero == 2) {
                            colonneIa = c; // horizontale de gauche à droite 2.
                            return 4;
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l + 1][c + 1].equals("[ ]")) && laGrille[l][c + 2].equals("[R]")) {
                        if (numero == 2) {
                            colonneIa = c + 1; // horizontale de gauche à droite 3.
                            return 4;
                        }
                    } else if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[R]") && laGrille[l + 2][c].equals("[R]")) {
                        if (numero == 2) {
                            colonneIa = c; // verticale de haut en bas 1.
                            return 4;
                        }
                    }
                } else if (l == 4 && c < 5) {

                    // J1 peut gagner

                    if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c + 1].equals("[R]") && laGrille[l + 2][c + 2].equals("[ ]")) {
                        if (numero == 2) {
                            colonneIa = c + 2;
                            return 4; // diagonale droite de haut en bas 1.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l + 1][c + 1].equals("[R]") && laGrille[l + 2][c + 2].equals("[R]")) {
                        if (numero == 2) {
                            colonneIa = c;
                            return 4; // diagonale droite de haut en bas 2.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c + 1].equals("[ ]") && !(laGrille[l + 2][c + 1].equals("[ ]")) && laGrille[l + 2][c + 2].equals("[R]")) {
                        if (numero == 2) {
                            colonneIa = c + 1;
                            return 4; // diagonale droite de haut en bas 3.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[ ]") && !(laGrille[l - 1][c + 2].equals("[ ]"))) {
                        if (numero == 2) {
                            colonneIa = c + 2;
                            return 4; // diagonale droite de bas en haut 1.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[R]")) {
                        if (numero == 2) {
                            colonneIa = c;
                            return 4; // diagonale droite de bas en haut 2.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]")) && laGrille[l - 2][c + 2].equals("[R]")) {
                        if (numero == 2) {
                            colonneIa = c + 1;
                            return 4; // diagonale droite de bas en haut 3.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[ ]") && !(laGrille[l + 1][c + 2].equals("[ ]"))) {
                        if (numero == 2) {
                            colonneIa = c + 2; // horizontale de gauche à droite 1.
                            return 4;
                        }
                    } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[R]")) {
                        if (numero == 2) {
                            colonneIa = c; // horizontale de gauche à droite 2.
                            return 4;
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l + 1][c + 1].equals("[ ]")) && laGrille[l][c + 2].equals("[R]")) {
                        if (numero == 2) {
                            colonneIa = c + 1; // horizontale de gauche à droite 3.
                            return 4;
                        }
                    } else if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[R]") && laGrille[l + 2][c].equals("[R]")) {
                        if (numero == 2) {
                            colonneIa = c; // verticale de haut en bas 1.
                            return 4;
                        }
                    }
                } else if (l == 5 && c < 5) {

                    // J1 peut gagner

                    if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[ ]") && !(laGrille[l - 1][c + 2].equals("[ ]"))) {
                        if (numero == 2) {
                            colonneIa = c + 2;
                            return 4; // diagonale droite de bas en haut 1.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[R]")) {
                        if (numero == 2) {
                            colonneIa = c;
                            return 4; // diagonale droite de bas en haut 2.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]")) && laGrille[l - 2][c + 2].equals("[R]")) {
                        if (numero == 2) {
                            colonneIa = c + 1;
                            return 4; // diagonale droite de bas en haut 3.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[ ]") && !(laGrille[l + 1][c + 2].equals("[ ]"))) {
                        if (numero == 2) {
                            colonneIa = c + 2; // horizontale de gauche à droite 1.
                            return 4;
                        }
                    } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[R]")) {
                        if (numero == 2) {
                            colonneIa = c; // horizontale de gauche à droite 2.
                            return 4;
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l + 1][c + 1].equals("[ ]")) && laGrille[l][c + 2].equals("[R]")) {
                        if (numero == 2) {
                            colonneIa = c + 1; // horizontale de gauche à droite 3.
                            return 4;
                        }
                    }
                } else if (l == 6 && c < 5) {

                    // J1 peut gagner

                    if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[ ]") && !(laGrille[l - 1][c + 2].equals("[ ]"))) {
                        if (numero == 2) {
                            colonneIa = c + 2;
                            return 4; // diagonale droite de bas en haut 1.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && laGrille[l - 1][c + 1].equals("[R]") && laGrille[l - 2][c + 2].equals("[R]")) {
                        if (numero == 2) {
                            colonneIa = c;
                            return 4; // diagonale droite de bas en haut 2.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]")) && laGrille[l - 2][c + 2].equals("[R]")) {
                        if (numero == 2) {
                            colonneIa = c + 1;
                            return 4; // diagonale droite de bas en haut 3.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[ ]")) {
                        if (numero == 2) {
                            colonneIa = c + 2; // horizontale de gauche à droite 1.
                            return 4;
                        }
                    } else if (laGrille[l][c].equals("[ ]") && laGrille[l][c + 1].equals("[R]") && laGrille[l][c + 2].equals("[R]")) {
                        if (numero == 2) {
                            colonneIa = c; // horizontale de gauche à droite 2.
                            return 4;
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[ ]") && laGrille[l][c + 2].equals("[R]")) {
                        if (numero == 2) {
                            colonneIa = c + 1; // horizontale de gauche à droite 3.
                            return 4;
                        }
                    }
                } else if (l < 5 && c >= 5) {

                    // J1 peut gagner

                    if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[R]") && laGrille[l + 2][c].equals("[R]")) {
                        if (numero == 2) {
                            colonneIa = c; // horizontale de haut en bas 1.
                            return 4;
                        }
                    }
                }

                //Test si 2 peuvent s'aligner

                if (l == 0 && c < 6) {

                    // J1 peut gagner

                    if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c + 1].equals("[ ]") && !(laGrille[l + 2][c + 1].equals("[ ]"))) {
                        if (numero == 3) {
                            colonneIa = c + 1;
                            return 2; // diagonale droite de haut en bas 1.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l + 1][c + 1].equals("[R]")) {
                        if (numero == 3) {
                            colonneIa = c;
                            return 2; // diagonale droite de haut en bas 2.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l + 1][c + 1].equals("[ ]"))) {
                        if (numero == 3) {
                            colonneIa = c + 1;
                            return 2; // horizontale de gauche a droite 1.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[R]")) {
                        if (numero == 3) {
                            colonneIa = c;
                            return 2; // horizontale de gauche a droite 2.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[R]")) {
                        if (numero == 3) {
                            colonneIa = c;
                            return 2; // verticale de haut en bas 1.
                        }
                    }
                } else if (l >= 1 && l < 5 && c < 6) {

                    // J1 peut gagner

                    if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]"))) {
                        if (numero == 3) {
                            colonneIa = c + 1;
                            return 2; // diagonale droite de bas en haut 1.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l - 1][c + 1].equals("[R]")) {
                        if (numero == 3) {
                            colonneIa = c;
                            return 2; // diagonale droite de bas en haut 2.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c + 1].equals("[ ]") && !(laGrille[l + 2][c + 1].equals("[ ]"))) {
                        if (numero == 3) {
                            colonneIa = c + 1;
                            return 2; // diagonale droite de haut en bas 1.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l + 1][c + 1].equals("[R]")) {
                        if (numero == 3) {
                            colonneIa = c;
                            return 2; // diagonale droite de haut en bas 2.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l + 1][c + 1].equals("[ ]"))) {
                        if (numero == 3) {
                            colonneIa = c + 1;
                            return 2; // horizontale de gauche a droite 1.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[R]")) {
                        if (numero == 3) {
                            colonneIa = c;
                            return 2; // horizontale de gauche a droite 2.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[R]")) {
                        if (numero == 3) {
                            colonneIa = c;
                            return 2; // verticale de haut en bas 1.
                        }
                    }
                } else if (l == 5 && c < 6) {

                    // J1 peut gagner

                    if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]"))) {
                        if (numero == 3) {
                            colonneIa = c + 1;
                            return 2; // diagonale droite de bas en haut 1.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l - 1][c + 1].equals("[R]")) {
                        if (numero == 3) {
                            colonneIa = c;
                            return 2; // diagonale droite de bas en haut 2.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l + 1][c + 1].equals("[ ]")) {
                        if (numero == 3) {
                            colonneIa = c + 1;
                            return 2; // diagonale droite de haut en bas 1.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l + 1][c + 1].equals("[R]")) {
                        if (numero == 3) {
                            colonneIa = c;
                            return 2; // diagonale droite de haut en bas 2.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l + 1][c + 1].equals("[ ]"))) {
                        if (numero == 3) {
                            colonneIa = c + 1;
                            return 2; // horizontale de gauche a droite 1.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[R]")) {
                        if (numero == 3) {
                            colonneIa = c;
                            return 2; // horizontale de gauche a droite 2.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[R]")) {
                        if (numero == 3) {
                            colonneIa = c;
                            return 2; // verticale de haut en bas 1.
                        }
                    }
                } else if (l == 6 && c < 6) {

                    // J1 peut gagner

                    if (laGrille[l][c].equals("[R]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]"))) {
                        if (numero == 3) {
                            colonneIa = c + 1;
                            return 2; // diagonale droite de bas en haut 1.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && laGrille[l - 1][c + 1].equals("[R]")) {
                        if (numero == 3) {
                            colonneIa = c;
                            return 2; // diagonale droite de bas en haut 2.
                        }
                    } else if (laGrille[l][c].equals("[R]") && laGrille[l][c + 1].equals("[ ]")) {
                        if (numero == 3) {
                            colonneIa = c + 1; // horizontale de gauche à droite 1.
                            return 2;
                        }
                    } else if (laGrille[l][c].equals("[ ]") && laGrille[l][c + 1].equals("[R]")) {
                        if (numero == 3) {
                            colonneIa = c; // horizontale de gauche à droite 2.
                            return 2;
                        }
                    }
                } else if (l < 6 && c >= 6) {

                    // J1 peut gagner

                    if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[R]")) {
                        if (numero == 3) {
                            colonneIa = c; // verticale de haut en bas 1.
                            return 2;
                        }
                    }

                }
            }
        }
        for (int c = 0; c < laGrille.length; c++) {
            for (int l = 0; l < laGrille.length; l++) {
                //Test si 4 peuvent s'aligner
                if (l < 3 && c < 4) {

                    // L'IA peut gagner

                    if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c + 1].equals("[J]") && laGrille[l + 2][c + 2].equals("[J]") && laGrille[l + 3][c + 3].equals("[ ]") && !(laGrille[l + 4][c + 3].equals("[ ]"))) {
                        if (numero == 1) {
                            colonneIa = c + 3;
                            return 7; // diagonale droite de haut en bas 1.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l + 1][c + 1].equals("[J]") && laGrille[l + 2][c + 2].equals("[J]") && laGrille[l + 3][c + 3].equals("[J]")) {
                        if (numero == 1) {
                            colonneIa = c;
                            return 7; // diagonale droite de haut en bas 2.
                        }
                    } else if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c + 1].equals("[ ]") && !(laGrille[l + 2][c + 1].equals("[ ]")) && laGrille[l + 2][c + 2].equals("[J]") && laGrille[l + 3][c + 3].equals("[J]")) {
                        if (numero == 1) {
                            colonneIa = c + 1;
                            return 7; // diagonale droite de haut en bas 3.
                        }
                    } else if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c + 1].equals("[J]") && laGrille[l + 2][c + 2].equals("[ ]") && !(laGrille[l + 3][c + 2].equals("[ ]")) && laGrille[l + 3][c + 3].equals("[J]")) {
                        if (numero == 1) {
                            colonneIa = c + 2;
                            return 7; // diagonale droite de haut en bas 4.
                        }
                    } else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[J]") && laGrille[l][c + 3].equals("[ ]") && !(laGrille[l + 1][c + 3].equals("[ ]"))) {
                        if (numero == 1) {
                            colonneIa = c + 3;
                            return 7; // horizontale de gauche a droite 1.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[J]") && laGrille[l][c + 3].equals("[J]")) {
                        if (numero == 1) {
                            colonneIa = c;
                            return 7; // horizontale de gauche a droite 2.
                        }
                    } else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l + 1][c + 1].equals("[ ]")) && laGrille[l][c + 2].equals("[J]") && laGrille[l][c + 3].equals("[J]")) {
                        if (numero == 1) {
                            colonneIa = c + 1;
                            return 7; // horizontale de gauche a droite 3.
                        }
                    } else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[ ]") && !(laGrille[l + 1][c + 2].equals("[ ]")) && laGrille[l][c + 3].equals("[J]")) {
                        if (numero == 1) {
                            colonneIa = c + 2;
                            return 7; // horizontale de gauche a droite 4.
                        }
                    } else if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c].equals("[J]") && laGrille[l + 2][c].equals("[J]") && laGrille[l + 3][c].equals("[ ]")) {
                        if (numero == 1) {
                            colonneIa = c;
                            return 7; // verticale de haut en bas
                        }
                    }
                } else if (l == 3 && c < 4) {

                    //L'IA peut gagner

                    if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c + 1].equals("[J]") && laGrille[l + 2][c + 2].equals("[J]") && laGrille[l + 3][c + 3].equals("[ ]")) {
                        if (numero == 1) {
                            colonneIa = c + 3;
                            return 7; // diagonale droite de haut en bas 1.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l + 1][c + 1].equals("[J]") && laGrille[l + 2][c + 2].equals("[J]") && laGrille[l + 3][c + 3].equals("[J]")) {
                        if (numero == 1) {
                            colonneIa = c;
                            return 7; // diagonale droite de haut en bas 2.
                        }
                    } else if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c + 1].equals("[ ]") && !(laGrille[l + 2][c + 1].equals("[ ]")) && laGrille[l + 2][c + 2].equals("[J]") && laGrille[l + 3][c + 3].equals("[J]")) {
                        if (numero == 1) {
                            colonneIa = c + 1;
                            return 7; // diagonale droite de haut en bas 3.
                        }
                    } else if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c + 1].equals("[J]") && laGrille[l + 2][c + 2].equals("[ ]") && !(laGrille[l + 3][c + 2].equals("[ ]")) && laGrille[l + 3][c + 3].equals("[J]")) {
                        if (numero == 1) {
                            colonneIa = c + 2;
                            return 7; // diagonale droite de haut en bas 4.
                        }
                    } else if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[J]") && laGrille[l - 3][c + 3].equals("[ ]") && !(laGrille[l - 2][c + 3].equals("[ ]"))) {
                        if (numero == 1) {
                            colonneIa = c + 3;
                            return 7; // diagonale droite de bas en haut 1.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[J]") && laGrille[l - 3][c + 3].equals("[J]")) {
                        if (numero == 1) {
                            colonneIa = c;
                            return 7; // diagonale droite de bas en haut 2.
                        }
                    } else if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]")) && laGrille[l - 2][c + 2].equals("[J]") && laGrille[l - 3][c + 3].equals("[J]")) {
                        if (numero == 1) {
                            colonneIa = c + 1;
                            return 7; // diagonale droite de bas en haut 3.
                        }
                    } else if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[ ]") && !(laGrille[l - 1][c + 2].equals("[ ]")) && laGrille[l - 3][c + 3].equals("[J]")) {
                        if (numero == 1) {
                            colonneIa = c + 2;
                            return 7; // diagonale droite de bas en haut 4.
                        }
                    } else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[J]") && laGrille[l][c + 3].equals("[ ]") && !(laGrille[l + 1][c + 3].equals("[ ]"))) {
                        if (numero == 1) {
                            colonneIa = c + 3;
                            return 7; // horizontale de gauche a droite 1.
                        }
                    } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[J]") && laGrille[l][c + 3].equals("[J]")) {
                        if (numero == 1) {
                            colonneIa = c;
                            return 7; // horizontale de gauche a droite 2.
                        }
                    } else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l + 1][c + 1].equals("[ ]")) && laGrille[l][c + 2].equals("[J]") && laGrille[l][c + 3].equals("[J]")) {
                        colonneIa = c + 1;
                        return 7; // horizontale de gauche a droite 3.
                    } else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[ ]") && !(laGrille[l + 1][c + 2].equals("[ ]")) && laGrille[l][c + 3].equals("[J]")) {
                        if (numero == 1) {
                            colonneIa = c + 2;
                            return 7; // horizontale de gauche a droite 4.
                        } else if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[J]") && laGrille[l + 2][c].equals("[J]") && laGrille[l + 3][c].equals("[J]")) {
                            if (numero == 1) {
                                colonneIa = c;
                                return 7; // verticale de haut en bas 1.
                            }
                        }
                    } else if (l >= 4 && l < 6 && c < 4) {

                        // L'IA peut gagner

                        if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[J]") && laGrille[l - 3][c + 3].equals("[ ]") && !(laGrille[l - 2][c + 3].equals("[ ]"))) {
                            if (numero == 1) {
                                colonneIa = c + 3;
                                return 7; // diagonale droite de bas en haut 1.
                            }
                        } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[J]") && laGrille[l - 3][c + 3].equals("[J]")) {
                            if (numero == 1) {
                                colonneIa = c;
                                return 7; // diagonale droite de bas en haut 2.
                            }
                        } else if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]")) && laGrille[l - 2][c + 2].equals("[J]") && laGrille[l - 3][c + 3].equals("[J]")) {
                            if (numero == 1) {
                                colonneIa = c + 1;
                                return 7; // diagonale droite de bas en haut 3.
                            }
                        } else if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[ ]") && !(laGrille[l - 1][c + 2].equals("[ ]")) && laGrille[l - 3][c + 3].equals("[J]")) {
                            if (numero == 1) {
                                colonneIa = c + 2;
                                return 7; // diagonale droite de bas en haut 4.
                            }
                        } else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[J]") && laGrille[l][c + 3].equals("[ ]") && !(laGrille[l + 1][c + 3].equals("[ ]"))) {
                            if (numero == 1) {
                                colonneIa = c + 3;
                                return 7; // horizontale de gauche a droite 1.
                            }
                        } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[J]") && laGrille[l][c + 3].equals("[J]")) {
                            if (numero == 1) {
                                colonneIa = c;
                                return 7; // horizontale de gauche a droite 2.
                            }
                        } else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l + 1][c + 1].equals("[ ]")) && laGrille[l][c + 2].equals("[J]") && laGrille[l][c + 3].equals("[J]")) {
                            if (numero == 1) {
                                colonneIa = c + 1;
                                return 7; // horizontale de gauche a droite 3.
                            }
                        } else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[ ]") && !(laGrille[l + 1][c + 2].equals("[ ]")) && laGrille[l][c + 3].equals("[J]")) {
                            if (numero == 1) {
                                colonneIa = c + 2;
                                return 7; // horizontale de gauche a droite 4.
                            }
                        }
                    } else if (l == 6 && c < 4) {

                        // L'IA peut gagner

                        if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[J]") && laGrille[l - 3][c + 3].equals("[ ]") && !(laGrille[l - 2][c + 3].equals("[ ]"))) {
                            if (numero == 1) {
                                colonneIa = c + 3;
                                return 7; // diagonale droite de bas en haut 1.
                            }
                        } else if (laGrille[l][c].equals("[ ]") && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[J]") && laGrille[l - 3][c + 3].equals("[J]")) {
                            if (numero == 1) {
                                colonneIa = c;
                                return 7; // diagonale droite de bas en haut 2.
                            }
                        } else if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]")) && laGrille[l - 2][c + 2].equals("[J]") && laGrille[l - 3][c + 3].equals("[J]")) {
                            if (numero == 1) {
                                colonneIa = c + 1;
                                return 7; // diagonale droite de bas en haut 3.
                            }
                        } else if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[ ]") && !(laGrille[l - 1][c + 2].equals("[ ]")) && laGrille[l - 3][c + 3].equals("[J]")) {
                            if (numero == 1) {
                                colonneIa = c + 2;
                                return 7; // diagonale droite de bas en haut 4.
                            }
                        } else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[J]") && laGrille[l][c + 3].equals("[ ]")) {
                            if (numero == 1) {
                                colonneIa = c + 3;
                                return 7; // horizontale de gauche a droite 1.
                            }
                        } else if (laGrille[l][c].equals("[ ]") && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[J]") && laGrille[l][c + 3].equals("[J]")) {
                            if (numero == 1) {
                                colonneIa = c;
                                return 7; // horizontale de gauche a droite 2.
                            }
                        } else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[ ]") && laGrille[l][c + 2].equals("[J]") && laGrille[l][c + 3].equals("[J]")) {
                            if (numero == 1) {
                                colonneIa = c + 1;
                                return 7; // horizontale de gauche a droite 3.
                            }
                        } else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[ ]") && laGrille[l][c + 3].equals("[J]")) {
                            if (numero == 1) {
                                colonneIa = c + 2;
                                return 7; // horizontale de gauche a droite 4.
                            }
                        }
                    } else if (l < 4 && c >= 4) {

                        // L'IA peut gagner

                        if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[J]") && laGrille[l + 2][c].equals("[J]") && laGrille[l + 3][c].equals("[J]")) {
                            if (numero == 1) {
                                colonneIa = c; // verticale de haut en bas 1.
                                return 7;
                            }
                        }
                    }

                    //Test si 3 peuvent s'aligner

                    if (l < 2 && c < 5) {

                        // L'IA peut gagner

                        if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c + 1].equals("[J]") && laGrille[l + 2][c + 2].equals("[ ]") && !(laGrille[l + 3][c + 2].equals("[ ]"))) {
                            if (numero == 2) {
                                if (laGrille[l + 3][c + 3].equals("[ ]") && !(laGrille[l + 4][c + 3].equals("[ ]"))) {
                                    colonneIa = c + 2;
                                    return 5; // diagonale droite de haut en bas 1.
                                }
                            }
                        } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l + 1][c + 1].equals("[J]") && laGrille[l + 2][c + 2].equals("[J]")) {
                            if (numero == 2) {
                                if (l != 0 && c != 0) {
                                    if (laGrille[l - 1][c - 1].equals("[ ]") && !(laGrille[l][c - 1].equals("[ ]"))) {
                                        colonneIa = c;
                                        return 5; // diagonale droite de haut en bas 2.
                                    }
                                }
                            }
                        } else if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c + 1].equals("[ ]") && !(laGrille[l + 2][c + 1].equals("[ ]")) && laGrille[l + 2][c + 2].equals("[J]")) {
                            if (numero == 2) {
                                colonneIa = c + 1;
                                return 5; // diagonale droite de haut en bas 3.
                            }
                        } else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[ ]") && !(laGrille[l + 1][c + 2].equals("[ ]"))) {
                            if (numero == 2) {
                                if (laGrille[l][c + 3].equals("[ ]") && !(laGrille[l + 1][c + 3].equals("[ ]"))) {
                                    colonneIa = c + 2;
                                    return 5; // horizontale de gauche a droite 1.
                                }
                            }
                        } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[J]")) {
                            if (numero == 2) {
                                if (c != 0) {
                                    if (laGrille[l][c - 1].equals("[ ]") && !(laGrille[l + 1][c - 1].equals("[ ]"))) {
                                        colonneIa = c;
                                        return 5; // horizontale de gauche a droite 2.
                                    }
                                }
                            }
                        } else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l + 1][c + 1].equals("[ ]")) && laGrille[l][c + 2].equals("[J]")) {
                            if (numero == 2) {
                                colonneIa = c + 1;
                                return 5; // horizontale de gauche a droite 3.
                            }
                        } else if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[J]") && laGrille[l + 2][c].equals("[J]")) {
                            if (numero == 2) {
                                colonneIa = c;
                                return 5; // verticale de haut en bas 1.
                            }
                        }
                    } else if (l >= 2 && l < 4 && c < 5) {

                        // L'IA peut gagner

                        if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c + 1].equals("[J]") && laGrille[l + 2][c + 2].equals("[ ]") && !(laGrille[l + 3][c + 2].equals("[ ]"))) {
                            if (numero == 2) {
                                if (l < 3) {
                                    if (laGrille[l + 3][c + 3].equals("[ ]") && !(laGrille[l + 4][c + 3].equals("[ ]"))) {
                                        colonneIa = c + 2;
                                        return 5; // diagonale droite de haut en bas 1.
                                    }
                                }
                            }
                        } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l + 1][c + 1].equals("[J]") && laGrille[l + 2][c + 2].equals("[J]")) {
                            if (numero == 2) {
                                if (l != 2 && c != 0) {
                                    if (laGrille[l - 1][c - 1].equals("[ ]") && !(laGrille[l][c - 1].equals("[ ]"))) {
                                        colonneIa = c;
                                        return 5; // diagonale droite de haut en bas 2.
                                    }
                                }
                            }
                        } else if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c + 1].equals("[ ]") && !(laGrille[l + 2][c + 1].equals("[ ]")) && laGrille[l + 2][c + 2].equals("[J]")) {
                            if (numero == 2) {
                                colonneIa = c + 1;
                                return 5; // diagonale droite de haut en bas 3.
                            }
                        } else if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[ ]") && !(laGrille[l - 1][c + 2].equals("[ ]"))) {
                            if (numero == 2) {
                                if (l > 4 && c <= 2) {
                                    if (laGrille[l - 3][c + 3].equals("[ ]") && !(laGrille[l - 2][c + 3].equals("[ ]"))) {
                                        colonneIa = c + 2;
                                        return 5; // diagonale droite de bas en haut 1.
                                    }
                                }
                            }
                        } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[J]")) {
                            if (numero == 2) {
                                if (c != 0 && l != 6) {
                                    if (laGrille[l + 1][c - 1].equals("[ ]") && !(laGrille[l + 2][c - 1].equals("[ ]")))
                                        colonneIa = c;
                                    return 5; // diagonale droite de bas en haut 2.
                                }
                            }
                        } else if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]")) && laGrille[l - 2][c + 2].equals("[J]")) {
                            if (numero == 2) {
                                colonneIa = c + 1;
                                return 5; // diagonale droite de bas en haut 3.
                            }
                        } else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[ ]") && !(laGrille[l + 1][c + 2].equals("[ ]"))) {
                            if (numero == 2) {
                                if (c < 4) {
                                    if (laGrille[l][c + 3].equals("[ ]") && !(laGrille[l + 1][c + 3].equals("[ ]"))) {
                                        colonneIa = c + 2; // horizontale de gauche à droite 1.
                                        return 5;
                                    }
                                }
                            }
                        } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[J]")) {
                            if (numero == 2) {
                                if (c != 0) {
                                    if (laGrille[l][c - 1].equals("[ ]") && !(laGrille[l + 1][c - 1].equals("[ ]"))) {
                                        colonneIa = c; // horizontale de gauche à droite 2.
                                        return 5;
                                    }
                                }
                            }
                        } else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l + 1][c + 1].equals("[ ]")) && laGrille[l][c + 2].equals("[J]")) {
                            if (numero == 2) {
                                colonneIa = c + 1; // horizontale de gauche à droite 3.
                                return 5;
                            }
                        } else if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[J]") && laGrille[l + 2][c].equals("[J]")) {
                            if (numero == 2) {
                                if (l < 4) {
                                    if (laGrille[l + 3][c].equals("[ ]")) {
                                        colonneIa = c; // verticale de haut en bas 1.
                                        return 5;
                                    }
                                }
                            }
                        }
                    } else if (l == 4 && c < 5) {

                        // L'IA peut gagner

                        if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c + 1].equals("[J]") && laGrille[l + 2][c + 2].equals("[ ]")) {
                            if (numero == 2) {
                                if (c != 0) {
                                    if (laGrille[l - 1][c - 1].equals("[ ]") && !(laGrille[l][c - 1].equals("[ ]"))) {
                                        colonneIa = c + 2;
                                        return 5; // diagonale droite de haut en bas 1.
                                    }
                                }
                            }
                        } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l + 1][c + 1].equals("[J]") && laGrille[l + 2][c + 2].equals("[J]")) {
                            if (numero == 2) {
                                if (c != 0) {
                                    if (laGrille[l - 1][c - 1].equals("[J]") && !(laGrille[l][c - 1].equals("[ ]"))) {
                                        colonneIa = c;
                                        return 5; // diagonale droite de haut en bas 2.
                                    }
                                }
                            }
                        } else if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c + 1].equals("[ ]") && !(laGrille[l + 2][c + 1].equals("[ ]")) && laGrille[l + 2][c + 2].equals("[J]")) {
                            if (numero == 2) {
                                colonneIa = c + 1;
                                return 5; // diagonale droite de haut en bas 3.
                            }
                        } else if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[ ]") && !(laGrille[l - 1][c + 2].equals("[ ]"))) {
                            if (numero == 2) {
                                if (c < 4) {
                                    if (laGrille[l - 3][c + 3].equals("[ ]") && !(laGrille[l - 1][c + 2].equals("[ ]"))) {
                                        colonneIa = c + 2;
                                        return 5; // diagonale droite de bas en haut 1.
                                    }
                                }
                            }
                        } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[J]")) {
                            if (numero == 2) {
                                if (c != 0) {
                                    if (laGrille[l + 1][c - 1].equals("[ ]") && !(laGrille[l + 2][c - 1].equals("[ ]"))) {
                                        colonneIa = c;
                                        return 5; // diagonale droite de bas en haut 2.
                                    }
                                }
                            }
                        } else if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]")) && laGrille[l - 2][c + 2].equals("[J]")) {
                            if (numero == 2) {
                                colonneIa = c + 1;
                                return 5; // diagonale droite de bas en haut 3.
                            }
                        } else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[ ]") && !(laGrille[l + 1][c + 2].equals("[ ]"))) {
                            if (numero == 2) {
                                if (c < 4) {
                                    if (laGrille[l][c + 3].equals("[ ]") && !(laGrille[l + 1][c + 3].equals("[ ]"))) {
                                        colonneIa = c + 2; // horizontale de gauche à droite 1.
                                        return 5;
                                    }
                                }
                            }
                        } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[J]")) {
                            if (numero == 2) {
                                if (c != 0) {
                                    if (laGrille[l][c - 1].equals("[ ]") && !(laGrille[l - 1][c + 2].equals("[ ]"))) {
                                        colonneIa = c; // horizontale de gauche à droite 2.
                                        return 5;
                                    }
                                }
                            }
                        } else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l + 1][c + 1].equals("[ ]")) && laGrille[l][c + 2].equals("[J]")) {
                            if (numero == 2) {
                                colonneIa = c + 1; // horizontale de gauche à droite 3.
                                return 5;
                            }
                        } else if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[J]") && laGrille[l + 2][c].equals("[J]")) {
                            if (numero == 2) {
                                colonneIa = c; // verticale de haut en bas 1.
                                return 5;
                            }
                        }
                    } else if (l == 5 && c < 5) {

                        // L'IA peut gagner

                        if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[ ]") && !(laGrille[l - 1][c + 2].equals("[ ]"))) {
                            if (numero == 2) {
                                if (c < 4) {
                                    if (laGrille[l - 3][c + 3].equals("[ ]") && !(laGrille[l - 2][c + 3].equals("[ ]"))) {
                                        colonneIa = c + 2;
                                        return 5; // diagonale droite de bas en haut 1.
                                    }
                                }
                            }
                        } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[J]")) {
                            if (numero == 2) {
                                if (c != 0) {
                                    if (laGrille[l - 1][c - 1].equals("[ ]") && !(laGrille[l - 2][c + 3].equals("[ ]"))) {
                                        colonneIa = c;
                                        return 5; // diagonale droite de bas en haut 2.
                                    }
                                }
                            }
                        } else if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]")) && laGrille[l - 2][c + 2].equals("[J]")) {
                            if (numero == 2) {
                                colonneIa = c + 1;
                                return 5; // diagonale droite de bas en haut 3.
                            }
                        } else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[ ]") && !(laGrille[l + 1][c + 2].equals("[ ]"))) {
                            if (numero == 2) {
                                colonneIa = c + 2; // horizontale de gauche à droite 1.
                                return 5;
                            }
                        } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[J]")) {
                            if (numero == 2) {
                                colonneIa = c; // horizontale de gauche à droite 2.
                                return 5;
                            }
                        } else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l + 1][c + 1].equals("[ ]")) && laGrille[l][c + 2].equals("[J]")) {
                            colonneIa = c + 1; // horizontale de gauche à droite 3.
                            return 5;
                        }
                    } else if (l == 6 && c < 5) {

                        // L'IA peut gagner

                        if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[ ]") && !(laGrille[l - 1][c + 2].equals("[ ]"))) {
                            if (numero == 2) {
                                if (c < 4) {
                                    if (laGrille[l - 3][c + 3].equals("[ ]") && !(laGrille[l - 2][c + 3].equals("[ ]"))) {
                                        colonneIa = c + 2;
                                        return 5; // diagonale droite de bas en haut 1.
                                    }
                                }
                            }
                        } else if (laGrille[l][c].equals("[ ]") && laGrille[l - 1][c + 1].equals("[J]") && laGrille[l - 2][c + 2].equals("[J]")) {
                            if (numero == 2) {
                                if (laGrille[l - 3][c + 3].equals("[ ]") && !(laGrille[l - 2][c + 3].equals("[ ]"))) {
                                    colonneIa = c;
                                    return 5; // diagonale droite de bas en haut 2.
                                }
                            }
                        } else if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]")) && laGrille[l - 2][c + 2].equals("[J]")) {
                            if (numero == 2) {
                                if (c < 4) {
                                    if (laGrille[l - 3][c + 3].equals("[ ]") && !(laGrille[l - 2][c + 3].equals("[ ]"))) {
                                        colonneIa = c + 1;
                                        return 5; // diagonale droite de bas en haut 3.
                                    }
                                    if (laGrille[l - 3][c + 3].equals("[ ]") && !(laGrille[l - 2][c + 3].equals("[ ]"))) {
                                        colonneIa = c + 1;
                                        return 5; // diagonale droite de bas en haut 3.
                                    }
                                }
                            }
                        } else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[ ]")) {
                            if (numero == 2) {
                                if (laGrille[l][c + 3].equals("[ ]") && !(laGrille[l + 1][c + 3].equals("[ ]")))
                                    colonneIa = c + 2; // horizontale de gauche à droite 1.
                                return 5;
                            }
                        } else if (laGrille[l][c].equals("[ ]") && laGrille[l][c + 1].equals("[J]") && laGrille[l][c + 2].equals("[J]")) {
                            if (numero == 2) {
                                if (c != 0) {
                                    if (laGrille[l][c - 1].equals("[ ]"))
                                        colonneIa = c; // horizontale de gauche à droite 2.
                                    return 5;
                                }
                            }
                        } else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[ ]") && laGrille[l][c + 2].equals("[J]")) {
                            if (numero == 2) {
                                if (c != 0) {
                                    if (laGrille[l][c + 3].equals("[ ]")) {
                                        colonneIa = c + 1; // horizontale de gauche à droite 3.
                                        return 5;
                                    }
                                }
                                if (c < 4) {
                                    if (laGrille[l][c - 1].equals("[ ]") && !(laGrille[l + 1][c - 1].equals("[ ]"))) {
                                        colonneIa = c + 1; // horizontale de gauche à droite 3.
                                        return 5;
                                    }
                                }
                            }
                        } else if (l < 5 && c >= 5) {

                            // L'IA peut gagner

                            if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[J]") && laGrille[l + 2][c].equals("[J]")) {
                                if (numero == 2) {
                                    if (l < 4) {
                                        if (laGrille[l + 3][c].equals("[ ]")) {
                                            colonneIa = c; // horizontale de haut en bas 1.
                                            return 5;
                                        }
                                    }
                                    if (l > 0) {
                                        if (laGrille[l - 1][c].equals("[ ]")) {
                                            colonneIa = c; // horizontale de haut en bas 1.
                                            return 5;
                                        }
                                    }
                                }
                            }
                            //Test si 2 peuvent s'aligner

                            if (l == 0 && c < 6) {

                                // L'IA peut gagner

                                if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c + 1].equals("[ ]") && !(laGrille[l + 2][c + 1].equals("[ ]"))) {
                                    if (numero == 3) {
                                        if (c != 0 && c < 4) {
                                            if (laGrille[l + 2][c + 2].equals("[ ]") && !(laGrille[l + 3][c + 2].equals("[ ]"))) {
                                                if (laGrille[l + 3][c + 3].equals("[ ]") && !(laGrille[l + 4][c + 3].equals("[ ]"))) {
                                                    colonneIa = c + 1;
                                                    return 3; // diagonale droite de haut en bas 1.
                                                }
                                            }
                                        }
                                    }
                                } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l + 1][c + 1].equals("[J]")) {
                                    if (numero == 3) {
                                        if (c != 0 && c < 4) {
                                            if (laGrille[l + 2][c + 2].equals("[ ]") && !(laGrille[l + 3][c + 2].equals("[ ]"))) {
                                                if (laGrille[l + 3][c + 3].equals("[ ]") && !(laGrille[l + 4][c + 3].equals("[ ]"))) {
                                                    colonneIa = c;
                                                    return 3; // diagonale droite de haut en bas 2.
                                                }
                                            }
                                        }
                                    }
                                } else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l + 1][c + 1].equals("[ ]"))) {
                                    if (numero == 3) {
                                        if (c != 0 && c < 5) {
                                            if (laGrille[l][c - 1].equals("[ ]") && !(laGrille[l + 1][c - 1].equals("[ ]"))) {
                                                if (laGrille[l][c + 2].equals("[ ]") && !(laGrille[l + 1][c + 2].equals("[ ]"))) {
                                                    colonneIa = c + 1;
                                                    return 3; // horizontale de gauche a droite 1.
                                                }
                                            }
                                        }
                                    }
                                } else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[J]")) {
                                    if (numero == 3) {
                                        if (c != 0 && c < 5) {
                                            if (laGrille[l][c - 1].equals("[ ]") && !(laGrille[l + 1][c - 1].equals("[ ]"))) {
                                                if (laGrille[l][c + 2].equals("[ ]") && !(laGrille[l + 1][c + 2].equals("[ ]"))) {
                                                    colonneIa = c;
                                                    return 3; // horizontale de gauche a droite 2.
                                                }
                                            }
                                        }
                                    }
                                } else if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[J]")) {
                                    if (numero == 3) {
                                        if (laGrille[l + 2][c].equals("[ ]")) {
                                            if (laGrille[l + 3][c].equals("[ ]")) {
                                                colonneIa = c;
                                                return 3; // verticale de haut en bas 1.
                                            }
                                        }
                                    }
                                } else if (l >= 1 && l < 5 && c < 6) {

                                    // L'IA peut gagner

                                    if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]"))) {
                                        if (numero == 3) {
                                            if(l!=1 && c!=5 ){
                                            if(laGrille[l +1][c -1].equals("[ ]") && !(laGrille[l+2][c -1].equals("[ ]"))){
                                                if(laGrille[l -2][c +2].equals("[ ]") && !(laGrille[l-1][c +2].equals("[ ]"))){
                                            colonneIa = c + 1;
                                            return 3; // diagonale droite de bas en haut 1.
                                        }
                                            }
                                            }
                                    }
                                    }
                                    else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l - 1][c + 1].equals("[J]")) {
                                        if (numero == 3) {
                                            if(l!=1 && c!=5 ){
                                                if(laGrille[l +1][c -1].equals("[ ]") && !(laGrille[l+2][c -1].equals("[ ]"))){
                                                    if(laGrille[l -2][c +2].equals("[ ]") && !(laGrille[l-1][c +2].equals("[ ]"))){
                                            colonneIa = c;
                                            return 3; // diagonale droite de bas en haut 2.
                                        }
                                    }
                                            }
                                        }
                                    }
                                    else if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c + 1].equals("[ ]") && !(laGrille[l + 2][c + 1].equals("[ ]"))) {
                                        if (numero == 3) {
                                            if(c!=5 ){
                                                if(laGrille[l -1][c -1].equals("[ ]") && !(laGrille[l+2][c -1].equals("[ ]"))){
                                                    if(laGrille[l +2][c +2].equals("[ ]") && !(laGrille[l+3][c +2].equals("[ ]"))){
                                            colonneIa = c + 1;
                                            return 3; // diagonale droite de haut en bas 1.
                                        }
                                    }
                                            }
                                        }
                                    }
                                                else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l + 1][c + 1].equals("[J]")) {
                                        if (numero == 3) {
                                            if(c!=5 ){
                                                if(laGrille[l -1][c -1].equals("[ ]") && !(laGrille[l+2][c -1].equals("[ ]"))){
                                                    if(laGrille[l +2][c +2].equals("[ ]") && !(laGrille[l+3][c +2].equals("[ ]"))){
                                            colonneIa = c;
                                            return 3; // diagonale droite de haut en bas 2.
                                        }
                                    } }
                                            else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l + 1][c + 1].equals("[ ]"))) {
                                        if (numero == 3) {
                                            if(c!=5 && c!=0 ){
                                                if(laGrille[l][c -1].equals("[ ]") && !(laGrille[l+1][c -1].equals("[ ]"))){
                                                    if(laGrille[l][c+2].equals("[ ]") && !(laGrille[l+1][c+2].equals("[ ]"))){
                                            colonneIa = c + 1;
                                            return 3; // horizontale de gauche a droite 1.
                                        }
                                    }
                                            }
                                        }
                                            }
                                                else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[J]")) {
                                        if (numero == 3) {
                                            if(c!=5 && c!=0 ){
                                                if(laGrille[l][c -1].equals("[ ]") && !(laGrille[l+1][c -1].equals("[ ]"))){
                                                    if(laGrille[l][c+2].equals("[ ]") && !(laGrille[l+1][c+2].equals("[ ]"))){
                                            colonneIa = c;
                                            return 3; // horizontale de gauche a droite 2.
                                        }
                                    }
                                            }
                                        }
                                                }
                                                else if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[J]")) {
                                        if (numero == 3) {
                                                if(laGrille[l-1][c].equals("[ ]")){
                                                    if(laGrille[l+2][c].equals("[ ]")){
                                            colonneIa = c;
                                            return 3; // verticale de haut en bas 1.
                                        }
                                    }
                                        }
                                                }
                                            else if (l == 5 && c < 6) {

                                    // L'IA peut gagner
                                    if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]"))) {
                                        if (numero == 3) {
                                            if(l!=1 && c!=5 ){
                                                if(laGrille[l +1][c -1].equals("[ ]") && !(laGrille[l+2][c -1].equals("[ ]"))){
                                                    if(laGrille[l -2][c +2].equals("[ ]") && !(laGrille[l-1][c +2].equals("[ ]"))){
                                            colonneIa = c + 1;
                                            return 3; // diagonale droite de bas en haut 1.
                                        }
                                    } }}}
                                                else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l - 1][c + 1].equals("[J]")) {
                                        if (numero == 3) {
                                            if(c!=5 ){
                                                if(laGrille[l +1][c -1].equals("[ ]") && !(laGrille[l+2][c -1].equals("[ ]"))){
                                                    if(laGrille[l -2][c +2].equals("[ ]") && !(laGrille[l-1][c +2].equals("[ ]"))){
                                            colonneIa = c;
                                            return 3; // diagonale droite de bas en haut 2.
                                        }
                                    } }}}
                                                else if (laGrille[l][c].equals("[J]") && laGrille[l + 1][c + 1].equals("[ ]")) {
                                        if (numero == 3) {
                                            if(c!=0 && c!=5 ){
                                                if(laGrille[l +1][c -1].equals("[ ]")){
                                                    if(laGrille[l -2][c +2].equals("[ ]") && !(laGrille[l-1][c +2].equals("[ ]"))){
                                            colonneIa = c + 1;
                                            return 3; // diagonale droite de haut en bas 1.
                                        }
                                    } }}}
                                                else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l + 1][c + 1].equals("[J]")) {
                                        if (numero == 3) {
                                            if(c!=0 && c!=5 ){
                                                if(laGrille[l +1][c -1].equals("[ ]")){
                                                    if(laGrille[l -2][c +2].equals("[ ]") && !(laGrille[l-1][c +2].equals("[ ]"))){
                                            colonneIa = c;
                                            return 3; // diagonale droite de haut en bas 2.
                                        }
                                    }}}}
                                                else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[ ]") && !(laGrille[l + 1][c + 1].equals("[ ]"))) {
                                        if (numero == 3) {
                                            if(c!=0 && c<5){
                                                if(laGrille[l][c -1].equals("[ ]") && !(laGrille[l+1][c -1].equals("[ ]"))){
                                                    if(laGrille[l][c +2].equals("[ ]") && !(laGrille[l+1][c +2].equals("[ ]"))){
                                            colonneIa = c + 1;
                                            return 3; // horizontale de gauche a droite 1.
                                        }
                                    }}}}
                                                else if (laGrille[l][c].equals("[ ]") && !(laGrille[l + 1][c].equals("[ ]")) && laGrille[l][c + 1].equals("[J]")) {
                                        if (numero == 3) {
                                            if(c!=0 && c<5){
                                                if(laGrille[l][c -1].equals("[ ]") && !(laGrille[l+1][c -1].equals("[ ]"))){
                                                    if(laGrille[l][c +2].equals("[ ]") && !(laGrille[l+1][c +2].equals("[ ]"))){
                                            colonneIa = c;
                                            return 3; // horizontale de gauche a droite 2.
                                        }
                                    } }}}
                                                else if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[J]")) {
                                        if (numero == 3) {
                                                if(laGrille[l -1][c].equals("[ ]")){
                                                    if(laGrille[l -2][c].equals("[ ]")){
                                            colonneIa = c;
                                            return 3; // verticale de haut en bas 1.
                                        }
                                    }
                                } else if (l == 6 && c < 6) {

                                    // L'IA peut gagner

                                    if (laGrille[l][c].equals("[J]") && laGrille[l - 1][c + 1].equals("[ ]") && !(laGrille[l][c + 1].equals("[ ]"))) {
                                        if (numero == 3) {
                                            if(c<4){
                                                if(laGrille[l-2][c +2].equals("[ ]") && !(laGrille[l-1][c +2].equals("[ ]"))){
                                                    if(laGrille[l-3][c +3].equals("[ ]") && !(laGrille[l-2][c +3].equals("[ ]"))){
                                            colonneIa = c + 1;
                                            return 3; // diagonale droite de bas en haut 1.
                                        }
                                    }}}}
                                    else if (laGrille[l][c].equals("[ ]") && laGrille[l - 1][c + 1].equals("[J]")) {
                                        if (numero == 3) {
                                            if(c<4){
                                                if(laGrille[l-2][c +2].equals("[ ]") && !(laGrille[l-1][c +2].equals("[ ]"))){
                                                    if(laGrille[l-3][c +3].equals("[ ]") && !(laGrille[l-2][c +3].equals("[ ]"))){
                                            colonneIa = c;
                                            return 3; // diagonale droite de bas en haut 2.
                                        }
                                    }}}}
                                    else if (laGrille[l][c].equals("[J]") && laGrille[l][c + 1].equals("[ ]")) {
                                        if (numero == 3) {
                                            if(c<4){
                                                if(laGrille[l][c +2].equals("[ ]")){
                                                    if(laGrille[l][c +3].equals("[ ]")){
                                            colonneIa = c + 1; // horizontale de gauche à droite 1.
                                            return 3;
                                        }
                                    }}}}
                                    else if (laGrille[l][c].equals("[ ]") && laGrille[l][c + 1].equals("[J]")) {
                                        if (numero == 3) {
                                            if(c<4){
                                                if(laGrille[l][c +2].equals("[ ]")){
                                                    if(laGrille[l][c +3].equals("[ ]")){
                                            colonneIa = c; // horizontale de gauche à droite 2.
                                            return 3;
                                        }
                                    }
                                }}}
                                    else if (l < 6 && c >= 6) {

                                    // L'IA peut gagner

                                    if (laGrille[l][c].equals("[ ]") && laGrille[l + 1][c].equals("[J]")) {
                                        if (numero == 3) {
                                            if(l!=6 && l!=0){
                                                if(laGrille[l+2][c].equals("[ ]")){
                                                    if(laGrille[l-1][c].equals("[ ]")){
                                            colonneIa = c; // verticale de haut en bas 1.
                                            return 3;
                                        }
                                            }
                                    }
                                            else if(l==0 && l<4){
                                                if(laGrille[l+2][c].equals("[ ]")){
                                                    if(laGrille[l+3][c].equals("[ ]")){
                                                        colonneIa = c; // verticale de haut en bas 1.
                                                        return 3;
                                                    }
                                            }
                                }
                                            else if(l==5 && l>2){
                                                if(laGrille[l-1][c].equals("[ ]")){
                                                    if(laGrille[l-2][c].equals("[ ]")){
                                                        colonneIa = c; // verticale de haut en bas 1.
                                                        return 3;
                            }
                        }

                    }
                }

            }

        }

    }
}
                            }
                        }
                    }
                }
            }
        }
    }
}
            }
        }
        return 1;
    }
}


