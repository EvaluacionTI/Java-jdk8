package pe.unjfsc.ads.java8.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.ads.java8.entity.CEProducto;
import pe.unjfsc.ads.java8.logical.CLCalcularVenta;

public class CVMostrarVenta {

    public static final Logger LOG = LoggerFactory.getLogger("CVMostrarVenta");

    public static void main(String[] args) {
        LOG.error("Iniciando revisión");

        LOG.info("[EVL] Declarar la instancia de la clase :");

        CEProducto oCEProduct = new CEProducto();
        CLCalcularVenta oCLCalcular = new CLCalcularVenta();

        oCEProduct.setPrecioVenta(10);
        double dSumTotalVenta = oCLCalcular.descuento(oCEProduct.getPrecioVenta());
        LOG.info("[EVL] Suma Acumulada-0 : {} ", dSumTotalVenta);

        oCEProduct.setPrecioVenta(10);
        dSumTotalVenta += oCLCalcular.descuento(oCEProduct.getPrecioVenta());
        LOG.info("[EVL] Suma Acumulada-1 : {} ", dSumTotalVenta);

        oCEProduct.setPrecioVenta(10);
        dSumTotalVenta += oCLCalcular.descuento(oCEProduct.getPrecioVenta());
        LOG.info("[EVL] Suma Acumulada-3 : {} ", dSumTotalVenta);

        oCEProduct.setPrecioVenta(10);
        dSumTotalVenta += oCLCalcular.descuento(oCEProduct.getPrecioVenta());
        LOG.info("[EVL] Suma Acumulada-4 : {} ", dSumTotalVenta);

        oCEProduct.setPrecioVenta(10);
        dSumTotalVenta += oCLCalcular.descuento(oCEProduct.getPrecioVenta());
        LOG.info("[EVL] Suma Acumulada-5 : {} ", dSumTotalVenta);
    }

}
