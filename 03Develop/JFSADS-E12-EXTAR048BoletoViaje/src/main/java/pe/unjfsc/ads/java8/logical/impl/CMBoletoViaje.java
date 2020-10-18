package pe.unjfsc.ads.java8.logical.impl;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.ads.java8.entity.CE04BoletaViaje;
import pe.unjfsc.ads.java8.logical.CIBoletoViaje;

public class CMBoletoViaje implements CIBoletoViaje{
    private static final Logger LOG = LoggerFactory.getLogger("CMBoletoViaje");
    private List<CE04BoletaViaje> oaLista;
    private CE04BoletaViaje oBoleto;
    private String sRpta;
    
    @Override
    public String saveBoletaViaje(CE04BoletaViaje oCEBoleta) {
        LOG.info("[EVL] Se almacenó el Boleto de Viaje : {}", oCEBoleta);
        sRpta = "GRABADO";
        return sRpta;
    }

    @Override
    public String updateBoletaViaje(CE04BoletaViaje oCEBoleta) {
        LOG.info("[EVL] Se actualizó el Boleto de Viaje : {}", oCEBoleta);
        sRpta = "ACTUALIZADO";
        
        return sRpta;
    }

    @Override
    public String deleteBoletaViaje(String codigo) {
        LOG.info("[EVL] Se eliminó el Boleto de Viaje : {}", codigo);
        sRpta = "ELIMINADO";
        return sRpta;
    }

    @Override
    public List<CE04BoletaViaje> listaAllBoletaViaje() {
        oaLista = new ArrayList<>();
        LOG.info("[EVL] Se listó todos los Boleto de Viaje : {}");
        
        return oaLista;
    }

    @Override
    public CE04BoletaViaje listaByBoletaViaje(String codigo) {
        oBoleto = new CE04BoletaViaje();
        LOG.info("[EVL] Se lista por código : {}");
        return oBoleto;
    }
    
}
