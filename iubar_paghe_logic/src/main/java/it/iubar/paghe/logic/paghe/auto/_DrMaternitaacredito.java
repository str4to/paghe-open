package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.DrMalattiaacreditoaltre;
import it.iubar.paghe.logic.paghe.DrMaternita;
import it.iubar.paghe.logic.paghe.DrMaternitaacreditoaltre;

/**
 * Class _DrMaternitaacredito was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DrMaternitaacredito extends CayenneDataObject {

    public static final String IDDATORETRIBUTIVO_PROPERTY = "iddatoretributivo";
    public static final String INDALLATTAMENTO_PROPERTY = "indallattamento";
    public static final String INDCONGEDOPARENTALE_PROPERTY = "indcongedoparentale";
    public static final String INDMAT1FASCIA_PROPERTY = "indmat1fascia";
    public static final String INDMAT2FASCIA_PROPERTY = "indmat2fascia";
    public static final String DR_MALATTIA_ACREDITO_ALTRE_ARRAY_PROPERTY = "drMalattiaACreditoAltreArray";
    public static final String DR_MATERNITA_ACREDITO_ALTRE_ARRAY_PROPERTY = "drMaternitaACreditoAltreArray";
    public static final String TO_DR_MATERNITA_PROPERTY = "toDrMaternita";

    public static final String IDDATORETRIBUTIVO_PK_COLUMN = "IDDATORETRIBUTIVO";

    public void setIddatoretributivo(Integer iddatoretributivo) {
        writeProperty("iddatoretributivo", iddatoretributivo);
    }
    public Integer getIddatoretributivo() {
        return (Integer)readProperty("iddatoretributivo");
    }

    public void setIndallattamento(BigDecimal indallattamento) {
        writeProperty("indallattamento", indallattamento);
    }
    public BigDecimal getIndallattamento() {
        return (BigDecimal)readProperty("indallattamento");
    }

    public void setIndcongedoparentale(BigDecimal indcongedoparentale) {
        writeProperty("indcongedoparentale", indcongedoparentale);
    }
    public BigDecimal getIndcongedoparentale() {
        return (BigDecimal)readProperty("indcongedoparentale");
    }

    public void setIndmat1fascia(BigDecimal indmat1fascia) {
        writeProperty("indmat1fascia", indmat1fascia);
    }
    public BigDecimal getIndmat1fascia() {
        return (BigDecimal)readProperty("indmat1fascia");
    }

    public void setIndmat2fascia(BigDecimal indmat2fascia) {
        writeProperty("indmat2fascia", indmat2fascia);
    }
    public BigDecimal getIndmat2fascia() {
        return (BigDecimal)readProperty("indmat2fascia");
    }

    public void addToDrMalattiaACreditoAltreArray(DrMalattiaacreditoaltre obj) {
        addToManyTarget("drMalattiaACreditoAltreArray", obj, true);
    }
    public void removeFromDrMalattiaACreditoAltreArray(DrMalattiaacreditoaltre obj) {
        removeToManyTarget("drMalattiaACreditoAltreArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<DrMalattiaacreditoaltre> getDrMalattiaACreditoAltreArray() {
        return (List<DrMalattiaacreditoaltre>)readProperty("drMalattiaACreditoAltreArray");
    }


    public void addToDrMaternitaACreditoAltreArray(DrMaternitaacreditoaltre obj) {
        addToManyTarget("drMaternitaACreditoAltreArray", obj, true);
    }
    public void removeFromDrMaternitaACreditoAltreArray(DrMaternitaacreditoaltre obj) {
        removeToManyTarget("drMaternitaACreditoAltreArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<DrMaternitaacreditoaltre> getDrMaternitaACreditoAltreArray() {
        return (List<DrMaternitaacreditoaltre>)readProperty("drMaternitaACreditoAltreArray");
    }


    public void setToDrMaternita(DrMaternita toDrMaternita) {
        setToOneTarget("toDrMaternita", toDrMaternita, true);
    }

    public DrMaternita getToDrMaternita() {
        return (DrMaternita)readProperty("toDrMaternita");
    }


}