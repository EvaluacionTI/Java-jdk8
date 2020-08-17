package aemsa.cap06.funcion;

class COPunto {

    private double x, y;

    COPunto(double cx, double cy) {
        x = cx;
        y = cy;
    }
}

class COCirculo {
    // miembros privados

    private Punto centro; // coordenadas del centro
    private double radio; // radio del c�rculo

    // miembros protegidos
    protected void msgEsNegativo() {
        System.out.println("El radio es negativo. Se convierte a positivo");
    }

    // miembros p�blicos
    public COCirculo() {
    } // constructor sin par�metros

    public COCirculo(double cx, double cy, double r) // constructor
    {
        centro = new Punto(cx, cy);
        if (r < 0) {
            msgEsNegativo();
            r = -r;
        }
        radio = r;
    }

    public double longCircunferencia() {
        return 2 * Math.PI * radio;
        
    }

    public double areaCirculo() {
        return Math.PI * radio * radio;
    }
}

class CV03v01FuncionPI {

    public static void main(String[] args) {
        COCirculo obj1 = new COCirculo();
        System.out.println(obj1.longCircunferencia());
        System.out.println(obj1.areaCirculo());

        COCirculo obj2 = new COCirculo(100, 100, 10);
        System.out.println(obj2.longCircunferencia());
        System.out.println(obj2.areaCirculo());
    }
}
