package it.iubar.paghe.logic.common.auto;

/** Class _F24Ufficiofinanziario was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _F24Ufficiofinanziario extends org.apache.cayenne.CayenneDataObject {

    public static final String AMBITO_PROPERTY = "ambito";
    public static final String CODICE_PROPERTY = "codice";
    public static final String DATAATTIVAZIONE_PROPERTY = "dataattivazione";
    public static final String DATASOPPRESSIONE_PROPERTY = "datasoppressione";
    public static final String DENOMINAZIONE_PROPERTY = "denominazione";
    public static final String IDUFFICIO_PROPERTY = "idufficio";
    public static final String PROVINCIA_PROPERTY = "provincia";
    public static final String TO_TIPOUFFICIOFINANZ_PROPERTY = "toTipoufficiofinanz";

    public static final String IDUFFICIO_PK_COLUMN = "IDUFFICIO";

    public Integer getAmbito() {
        return (Integer)readProperty("ambito");
    }
    
    
    public String getCodice() {
        return (String)readProperty("codice");
    }
    
    
    public java.util.Date getDataattivazione() {
        return (java.util.Date)readProperty("dataattivazione");
    }
    
    
    public java.util.Date getDatasoppressione() {
        return (java.util.Date)readProperty("datasoppressione");
    }
    
    
    public String getDenominazione() {
        return (String)readProperty("denominazione");
    }
    
    
    public Integer getIdufficio() {
        return (Integer)readProperty("idufficio");
    }
    
    
    public String getProvincia() {
        return (String)readProperty("provincia");
    }
    
    

    public it.iubar.paghe.logic.common.F24Tipoufffinanziario getToTipoufficiofinanz() {
        return (it.iubar.paghe.logic.common.F24Tipoufffinanziario)readProperty("toTipoufficiofinanz");
    } 
    
    
}
