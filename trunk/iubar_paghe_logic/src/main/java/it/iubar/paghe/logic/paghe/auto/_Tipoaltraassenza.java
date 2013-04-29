package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

/** Class _Tipoaltraassenza was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _Tipoaltraassenza extends org.apache.cayenne.CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDELEMENTO_PROPERTY = "idelemento";
    public static final String IDTIPOALTRAASSENZA_PROPERTY = "idtipoaltraassenza";
    public static final String ASSENZA_ARRAY_PROPERTY = "assenzaArray";
    public static final String TO_ELEMENTORETRIBUTIVO_PROPERTY = "toElementoretributivo";

    public static final String IDTIPOALTRAASSENZA_PK_COLUMN = "IDTIPOALTRAASSENZA";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }
    
    
    public Integer getIdelemento() {
        return (Integer)readProperty("idelemento");
    }
    
    
    public Short getIdtipoaltraassenza() {
        return (Short)readProperty("idtipoaltraassenza");
    }
    
    
    public void addToAssenzaArray(it.iubar.paghe.logic.paghe.Assenza obj) {
        addToManyTarget("assenzaArray", obj, true);
    }
    public void removeFromAssenzaArray(it.iubar.paghe.logic.paghe.Assenza obj) {
        removeToManyTarget("assenzaArray", obj, true);
    }
    public List getAssenzaArray() {
        return (List)readProperty("assenzaArray");
    }
    
    

    public it.iubar.paghe.logic.paghe.Elementoretributivo getToElementoretributivo() {
        return (it.iubar.paghe.logic.paghe.Elementoretributivo)readProperty("toElementoretributivo");
    } 
    
    
}
