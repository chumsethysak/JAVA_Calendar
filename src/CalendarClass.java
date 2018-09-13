
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chums
 */

public class CalendarClass {
    public static Boolean isCurrentYear=false;
    public static class StatusColumnCellRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
        JLabel l = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);

        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MMM/yyyy");
        long date=System.currentTimeMillis();
        String m=sdf.format(date);
        String[] ms=m.split("/");
        Object value2=((Calendar.getInstance()).get(Calendar.DATE));
        if(isCurrentYear&&(table.getName() == null ? ms[1] == null : table.getName().equalsIgnoreCase(ms[1]))&&value==value2){      
                    l.setBackground(Color.green);
                    l.setForeground(Color.RED.darker());                
        }else{
            if(col==0){
                l.setBackground(Color.RED);
                l.setForeground(Color.yellow);
            }else if(col==6){
                l.setBackground(Color.ORANGE);l.setForeground(Color.BLACK);
            }else{
                l.setBackground(new JLabel().getBackground());
                l.setForeground(new JLabel().getForeground());
            }
        }
        
           if(isSelected){
                l.setFont(new Font("Serif", Font.BOLD, 18));
                l.setBackground(Color.CYAN);
                if(value==null)
                        l.setBackground(Color.WHITE);     
            }else{
                if(col!=0&&col!=6){
                    if(!(isCurrentYear&&(table.getName() == null ? ms[1] == null : table.getName().equalsIgnoreCase(ms[1]))&&value==value2)){
                        l.setFont(new JLabel().getFont());
                        l.setBackground(new JLabel().getBackground());
                    }
                }
            }
            return l;
    }
}
    public static DefaultTableCellRenderer RenderHeaderColor(Color c){
            DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
            headerRenderer.setBackground(c);
            return headerRenderer;
    }

    public static void addDaysToTableMonths(String Year,JTable tblMonth,int mIndex){  
        Calendar c=Calendar.getInstance();
        int year=Integer.valueOf(Year);
        int month=mIndex;
        c.set( year, month,1);
        int day=c.get(Calendar.DAY_OF_WEEK);
        int maxDaysOfM=c.getActualMaximum(Calendar.DAY_OF_MONTH);
        
        DefaultTableModel tmodel=(DefaultTableModel)tblMonth.getModel();
        while(tmodel.getRowCount()!=0)            
            tmodel.removeRow(0);      
        tmodel.setRowCount(6);
        //FirstRow
        int a=1;
            for(int i=day-1;i<7;i++){
                tmodel.setValueAt(a,0  ,i);
                a++;
            }
            L:for(int j=1;j<tmodel.getRowCount();j++){//row
                    for(int col=0;col<7;col++){
                        tmodel.setValueAt(a, j, col);
                        if(a!=maxDaysOfM)a++;
                        else break L;
                    }
            }
    }
}
