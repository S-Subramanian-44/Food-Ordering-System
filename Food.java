import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Food extends javax.swing.JFrame {
private javax.swing.JButton jButton1;
private javax.swing.JButton jButton2;
private javax.swing.JButton jButton3;
private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel2;
private javax.swing.JLabel jLabel3;
private javax.swing.JLabel jLabel4;
private javax.swing.JLabel jLabel5;
private javax.swing.JPanel jPanel1;
private javax.swing.JPanel jPanel2;
private javax.swing.JScrollPane jScrollPane1;
private javax.swing.JTable jTable1;
private javax.swing.JRadioButton lblchapathi;
private javax.swing.JRadioButton lbldosa;
private javax.swing.JRadioButton lblidly;
private javax.swing.JRadioButton lblkichadi;
private javax.swing.JRadioButton lblparota;
private javax.swing.JRadioButton lblpoori;
private javax.swing.JRadioButton lblravva;
private javax.swing.JRadioButton lblupma;
private javax.swing.JRadioButton lbluttappam;
private javax.swing.JRadioButton lblvada;
private javax.swing.JTextField txtbal;
private javax.swing.JTextField txtpay;
private javax.swing.JSpinner txtqty;
private javax.swing.JTextField txttotal;
public Food() {
initComponents();
}
DefaultTableModel model;
String item;
int price;
// <editor-fold defaultstate="collapsed" desc="Generated Code">

 private void updateDatabase() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/food", "root", "mani@2133044")) {
            String sql = "INSERT INTO orders (item, price, quantity, total) VALUES (?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                for (int row = 0; row < jTable1.getRowCount(); row++) {
                    preparedStatement.setString(1, jTable1.getValueAt(row, 0).toString());
                    preparedStatement.setInt(2, Integer.parseInt(jTable1.getValueAt(row, 1).toString()));
                    preparedStatement.setInt(3, Integer.parseInt(jTable1.getValueAt(row, 2).toString()));
                    preparedStatement.setInt(4, Integer.parseInt(jTable1.getValueAt(row, 3).toString()));

                    preparedStatement.executeUpdate();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void updateTotal() {
        int sum = 0;
        for (int a = 0; a < jTable1.getRowCount(); a++) {
            sum = sum + Integer.parseInt(jTable1.getValueAt(a, 3).toString());
        }
        txttotal.setText(Integer.toString(sum));
    }

private void initComponents() {
jPanel1 = new javax.swing.JPanel();
jLabel1 = new javax.swing.JLabel();
jPanel2 = new javax.swing.JPanel();
lblidly = new javax.swing.JRadioButton();
lbldosa = new javax.swing.JRadioButton();
lblvada = new javax.swing.JRadioButton();
lblpoori = new javax.swing.JRadioButton();
lblchapathi = new javax.swing.JRadioButton();
lblparota = new javax.swing.JRadioButton();
lbluttappam = new javax.swing.JRadioButton();
lblupma = new javax.swing.JRadioButton();
lblravva = new javax.swing.JRadioButton();
lblkichadi = new javax.swing.JRadioButton();
jScrollPane1 = new javax.swing.JScrollPane();
jTable1 = new javax.swing.JTable();
txtpay = new javax.swing.JTextField();
jLabel2 = new javax.swing.JLabel();
jLabel3 = new javax.swing.JLabel();
jLabel4 = new javax.swing.JLabel();
txtbal = new javax.swing.JTextField();
jButton1 = new javax.swing.JButton();
jButton2 = new javax.swing.JButton();
txttotal = new javax.swing.JTextField();
jLabel5 = new javax.swing.JLabel();
txtqty = new javax.swing.JSpinner();
jButton3 = new javax.swing.JButton();
setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
jPanel1.setBackground(new java.awt.Color(0, 0, 255));
jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24));
jLabel1.setForeground(new java.awt.Color(255, 255, 51));
jLabel1.setText("Food Ordering System");
javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
jPanel1.setLayout(jPanel1Layout);
jPanel1Layout.setHorizontalGroup(
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
jPanel1Layout.createSequentialGroup()
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(jLabel1)
.addGap(351, 351, 351))
);
jPanel1Layout.setVerticalGroup(

jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(21, 21, 21)
.addComponent(jLabel1)
.addContainerGap(26, Short.MAX_VALUE))
);
lblidly.setFont(new java.awt.Font("Segoe UI", 3, 18));
lblidly.setText("Idly");
lbldosa.setFont(new java.awt.Font("Segoe UI", 3, 18));
lbldosa.setText("Dosa");
lblvada.setFont(new java.awt.Font("Segoe UI", 3, 18));
lblvada.setText("Vada");
lblpoori.setFont(new java.awt.Font("Segoe UI", 3, 18));
lblpoori.setText("Poori");
lblchapathi.setFont(new java.awt.Font("Segoe UI", 3, 18));
lblchapathi.setText("Chapathi");
lblparota.setFont(new java.awt.Font("Segoe UI", 3, 18));
lblparota.setText("Paroto");
lbluttappam.setFont(new java.awt.Font("Segoe UI", 3, 18));
lbluttappam.setText("Uttappam");
lblupma.setFont(new java.awt.Font("Segoe UI", 3, 18));
lblupma.setText("Upma");
lblravva.setFont(new java.awt.Font("Segoe UI", 3, 18));
lblravva.setText("Ravva");
lblkichadi.setFont(new java.awt.Font("Segoe UI", 3, 18));
lblkichadi.setText("Kichadi");
lblkichadi.addAncestorListener(new javax.swing.event.AncestorListener() {
public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
}
public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
}
public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
lblkichadiAncestorMoved(evt);
}
});
javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
jPanel2.setLayout(jPanel2Layout);
jPanel2Layout.setHorizontalGroup(

jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel2Layout.createSequentialGroup()
.addGap(38, 38, 38)
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel2Layout.createSequentialGroup()
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(lbldosa)
.addComponent(lblidly))
.addGap(43, 43, 43)
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(lblparota)
.addComponent(lblchapathi)))
.addGroup(jPanel2Layout.createSequentialGroup()
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(lblvada)
.addComponent(lblpoori)
.addComponent(lblravva))
.addGap(32, 32, 32)
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(lblkichadi)
.addComponent(lblupma)
.addComponent(lbluttappam))))
.addContainerGap(25, Short.MAX_VALUE))
);
jPanel2Layout.setVerticalGroup(
jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel2Layout.createSequentialGroup()
.addGap(40, 40, 40)
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(lblidly)
.addComponent(lblchapathi))
.addGap(18, 18, 18)
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(lbldosa)
.addComponent(lblparota))
.addGap(18, 18, 18)
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(lblvada)
.addComponent(lbluttappam))
.addGap(18, 18, 18)

