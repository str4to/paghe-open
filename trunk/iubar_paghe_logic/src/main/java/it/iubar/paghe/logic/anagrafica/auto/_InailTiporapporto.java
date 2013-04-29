package it.iubar.paghe.logic.anagrafica.auto;

import java.util.List;

/** Class _InailTiporapporto was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _InailTiporapporto extends org.apache.cayenne.CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDINAILTIPORAPPORTO_PROPERTY = "idinailtiporapporto";
    public static final String PARASUBORDINATO_ARRAY_PROPERTY = "parasubordinatoArray";

    public static final String IDINAILTIPORAPPORTO_PK_COLUMN = "IDINAILTIPORAPPORTO";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }
    
    
    public Short getIdinailtiporapporto() {
        return (Short)readProperty("idinailtiporapporto");
    }
    
    
    public void addToParasubordinatoArray(it.iubar.paghe.logic.anagrafica.Parasubordinato obj) {
        addToManyTarget("parasubordinatoArray", obj, true);
    }
    public void removeFromParasubordinatoArray(it.iubar.paghe.logic.anagrafica.Parasubordinato obj) {
        removeToManyTarget("parasubordinatoArray", obj, true);
    }
    public List getParasubordinatoArray() {
        return (List)readProperty("parasubordinatoArray");
    }
    
    
}