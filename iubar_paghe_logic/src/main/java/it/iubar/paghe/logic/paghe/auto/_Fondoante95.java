package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Fondoante95Arretrato;
import it.iubar.paghe.logic.paghe.Fondoante95Contribsindanno;
import it.iubar.paghe.logic.paghe.Fondoante95Partpens;
import it.iubar.paghe.logic.paghe.Fondospeciale;

/**
 * Class _Fondoante95 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Fondoante95 extends CayenneDataObject {

    public static final String GIORNINONRETRIBUITI_PROPERTY = "giorninonretribuiti";
    public static final String IDDATORETRIBUTIVO_PROPERTY = "iddatoretributivo";
    public static final String RETRIBACCESSORIAET_PROPERTY = "retribaccessoriaet";
    public static final String RETRIBPENSIONABILE_PROPERTY = "retribpensionabile";
    public static final String RETRIBTEORICAEXL223_PROPERTY = "retribteoricaexl223";
    public static final String TREDICESIMA_PROPERTY = "tredicesima";
    public static final String ARRETRATOFONDOANTE95ARRAY_PROPERTY = "arretratofondoante95Array";
    public static final String CONTRIBSINDANNOFONDO_ARRAY_PROPERTY = "contribsindannofondoArray";
    public static final String FONDOANTE95PARTPENS_ARRAY_PROPERTY = "fondoante95PartpensArray";
    public static final String TO_FONDOSPECIALE_PROPERTY = "toFondospeciale";

    public static final String IDDATORETRIBUTIVO_PK_COLUMN = "IDDATORETRIBUTIVO";

    public void setGiorninonretribuiti(Short giorninonretribuiti) {
        writeProperty("giorninonretribuiti", giorninonretribuiti);
    }
    public Short getGiorninonretribuiti() {
        return (Short)readProperty("giorninonretribuiti");
    }

    public void setIddatoretributivo(Integer iddatoretributivo) {
        writeProperty("iddatoretributivo", iddatoretributivo);
    }
    public Integer getIddatoretributivo() {
        return (Integer)readProperty("iddatoretributivo");
    }

    public void setRetribaccessoriaet(BigDecimal retribaccessoriaet) {
        writeProperty("retribaccessoriaet", retribaccessoriaet);
    }
    public BigDecimal getRetribaccessoriaet() {
        return (BigDecimal)readProperty("retribaccessoriaet");
    }

    public void setRetribpensionabile(BigDecimal retribpensionabile) {
        writeProperty("retribpensionabile", retribpensionabile);
    }
    public BigDecimal getRetribpensionabile() {
        return (BigDecimal)readProperty("retribpensionabile");
    }

    public void setRetribteoricaexl223(BigDecimal retribteoricaexl223) {
        writeProperty("retribteoricaexl223", retribteoricaexl223);
    }
    public BigDecimal getRetribteoricaexl223() {
        return (BigDecimal)readProperty("retribteoricaexl223");
    }

    public void setTredicesima(BigDecimal tredicesima) {
        writeProperty("tredicesima", tredicesima);
    }
    public BigDecimal getTredicesima() {
        return (BigDecimal)readProperty("tredicesima");
    }

    public void addToArretratofondoante95Array(Fondoante95Arretrato obj) {
        addToManyTarget("arretratofondoante95Array", obj, true);
    }
    public void removeFromArretratofondoante95Array(Fondoante95Arretrato obj) {
        removeToManyTarget("arretratofondoante95Array", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Fondoante95Arretrato> getArretratofondoante95Array() {
        return (List<Fondoante95Arretrato>)readProperty("arretratofondoante95Array");
    }


    public void addToContribsindannofondoArray(Fondoante95Contribsindanno obj) {
        addToManyTarget("contribsindannofondoArray", obj, true);
    }
    public void removeFromContribsindannofondoArray(Fondoante95Contribsindanno obj) {
        removeToManyTarget("contribsindannofondoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Fondoante95Contribsindanno> getContribsindannofondoArray() {
        return (List<Fondoante95Contribsindanno>)readProperty("contribsindannofondoArray");
    }


    public void addToFondoante95PartpensArray(Fondoante95Partpens obj) {
        addToManyTarget("fondoante95PartpensArray", obj, true);
    }
    public void removeFromFondoante95PartpensArray(Fondoante95Partpens obj) {
        removeToManyTarget("fondoante95PartpensArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Fondoante95Partpens> getFondoante95PartpensArray() {
        return (List<Fondoante95Partpens>)readProperty("fondoante95PartpensArray");
    }


    public void setToFondospeciale(Fondospeciale toFondospeciale) {
        setToOneTarget("toFondospeciale", toFondospeciale, true);
    }

    public Fondospeciale getToFondospeciale() {
        return (Fondospeciale)readProperty("toFondospeciale");
    }


}
