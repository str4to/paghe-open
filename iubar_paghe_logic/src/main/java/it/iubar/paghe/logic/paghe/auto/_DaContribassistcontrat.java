package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.DaTipocontribassist;
import it.iubar.paghe.logic.paghe.Denunciaaziendale;

/**
 * Class _DaContribassistcontrat was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DaContribassistcontrat extends CayenneDataObject {

    public static final String IDCONTRIBASSIST_PROPERTY = "idcontribassist";
    public static final String IDDENUNCIAAZIENDALE_PROPERTY = "iddenunciaaziendale";
    public static final String IDTIPOCONTRIBASSIST_PROPERTY = "idtipocontribassist";
    public static final String IMPORTO_PROPERTY = "importo";
    public static final String TO_DA_TIPO_CONTRIB_ASSIST_PROPERTY = "toDaTipoContribAssist";
    public static final String TO_DENUNCIA_AZIENDALE_PROPERTY = "toDenunciaAziendale";

    public static final String IDCONTRIBASSIST_PK_COLUMN = "IDCONTRIBASSIST";
    public static final String IDDENUNCIAAZIENDALE_PK_COLUMN = "IDDENUNCIAAZIENDALE";

    public void setIdcontribassist(Short idcontribassist) {
        writeProperty("idcontribassist", idcontribassist);
    }
    public Short getIdcontribassist() {
        return (Short)readProperty("idcontribassist");
    }

    public void setIddenunciaaziendale(Integer iddenunciaaziendale) {
        writeProperty("iddenunciaaziendale", iddenunciaaziendale);
    }
    public Integer getIddenunciaaziendale() {
        return (Integer)readProperty("iddenunciaaziendale");
    }

    public void setIdtipocontribassist(String idtipocontribassist) {
        writeProperty("idtipocontribassist", idtipocontribassist);
    }
    public String getIdtipocontribassist() {
        return (String)readProperty("idtipocontribassist");
    }

    public void setImporto(BigDecimal importo) {
        writeProperty("importo", importo);
    }
    public BigDecimal getImporto() {
        return (BigDecimal)readProperty("importo");
    }

    public void setToDaTipoContribAssist(DaTipocontribassist toDaTipoContribAssist) {
        setToOneTarget("toDaTipoContribAssist", toDaTipoContribAssist, true);
    }

    public DaTipocontribassist getToDaTipoContribAssist() {
        return (DaTipocontribassist)readProperty("toDaTipoContribAssist");
    }


    public void setToDenunciaAziendale(Denunciaaziendale toDenunciaAziendale) {
        setToOneTarget("toDenunciaAziendale", toDenunciaAziendale, true);
    }

    public Denunciaaziendale getToDenunciaAziendale() {
        return (Denunciaaziendale)readProperty("toDenunciaAziendale");
    }


}
