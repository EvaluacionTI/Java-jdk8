package pe.unjfsc.ads.java8.model;

import java.util.HashSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.ads.java8.entity.CE01Ciudad;
import pe.unjfsc.ads.java8.entity.CE02AsignacionOrigenDestino;

public final class CDLoadData {
    private static final Logger LOG = LoggerFactory.getLogger("CDLoadData");
    
    private HashSet<CE01Ciudad> oaCiudad;
    private HashSet<CE02AsignacionOrigenDestino> oaCiudadOrigenDestino;
    private HashSet<String> dias, oaMes;
    private CE01Ciudad oCECiudadOrigen, oCECiudaDestino;

    public CDLoadData() {
        ciudades();
        ciudadOrigenDestino();
        dias();
        mes();
    }

    protected HashSet<CE01Ciudad> ciudades() {
        oaCiudad = new HashSet<>();
        oaCiudad.add(new CE01Ciudad("01", "Lima"));
        oaCiudad.add(new CE01Ciudad("02", "Chilca"));
        oaCiudad.add(new CE01Ciudad("03", "Bujama"));
        oaCiudad.add(new CE01Ciudad("04", "Asia"));
        oaCiudad.add(new CE01Ciudad("05", "Cañete"));
        oaCiudad.add(new CE01Ciudad("06", "Imperial"));
        LOG.info("[EVL] Ciudades : {}", oaCiudad.size());
        return oaCiudad;
    }

    protected HashSet<CE02AsignacionOrigenDestino> ciudadOrigenDestino() {
        oaCiudadOrigenDestino = new HashSet<>();
        oCECiudadOrigen = new CE01Ciudad();
        oCECiudaDestino = new CE01Ciudad();

        oCECiudadOrigen.setCodigo("01");
        oCECiudadOrigen.setNombre("Lima");
        oCECiudaDestino.setCodigo("06");
        oCECiudaDestino.setCodigo("Imperial");
        oaCiudadOrigenDestino.add(new CE02AsignacionOrigenDestino(oCECiudadOrigen, oCECiudaDestino, 20));

        oCECiudadOrigen = new CE01Ciudad();
        oCECiudaDestino = new CE01Ciudad();

        oCECiudadOrigen.setCodigo("02");
        oCECiudadOrigen.setNombre("Chilca");
        oCECiudaDestino.setCodigo("05");
        oCECiudaDestino.setCodigo("Cañete");
        oaCiudadOrigenDestino.add(new CE02AsignacionOrigenDestino(oCECiudadOrigen, oCECiudaDestino, 15));

        oCECiudadOrigen.setCodigo("03");
        oCECiudadOrigen.setNombre("Bujama");
        oCECiudaDestino.setCodigo("04");
        oCECiudaDestino.setCodigo("Asia");
        oaCiudadOrigenDestino.add(new CE02AsignacionOrigenDestino(oCECiudadOrigen, oCECiudaDestino, 8));        
        LOG.info("[EVL] Ciudades Origen Destino : {}", oaCiudadOrigenDestino.size());
        return oaCiudadOrigenDestino;
    }
    
    protected HashSet<String> dias(){
        dias = new HashSet<>();
        dias.add("01");
        dias.add("02");
        dias.add("03");
        dias.add("04");
        dias.add("05");
        dias.add("06");
        dias.add("07");
        dias.add("08");
        dias.add("09");
        dias.add("10");
        dias.add("11");
        dias.add("12");
        LOG.info("[EVL] Dias : {}", dias.size());
        return dias;
    }

    protected HashSet<String> mes(){
        oaMes = new HashSet<>();
        oaMes.add("ENERO");
        oaMes.add("FEBRERO");
        oaMes.add("MARZO");
        oaMes.add("ABRIL");
        oaMes.add("MAYO");
        oaMes.add("JUNIO");
        oaMes.add("JULIO");
        oaMes.add("AGOSTO");
        oaMes.add("SETIEMBRE");
        oaMes.add("OCTUBRE");
        oaMes.add("NOVIEMBRE");
        oaMes.add("DICIEMBRE");
        LOG.info("[EVL] Meses : {}", oaMes.size());
        return oaMes;
    }
}
