package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

/** Class _InpsAliquotadettaglio was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _InpsAliquotadettaglio extends org.apache.cayenne.CayenneDataObject {

    public static final String ALIQUOTAAGGIUNTIVA_PROPERTY = "aliquotaaggiuntiva";
    public static final String CIG_PROPERTY = "cig";
    public static final String CIGS_PROPERTY = "cigs";
    public static final String CIGS2_PROPERTY = "cigs2";
    public static final String CUAF_PROPERTY = "cuaf";
    public static final String DS_PROPERTY = "ds";
    public static final String DS2_PROPERTY = "ds2";
    public static final String IDAREA_PROPERTY = "idarea";
    public static final String IDTIPOLAVORATORE_PROPERTY = "idtipolavoratore";
    public static final String IVS_PROPERTY = "ivs";
    public static final String IVS2_PROPERTY = "ivs2";
    public static final String MALATTIA_PROPERTY = "malattia";
    public static final String MATERNITA_PROPERTY = "maternita";
    public static final String MOBILITA_PROPERTY = "mobilita";
    public static final String NOTA_PROPERTY = "nota";
    public static final String TFR_PROPERTY = "tfr";
    public static final String ULTIMAMODIFICA_PROPERTY = "ultimamodifica";
    public static final String ULTIMAMODIFICAUSER_PROPERTY = "ultimamodificauser";
    public static final String VALIDOAL_PROPERTY = "validoal";
    public static final String VALIDODAL_PROPERTY = "validodal";
    public static final String PROFILOINPS_ARRAY_PROPERTY = "profiloinpsArray";
    public static final String TO_INPS_ALIQUOTAAREA_PROPERTY = "toInpsAliquotaarea";
    public static final String TO_INPS_ALIQUOTATIPOLAVORATORE_PROPERTY = "toInpsAliquotatipolavoratore";

    public static final String IDAREA_PK_COLUMN = "IDAREA";
    public static final String IDTIPOLAVORATORE_PK_COLUMN = "IDTIPOLAVORATORE";
    public static final String VALIDODAL_PK_COLUMN = "VALIDODAL";

    public void setAliquotaaggiuntiva(java.math.BigDecimal aliquotaaggiuntiva) {
        writeProperty("aliquotaaggiuntiva", aliquotaaggiuntiva);
    }
    public java.math.BigDecimal getAliquotaaggiuntiva() {
        return (java.math.BigDecimal)readProperty("aliquotaaggiuntiva");
    }
    
    
    public void setCig(java.math.BigDecimal cig) {
        writeProperty("cig", cig);
    }
    public java.math.BigDecimal getCig() {
        return (java.math.BigDecimal)readProperty("cig");
    }
    
    
    public void setCigs(java.math.BigDecimal cigs) {
        writeProperty("cigs", cigs);
    }
    public java.math.BigDecimal getCigs() {
        return (java.math.BigDecimal)readProperty("cigs");
    }
    
    
    public void setCigs2(java.math.BigDecimal cigs2) {
        writeProperty("cigs2", cigs2);
    }
    public java.math.BigDecimal getCigs2() {
        return (java.math.BigDecimal)readProperty("cigs2");
    }
    
    
    public void setCuaf(java.math.BigDecimal cuaf) {
        writeProperty("cuaf", cuaf);
    }
    public java.math.BigDecimal getCuaf() {
        return (java.math.BigDecimal)readProperty("cuaf");
    }
    
    
    public void setDs(java.math.BigDecimal ds) {
        writeProperty("ds", ds);
    }
    public java.math.BigDecimal getDs() {
        return (java.math.BigDecimal)readProperty("ds");
    }
    
    
    public void setDs2(java.math.BigDecimal ds2) {
        writeProperty("ds2", ds2);
    }
    public java.math.BigDecimal getDs2() {
        return (java.math.BigDecimal)readProperty("ds2");
    }
    
    
    public void setIdarea(Integer idarea) {
        writeProperty("idarea", idarea);
    }
    public Integer getIdarea() {
        return (Integer)readProperty("idarea");
    }
    
    
    public void setIdtipolavoratore(Integer idtipolavoratore) {
        writeProperty("idtipolavoratore", idtipolavoratore);
    }
    public Integer getIdtipolavoratore() {
        return (Integer)readProperty("idtipolavoratore");
    }
    
    
    public void setIvs(java.math.BigDecimal ivs) {
        writeProperty("ivs", ivs);
    }
    public java.math.BigDecimal getIvs() {
        return (java.math.BigDecimal)readProperty("ivs");
    }
    
    
    public void setIvs2(java.math.BigDecimal ivs2) {
        writeProperty("ivs2", ivs2);
    }
    public java.math.BigDecimal getIvs2() {
        return (java.math.BigDecimal)readProperty("ivs2");
    }
    
    
    public void setMalattia(java.math.BigDecimal malattia) {
        writeProperty("malattia", malattia);
    }
    public java.math.BigDecimal getMalattia() {
        return (java.math.BigDecimal)readProperty("malattia");
    }
    
    
    public void setMaternita(java.math.BigDecimal maternita) {
        writeProperty("maternita", maternita);
    }
    public java.math.BigDecimal getMaternita() {
        return (java.math.BigDecimal)readProperty("maternita");
    }
    
    
    public void setMobilita(java.math.BigDecimal mobilita) {
        writeProperty("mobilita", mobilita);
    }
    public java.math.BigDecimal getMobilita() {
        return (java.math.BigDecimal)readProperty("mobilita");
    }
    
    
    public void setNota(String nota) {
        writeProperty("nota", nota);
    }
    public String getNota() {
        return (String)readProperty("nota");
    }
    
    
    public void setTfr(java.math.BigDecimal tfr) {
        writeProperty("tfr", tfr);
    }
    public java.math.BigDecimal getTfr() {
        return (java.math.BigDecimal)readProperty("tfr");
    }
    
    
    public void setUltimamodifica(java.sql.Timestamp ultimamodifica) {
        writeProperty("ultimamodifica", ultimamodifica);
    }
    public java.sql.Timestamp getUltimamodifica() {
        return (java.sql.Timestamp)readProperty("ultimamodifica");
    }
    
    
    public void setUltimamodificauser(String ultimamodificauser) {
        writeProperty("ultimamodificauser", ultimamodificauser);
    }
    public String getUltimamodificauser() {
        return (String)readProperty("ultimamodificauser");
    }
    
    
    public void setValidoal(java.util.Date validoal) {
        writeProperty("validoal", validoal);
    }
    public java.util.Date getValidoal() {
        return (java.util.Date)readProperty("validoal");
    }
    
    
    public void setValidodal(java.util.Date validodal) {
        writeProperty("validodal", validodal);
    }
    public java.util.Date getValidodal() {
        return (java.util.Date)readProperty("validodal");
    }
    
    
    public void addToProfiloinpsArray(it.iubar.paghe.logic.paghe.Profiloprevidenziale obj) {
        addToManyTarget("profiloinpsArray", obj, true);
    }
    public void removeFromProfiloinpsArray(it.iubar.paghe.logic.paghe.Profiloprevidenziale obj) {
        removeToManyTarget("profiloinpsArray", obj, true);
    }
    public List getProfiloinpsArray() {
        return (List)readProperty("profiloinpsArray");
    }
    
    
    public void setToInpsAliquotaarea(it.iubar.paghe.logic.paghe.InpsAliquotaarea toInpsAliquotaarea) {
        setToOneTarget("toInpsAliquotaarea", toInpsAliquotaarea, true);
    }

    public it.iubar.paghe.logic.paghe.InpsAliquotaarea getToInpsAliquotaarea() {
        return (it.iubar.paghe.logic.paghe.InpsAliquotaarea)readProperty("toInpsAliquotaarea");
    } 
    
    
    public void setToInpsAliquotatipolavoratore(it.iubar.paghe.logic.paghe.InpsAliquotatipolavoratore toInpsAliquotatipolavoratore) {
        setToOneTarget("toInpsAliquotatipolavoratore", toInpsAliquotatipolavoratore, true);
    }

    public it.iubar.paghe.logic.paghe.InpsAliquotatipolavoratore getToInpsAliquotatipolavoratore() {
        return (it.iubar.paghe.logic.paghe.InpsAliquotatipolavoratore)readProperty("toInpsAliquotatipolavoratore");
    } 
    
    
}
