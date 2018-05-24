/*
 * Seguro Equivalente Mensual
 * TEM Equivalente Mensual = TEM SD * (1+TEM DerEmi SD) * (1 + TEM IGV)
 */
package bco.credito.entidad;

import java.io.Serializable;
import java.util.Date;

public class CEv0CuotaFija implements Serializable {

    private Date mFechaDesembolso;
    private Date mFechaInicioPago;
    private int mNumeroDiasFrecuencia;
    private int mNumeroMesesGracia;
    private int mNumeroDiasBaseCalculo;
    private int mPlazo;
    private double mTea;  // Tasa Efectiva Anual
    private double mTemIGV;     // Impuesto General a las Ventas aplicado al Seguro de Desgravamen
    private double mTemSD;  //Seguro de Desgravamen
    private double mTemDerEmiSD; // Derecho de Emisión del Seguros de Desgravamen
    private double mImporteDesembolso; //Monto del Desembolso del Crédito


    /*
     * CONSTRUCTORES
     */
    public CEv0CuotaFija() {
    }
    
    public CEv0CuotaFija(double pTea) {
        this.mTea = pTea;
    }

    public CEv0CuotaFija(double pTea, int pPlazo, double pMontoDesembolso) {
        this.mTea = pTea;
        this.mPlazo = pPlazo;
        this.mImporteDesembolso = pMontoDesembolso;
    }

    public CEv0CuotaFija(double pTemSD, double pTemDerEmiSD, double pTemIGV) {
        this.mTemSD = pTemSD;
        this.mTemDerEmiSD = pTemDerEmiSD;
        this.mTemIGV = pTemIGV;
    }

    public CEv0CuotaFija(double pTea, int pPlazo, double pMontoDesembolso, double pTemSD, double pTemDerEmiSD, double pTemIGV) {
        this.mTea = pTea;
        this.mTemSD = pTemSD;
        this.mTemDerEmiSD = pTemDerEmiSD;
        this.mTemIGV = pTemIGV;
    }


    /*
     * METODOS
     */
    public Date getmFechaDesembolso() {
        return mFechaDesembolso;
    }

    public void setmFechaDesembolso(Date mFechaDesembolso) {
        this.mFechaDesembolso = mFechaDesembolso;
    }
   
    public Date getmFechaInicioPago() {
        return mFechaInicioPago;
    }

    public void setmFechaInicioPago(Date mFechaInicioPago) {
        this.mFechaInicioPago = mFechaInicioPago;
    }

    public int getmNumeroDiasFrecuencia() {
        return mNumeroDiasFrecuencia;
    }

    public void setmNumeroDiasFrecuencia(int mNumeroDiasFrecuencia) {
        this.mNumeroDiasFrecuencia = mNumeroDiasFrecuencia;
    }

    public int getmNumeroMesesGracia() {
        return mNumeroMesesGracia;
    }

    public void setmNumeroMesesGracia(int mNumeroMesesGracia) {
        this.mNumeroMesesGracia = mNumeroMesesGracia;
    }

    public int getmNumeroDiasBaseCalculo() {
        return mNumeroDiasBaseCalculo;
    }

    public void setmNumeroDiasBaseCalculo(int mNumeroDiasBaseCalculo) {
        this.mNumeroDiasBaseCalculo = mNumeroDiasBaseCalculo;
    }

    
        public int getmPlazo() {
        return mPlazo;
    }

    public void setmPlazo(int mPlazo) {
        this.mPlazo = mPlazo;
    }

    public double getmTea() {
        return mTea;
    }

    public void setmTea(double mTea) {
        this.mTea = mTea;
    }

    public double getmTemIGV() {
        return mTemIGV;
    }

    public void setmTemIGV(double mTemIGV) {
        this.mTemIGV = mTemIGV;
    }

    public double getmTemSD() {
        return mTemSD;
    }

    public void setmTemSD(double mTemSD) {
        this.mTemSD = mTemSD;
    }

    public double getmTemDerEmiSD() {
        return mTemDerEmiSD;
    }

    public void setmTemDerEmiSD(double mTemDerEmiSD) {
        this.mTemDerEmiSD = mTemDerEmiSD;
    }

    public double getmImporteDesembolso() {
        return mImporteDesembolso;
    }

    public void setmImporteDesembolso(double mImporteDesembolso) {
        this.mImporteDesembolso = mImporteDesembolso;
    }

    /*
     * CONVERSION DE TASAS - TEA y SEGURO DE DESGRAVAMEN
     */
    public double getmTeaConvertidoTem() {
        double lDblTasaEquivalente;
        
        lDblTasaEquivalente = (Math.pow((1 + this.mTea * 0.01D), (1D / 12D)) - 1D);
        return lDblTasaEquivalente;
    }

    public double getmTeaConvertidoTed() {
        double lDblTasaEquivalente;
        
        lDblTasaEquivalente = (Math.pow((1 + this.mTea * 0.01D), (1D / 360D)) - 1D);
        return lDblTasaEquivalente;
    }

    public double getmTemEquivalenteSeguroDesgravamen() {
        double lDblTasaEquivalente;
        
        lDblTasaEquivalente = (this.mTemSD * (1 + this.mTemDerEmiSD * 0.01D) * (1 + this.mTemIGV * 0.01D));
        return lDblTasaEquivalente;
    }

    public double getmTeaEquivalenteSeguroDesgravamen() {
        double lDblTasaEquivalente;
        
        lDblTasaEquivalente = getmTeaConvertidoTem();
        lDblTasaEquivalente = lDblTasaEquivalente * (1 + getmTemEquivalenteSeguroDesgravamen());
        lDblTasaEquivalente = Math.pow(lDblTasaEquivalente, 12) - 1;

        return lDblTasaEquivalente;
    }

    /*
     * MONTO DE CUOTA FIJO POR FORMULA
     */
    public double getmFormulaMontoCuotaFijo() {
        double lDblFactorBase, lDblMontoCuotaFijo;

        lDblFactorBase = 1 - Math.pow((1 + getmTeaConvertidoTem()), this.mPlazo * -1D);
        lDblFactorBase = Math.pow(lDblFactorBase / getmTeaConvertidoTem(), -1D);

        lDblMontoCuotaFijo = lDblFactorBase * this.mImporteDesembolso;

        return lDblMontoCuotaFijo;
    }

}
