package it.iubar.paghe.logic.common.auto;

/** Class _EnpalsGruppoagevolazione was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EnpalsGruppoagevolazione extends org.apache.cayenne.CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDGRUPPO_PROPERTY = "idgruppo";

    public static final String IDGRUPPO_PK_COLUMN = "IDGRUPPO";

    public void setDescrizione(String descrizione) {
        writeProperty("descrizione", descrizione);
    }
    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }
    
    
    public void setIdgruppo(Short idgruppo) {
        writeProperty("idgruppo", idgruppo);
    }
    public Short getIdgruppo() {
        return (Short)readProperty("idgruppo");
    }
    
    
}
