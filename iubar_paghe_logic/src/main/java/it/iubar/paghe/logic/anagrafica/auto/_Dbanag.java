package it.iubar.paghe.logic.anagrafica.auto;

/** Class _Dbanag was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _Dbanag extends org.apache.cayenne.CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String ID_PROPERTY = "id";
    public static final String VALORE_PROPERTY = "valore";

    public static final String ID_PK_COLUMN = "ID";

    public void setDescrizione(String descrizione) {
        writeProperty("descrizione", descrizione);
    }
    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }
    
    
    public void setId(Short id) {
        writeProperty("id", id);
    }
    public Short getId() {
        return (Short)readProperty("id");
    }
    
    
    public void setValore(String valore) {
        writeProperty("valore", valore);
    }
    public String getValore() {
        return (String)readProperty("valore");
    }
    
    
}
