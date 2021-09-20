package pe.popehiflo.modulo3;

public class Main {

    public static void main(String[] args) {
        Auto clio = new Auto();
        clio.setMarca("Renault");
        clio.setModelo("Clio");
        clio.setAnio(2014);
        clio.setKm(0);
        clio.setDominio("PHN123");

        Auto megane = new Auto("Renault", "Megane", 2016, 0,"PJK653");
        Auto meganeD = new Auto("Renault", "Megane", 2016, 0,"PJK653");

        System.out.println(clio.getMarca() + " - " + clio.getModelo());
        System.out.println(megane.getMarca() + " - " + megane.getModelo());

        System.out.println("Son iguales, clio y megane? " + clio.equals(megane));
        System.out.println("Son iguales, megane y meganeD? " + megane.equals(meganeD));
        System.out.println("* Si no sobreescribes el metodo Equals, \n" +
                "* megane y meganeD no son iguales porque se esta comparando la direccion de memoria, mas no el contenido. \n" +
                "* Pero si sobreescribes ese metodo, entonces si comparara el contenido de los atributos y si seran iguales");
        System.out.println("megane  : " + megane);
        System.out.println("meganeD : " + meganeD);
        System.out.println("HashCode megane  : " + megane.hashCode());
        System.out.println("HashCode meganeD : " + meganeD.hashCode());


    }
}
