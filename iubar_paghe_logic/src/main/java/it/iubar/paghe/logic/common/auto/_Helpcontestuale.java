package it.iubar.paghe.logic.common.auto;

/** Class _Helpcontestuale was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _Helpcontestuale extends org.apache.cayenne.CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDLIVELLO1_PROPERTY = "idlivello1";
    public static final String IDLIVELLO2_PROPERTY = "idlivello2";
    public static final String IDLIVELLO3_PROPERTY = "idlivello3";
    public static final String URL_PROPERTY = "url";
    public static final String TO_HELPCONTESTUALELIV2_PROPERTY = "toHelpcontestualeliv2";

    public static final String IDLIVELLO1_PK_COLUMN = "IDLIVELLO1";
    public static final String IDLIVELLO2_PK_COLUMN = "IDLIVELLO2";
    public static final String IDLIVELLO3_PK_COLUMN = "IDLIVELLO3";

    public void setDescrizione(String descrizione) {
        writeProperty("descrizione", descrizione);
    }
    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }
    
    
    public void setIdlivello1(Short idlivello1) {
        writeProperty("idlivello1", idlivello1);
    }
    public Short getIdlivello1() {
        return (Short)readProperty("idlivello1");
    }
    
    
    public void setIdlivello2(Short idlivello2) {
        writeProperty("idlivello2", idlivello2);
    }
    public Short getIdlivello2() {
        return (Short)readProperty("idlivello2");
    }
    
    
    public void setIdlivello3(Short idlivello3) {
        writeProperty("idlivello3", idlivello3);
    }
    public Short getIdlivello3() {
        return (Short)readProperty("idlivello3");
    }
    
    
    public void setUrl(String url) {
        writeProperty("url", url);
    }
    public String getUrl() {
        return (String)readProperty("url");
    }
    
    
    public void setToHelpcontestualeliv2(it.iubar.paghe.logic.common.Helpcontestualelivello2 toHelpcontestualeliv2) {
        setToOneTarget("toHelpcontestualeliv2", toHelpcontestualeliv2, true);
    }

    public it.iubar.paghe.logic.common.Helpcontestualelivello2 getToHelpcontestualeliv2() {
        return (it.iubar.paghe.logic.common.Helpcontestualelivello2)readProperty("toHelpcontestualeliv2");
    } 
    
    
}
