package it.iubar.paghe.logic.paghe.auto;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.DmagTipoditta1;
import it.iubar.paghe.logic.paghe.DmagTipoditta2;
import it.iubar.paghe.logic.paghe.DmagTipomanodopera;

/**
 * Class _DmagImpresaprofilo was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DmagImpresaprofilo extends CayenneDataObject {

    public static final String IDASSCATEGORIA_PROPERTY = "idasscategoria";
    public static final String IDIMPRESA_PROPERTY = "idimpresa";
    public static final String IDTIPODITTA1_PROPERTY = "idtipoditta1";
    public static final String IDTIPODITTA2_PROPERTY = "idtipoditta2";
    public static final String IDTIPOMANODOPERA_PROPERTY = "idtipomanodopera";
    public static final String TO_DMAG_TIPODITTA1_PROPERTY = "toDmagTipoditta1";
    public static final String TO_DMAG_TIPODITTA2_PROPERTY = "toDmagTipoditta2";
    public static final String TO_DMAG_TIPOMANODOPERA_PROPERTY = "toDmagTipomanodopera";

    public static final String IDIMPRESA_PK_COLUMN = "IDIMPRESA";

    public void setIdasscategoria(Short idasscategoria) {
        writeProperty("idasscategoria", idasscategoria);
    }
    public Short getIdasscategoria() {
        return (Short)readProperty("idasscategoria");
    }

    public void setIdimpresa(Integer idimpresa) {
        writeProperty("idimpresa", idimpresa);
    }
    public Integer getIdimpresa() {
        return (Integer)readProperty("idimpresa");
    }

    public void setIdtipoditta1(Short idtipoditta1) {
        writeProperty("idtipoditta1", idtipoditta1);
    }
    public Short getIdtipoditta1() {
        return (Short)readProperty("idtipoditta1");
    }

    public void setIdtipoditta2(Short idtipoditta2) {
        writeProperty("idtipoditta2", idtipoditta2);
    }
    public Short getIdtipoditta2() {
        return (Short)readProperty("idtipoditta2");
    }

    public void setIdtipomanodopera(Short idtipomanodopera) {
        writeProperty("idtipomanodopera", idtipomanodopera);
    }
    public Short getIdtipomanodopera() {
        return (Short)readProperty("idtipomanodopera");
    }

    public void setToDmagTipoditta1(DmagTipoditta1 toDmagTipoditta1) {
        setToOneTarget("toDmagTipoditta1", toDmagTipoditta1, true);
    }

    public DmagTipoditta1 getToDmagTipoditta1() {
        return (DmagTipoditta1)readProperty("toDmagTipoditta1");
    }


    public void setToDmagTipoditta2(DmagTipoditta2 toDmagTipoditta2) {
        setToOneTarget("toDmagTipoditta2", toDmagTipoditta2, true);
    }

    public DmagTipoditta2 getToDmagTipoditta2() {
        return (DmagTipoditta2)readProperty("toDmagTipoditta2");
    }


    public void setToDmagTipomanodopera(DmagTipomanodopera toDmagTipomanodopera) {
        setToOneTarget("toDmagTipomanodopera", toDmagTipomanodopera, true);
    }

    public DmagTipomanodopera getToDmagTipomanodopera() {
        return (DmagTipomanodopera)readProperty("toDmagTipomanodopera");
    }


}