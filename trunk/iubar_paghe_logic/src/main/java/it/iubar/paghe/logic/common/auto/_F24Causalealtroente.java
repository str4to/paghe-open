package it.iubar.paghe.logic.common.auto;

/** Class _F24Causalealtroente was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _F24Causalealtroente extends org.apache.cayenne.CayenneDataObject {

    public static final String CAUSALE_PROPERTY = "causale";
    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String FLAG1_PROPERTY = "flag1";
    public static final String FLAG2_PROPERTY = "flag2";
    public static final String FLAG3_PROPERTY = "flag3";
    public static final String IDENTE_PROPERTY = "idente";
    public static final String TO_TIPOALTROENTE_PROPERTY = "toTipoaltroente";

    public static final String CAUSALE_PK_COLUMN = "CAUSALE";

    public String getCausale() {
        return (String)readProperty("causale");
    }
    
    
    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }
    
    
    public String getFlag1() {
        return (String)readProperty("flag1");
    }
    
    
    public String getFlag2() {
        return (String)readProperty("flag2");
    }
    
    
    public String getFlag3() {
        return (String)readProperty("flag3");
    }
    
    
    public Short getIdente() {
        return (Short)readProperty("idente");
    }
    
    

    public it.iubar.paghe.logic.common.F24Tipoaltroente getToTipoaltroente() {
        return (it.iubar.paghe.logic.common.F24Tipoaltroente)readProperty("toTipoaltroente");
    } 
    
    
}
