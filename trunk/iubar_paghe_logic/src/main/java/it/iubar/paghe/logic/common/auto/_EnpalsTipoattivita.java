package it.iubar.paghe.logic.common.auto;

/** Class _EnpalsTipoattivita was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EnpalsTipoattivita extends org.apache.cayenne.CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDTIPOATTIVITA_PROPERTY = "idtipoattivita";

    public static final String IDTIPOATTIVITA_PK_COLUMN = "IDTIPOATTIVITA";

    public void setDescrizione(String descrizione) {
        writeProperty("descrizione", descrizione);
    }
    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }
    
    
    public void setIdtipoattivita(Short idtipoattivita) {
        writeProperty("idtipoattivita", idtipoattivita);
    }
    public Short getIdtipoattivita() {
        return (Short)readProperty("idtipoattivita");
    }
    
    
}
