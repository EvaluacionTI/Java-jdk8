package pe.unjfsc.fsi.java8.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.fsi.java8.entity.CESaldoAfiliado;
import pe.unjfsc.fsi.java8.logical.CIRetiroAFP;
import pe.unjfsc.fsi.java8.logical.impl.CMSaldoDisponible;

public class CVMostrarRetiroAFP {

    public static final Logger LOG = LoggerFactory.getLogger("CVMostrarRetiroAFP");

    public static void main(String[] args) {
        LOG.info("[EVL] Start ");
        CESaldoAfiliado oCESaldoAfiliado = new CESaldoAfiliado();
        CIRetiroAFP oCIRetiroAFP = new CMSaldoDisponible();

        LOG.info("[EVL] Entidad Afiliado : {} ", oCESaldoAfiliado);
        LOG.info("[EVL] Entidad Retiro   : {} ", oCIRetiroAFP);

        oCESaldoAfiliado.setId(15);
        oCESaldoAfiliado.setCodigoAfiliado("152027");
        oCESaldoAfiliado.setSaldoCIC(51600);
        LOG.info("[EVL] Entidad Afiliado : {} ", oCESaldoAfiliado);

        double saldoDisponible = oCIRetiroAFP.saldoDisponible(oCESaldoAfiliado);

        LOG.info("[EVL] Saldo de Retiro : {} ", saldoDisponible);
    }
}
