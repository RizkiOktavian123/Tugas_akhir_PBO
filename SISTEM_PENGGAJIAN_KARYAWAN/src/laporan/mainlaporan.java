/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laporan;
import java.util.HashMap;
import util.koneksi;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class mainlaporan {
    public  String tglAwal, tglAkhir,Parameter_tglAwal,
Parameter_tglAkhkir,namaLaporan,ParameterLaporan, idLaporan;
    public void cetakLaporanMaster(){
      koneksi.koneksi();
      String Rs="src/laporan/"+namaLaporan+".jrxml";
      HashMap param=new HashMap();
      
      param.put(ParameterLaporan,idLaporan);
      param.put(Parameter_tglAwal,tglAwal);
      param.put(Parameter_tglAkhkir,tglAkhir);
      
      try {
          JasperReport jasperReport = JasperCompileManager.compileReport(Rs);
          JasperPrint JasperPrint = JasperFillManager.fillReport(jasperReport,
param,koneksi.con);
          JasperViewer.viewReport(JasperPrint,false);          
      }catch(JRException ex) {
        System.out.println(ex);
      }
    }//cetak   
}
