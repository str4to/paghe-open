package it.iubar.paghe.logic.anagrafica.auto;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.anagrafica.Impresa;
import it.iubar.paghe.logic.anagrafica.Sedeimpresa;

/**
 * Class _SedeimpresaCodinpslav was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _SedeimpresaCodinpslav extends CayenneDataObject {

    public static final String CONTROCOD_PROPERTY = "controcod";
    public static final String IDIMPRESA_PROPERTY = "idimpresa";
    public static final String IDSEDEIMPRESA_PROPERTY = "idsedeimpresa";
    public static final String MATRICOLAINPS_PROPERTY = "matricolainps";
    public static final String TO_IMPRESA_PROPERTY = "toImpresa";
    public static final String TO_SEDEIMPRESA_PROPERTY = "toSedeimpresa";

    public static final String IDIMPRESA_PK_COLUMN = "IDIMPRESA";
    public static final String IDSEDEIMPRESA_PK_COLUMN = "IDSEDEIMPRESA";
    public static final String MATRICOLAINPS_PK_COLUMN = "MATRICOLAINPS";

    public void setControcod(String controcod) {
        writeProperty("controcod", controcod);
    }
    public String getControcod() {
        return (String)readProperty("controcod");
    }

    public void setIdimpresa(Integer idimpresa) {
        writeProperty("idimpresa", idimpresa);
    }
    public Integer getIdimpresa() {
        return (Integer)readProperty("idimpresa");
    }

    public void setIdsedeimpresa(Short idsedeimpresa) {
        writeProperty("idsedeimpresa", idsedeimpresa);
    }
    public Short getIdsedeimpresa() {
        return (Short)readProperty("idsedeimpresa");
    }

    public void setMatricolainps(String matricolainps) {
        writeProperty("matricolainps", matricolainps);
    }
    public String getMatricolainps() {
        return (String)readProperty("matricolainps");
    }

    public void setToImpresa(Impresa toImpresa) {
        setToOneTarget("toImpresa", toImpresa, true);
    }

    public Impresa getToImpresa() {
        return (Impresa)readProperty("toImpresa");
    }


    public void setToSedeimpresa(Sedeimpresa toSedeimpresa) {
        setToOneTarget("toSedeimpresa", toSedeimpresa, true);
    }

    public Sedeimpresa getToSedeimpresa() {
        return (Sedeimpresa)readProperty("toSedeimpresa");
    }


}
