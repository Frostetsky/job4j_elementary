package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double AB, double AC, double BC) {
        if (AB + AC > BC && AC + BC > AB && AB + BC > AC) return true;
        else if (AB + AC == BC && AC + BC == AB && AB + BC == AC) return true;
        else if (AB <= 0 || AC <= 0 || BC <= 0) { System.out.println("Стороны не могут быть равны нулю или отрицательны"); return false; }
        else { System.out.println("Треугольника не существует"); return false; }
    }

    public static void main(String[] args) {

    }


}
