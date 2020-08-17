
package aemsa.vista.colecciones;

import java.text.CollationKey;
import java.text.Collator;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CV03v01OrdenarCadenas {

    public static void main(String[] args) {
        Collator oCola = Collator.getInstance();
        
        CollationKey oKey1 = oCola.getCollationKey("Mery");
        CollationKey oKey2 = oCola.getCollationKey("mery");
        CollationKey oKey3 = oCola.getCollationKey("maria");
        CollationKey oKey4 = oCola.getCollationKey("María");
        CollationKey oKey5 = oCola.getCollationKey("Rosa");        
        
        Set oS = new TreeSet();
        
        oS.add(oKey1);
        oS.add(oKey2);
        oS.add(oKey3);
        oS.add(oKey4);
        oS.add(oKey5);
        
        Iterator iTera = oS.iterator();
        while (iTera.hasNext()){
            CollationKey key = (CollationKey)iTera.next();
            System.out.print(key.getSourceString() + " ");
        }
        
    }
    
}
