package it.iubar.paghe.logic.paghe.auto;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.DaFondointeradesione;
import it.iubar.paghe.logic.paghe.DaFondointerrevoca;
import it.iubar.paghe.logic.paghe.Denunciaaziendale;

/**
 * Class _DaFondointerprof was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DaFondointerprof extends CayenneDataObject {

    public static final String ADESIONE1NUMDIP_PROPERTY = "adesione1numdip";
    public static final String ADESIONE2NUMDIP_PROPERTY = "adesione2numdip";
    public static final String IDDENUNCIAAZIENDALE_PROPERTY = "iddenunciaaziendale";
    public static final String IDFONDOINTERADESIONE1_PROPERTY = "idfondointeradesione1";
    public static final String IDFONDOINTERADESIONE2_PROPERTY = "idfondointeradesione2";
    public static final String IDFONDOINTERREVOCA1_PROPERTY = "idfondointerrevoca1";
    public static final String IDFONDOINTERREVOCA2_PROPERTY = "idfondointerrevoca2";
    public static final String TO_DA_FONDO_INTER_ADESIONE1_PROPERTY = "toDaFondoInterAdesione1";
    public static final String TO_DA_FONDO_INTER_ADESIONE2_PROPERTY = "toDaFondoInterAdesione2";
    public static final String TO_DA_FONDO_INTER_REVOCA1_PROPERTY = "toDaFondoInterRevoca1";
    public static final String TO_DA_FONDO_INTER_REVOCA2_PROPERTY = "toDaFondoInterRevoca2";
    public static final String TO_DENUNCIA_AZIENDALE_PROPERTY = "toDenunciaAziendale";

    public static final String IDDENUNCIAAZIENDALE_PK_COLUMN = "IDDENUNCIAAZIENDALE";

    public void setAdesione1numdip(Short adesione1numdip) {
        writeProperty("adesione1numdip", adesione1numdip);
    }
    public Short getAdesione1numdip() {
        return (Short)readProperty("adesione1numdip");
    }

    public void setAdesione2numdip(Short adesione2numdip) {
        writeProperty("adesione2numdip", adesione2numdip);
    }
    public Short getAdesione2numdip() {
        return (Short)readProperty("adesione2numdip");
    }

    public void setIddenunciaaziendale(Integer iddenunciaaziendale) {
        writeProperty("iddenunciaaziendale", iddenunciaaziendale);
    }
    public Integer getIddenunciaaziendale() {
        return (Integer)readProperty("iddenunciaaziendale");
    }

    public void setIdfondointeradesione1(String idfondointeradesione1) {
        writeProperty("idfondointeradesione1", idfondointeradesione1);
    }
    public String getIdfondointeradesione1() {
        return (String)readProperty("idfondointeradesione1");
    }

    public void setIdfondointeradesione2(String idfondointeradesione2) {
        writeProperty("idfondointeradesione2", idfondointeradesione2);
    }
    public String getIdfondointeradesione2() {
        return (String)readProperty("idfondointeradesione2");
    }

    public void setIdfondointerrevoca1(String idfondointerrevoca1) {
        writeProperty("idfondointerrevoca1", idfondointerrevoca1);
    }
    public String getIdfondointerrevoca1() {
        return (String)readProperty("idfondointerrevoca1");
    }

    public void setIdfondointerrevoca2(String idfondointerrevoca2) {
        writeProperty("idfondointerrevoca2", idfondointerrevoca2);
    }
    public String getIdfondointerrevoca2() {
        return (String)readProperty("idfondointerrevoca2");
    }

    public void setToDaFondoInterAdesione1(DaFondointeradesione toDaFondoInterAdesione1) {
        setToOneTarget("toDaFondoInterAdesione1", toDaFondoInterAdesione1, true);
    }

    public DaFondointeradesione getToDaFondoInterAdesione1() {
        return (DaFondointeradesione)readProperty("toDaFondoInterAdesione1");
    }


    public void setToDaFondoInterAdesione2(DaFondointeradesione toDaFondoInterAdesione2) {
        setToOneTarget("toDaFondoInterAdesione2", toDaFondoInterAdesione2, true);
    }

    public DaFondointeradesione getToDaFondoInterAdesione2() {
        return (DaFondointeradesione)readProperty("toDaFondoInterAdesione2");
    }


    public void setToDaFondoInterRevoca1(DaFondointerrevoca toDaFondoInterRevoca1) {
        setToOneTarget("toDaFondoInterRevoca1", toDaFondoInterRevoca1, true);
    }

    public DaFondointerrevoca getToDaFondoInterRevoca1() {
        return (DaFondointerrevoca)readProperty("toDaFondoInterRevoca1");
    }


    public void setToDaFondoInterRevoca2(DaFondointerrevoca toDaFondoInterRevoca2) {
        setToOneTarget("toDaFondoInterRevoca2", toDaFondoInterRevoca2, true);
    }

    public DaFondointerrevoca getToDaFondoInterRevoca2() {
        return (DaFondointerrevoca)readProperty("toDaFondoInterRevoca2");
    }


    public void setToDenunciaAziendale(Denunciaaziendale toDenunciaAziendale) {
        setToOneTarget("toDenunciaAziendale", toDenunciaAziendale, true);
    }

    public Denunciaaziendale getToDenunciaAziendale() {
        return (Denunciaaziendale)readProperty("toDenunciaAziendale");
    }


}
