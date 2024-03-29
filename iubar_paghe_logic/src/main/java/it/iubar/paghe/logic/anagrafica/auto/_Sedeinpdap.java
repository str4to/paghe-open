package it.iubar.paghe.logic.anagrafica.auto;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.anagrafica.Provincia;

/**
 * Class _Sedeinpdap was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Sedeinpdap extends CayenneDataObject {

    public static final String DENOMINAZIONE_PROPERTY = "denominazione";
    public static final String IDSEDEINPDAP_PROPERTY = "idsedeinpdap";
    public static final String PROVINCIASIGLA_PROPERTY = "provinciasigla";
    public static final String TO_PROVINCIA_PROPERTY = "toProvincia";
    public static final String TO_PROVINCIA_BY_SIGLA_PROPERTY = "toProvinciaBySigla";

    public static final String IDSEDEINPDAP_PK_COLUMN = "IDSEDEINPDAP";

    public void setDenominazione(String denominazione) {
        writeProperty("denominazione", denominazione);
    }
    public String getDenominazione() {
        return (String)readProperty("denominazione");
    }

    public void setIdsedeinpdap(String idsedeinpdap) {
        writeProperty("idsedeinpdap", idsedeinpdap);
    }
    public String getIdsedeinpdap() {
        return (String)readProperty("idsedeinpdap");
    }

    public void setProvinciasigla(String provinciasigla) {
        writeProperty("provinciasigla", provinciasigla);
    }
    public String getProvinciasigla() {
        return (String)readProperty("provinciasigla");
    }

    public void setToProvincia(Provincia toProvincia) {
        setToOneTarget("toProvincia", toProvincia, true);
    }

    public Provincia getToProvincia() {
        return (Provincia)readProperty("toProvincia");
    }


    public void setToProvinciaBySigla(Provincia toProvinciaBySigla) {
        setToOneTarget("toProvinciaBySigla", toProvinciaBySigla, true);
    }

    public Provincia getToProvinciaBySigla() {
        return (Provincia)readProperty("toProvinciaBySigla");
    }


}
