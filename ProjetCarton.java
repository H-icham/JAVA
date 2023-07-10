public class ProjetCarton {
    public static void main(String[] args) {
        int nbCarton = 34;
        int nbCartonMax = 9;
        while (nbCarton>0) {
            if (nbCarton >= nbCartonMax) {
                System.out.println("livraison de " + nbCartonMax + " cartons");
                nbCarton = nbCarton - nbCartonMax;
            } else {
                System.out.println("livraison de " + nbCarton + " cartons");
                nbCarton = nbCarton - nbCartonMax;
            }
        }
    }
}

