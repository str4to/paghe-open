package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

/** Class _DmagCodditta1 was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _DmagCodditta1 extends org.apache.cayenne.CayenneDataObject {

    public static final String CODICE_PROPERTY = "codice";
    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String HELPDMAGCOMPATIBCODDITTA_ARRAY_PROPERTY = "helpdmagcompatibcoddittaArray";

    public static final String CODICE_PK_COLUMN = "CODICE";

    public void setCodice(Short codice) {
        writeProperty("codice", codice);
    }
    public Short getCodice() {
        return (Short)readProperty("codice");
    }
    
    
    public void setDescrizione(String descrizione) {
        writeProperty("descrizione", descrizione);
    }
    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }
    
    
    public void addToHelpdmagcompatibcoddittaArray(it.iubar.paghe.logic.paghe.DmagCompatibcodditta obj) {
        addToManyTarget("helpdmagcompatibcoddittaArray", obj, true);
    }
    public void removeFromHelpdmagcompatibcoddittaArray(it.iubar.paghe.logic.paghe.DmagCompatibcodditta obj) {
        removeToManyTarget("helpdmagcompatibcoddittaArray", obj, true);
    }
    public List getHelpdmagcompatibcoddittaArray() {
        return (List)readProperty("helpdmagcompatibcoddittaArray");
    }
    
    
}
