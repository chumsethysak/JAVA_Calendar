
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chums
 */
public class frmCalendar extends javax.swing.JFrame {

    /**
     * Creates new form frmCalendar
     */
    public frmCalendar() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_HORIZ);
        this.setVisible(true);
        this.setResizable(false);
        tblMonths=new JTable[]{tblJan,tblFeb,tblMarch,tblApril,tblMay,tblJune,tblJuly,tblAugust,tblSeptember,tblOctober,tblNovember,tblDecember};

        for(JTable tbl:tblMonths){
            for(int i=0;i<tbl.getColumnCount();i++){
                
                tbl.getColumnModel().getColumn(i).setCellRenderer(new CalendarClass.StatusColumnCellRenderer());      
            }
           
            tbl.getColumnModel().getColumn(0).setHeaderRenderer(CalendarClass.RenderHeaderColor(Color.red.darker()));
            tbl.getColumnModel().getColumn(6).setHeaderRenderer(CalendarClass.RenderHeaderColor(Color.ORANGE));
            for(int i=1;i<6;i++){
           tbl.getColumnModel().getColumn(i).setHeaderRenderer(CalendarClass.RenderHeaderColor(Color.GREEN.darker()));
          
            }

            tbl.getTableHeader().setReorderingAllowed(false);
            tbl.getTableHeader().setResizingAllowed(false);
            
            tbl.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent me) {              
                }

                @Override
                public void mousePressed(MouseEvent me) {
                    if(selectedTable==tbl&&countUnfocused<12){
                        int row=tbl.getSelectedRow();
                        int col=tbl.getSelectedColumn();
                        if(row!=-1&&col!=-1){
                            for(JTable TemTbl:tblMonths)
                                if(TemTbl!=tbl)
                                    TemTbl.clearSelection();
                        }
                    }
                }

                @Override
                public void mouseReleased(MouseEvent me) {                   
                }

                @Override
                public void mouseEntered(MouseEvent me) {
                    selectedTable=tbl;
                    countUnfocused--;
                }

                @Override
                public void mouseExited(MouseEvent me) {
                    countUnfocused++;
                }
            });
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        cbxYear = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblJan = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFeb = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMarch = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblJune = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblMay = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblApril = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblSeptember = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblAugust = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblJuly = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblDecember = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblNovember = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblOctober = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(getMinimumSize());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        cbxYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxYearItemStateChanged(evt);
            }
        });

        tblJan.setFont(new java.awt.Font("Khmer OS", 0, 12)); // NOI18N
        tblJan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "អាទិ", "ច័ន្ទ", "អង្គារ", "ពុធ", "ព្រហ.", "សុក្រ", "សៅរ៍"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblJan.setCellSelectionEnabled(true);
        tblJan.setDropMode(javax.swing.DropMode.ON);
        tblJan.setName("JAN"); // NOI18N
        tblJan.setRowHeight(20);
        tblJan.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblJan.getTableHeader().setResizingAllowed(false);
        tblJan.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblJan);

        tblFeb.setFont(new java.awt.Font("Khmer OS", 0, 12)); // NOI18N
        tblFeb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "អាទិ", "ច័ន្ទ", "អង្គារ", "ពុធ", "ព្រហ.", "សុក្រ", "សៅរ៍"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFeb.setCellSelectionEnabled(true);
        tblFeb.setMinimumSize(new java.awt.Dimension(150, 180));
        tblFeb.setName("FEB"); // NOI18N
        tblFeb.setPreferredSize(new java.awt.Dimension(525, 120));
        tblFeb.setRowHeight(20);
        tblFeb.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(tblFeb);

        tblMarch.setFont(new java.awt.Font("Khmer OS", 0, 12)); // NOI18N
        tblMarch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "អាទិ", "ច័ន្ទ", "អង្គារ", "ពុធ", "ព្រហ.", "សុក្រ", "សៅរ៍"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMarch.setCellSelectionEnabled(true);
        tblMarch.setName("MAR"); // NOI18N
        tblMarch.setPreferredSize(tblJan.getPreferredSize());
        tblMarch.setRowHeight(20);
        tblMarch.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(tblMarch);

        tblJune.setFont(new java.awt.Font("Khmer OS", 0, 12)); // NOI18N
        tblJune.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "អាទិ", "ច័ន្ទ", "អង្គារ", "ពុធ", "ព្រហ.", "សុក្រ", "សៅរ៍"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblJune.setCellSelectionEnabled(true);
        tblJune.setName("JUN"); // NOI18N
        tblJune.setPreferredSize(new java.awt.Dimension(525, 120));
        tblJune.setRowHeight(20);
        jScrollPane4.setViewportView(tblJune);

        tblMay.setFont(new java.awt.Font("Khmer OS", 0, 12)); // NOI18N
        tblMay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "អាទិ", "ច័ន្ទ", "អង្គារ", "ពុធ", "ព្រហ.", "សុក្រ", "សៅរ៍"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMay.setCellSelectionEnabled(true);
        tblMay.setName("MAY"); // NOI18N
        tblMay.setPreferredSize(tblJan.getPreferredSize());
        tblMay.setRowHeight(20);
        jScrollPane5.setViewportView(tblMay);

        tblApril.setFont(new java.awt.Font("Khmer OS", 0, 12)); // NOI18N
        tblApril.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "អាតិ", "ច័ន្ទ", "អង្គារ", "ពុធ", "ព្រហ.", "សុក្រ", "សៅរ៍"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblApril.setCellSelectionEnabled(true);
        tblApril.setName("APR"); // NOI18N
        tblApril.setPreferredSize(tblJan.getPreferredSize());
        tblApril.setRowHeight(20);
        jScrollPane6.setViewportView(tblApril);

        tblSeptember.setFont(new java.awt.Font("Khmer OS", 0, 12)); // NOI18N
        tblSeptember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "អាទិ", "ច័ន្ទ", "អង្គារ", "ពុធ", "ព្រហ.", "សុក្រ", "សៅរ៍"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSeptember.setCellSelectionEnabled(true);
        tblSeptember.setName("SEP"); // NOI18N
        tblSeptember.setPreferredSize(tblJan.getPreferredSize());
        tblSeptember.setRowHeight(20);
        jScrollPane7.setViewportView(tblSeptember);

        tblAugust.setFont(new java.awt.Font("Khmer OS", 0, 12)); // NOI18N
        tblAugust.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "អាទិ", "ច័ន្ទ", "អង្គារ", "ពុធ", "ព្រហ.", "សុក្រ", "សៅរ៍"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAugust.setCellSelectionEnabled(true);
        tblAugust.setName("AUG"); // NOI18N
        tblAugust.setPreferredSize(tblJan.getPreferredSize());
        tblAugust.setRowHeight(20);
        jScrollPane8.setViewportView(tblAugust);

        tblJuly.setFont(new java.awt.Font("Khmer OS", 0, 12)); // NOI18N
        tblJuly.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "អាទិ", "ច័ន្ទ", "អង្គារ", "ពុធ", "ព្រហ.", "សុក្រ", "សៅរ៍"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblJuly.setCellSelectionEnabled(true);
        tblJuly.setName("JUL"); // NOI18N
        tblJuly.setPreferredSize(new java.awt.Dimension(525, 120));
        tblJuly.setRowHeight(20);
        jScrollPane9.setViewportView(tblJuly);

        tblDecember.setFont(new java.awt.Font("Khmer OS", 0, 12)); // NOI18N
        tblDecember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "អាទិ", "ច័ន្ទ", "អង្គារ", "ពុធ", "ព្រហ.", "សុក្រ", "សៅរ៍"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDecember.setCellSelectionEnabled(true);
        tblDecember.setName("Dec"); // NOI18N
        tblDecember.setPreferredSize(tblJan.getPreferredSize());
        tblDecember.setRowHeight(20);
        jScrollPane10.setViewportView(tblDecember);

        tblNovember.setFont(new java.awt.Font("Khmer OS", 0, 12)); // NOI18N
        tblNovember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "អាទិ", "ច័ន្ទ", "អង្គារ", "ពុធ", "ព្រហ.", "សុក្រ", "សៅរ៍"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNovember.setCellSelectionEnabled(true);
        tblNovember.setName("Nov"); // NOI18N
        tblNovember.setPreferredSize(tblJan.getPreferredSize());
        tblNovember.setRowHeight(20);
        jScrollPane11.setViewportView(tblNovember);

        tblOctober.setFont(new java.awt.Font("Khmer OS", 0, 12)); // NOI18N
        tblOctober.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "អាទិ", "ច័ន្ទ", "អង្គារ", "ពុធ", "ព្រហ.", "សុក្រ", "សៅរ៍"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOctober.setCellSelectionEnabled(true);
        tblOctober.setName("OCT"); // NOI18N
        tblOctober.setPreferredSize(tblJan.getPreferredSize());
        tblOctober.setRowHeight(20);
        jScrollPane12.setViewportView(tblOctober);

        jLabel1.setFont(new java.awt.Font("Khmer OS Muol", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 0));
        jLabel1.setText("មីនា");

        jLabel2.setFont(new java.awt.Font("Khmer OS Muol", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 0));
        jLabel2.setText("មករា");

        jLabel3.setFont(new java.awt.Font("Khmer OS Muol", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 0));
        jLabel3.setText("កុម្ភៈ");

        jLabel4.setFont(new java.awt.Font("Khmer OS Muol", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 0));
        jLabel4.setText("កក្កដា");

        jLabel5.setFont(new java.awt.Font("Khmer OS Muol", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 102, 0));
        jLabel5.setText("មិថុនា");

        jLabel6.setFont(new java.awt.Font("Khmer OS Muol", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 0));
        jLabel6.setText("ឧសភា");

        jLabel7.setFont(new java.awt.Font("Khmer OS Muol", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 102, 0));
        jLabel7.setText("មេសា");

        jLabel8.setFont(new java.awt.Font("Khmer OS Muol", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 102, 0));
        jLabel8.setText("កញ្ញា");

        jLabel9.setFont(new java.awt.Font("Khmer OS Muol", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 102, 0));
        jLabel9.setText("សីហា");

        jLabel10.setFont(new java.awt.Font("Khmer OS Muol", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 102, 0));
        jLabel10.setText("ធ្នូ");

        jLabel11.setFont(new java.awt.Font("Khmer OS Muol", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 102, 0));
        jLabel11.setText("វិច្ឆិកា");

        jLabel12.setFont(new java.awt.Font("Khmer OS Muol", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 102, 0));
        jLabel12.setText("តុលា");

        jLabel13.setFont(new java.awt.Font("Khmer Rotanak Angkor", 0, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 153, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(100, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(334, 334, 334)
                                .addComponent(jLabel3)
                                .addGap(332, 332, 332)
                                .addComponent(jLabel1)
                                .addGap(323, 323, 323)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(321, 321, 321)
                                .addComponent(jLabel5)
                                .addGap(319, 319, 319)
                                .addComponent(jLabel4)
                                .addGap(317, 317, 317)
                                .addComponent(jLabel9))
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxYear, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(7, 7, 7)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(329, 329, 329)
                        .addComponent(jLabel11)
                        .addGap(336, 336, 336)
                        .addComponent(jLabel10)
                        .addGap(163, 163, 163)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel12)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );

        cbxYear.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
