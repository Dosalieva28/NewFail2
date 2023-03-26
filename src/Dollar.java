public  class Dollar {
    private char simvol;
    private double summa;

    public double  convert(double sum, char sim) {
        double rez = 0;
        if (sim == 'e') {
            rez = sum * 1.05;
        } else if (sim == 'c') {
            rez = sum / 86.05;
        }
        return rez;
        }
    }

