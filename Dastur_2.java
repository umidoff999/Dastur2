public class Dastur_2 {
    public static void main(String[] args) {
        class Car {
            private String rang;
            private String model;
            private double narx;
            private boolean avtomatik;

            public String getRang() {
                return rang;
            }

            public void setRang(String rang) {
                this.rang = rang;
            }

            public String getModel() {
                return model;
            }

            public void setModel(String model) {
                this.model = model;
            }

            public double getNarx() {
                return narx;
            }

            public void setNarx(double narx) {
                this.narx = narx;
            }

            public boolean isAvtomatik() {
                return avtomatik;
            }

            public void setAvtomatik(boolean avtomatik) {
                this.avtomatik = avtomatik;
            }

            public String getTuzilmaTuri() {
                if (avtomatik) {
                    return "Avtomatik";
                } else {
                    return "Mexanik";
                }
            }
        }

        class Triangle {
            private double a;
            private double b;
            private double c;

            public double getA() {
                return a;
            }

            public void setA(double a) {
                this.a = a;
            }

            public double getB() {
                return b;
            }

            public void setB(double b) {
                this.b = b;
            }

            public double getC() {
                return c;
            }

            public void setC(double c) {
                this.c = c;
            }

            public double getYuzi() {
                double p = (a + b + c) / 2;
                double yuz = Math.sqrt(p \* (p - a) \* (p - b) \* (p - c));
                return yuz;
            }

            public double getPerimeter() {
                return a + b + c;
            }
        }

        class Point {
            private double x;
            private double y;
            private double z;

            public double getX() {
                return x;
            }

            public void setX(double x) {
                this.x = x;
            }

            public double getY() {
                return y;
            }

            public void setY(double y) {
                this.y = y;
            }

            public double getZ() {
                return z;
            }

            public void setZ(double z) {
                this.z = z;
            }
        }


    }
}
