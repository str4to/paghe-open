package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Contrattodettaglio;
import it.iubar.paghe.logic.paghe.Contrattovoce;
import it.iubar.paghe.logic.paghe.Elementoretributivo;

/**
 * Class _ContrattodettElemento was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ContrattodettElemento extends CayenneDataObject {

    public static final String IDCONTRATTODETTAGLIO_PROPERTY = "idcontrattodettaglio";
    public static final String IDELEMENTO_PROPERTY = "idelemento";
    public static final String IDLIVELLO_PROPERTY = "idlivello";
    public static final String IDTIPOLAVORATORE2_PROPERTY = "idtipolavoratore2";
    public static final String IDVOCE_PROPERTY = "idvoce";
    public static final String IMPORTO_PROPERTY = "importo";
    public static final String PERCENTUALE_PROPERTY = "percentuale";
    public static final String QUANTITA_PROPERTY = "quantita";
    public static final String TO_CONTRATTODETTAGLIO_PROPERTY = "toContrattodettaglio";
    public static final String TO_CONTRATTOVOCE_PROPERTY = "toContrattovoce";
    public static final String TO_ELEMENTORETRIBUTIVO_PROPERTY = "toElementoretributivo";

    public static final String IDCONTRATTODETTAGLIO_PK_COLUMN = "IDCONTRATTODETTAGLIO";
    public static final String IDELEMENTO_PK_COLUMN = "IDELEMENTO";

    public void setIdcontrattodettaglio(Integer idcontrattodettaglio) {
        writeProperty("idcontrattodettaglio", idcontrattodettaglio);
    }
    public Integer getIdcontrattodettaglio() {
        return (Integer)readProperty("idcontrattodettaglio");
    }

    public void setIdelemento(Integer idelemento) {
        writeProperty("idelemento", idelemento);
    }
    public Integer getIdelemento() {
        return (Integer)readProperty("idelemento");
    }

    public void setIdlivello(String idlivello) {
        writeProperty("idlivello", idlivello);
    }
    public String getIdlivello() {
        return (String)readProperty("idlivello");
    }

    public void setIdtipolavoratore2(Short idtipolavoratore2) {
        writeProperty("idtipolavoratore2", idtipolavoratore2);
    }
    public Short getIdtipolavoratore2() {
        return (Short)readProperty("idtipolavoratore2");
    }

    public void setIdvoce(Short idvoce) {
        writeProperty("idvoce", idvoce);
    }
    public Short getIdvoce() {
        return (Short)readProperty("idvoce");
    }

    public void setImporto(BigDecimal importo) {
        writeProperty("importo", importo);
    }
    public BigDecimal getImporto() {
        return (BigDecimal)readProperty("importo");
    }

    public void setPercentuale(BigDecimal percentuale) {
        writeProperty("percentuale", percentuale);
    }
    public BigDecimal getPercentuale() {
        return (BigDecimal)readProperty("percentuale");
    }

    public void setQuantita(BigDecimal quantita) {
        writeProperty("quantita", quantita);
    }
    public BigDecimal getQuantita() {
        return (BigDecimal)readProperty("quantita");
    }

    public void setToContrattodettaglio(Contrattodettaglio toContrattodettaglio) {
        setToOneTarget("toContrattodettaglio", toContrattodettaglio, true);
    }

    public Contrattodettaglio getToContrattodettaglio() {
        return (Contrattodettaglio)readProperty("toContrattodettaglio");
    }


    public void setToContrattovoce(Contrattovoce toContrattovoce) {
        setToOneTarget("toContrattovoce", toContrattovoce, true);
    }

    public Contrattovoce getToContrattovoce() {
        return (Contrattovoce)readProperty("toContrattovoce");
    }


    public void setToElementoretributivo(Elementoretributivo toElementoretributivo) {
        setToOneTarget("toElementoretributivo", toElementoretributivo, true);
    }

    public Elementoretributivo getToElementoretributivo() {
        return (Elementoretributivo)readProperty("toElementoretributivo");
    }


}
