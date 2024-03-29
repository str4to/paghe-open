package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.DaRecuperopensbancari;
import it.iubar.paghe.logic.paghe.DaVerspensbancari;
import it.iubar.paghe.logic.paghe.Denunciaaziendale;

/**
 * Class _DaPrestazbancari was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DaPrestazbancari extends CayenneDataObject {

    public static final String IDDENUNCIAAZIENDALE_PROPERTY = "iddenunciaaziendale";
    public static final String DA_RECUPERO_PENS_BANCARI_ARRAY_PROPERTY = "daRecuperoPensBancariArray";
    public static final String DA_VERS_PENS_BANCARI_ARRAY_PROPERTY = "daVersPensBancariArray";
    public static final String TO_DENUNCIA_AZIENDALE_PROPERTY = "toDenunciaAziendale";

    public static final String IDDENUNCIAAZIENDALE_PK_COLUMN = "IDDENUNCIAAZIENDALE";

    public void setIddenunciaaziendale(Integer iddenunciaaziendale) {
        writeProperty("iddenunciaaziendale", iddenunciaaziendale);
    }
    public Integer getIddenunciaaziendale() {
        return (Integer)readProperty("iddenunciaaziendale");
    }

    public void addToDaRecuperoPensBancariArray(DaRecuperopensbancari obj) {
        addToManyTarget("daRecuperoPensBancariArray", obj, true);
    }
    public void removeFromDaRecuperoPensBancariArray(DaRecuperopensbancari obj) {
        removeToManyTarget("daRecuperoPensBancariArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<DaRecuperopensbancari> getDaRecuperoPensBancariArray() {
        return (List<DaRecuperopensbancari>)readProperty("daRecuperoPensBancariArray");
    }


    public void addToDaVersPensBancariArray(DaVerspensbancari obj) {
        addToManyTarget("daVersPensBancariArray", obj, true);
    }
    public void removeFromDaVersPensBancariArray(DaVerspensbancari obj) {
        removeToManyTarget("daVersPensBancariArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<DaVerspensbancari> getDaVersPensBancariArray() {
        return (List<DaVerspensbancari>)readProperty("daVersPensBancariArray");
    }


    public void setToDenunciaAziendale(Denunciaaziendale toDenunciaAziendale) {
        setToOneTarget("toDenunciaAziendale", toDenunciaAziendale, true);
    }

    public Denunciaaziendale getToDenunciaAziendale() {
        return (Denunciaaziendale)readProperty("toDenunciaAziendale");
    }


}
