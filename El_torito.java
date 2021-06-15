import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class El_torito extends JFrame implements ActionListener {


    JFrame fenetre;
    JButton[][] CaseJeu;
    JButton reset;

    El_torito() {


        fenetre = new JFrame("El_torito");
        CaseJeu = new JButton[5][4];
        reset = new JButton("Recommencer");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(new Dimension(600, 600));
        fenetre.setResizable(false);
        fenetre.setLocationRelativeTo(null);
        JPanel jeuPanel = new JPanel(new FlowLayout());
        JPanel Grille_du_jeu = new JPanel(new GridLayout(5, 4));

        jeuPanel.add(Grille_du_jeu, BorderLayout.CENTER);
        jeuPanel.setBackground(Color.black);
        JPanel menu = new JPanel(new FlowLayout());
        menu.add(reset);
        menu.setBackground(new Color(165, 42, 42));
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

    @Override
    public void actionPerformed(ActionEvent e) {



                if (((JButton) e.getSource()).getText().equals("")) {

        }
    }
}



