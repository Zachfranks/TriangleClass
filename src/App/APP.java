package App;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class APP {

    private static com.company.TryangleClass Side;

    //items on the form
    private JPanel frmMain;
    private JSpinner nmbA;
    private JSpinner nmbB;
    private JSpinner nmbC;
    private JButton btnShow;
    private JLabel lblArea;
    private JLabel lblperm;
    private JLabel lblType;
    private JLabel lblHei;
    private JLabel lblInC;
    private JLabel lblCirmcum;

    public APP() {
        btnShow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //getting the int's from the text boxs
                int sideA = (Integer) nmbA.getValue();
                int sideB = (Integer) nmbB.getValue();
                int sideC = (Integer) nmbC.getValue();

                //calling the class as a variuble
                Side = new com.company.TryangleClass(sideA,sideB,sideC);

                //dispying it to labes
                lblperm.setText("the perimeter is: " + (Side.GetPerminter()));
                lblArea.setText("the area is: " + (Side.GetArea()));
                lblType.setText(Side.GetType());
                lblHei.setText("the height is: " + (Side.GetHeight()));
                lblInC.setText("the in circle is: " + Side.GetInRaduis());
                lblCirmcum.setText("the circum Circle is: " + Side.GetCircumArea());

            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame ("APP");
        frame.setContentPane(new APP().frmMain);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
