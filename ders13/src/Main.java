import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class hesapMakinesi extends JFrame implements ActionListener {
    public static void main(String args[]) {
        hesapMakinesi t = new hesapMakinesi();
    }
    JButton topla =new JButton("+");
    JButton cikar =new JButton("-");
    JButton carp =new JButton("*");
    JButton bol =new JButton("/");
    JTextField birinci =new JTextField();
    JTextField ikinci =new JTextField();
    JLabel lbl=new JLabel("Cevap");

    hesapMakinesi() {
        birinci.setBounds(90, 50, 150, 30);
        add(birinci);
        ikinci.setBounds(90, 80, 150, 30);
        add(ikinci);
        topla.setBounds(50, 200, 100, 30);
        add(topla);
        cikar.setBounds(150, 200, 100, 30);
        add(cikar);
        carp.setBounds(250, 200, 100, 30);
        add(carp);
        bol.setBounds(350, 200, 100, 30);
        add(bol);
        lbl.setBounds(90, 140, 150, 30);
        add(lbl);
        topla.addActionListener(this);
        cikar.addActionListener(this);
        carp.addActionListener(this);
        bol.addActionListener(this);
        setLayout(null);
        setSize(500, 500);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        int sayi1 = Integer.parseInt(birinci.getText());
        int sayi2 = Integer.parseInt(ikinci.getText());
        int sonuc = 0;
        if (e.getSource().equals(topla)) {
            sonuc = sayi1 + sayi2;
            lbl.setText(String.valueOf(sonuc));
        } else if (e.getSource().equals(cikar)) {
            sonuc = sayi1 - sayi2;
            lbl.setText(String.valueOf(sonuc));
        } else if (e.getSource().equals(carp)) {
            sonuc = sayi1 * sayi2;
            lbl.setText(String.valueOf(sonuc));
        } else if (e.getSource().equals(bol)) {
            sonuc = sayi1 / sayi2;
            lbl.setText(String.valueOf(sonuc));
        }
    }


}