.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(lblpoori)
.addComponent(lblupma))
.addGap(18, 18, 18)
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(lblravva)
.addComponent(lblkichadi))
.addContainerGap(55, Short.MAX_VALUE))
);
jTable1.setModel(new javax.swing.table.DefaultTableModel(
new Object [][] {
},
new String [] {
"Item", "Price", "Quantity", "Total"
}
));
jScrollPane1.setViewportView(jTable1);
txtpay.setFont(new java.awt.Font("Segoe UI", 1, 14));
jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14));
jLabel2.setText("Balance");
jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14));
jLabel3.setText("Total");
jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14));
jLabel4.setText("Payment");
txtbal.setFont(new java.awt.Font("Segoe UI", 1, 14));
jButton1.setText("Add");
jButton1.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton1ActionPerformed(evt);
}
});
jButton2.setText("Order");
jButton2.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton2ActionPerformed(evt);
}
});

txttotal.setFont(new java.awt.Font("Segoe UI", 1, 14));
jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14));
jLabel5.setText("Quantity");
txtqty.setFont(new java.awt.Font("Segoe UI", 2, 14));
jButton3.setText("Remove");
jButton3.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton3ActionPerformed(evt);
}
});
javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addContainerGap())
.addGroup(layout.createSequentialGroup()
.addGap(9, 9, 9)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel5)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE,
76, javax.swing.GroupLayout.PREFERRED_SIZE)))
.addGap(18, 18, 18)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addGroup(layout.createSequentialGroup()
.addComponent(jButton1,
javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(77, 77, 77)
.addComponent(jButton3,

javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)

.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(jButton2,
javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
430, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(60, 60, 60)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabel4)
.addComponent(jLabel3)
.addComponent(jLabel2))

.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
70, Short.MAX_VALUE)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addComponent(txtpay, javax.swing.GroupLayout.DEFAULT_SIZE, 77,
Short.MAX_VALUE)
.addComponent(txttotal)
.addComponent(txtbal))
.addGap(18, 18, 18))))
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(18, 18, 18)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
333, javax.swing.GroupLayout.PREFERRED_SIZE)))
.addGroup(layout.createSequentialGroup()
.addGap(115, 115, 115)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabel3)
.addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(30, 30, 30)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

