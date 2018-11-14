
package Controlador;

import javax.swing.JTextField;

public class metodos {
    
    public static boolean valida(int bodega,int cboId,JTextField lbl_bodega,String inBbodega, String areaBod)
    {
         if(bodega==0)
        {
            if(cboId==1)
            {
            lbl_bodega.setText("ADM Nacional");
            inBbodega="BOD_ADM_";
            areaBod="ADM NACIONAL";   
            }else if(cboId==2)
            {
            lbl_bodega.setText("Internacional");
            inBbodega="BOD_INTERNACIONAL_";
            areaBod="INTERNACIONAL";
            }else if(cboId==3){
            lbl_bodega.setText("STA Internacional");
            inBbodega="BOD_STAINTER_";
            areaBod="STA INTERNACIONAL";   
            }else if(cboId==4)
            {
            lbl_bodega.setText("RMA Express");
            inBbodega="BOD_EXPRESS_";
            areaBod="EXPRESS";  
            }else if (cboId==5)
            {
            lbl_bodega.setText("C.Calidad");
            inBbodega="BOD_CCALIDAD_";
            areaBod="C.CALIDAD";
            }else if(cboId==6)
            {
            lbl_bodega.setText("STA PCF");
            inBbodega="BOD_STAPCF_";
            areaBod="STA PCF"; 
            }else if(cboId==7)
            {
            lbl_bodega.setText("Revision Fisica");
            inBbodega="BOD_REVFISICA_";
            areaBod="REVISION FISICA"; 
            }else if(cboId==8)
            {
            lbl_bodega.setText("Post Revision");
            inBbodega="BOD_POSTREV_";
            areaBod="POST REVISION";
            }else if(cboId==9)
            {
            lbl_bodega.setText("Liquidacion");
            inBbodega="BOD_LIQ_";
            areaBod="LIQUIDACION";
            }else if(cboId==10){
            lbl_bodega.setText("Recepción");
            inBbodega="BOD_RECEPCION_";
            areaBod="RECEPCION"; 
            }
        }
        else if(bodega==1)
        {
          if(cboId==1)
          {
           lbl_bodega.setText("Internacional");
           inBbodega="BOD_INTERNACIONAL_";
           areaBod="INTERNACIONAL";   
          }else if(cboId==2){
            lbl_bodega.setText("STA Internacional");
            inBbodega="BOD_STAINTER_";
            areaBod="STA INTERNACIONAL"; 
          }else if (cboId==3)
          {
            lbl_bodega.setText("Revision Fisica");
            inBbodega="BOD_REVFISICA_";
            areaBod="REVISION FISICA";  
          }else if(cboId==4)
          {
            lbl_bodega.setText("Post Revision");
            inBbodega="BOD_POSTREV_";
            areaBod="POST REVISION"; 
          }else if(cboId==5)
          {
             lbl_bodega.setText("Liquidacion");
            inBbodega="BOD_LIQ_";
            areaBod="LIQUIDACION";
          }
        
        }else if(bodega==2)
        {
          if(cboId==1)
          {
            lbl_bodega.setText("ADM Nacional");
            inBbodega="BOD_ADM_";
            areaBod="ADM NACIONAL";   
          }else if(cboId==2)
          {
            lbl_bodega.setText("STA Nacional");
            inBbodega="BOD_STANAC_";
            areaBod="STA NACIONAL";   
          }
        }
        else if(bodega==3)
        {
            lbl_bodega.setText("STA PCF");
            inBbodega="BOD_STAPCF_";
            areaBod="STA PCF";
        }else if(bodega==4)
        {
            lbl_bodega.setText("C.Calidad");
            inBbodega="BOD_CCALIDAD_";
            areaBod="C.CALIDAD";
        }else if(bodega==5)
        {
            lbl_bodega.setText("Recepción");
            inBbodega="BOD_RECEPCION_";
            areaBod="RECEPCION";
        }else if(bodega==6)
        {
            lbl_bodega.setText("RMA Express");
            inBbodega="BOD_EXPRESS_";
            areaBod="EXPRESS";
        }
        return false;
    }
}
