package it.iubar.paghe.logic.paghe.auto;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Posizionesubordinato;

/**
 * Class _Inquadramento was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Inquadramento extends CayenneDataObject {

    public static final String IDINPSQUALIFICA1_PROPERTY = "idinpsqualifica1";
    public static final String IDINPSQUALIFICA2_PROPERTY = "idinpsqualifica2";
    public static final String IDINPSQUALIFICA3_PROPERTY = "idinpsqualifica3";
    public static final String IDINPSTIPOCONTRIBUZIONE_PROPERTY = "idinpstipocontribuzione";
    public static final String IDINQUADRAMENTO_PROPERTY = "idinquadramento";
    public static final String IDLAVORATORE_PROPERTY = "idlavoratore";
    public static final String POSIZIONESUBORDINATO_ARRAY1_PROPERTY = "posizionesubordinatoArray1";

    public static final String IDINQUADRAMENTO_PK_COLUMN = "IDINQUADRAMENTO";

    public void setIdinpsqualifica1(String idinpsqualifica1) {
        writeProperty("idinpsqualifica1", idinpsqualifica1);
    }
    public String getIdinpsqualifica1() {
        return (String)readProperty("idinpsqualifica1");
    }

    public void setIdinpsqualifica2(String idinpsqualifica2) {
        writeProperty("idinpsqualifica2", idinpsqualifica2);
    }
    public String getIdinpsqualifica2() {
        return (String)readProperty("idinpsqualifica2");
    }

    public void setIdinpsqualifica3(String idinpsqualifica3) {
        writeProperty("idinpsqualifica3", idinpsqualifica3);
    }
    public String getIdinpsqualifica3() {
        return (String)readProperty("idinpsqualifica3");
    }

    public void setIdinpstipocontribuzione(String idinpstipocontribuzione) {
        writeProperty("idinpstipocontribuzione", idinpstipocontribuzione);
    }
    public String getIdinpstipocontribuzione() {
        return (String)readProperty("idinpstipocontribuzione");
    }

    public void setIdinquadramento(Integer idinquadramento) {
        writeProperty("idinquadramento", idinquadramento);
    }
    public Integer getIdinquadramento() {
        return (Integer)readProperty("idinquadramento");
    }

    public void setIdlavoratore(Integer idlavoratore) {
        writeProperty("idlavoratore", idlavoratore);
    }
    public Integer getIdlavoratore() {
        return (Integer)readProperty("idlavoratore");
    }

    public void setPosizionesubordinatoArray1(Posizionesubordinato posizionesubordinatoArray1) {
        setToOneTarget("posizionesubordinatoArray1", posizionesubordinatoArray1, true);
    }

    public Posizionesubordinato getPosizionesubordinatoArray1() {
        return (Posizionesubordinato)readProperty("posizionesubordinatoArray1");
    }


}
