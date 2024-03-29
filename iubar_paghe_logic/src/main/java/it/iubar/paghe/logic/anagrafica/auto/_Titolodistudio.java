package it.iubar.paghe.logic.anagrafica.auto;

import java.util.List;

/** Class _Titolodistudio was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _Titolodistudio extends org.apache.cayenne.CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDTITOLODISTUDIO_PROPERTY = "idtitolodistudio";
    public static final String PERSONAFISICA_ARRAY_PROPERTY = "personafisicaArray";

    public static final String IDTITOLODISTUDIO_PK_COLUMN = "IDTITOLODISTUDIO";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }
    
    
    public Short getIdtitolodistudio() {
        return (Short)readProperty("idtitolodistudio");
    }
    
    
    public void addToPersonafisicaArray(it.iubar.paghe.logic.anagrafica.Personafisica obj) {
        addToManyTarget("personafisicaArray", obj, true);
    }
    public void removeFromPersonafisicaArray(it.iubar.paghe.logic.anagrafica.Personafisica obj) {
        removeToManyTarget("personafisicaArray", obj, true);
    }
    public List getPersonafisicaArray() {
        return (List)readProperty("personafisicaArray");
    }
    
    
}
