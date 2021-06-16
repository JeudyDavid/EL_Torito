
import java.awt.*;
        import javax.swing.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class El_Torito extends JFrame implements ActionListener {



    JFrame fenetre;
    JButton[][] CaseJeu;
    JButton reset;

    El_Torito() {


        fenetre = new JFrame("El_torito");
        CaseJeu = new JButton[5][4];
        reset = new JButton("tu as 0 / 5");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(new Dimension(400, 550));
        fenetre.setResizable(false);
        fenetre.setLocationRelativeTo(null);
        JPanel jeuPanel = new JPanel(new FlowLayout());
        JPanel Grille_du_jeu = new JPanel(new GridLayout(5, 4));

        jeuPanel.add(Grille_du_jeu, BorderLayout.CENTER);
        jeuPanel.setBackground(Color.black);
        JPanel menu = new JPanel(new FlowLayout());
        menu.add(reset);
        menu.setBackground(Color.black);
        fenetre.add(jeuPanel, BorderLayout.NORTH);
        fenetre.add(menu, BorderLayout.CENTER);

        for (int ligne = 0; ligne < 5; ligne++) {
            for (int colonne = 0; colonne < 4; colonne++) {
                String[] arr = {"mort", "Melancolie", "horreur", "tristesse", "peur", "desole", "desole", "desole", "desole", "desole", "desole"};
                Random random = new Random();
                int select = random.nextInt(arr.length);
                CaseJeu[ligne][colonne] = new JButton("");
                CaseJeu[ligne][colonne].setPreferredSize(new Dimension(90, 90));
                int finalLigne = ligne;
                int finalColonne = colonne;
                CaseJeu[ligne][colonne].addActionListener(e -> CaseJeu[finalLigne][finalColonne].setText(arr[select]));
                if(CaseJeu[ligne][colonne].getText() == "peur"){
                    reset.setText("Jeudy");
                }

                CaseJeu[ligne][colonne].getText();
                CaseJeu[ligne][colonne].addActionListener(this);
                Grille_du_jeu.add(CaseJeu[ligne][colonne]);
            }
        }



//        for (int ligne = 0; ligne < 5; ligne++) {
//            int i = 0;
//            for (int colonne = 0; colonne < 4; colonne++) {
//
//            }
//        }

//        for (int ligne = 0; ligne < 3; ligne++) {
//            for (int colonne = 0; colonne < 3; colonne++) {
//                CaseJeu[ligne][colonne].addActionListener(this);
//            }
//        }

        fenetre.setVisible(true);


    }
    int compteur = 0;
    int c = 0;
    int i =0;
    @Override
    public void actionPerformed(ActionEvent e) {


        if(((JButton) e.getSource()).getText().equals("")){
            if(c == 5){
                fenetre.dispatchEvent(new WindowEvent(fenetre, WindowEvent.WINDOW_CLOSING));
            }
            else if(c > 4){
                new El_Torito();
            }
            c++;
            for (int ligne = 0; ligne < 5; ligne++) {
                  for (int colonne = 0; colonne < 4; colonne++) {

                    ArrayList<String> resultat = new ArrayList<String>();
                    resultat.add(CaseJeu[ligne][colonne].getText());
//                    System.out.println(resultat.get(compteur));
                      if (resultat.get(compteur) == "peur" || resultat.get(compteur) == "Melancolie" || resultat.get(compteur) == "mort" || resultat.get(compteur) == "tristesse" || resultat.get(compteur) == "horreur") {
                          ArrayList<String> resultat2 = new ArrayList<String>();
                          int taille = resultat2.size();
                          resultat2.add(resultat.get(compteur));
                          System.out.println(resultat2.get(compteur));
                          for(int i=0; i < resultat2.size(); i++){
                              for(int j=i+1; j<resultat2.size(); j++){
                                  if((resultat2.get(i)).equals(resultat2.get(j))){
                                      taille--;
                                      break;
                                  }
                              }
                          }
                          reset.setText("tu as "+resultat.get(compteur)+" / 5 ");
                          System.out.println(resultat2.size());
//                          resultat2.add(resultat.get(compteur));
//                          System.out.println(resultat2.get(compteur));
                          i++;
//                          reset.setText("tu as "+taille +" / 5 ");
                      }


//                      compteur = compteur  + 1;

                }

            }

        }


//        if (((JButton) e.getSource()).getText().equals("Melancolie") || ((JButton) e.getSource()).getText().equals("peur") || ((JButton) e.getSource()).getText().equals("mort") || ((JButton) e.getSource()).getText().equals("Melancolie") || ((JButton) e.getSource()).getText().equals("Mort")) {
//        if(((JButton) e.getSource()).getText().equals("")){
//            for (int ligne = 0; ligne < 5; ligne++) {
//                for (int colonne = 0; colonne < 4; colonne++) {
//                    ArrayList<String> resultat= new ArrayList<String>();
//                    resultat.add(CaseJeu[ligne][colonne].getText());
//                    System.out.println(resultat.get(compteur));
//                    if(((JButton) e.getSource()).getText() == "peur"){
//                        System.out.println("buo");
//                        compteur++;
//                    }
//
//
//                }
//            }
//
//
//        }


    }

}