.addComponent(jLabel4)

.addComponent(txtpay, javax.swing.GroupLayout.PREFERRED_SIZE, 31,

javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(33, 33, 33)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel2)

.addComponent(txtbal, javax.swing.GroupLayout.PREFERRED_SIZE, 31,

javax.swing.GroupLayout.PREFERRED_SIZE))))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(txtqty, javax.swing.GroupLayout.DEFAULT_SIZE, 41,
Short.MAX_VALUE)
.addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
.addGap(47, 47, 47))
);
pack();
setLocationRelativeTo(null);
}
private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
model.removeRow(jTable1.getSelectedRow());
int sum = 0;
for(int a=0; a<jTable1.getRowCount(); a++)
{
sum = sum + Integer.parseInt(jTable1.getValueAt(a, 3).toString());
}
txttotal.setText(Integer.toString(sum));
}
private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
int tot = Integer.parseInt(txttotal.getText());
int pay = Integer.parseInt(txtpay.getText());
int bal = pay - tot;
txtbal.setText(String.valueOf(bal));

JOptionPane.showMessageDialog(this, "Order Completed!!!");
}
private void lblkichadiAncestorMoved(javax.swing.event.AncestorEvent evt) {
}
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    if (lblidly.isSelected()) {
        item = "Idly";
        price = 10;
    } else if (lbldosa.isSelected()) {
        item = "Dosa";
        price = 10;
    } else if (lblvada.isSelected()) {
        item = "Vada";
        price = 8;
    } else if (lblpoori.isSelected()) {
        item = "Poori";
        price = 15; // Assuming this is the correct price for Poori
    } else if (lblravva.isSelected()) {
        item = "Ravva";
        price = 20;
    } else if (lblchapathi.isSelected()) {
        item = "Chapathi";
        price = 10;
    } else if (lblparota.isSelected()) {
        item = "Parota";
        price = 12;
    } else if (lbluttappam.isSelected()) {
        item = "Uttappam";
        price = 8;
    } else if (lblupma.isSelected()) {
        item = "Upma";
        price = 20;
    } else if (lblkichadi.isSelected()) {
        item = "Kichadi";
        price = 20;
    }

    int qty = Integer.parseInt(txtqty.getValue().toString());
    int tot = qty * price;
    model = (DefaultTableModel) jTable1.getModel();
    model.addRow(new Object[]{item, price, qty, tot});
    
    int sum = 0;
    for (int a = 0; a < jTable1.getRowCount(); a++) {
        sum = sum + Integer.parseInt(jTable1.getValueAt(a, 3).toString());
    }
    txttotal.setText(Integer.toString(sum));

    // Call the method to update the database
    updateDatabase();
}
public static void main(String args[]) {
try {
for (javax.swing.UIManager.LookAndFeelInfo info :
javax.swing.UIManager.getInstalledLookAndFeels()) {
if ("Nimbus".equals(info.getName())) {
javax.swing.UIManager.setLookAndFeel(info.getClassName());
break;
}

}
} catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
javax.swing.UnsupportedLookAndFeelException ex) {
java.util.logging.Logger.getLogger(Food.class.getName()).log(java.util.logging.Level.SEVERE, null,
ex);
}
java.awt.EventQueue.invokeLater(() -> {
new Food().setVisible(true);
});
}
}







