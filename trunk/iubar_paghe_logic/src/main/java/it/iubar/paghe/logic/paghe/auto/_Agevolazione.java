package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.InpsTipoagevolazione;
import it.iubar.paghe.logic.paghe.PosizioneparasubAgevolazione;

/**
 * Class _Agevolazione was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Agevolazione extends CayenneDataObject {

    public static final String IDAGEVOLAZIONE_PROPERTY = "idagevolazione";
    public static final String IMPORTO_PROPERTY = "importo";
    public static final String POSIZIONEPARASUBORDINATO_AGEVOLAZIONE_ARRAY_PROPERTY = "posizioneparasubordinatoAgevolazioneArray";
    public static final String TO_INPS_TIPOAGEVOLAZIONE_PROPERTY = "toInpsTipoagevolazione";

    public static final String IDAGEVOLAZIONE_PK_COLUMN = "IDAGEVOLAZIONE";

    public void setIdagevolazione(Integer idagevolazione) {
        writeProperty("idagevolazione", idagevolazione);
    }
    public Integer getIdagevolazione() {
        return (Integer)readProperty("idagevolazione");
    }

    public void setImporto(BigDecimal importo) {
        writeProperty("importo", importo);
    }
    public BigDecimal getImporto() {
        return (BigDecimal)readProperty("importo");
    }

    public void addToPosizioneparasubordinatoAgevolazioneArray(PosizioneparasubAgevolazione obj) {
        addToManyTarget("posizioneparasubordinatoAgevolazioneArray", obj, true);
    }
    public void removeFromPosizioneparasubordinatoAgevolazioneArray(PosizioneparasubAgevolazione obj) {
        removeToManyTarget("posizioneparasubordinatoAgevolazioneArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<PosizioneparasubAgevolazione> getPosizioneparasubordinatoAgevolazioneArray() {
        return (List<PosizioneparasubAgevolazione>)readProperty("posizioneparasubordinatoAgevolazioneArray");
    }


    public void setToInpsTipoagevolazione(InpsTipoagevolazione toInpsTipoagevolazione) {
        setToOneTarget("toInpsTipoagevolazione", toInpsTipoagevolazione, true);
    }

    public InpsTipoagevolazione getToInpsTipoagevolazione() {
        return (InpsTipoagevolazione)readProperty("toInpsTipoagevolazione");
    }


}