package it.iubar.paghe.logic.common.auto;

/** Class _Consiglio was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _Consiglio extends org.apache.cayenne.CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDAPP_PROPERTY = "idapp";
    public static final String IDSTATO_PROPERTY = "idstato";
    public static final String TITOLO_PROPERTY = "titolo";

    public static final String IDCONSIGLIO_PK_COLUMN = "IDCONSIGLIO";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }
    
    
    public Short getIdapp() {
        return (Short)readProperty("idapp");
    }
    
    
    public Short getIdstato() {
        return (Short)readProperty("idstato");
    }
    
    
    public String getTitolo() {
        return (String)readProperty("titolo");
    }
    
    
}