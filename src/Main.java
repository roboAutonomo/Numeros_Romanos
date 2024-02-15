public class Main {
    public static void main(String[] args) throws Exception {
        String numeroRomano = getRoman("2999");
        System.out.println(numeroRomano);
    }

    public static String getRoman(String number) throws Exception {
        char[] rr = number.toCharArray();
        String romano = "";
        int tamArr = rr.length;

        for(int i = 0; i < tamArr; i++) {
            if(rr[i] != '0') {
                char cifra = obtenerCifra(i, tamArr);
                romano += devolverRomano(Character.getNumericValue(rr[i]), cifra);
            }
        }

        return romano;
    }

    private static String devolverRomano(int n, char cifra) throws Exception {
        String romano = "";
        switch(cifra) {
            case 'U':
                romano += obtenerUnidad(n);
                break;
            case 'D':
                romano += obtenerDecena(n);
                break;
            case 'C':
                romano += obtenerCentena(n);
                break;
            case 'M':
                romano += obtenerMil(n);
                break;
        }
        return romano;
    }

    private static String obtenerMil(int c) throws Exception {
        String mil = "";
        switch(c) {
            case 1:
                mil = "M";
                break;
            case 2:
                mil = "MM";
                break;
            case 3:
                mil = "MMM";
                break;
            default:
                throw new Exception("No tengo mas simbolos para esos numeros.");
        }
        return mil;
    }

    private static String obtenerCentena(int c) {
        String centena = "";
        switch(c) {
            case 1:
                centena = "C";
                break;
            case 2:
                centena = "CC";
                break;
            case 3:
                centena = "CCC";
                break;
            case 4:
                centena = "CD";
                break;
            case 5:
                centena = "D";
                break;
            case 6:
                centena = "DC";
                break;
            case 7:
                centena = "DCC";
                break;
            case 8:
                centena = "DCCC";
                break;
            case 9:
                centena = "CM";
                break;
        }
        return centena;
    }

    private static String obtenerDecena(int c) {
        String decena = "";
        switch(c) {
            case 1:
                decena = "X";
                break;
            case 2:
                decena = "XX";
                break;
            case 3:
                decena = "XXX";
                break;
            case 4:
                decena = "XL";
                break;
            case 5:
                decena = "L";
                break;
            case 6:
                decena = "LX";
                break;
            case 7:
                decena = "LXX";
                break;
            case 8:
                decena = "LXXX";
                break;
            case 9:
                decena = "XC";
                break;
        }
        return decena;
    }

    private static String obtenerUnidad(int c) {
        String unidad = "";
        switch(c) {
            case 1:
                unidad = "I";
                break;
            case 2:
                unidad = "II";
                break;
            case 3:
                unidad = "III";
                break;
            case 4:
                unidad = "IV";
                break;
            case 5:
                unidad = "V";
                break;
            case 6:
                unidad = "VI";
                break;
            case 7:
                unidad = "VII";
                break;
            case 8:
                unidad = "VIII";
                break;
            case 9:
                unidad = "IX";
                break;
        }
        return unidad;
    }

    private static char obtenerCifra(int pos, int tamArr) {
        char cifra = ' ';
        switch(tamArr) {
            case 1:
                cifra = 'U';
                break;
            case 2:
                if(pos == 0) {
                    cifra = 'D';
                } else {
                    cifra = 'U';
                }
                break;
            case 3:
                if(pos == 0) {
                    cifra = 'C';
                } else if(pos == 1) {
                    cifra = 'D';
                } else {
                    cifra = 'U';
                }
                break;
            case 4:
                if(pos == 0) {
                    cifra = 'M';
                } else if(pos == 1) {
                    cifra = 'D';
                } else if(pos == 2) {
                    cifra = 'C';
                } else {
                    cifra = 'U';
                }
        }
        return cifra;
    }
}
