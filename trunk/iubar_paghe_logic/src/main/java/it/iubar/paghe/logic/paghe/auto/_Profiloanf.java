package it.iubar.paghe.logic.paghe.auto;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.InpsTipoanf;

/**
 * Class _Profiloanf was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Profiloanf extends CayenneDataObject {

    public static final String IDCLASSEANF_PROPERTY = "idclasseanf";
    public static final String IDINPSTIPOANF_PROPERTY = "idinpstipoanf";
    public static final String IDINPSTIPOANF2_PROPERTY = "idinpstipoanf2";
    public static final String IDPROFILO_PROPERTY = "idprofilo";
    public static final String TO_INPS_TIPOANF_PROPERTY = "toInpsTipoanf";

    public static final String IDPROFILO_PK_COLUMN = "IDPROFILO";

    public void setIdclasseanf(Short idclasseanf) {
        writeProperty("idclasseanf", idclasseanf);
    }
    public Short getIdclasseanf() {
        return (Short)readProperty("idclasseanf");
    }

    public void setIdinpstipoanf(String idinpstipoanf) {
        writeProperty("idinpstipoanf", idinpstipoanf);
    }
    public String getIdinpstipoanf() {
        return (String)readProperty("idinpstipoanf");
    }

    public void setIdinpstipoanf2(Short idinpstipoanf2) {
        writeProperty("idinpstipoanf2", idinpstipoanf2);
    }
    public Short getIdinpstipoanf2() {
        return (Short)readProperty("idinpstipoanf2");
    }

    public void setIdprofilo(Integer idprofilo) {
        writeProperty("idprofilo", idprofilo);
    }
    public Integer getIdprofilo() {
        return (Integer)readProperty("idprofilo");
    }

    public void setToInpsTipoanf(InpsTipoanf toInpsTipoanf) {
        setToOneTarget("toInpsTipoanf", toInpsTipoanf, true);
    }

    public InpsTipoanf getToInpsTipoanf() {
        return (InpsTipoanf)readProperty("toInpsTipoanf");
    }


}