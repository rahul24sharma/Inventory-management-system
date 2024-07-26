/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;
import javax.swing.JOptionPane;
import dao.InventoryUtils;
import java.io.File;
import java.awt.Desktop;


/**
 *
 * @author divyasharma
 */
public class OpenPdf {

    public static void OpenById(String id) {
        try {
            File pdfFile = new File(InventoryUtils.billPath + id + ".pdf");
            if (pdfFile.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(pdfFile);
                } else {
                    JOptionPane.showMessageDialog(null, "Desktop is not supported on this platform!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "File doesn't exist!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
