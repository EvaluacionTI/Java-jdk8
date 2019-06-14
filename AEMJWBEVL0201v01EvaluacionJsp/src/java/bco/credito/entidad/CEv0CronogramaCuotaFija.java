
package bco.credito.entidad;

import java.io.Serializable;
import java.util.Date;

public class CEv0CronogramaCuotaFija  extends CEv0CuotaFija implements Serializable{
    private int mNumeroCuota;
    private Date mFechaInicio;
    private Date mFechaVencimiento;
    private int mNumeroDias;
    private int mAcumuladoDias;
    private double mFactorNormal;
    private double mFactorInversa;
    private byte mNumeroMesesPago;
    private double mFactorDoble;

    public int getmNumeroCuota() {
        return mNumeroCuota;
    }

    public void setmNumeroCuota(int mNumeroCuota) {
        this.mNumeroCuota = mNumeroCuota;
    }

    public Date getmFechaInicio() {
        return mFechaInicio;
    }

    public void setmFechaInicio(Date mFechaInicio) {
        this.mFechaInicio = mFechaInicio;
    }

    public Date getmFechaVencimiento() {
        return mFechaVencimiento;
    }

    public void setmFechaVencimiento(Date mFechaVencimiento) {
        this.mFechaVencimiento = mFechaVencimiento;
    }

    public int getmNumeroDias() {
        return mNumeroDias;
    }

    public void setmNumeroDias(int mNumeroDias) {
        this.mNumeroDias = mNumeroDias;
    }

    public int getmAcumuladoDias() {
        return mAcumuladoDias;
    }

    public void setmAcumuladoDias(int mAcumuladoDias) {
        this.mAcumuladoDias = mAcumuladoDias;
    }

    public double getmFactorNormal() {
        return mFactorNormal;
    }

    public void setmFactorNormal(double mFactorNormal) {
        this.mFactorNormal = mFactorNormal;
    }

    public double getmFactorInversa() {
        return mFactorInversa;
    }

    public void setmFactorInversa(double mFactorInversa) {
        this.mFactorInversa = mFactorInversa;
    }

    public byte getmNumeroMesesPago() {
        return mNumeroMesesPago;
    }

    public void setmNumeroMesesPago(byte mNumeroMesesPago) {
        this.mNumeroMesesPago = mNumeroMesesPago;
    }

    public double getmFactorDoble() {
        return mFactorDoble;
    }

    public void setmFactorDoble(double mFactorDoble) {
        this.mFactorDoble = mFactorDoble;
    }


}
