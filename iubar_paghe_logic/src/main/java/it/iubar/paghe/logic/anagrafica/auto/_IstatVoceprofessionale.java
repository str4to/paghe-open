package it.iubar.paghe.logic.anagrafica.auto;

import java.util.List;

/** Class _IstatVoceprofessionale was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _IstatVoceprofessionale extends org.apache.cayenne.CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDVOCEPROFESSIONALE_PROPERTY = "idvoceprofessionale";
    public static final String VERSIONEVOCEPROF_PROPERTY = "versionevoceprof";
    public static final String LAVORATORE_ARRAY_PROPERTY = "lavoratoreArray";

    public static final String IDVOCEPROFESSIONALE_PK_COLUMN = "IDVOCEPROFESSIONALE";
    public static final String VERSIONEVOCEPROF_PK_COLUMN = "VERSIONEVOCEPROF";

    public void setDescrizione(String descrizione) {
        writeProperty("descrizione", descrizione);
    }
    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }
    
    
    public void setIdvoceprofessionale(String idvoceprofessionale) {
        writeProperty("idvoceprofessionale", idvoceprofessionale);
    }
    public String getIdvoceprofessionale() {
        return (String)readProperty("idvoceprofessionale");
    }
    
    
    public void setVersionevoceprof(Short versionevoceprof) {
        writeProperty("versionevoceprof", versionevoceprof);
    }
    public Short getVersionevoceprof() {
        return (Short)readProperty("versionevoceprof");
    }
    
    
    public void addToLavoratoreArray(it.iubar.paghe.logic.anagrafica.Lavoratore obj) {
        addToManyTarget("lavoratoreArray", obj, true);
    }
    public void removeFromLavoratoreArray(it.iubar.paghe.logic.anagrafica.Lavoratore obj) {
        removeToManyTarget("lavoratoreArray", obj, true);
    }
    public List getLavoratoreArray() {
        return (List)readProperty("lavoratoreArray");
    }
    
    
}
