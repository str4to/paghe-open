package it.iubar.paghe.logic.paghe.auto;

/** Class _Tipoposizione was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _Tipoposizione extends org.apache.cayenne.CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDTIPOPOSIZIONE_PROPERTY = "idtipoposizione";

    public static final String IDTIPOPOSIZIONE_PK_COLUMN = "IDTIPOPOSIZIONE";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }
    
    
    public Short getIdtipoposizione() {
        return (Short)readProperty("idtipoposizione");
    }
    
    
}
