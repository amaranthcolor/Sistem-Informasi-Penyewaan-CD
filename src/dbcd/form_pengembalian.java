/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbcd;

/**
 *
 * @author USER
 */
import Koneksi.Db_Koneksi;
import com.mysql.jdbc.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class form_pengembalian extends javax.swing.JFrame {
    
    private DefaultTableModel model;
    String idtrans, idmem, nama,kode, judul, pinjam, pengem, kembali, blnpengem,blnkembali, ddenda;
    int intblnpengem,intblnkembali;
    double harga, denda, lambat;

    /**
     * Creates new form form_pengembalian
     */
    public form_pengembalian() {
        initComponents();
        
        model = new DefaultTableModel();
        tbkembali.setModel(model);
        model.addColumn("Id Transaksi");
        model.addColumn("Id Member");
        model.addColumn("Nama Member");
        model.addColumn("Kode Film");
        model.addColumn("Judul Film");
        model.addColumn("Tanggal Pinjam");
        model.addColumn("Tanggal Pengembalian");
        model.addColumn("Harga");
        model.addColumn("Tanggal Kembali");
        model.addColumn("Denda");
        
        getData();
        tombol();
    }
    
    public void getData(){
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
        try{
            Statement stat = (Statement) Db_Koneksi.getKoneksi().createStatement();
            String sql = "Select * from tbkembali";
            ResultSet res = stat.executeQuery(sql);
            
            while(res.next()){
                Object[] obj = new Object[10];
                obj[0] = res.getString("id_transaksi");
                obj[1] = res.getString("id_member");
                obj[2] = res.getString("nama_member");
                obj[3] = res.getString("kode_film");
                obj[4] = res.getString("judul_film");
                obj[5] = res.getString("tgl_pinjam");
                obj[6] = res.getString("tgl_pengem");
                obj[7] = res.getString("harga");
                obj[8] = res.getString("tgl_dikem");
                obj[9] = res.getString("denda");
                
                model.addRow(obj);
            }
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtidtrans = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtkode = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtjudul = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tglpengem = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        tglpinjam = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        tglkembali = new com.toedter.calendar.JDateChooser();
        txtdenda = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtidmember = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtlambat = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbkembali = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Pengembalian");

        jPanel1.setBackground(new java.awt.Color(213, 204, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("ID Transaksi");

        txtidtrans.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("ID Member");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Nama Member");

        txtnama.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Kode Film");

        txtkode.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtkode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtkodeKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Judul Film");

        txtjudul.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Tanggal Pinjam");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Tanggal Pengembalian");

        tglpengem.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tglpengem.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tglpengemPropertyChange(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Harga");

        txtharga.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btnsave.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnupdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnclose.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnclose.setText("Close");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        btnreset.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        btndelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        tglpinjam.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Tanggal Kembali");

        tglkembali.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tglkembali.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tglkembaliPropertyChange(evt);
            }
        });

        txtdenda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Denda");

        txtidmember.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Keterlambatan");

        txtlambat.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Hitung");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tglpengem, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(txtidtrans)
                            .addComponent(txtnama)
                            .addComponent(txtkode, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtjudul)
                            .addComponent(txtharga)
                            .addComponent(tglpinjam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tglkembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtdenda)
                            .addComponent(txtidmember)
                            .addComponent(txtlambat, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btndelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnclose, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidtrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtidmember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtjudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(tglpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tglpengem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(tglkembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlambat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave)
                    .addComponent(btnupdate)
                    .addComponent(btnreset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndelete)
                    .addComponent(btnclose))
                .addContainerGap())
        );

        tbkembali.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbkembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbkembaliMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbkembali);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel13.setText("PENGEMBALIAN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void loadData(){
        idtrans = txtidtrans.getText();
        idmem = txtidmember.getText();
        nama = txtnama.getText();
        kode = txtkode.getText();
        judul = txtjudul.getText();
        pinjam = tglpinjam.getDateFormatString();
        pengem = tglpengem.getDateFormatString();
        harga = Double.parseDouble(txtharga.getText());
        kembali = tglkembali.getDateFormatString();
        denda = Double.parseDouble(txtdenda.getText());
        
    }
    
    void tombol(){
        txtidtrans.setEnabled(false);
        txtidmember.setEnabled(false);
        txtnama.setEnabled(false);
        txtjudul.setEnabled(false);
        tglpinjam.setEnabled(false);
        tglpengem.setEnabled(false);
        txtharga.setEnabled(false);
    }
    
    public void dataPinjam(){   
        try{
            
            java.sql.Statement stat = (java.sql.Statement) Db_Koneksi.getKoneksi().createStatement();
           
            
            String sql = "SELECT * FROM tbpinjam WHERE kode_film = '"+ txtkode.getText() +"'";
            ResultSet res = stat.executeQuery(sql);
                        
            
            while(res.next()){
                
               txtidtrans.setText(res.getString("id_transaksi"));
               txtidmember.setText(res.getString("id_member"));
               txtnama.setText(res.getString("nama_member"));
               txtjudul.setText(res.getString("judul_film"));
               tglpinjam.setDate(res.getDate("tgl_pinjam"));
               tglpengem.setDate(res.getDate("tgl_pengem"));
               txtharga.setText(res.getString("harga"));
            }
        }catch(SQLException err){
           JOptionPane.showMessageDialog(null, err.getMessage());
        }
    }
    
    public void saveData(){
        loadData();
        String tampilan = "yyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String pinjam=String.valueOf(fm.format(tglpinjam.getDate()));
        String pengem=String.valueOf(fm.format(tglpengem.getDate()));
        String kembali=String.valueOf(fm.format(tglkembali.getDate()));
        try{
            Statement stat = (Statement) Db_Koneksi.getKoneksi().createStatement();
            String  sql =   "INSERT INTO tbkembali(id_transaksi,id_member,nama_member,kode_film,judul_film,tgl_pinjam,tgl_pengem,harga,tgl_dikem,denda)" + "VALUES('"+ idtrans +"','"+ idmem +"','"+ nama +"','"+ kode +"','"+ judul +"','"+ pinjam +"','"+ pengem +"','"+ harga +"','"+ kembali +"','"+ denda +"')";
            PreparedStatement p = (PreparedStatement) Db_Koneksi.getKoneksi().prepareStatement(sql);
            p.executeUpdate();
            getData();
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
    }
    
    public void Reset(){
        idtrans = "";
        idmem = "";
        nama = "";
        kode = "";
        judul = "";
        pinjam = "";
        pengem = "";
        harga = 0;
        kembali = "";
        denda = 0;
        txtidtrans.setText(idtrans);
        txtidmember.setText(idmem);
        txtnama.setText(nama);
        txtkode.setText(kode);
        txtjudul.setText(judul);
        tglpinjam.setDate(null);
        tglpengem.setDate(null);
        txtharga.setText("");
        tglkembali.setDate(null);
        txtlambat.setText("");
        txtdenda.setText("");
    }
    
    public void dataSelect(){
        int i = tbkembali.getSelectedRow();
        if (i == -1){
            return;
        }
        txtidtrans.setText(""+model.getValueAt(i, 0));
        txtidmember.setText(""+model.getValueAt(i, 1));
        txtnama.setText(""+model.getValueAt(i, 2));
        txtkode.setText(""+model.getValueAt(i, 3));
        txtjudul.setText(""+model.getValueAt(i, 4));
        tglpinjam.setDateFormatString(""+model.getValueAt(i, 5));
        tglpengem.setDateFormatString(""+model.getValueAt(i, 6));
        txtharga.setText(""+model.getValueAt(i, 7));
        tglkembali.setDateFormatString(""+model.getValueAt(i, 8));
        txtdenda.setText(""+model.getValueAt(i, 9));
    }
    
    public void updateData(){
        loadData();
        try{
            Statement stat = (Statement) Db_Koneksi.getKoneksi().createStatement();
            String sql = "UPDATE tbkembali SET id_member = '"+idmem+"',"
                                        + "nama_member = '"+nama+"',"
                                        + "kode_film = '"+kode+"',"
                                        + "judul_film = '"+judul+"',"
                                        + "tgl_pinjam = '"+pinjam+"',"
                                        + "tgl_pengem = '"+pengem+"',"
                                        + "harga = '"+harga+"'," 
                                        + "tgl_dikem = '"+kembali+"' WHERE id_transaksi = '"+idtrans+"'";
            PreparedStatement p = (PreparedStatement) Db_Koneksi.getKoneksi().prepareStatement(sql);
            p.executeUpdate();
            getData();
            Reset();
            JOptionPane.showMessageDialog(null, "Update Berhasil");           
        }catch(SQLException er){
            JOptionPane.showMessageDialog(null, er.getMessage());
        }
    }
    
    public void deleteData(){
        loadData();
        int pesan = JOptionPane.showConfirmDialog(null, "Anda yakin menghapus data "+idtrans+"?","Konfirmasi",
                    JOptionPane.OK_CANCEL_OPTION);
        if (pesan == JOptionPane.OK_OPTION){
            try{
                Statement stat =(Statement) Db_Koneksi.getKoneksi().createStatement();
                String sql = "DELETE FROM tbkembali WHERE id_transaksi = '"+idtrans+"' AND kode_film = '"+kode+"'";
                PreparedStatement p = (PreparedStatement) Db_Koneksi.getKoneksi().prepareStatement(sql);
                p.executeUpdate();
                getData();
                Reset();
                JOptionPane.showMessageDialog(null,"Delete Berhasil");
            }catch(SQLException er){
                JOptionPane.showMessageDialog(null, er.getMessage());
            }
        }
    }
    
    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        saveData();
        try{
            Statement stat = (Statement) Db_Koneksi.getKoneksi().createStatement();
            String  sql =   "DELETE FROM tbpinjam WHERE id_transaksi = '"+idtrans+"'";
            PreparedStatement p = (PreparedStatement) Db_Koneksi.getKoneksi().prepareStatement(sql);
            p.executeUpdate();
            getData();
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        updateData();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btncloseActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        Reset();
    }//GEN-LAST:event_btnresetActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        deleteData();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void tbkembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbkembaliMouseClicked
        // TODO add your handling code here:
        dataSelect();
    }//GEN-LAST:event_tbkembaliMouseClicked

    private void txtkodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkodeKeyReleased
        // TODO add your handling code here:
        dataPinjam();
    }//GEN-LAST:event_txtkodeKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            int tahunP = Integer.parseInt(pengem.substring(7, 11));
            int hariP = Integer.parseInt(pengem.substring(0, 2));
            blnpengem = (String) pengem.substring(3, 6);
            if (blnpengem.compareTo("Jan") == 0) {
                intblnpengem = 1;
            } else if (blnpengem.compareTo("Feb") == 0) {
                intblnpengem = 2;
            } else if (blnpengem.compareTo("Mar") == 0) {
                intblnpengem = 3;
            } else if (blnpengem.compareTo("Apr") == 0) {
                intblnpengem = 4;
            } else if (blnpengem.compareTo("May") == 0) {
                intblnpengem = 5;
            } else if (blnpengem.compareTo("Jun") == 0) {
                intblnpengem = 6;
            } else if (blnpengem.compareTo("Jul") == 0) {
                intblnpengem = 7;
            } else if (blnpengem.compareTo("Aug") == 0) {
                intblnpengem = 8;
            } else if (blnpengem.compareTo("Sep") == 0) {
                intblnpengem = 9;
            } else if (blnpengem.compareTo("Oct") == 0) {
                intblnpengem = 10;
            } else if (blnpengem.compareTo("Nov") == 0) {
                intblnpengem = 11;
            } else {
                intblnpengem = 12;
            }
            int tahunK = Integer.parseInt(kembali.substring(7, 11));
            int hariK = Integer.parseInt(kembali.substring(0, 2));
            blnkembali = (String) kembali.substring(3, 6);
            if (blnkembali.compareTo("Jan") == 0) {
                intblnkembali = 1;
            } else if (blnkembali.compareTo("Feb") == 0) {
                intblnkembali = 2;
            } else if (blnkembali.compareTo("Mar") == 0) {
                intblnkembali = 3;
            } else if (blnkembali.compareTo("Apr") == 0) {
                intblnkembali = 4;
            } else if (blnkembali.compareTo("May") == 0) {
                intblnkembali = 5;
            } else if (blnkembali.compareTo("Jun") == 0) {
                intblnkembali = 6;
            } else if (blnkembali.compareTo("Jul") == 0) {
                intblnkembali = 7;
            } else if (blnkembali.compareTo("Aug") == 0) {
                intblnkembali = 8;
            } else if (blnkembali.compareTo("Sep") == 0) {
                intblnkembali = 9;
            } else if (blnkembali.compareTo("Oct") == 0) {
                intblnkembali = 10;
            } else if (blnkembali.compareTo("Nov") == 0) {
                intblnkembali = 11;
            } else {
                intblnkembali = 12;
            }
            int hasilHari = hariK - hariP;
            int hasilBulan = (intblnkembali - intblnpengem) * 30;
            int hasiltahun = (tahunK - tahunP) * 365;
            int totalwaktu = (hasilHari + hasilBulan + hasiltahun);
            txtlambat.setText(String.valueOf(totalwaktu));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        harga = Double.parseDouble(txtharga.getText());
        lambat = Double.parseDouble(txtlambat.getText());
        denda = (harga * 0.1) * lambat;

        txtdenda.setText(String.valueOf(denda));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tglpengemPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tglpengemPropertyChange
        // TODO add your handling code here:
        if(tglpengem.getDate()!=null){
            SimpleDateFormat Format = new SimpleDateFormat("dd MMM yyyy");
            pengem = Format.format(tglpengem.getDate());
        }
    }//GEN-LAST:event_tglpengemPropertyChange

    private void tglkembaliPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tglkembaliPropertyChange
        // TODO add your handling code here:
        if(tglkembali.getDate()!=null){
            SimpleDateFormat Format = new SimpleDateFormat("dd MMM yyyy");
            kembali = Format.format(tglkembali.getDate());
        }
    }//GEN-LAST:event_tglkembaliPropertyChange

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(form_pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_pengembalian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbkembali;
    private com.toedter.calendar.JDateChooser tglkembali;
    private com.toedter.calendar.JDateChooser tglpengem;
    private com.toedter.calendar.JDateChooser tglpinjam;
    private javax.swing.JTextField txtdenda;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtidmember;
    private javax.swing.JTextField txtidtrans;
    private javax.swing.JTextField txtjudul;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtlambat;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
