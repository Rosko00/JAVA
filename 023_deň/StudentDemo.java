class Student {
    String meno;
    int vek;
    double znamka;

    // Parametrizovaný konštruktor
    Student(String meno, int vek, double znamka) {
        this.meno = meno;
        this.vek = vek;
        this.znamka = znamka;
    }

    void zobrazInfo() {
        System.out.println("Študent: " + meno + ", Vek: " + vek + ", Známka: " + znamka);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Ján", 20, 1.5);
        student1.zobrazInfo();
    }
}
