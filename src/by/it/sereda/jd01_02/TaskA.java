package by.it.sereda.jd01_02;

public class TaskA {
    //метод поиска самого длинного элемента
    //результат - строка для вывода на консоль
    static String getMax(int array[]) {
        int lenMax = 0;
        Integer max = Integer.MIN_VALUE;
        for (Integer i : array) {
            if (lenMax < i.toString().length()) {
                max=i;
                lenMax = i.toString().length();
            }
        }
        return "length=" + max.toString().length() + " MAX=" + max.toString();
    }
    //метод поиска самого короткого элемента
    //результат - строка для вывода на консоль
    static String getMin(int array[]) {
        int lenMin = 10;
        Integer min = Integer.MAX_VALUE;
        for (Integer i : array) {
            if (lenMin > i.toString().length()) {
                lenMin=i.toString().length();
                min=i;
            }
        }
        return "length=" + min.toString().length() + " MIN=" + min.toString();
    }

    //метод вычисления средней длины чисел
    static double mean(int array[]) {
        double res = 0;
        //все сложить
        for (Integer i : array) res = res + i.toString().length();
        //найти среднее
        res = res / array.length;
        return res;
    }
    //метод поиска числа, состоящего из разных цифр
    static boolean uniqueDigits(Integer value) {
        char ch[]=value.toString().toCharArray();
        for (int i=0;i<ch.length;i++)
            for (int j=i+1;j<ch.length;j++)
            if (ch[i]==ch[j]) return false;
        //если не попалось одинаковых цифр, то они все разные
        return true;
    }
}
