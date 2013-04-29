package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Cigoacredaltre;
import it.iubar.paghe.logic.paghe.Gestionecig;
import it.iubar.paghe.logic.paghe.Orecongcigo;

/**
 * Class _Cigoacredito was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Cigoacredito extends CayenneDataObject {

    public static final String IDDATORETRIBUTIVO_PROPERTY = "iddatoretributivo";
    public static final String INDORDINARIA_PROPERTY = "indordinaria";
    public static final String CIGO_ACRED_ALTRE_ARRAY_PROPERTY = "cigoACredAltreArray";
    public static final String ORE_CONG_CIGO_ARRAY_PROPERTY = "oreCongCigoArray";
    public static final String TO_GESTIONE_CIG_PROPERTY = "toGestioneCig";

    public static final String IDDATORETRIBUTIVO_PK_COLUMN = "IDDATORETRIBUTIVO";

    public void setIddatoretributivo(Integer iddatoretributivo) {
        writeProperty("iddatoretributivo", iddatoretributivo);
    }
    public Integer getIddatoretributivo() {
        return (Integer)readProperty("iddatoretributivo");
    }

    public void setIndordinaria(BigDecimal indordinaria) {
        writeProperty("indordinaria", indordinaria);
    }
    public BigDecimal getIndordinaria() {
        return (BigDecimal)readProperty("indordinaria");
    }

    public void addToCigoACredAltreArray(Cigoacredaltre obj) {
        addToManyTarget("cigoACredAltreArray", obj, true);
    }
    public void removeFromCigoACredAltreArray(Cigoacredaltre obj) {
        removeToManyTarget("cigoACredAltreArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Cigoacredaltre> getCigoACredAltreArray() {
        return (List<Cigoacredaltre>)readProperty("cigoACredAltreArray");
    }


    public void addToOreCongCigoArray(Orecongcigo obj) {
        addToManyTarget("oreCongCigoArray", obj, true);
    }
    public void removeFromOreCongCigoArray(Orecongcigo obj) {
        removeToManyTarget("oreCongCigoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Orecongcigo> getOreCongCigoArray() {
        return (List<Orecongcigo>)readProperty("oreCongCigoArray");
    }


    public void setToGestioneCig(Gestionecig toGestioneCig) {
        setToOneTarget("toGestioneCig", toGestioneCig, true);
    }

    public Gestionecig getToGestioneCig() {
        return (Gestionecig)readProperty("toGestioneCig");
    }


}