Calendar c=Calendar.getInstance();
Boolean firstForm=true;
JTable[] tblMonths;
JTable selectedTable;
int countUnfocused=0;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
       
        c=Calendar.getInstance();
        int year=c.get(Calendar.YEAR);
        for(int i=year+200;i>=year-200;i--){
            cbxYear.addItem(""+i);
        }
        firstForm=false;
        cbxYear.setSelectedIndex(200);
    }//GEN-LAST:event_formWindowOpened

    private void cbxYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxYearItemStateChanged
        // TODO add your handling code here:
        if(firstForm)return;
        c.set(Integer.valueOf(cbxYear.getSelectedItem()+""), 1, 1);
        CalendarClass.isCurrentYear=(c.get(Calendar.YEAR)==(Calendar.getInstance()).get(Calendar.YEAR));
        for(int i=0;i<tblMonths.length;i++){
            CalendarClass.addDaysToTableMonths(c.get(Calendar.YEAR)+"", tblMonths[i],i);
            tblMonths[i].setSelectionMode(0);
        }
    }//GEN-LAST:event_cbxYearItemStateChanged
    

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
            java.util.logging.Logger.getLogger(frmCalendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCalendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCalendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCalendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCalendar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxYear;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable tblApril;
    private javax.swing.JTable tblAugust;
    private javax.swing.JTable tblDecember;
    private javax.swing.JTable tblFeb;
    private javax.swing.JTable tblJan;
    private javax.swing.JTable tblJuly;
    private javax.swing.JTable tblJune;
    private javax.swing.JTable tblMarch;
    private javax.swing.JTable tblMay;
    private javax.swing.JTable tblNovember;
    private javax.swing.JTable tblOctober;
    private javax.swing.JTable tblSeptember;
    // End of variables declaration//GEN-END:variables
}
