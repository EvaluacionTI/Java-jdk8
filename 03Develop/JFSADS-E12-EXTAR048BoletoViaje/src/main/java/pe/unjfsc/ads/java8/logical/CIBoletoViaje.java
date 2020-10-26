package pe.unjfsc.ads.java8.logical;

import java.util.List;
import pe.unjfsc.ads.java8.entity.CE04BoletaViaje;

public interface CIBoletoViaje {
    public String saveBoletaViaje(CE04BoletaViaje oCEBoleta);
    public String updateBoletaViaje(CE04BoletaViaje oCEBoleta);
    public String deleteBoletaViaje(String codigo);
    public List<CE04BoletaViaje> listaAllBoletaViaje();
    public CE04BoletaViaje listaByBoletaViaje(String codigo);
}
