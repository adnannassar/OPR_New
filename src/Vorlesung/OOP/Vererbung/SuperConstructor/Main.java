package Vorlesung.OOP.Vererbung.SuperConstructor;

public class Main {
    public static void main(String[] args) {
        System.out.println(new R().m1(new Q()));
    }
    static class P {
        public String m1(P par) {
            return "[Pm1" + par.m2(this) + "]";
        }
        public String m2(P par) {
            return "(Pm2" + this.m3() + par.m3() + ")";
        }
        public String m3() {
            return "Pm3";
        }
    }
    static class Q extends P {
        public String m1(P par) {
            return "[Qm1" + super.m1(par) + "]";
        }
        public String m2(P par) {
            return "(Qm2" + super.m2(par) + ")";
        }
        public String m3() {
            return "Qm3";
        }
    }
    static class R extends Q {
        public String m3() {
            return "Rm3";
        }
    }
}
