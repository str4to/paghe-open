package it.iubar.paghe.logic.paghe.auto;

/** Class _UniemensDenunciaaziendale was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _UniemensDenunciaaziendale extends org.apache.cayenne.CayenneDataObject {

    public static final String IDDENUNCIAAZIENDALE_PROPERTY = "iddenunciaaziendale";
    public static final String IDDICHIARAZIONE_PROPERTY = "iddichiarazione";
    public static final String TO_DENUNCIAAZIENDALE_PROPERTY = "toDenunciaaziendale";
    public static final String TO_UNIEMENS_PROPERTY = "toUniemens";

    public static final String IDDENUNCIAAZIENDALE_PK_COLUMN = "IDDENUNCIAAZIENDALE";
    public static final String IDDICHIARAZIONE_PK_COLUMN = "IDDICHIARAZIONE";

    public void setIddenunciaaziendale(Integer iddenunciaaziendale) {
        writeProperty("iddenunciaaziendale", iddenunciaaziendale);
    }
    public Integer getIddenunciaaziendale() {
        return (Integer)readProperty("iddenunciaaziendale");
    }
    
    
    public void setIddichiarazione(Integer iddichiarazione) {
        writeProperty("iddichiarazione", iddichiarazione);
    }
    public Integer getIddichiarazione() {
        return (Integer)readProperty("iddichiarazione");
    }
    
    
    public void setToDenunciaaziendale(it.iubar.paghe.logic.paghe.Denunciaaziendale toDenunciaaziendale) {
        setToOneTarget("toDenunciaaziendale", toDenunciaaziendale, true);
    }

    public it.iubar.paghe.logic.paghe.Denunciaaziendale getToDenunciaaziendale() {
        return (it.iubar.paghe.logic.paghe.Denunciaaziendale)readProperty("toDenunciaaziendale");
    } 
    
    
    public void setToUniemens(it.iubar.paghe.logic.paghe.Uniemens toUniemens) {
        setToOneTarget("toUniemens", toUniemens, true);
    }

    public it.iubar.paghe.logic.paghe.Uniemens getToUniemens() {
        return (it.iubar.paghe.logic.paghe.Uniemens)readProperty("toUniemens");
    } 
    
    
}