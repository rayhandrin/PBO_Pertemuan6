package Exercise3;

abstract class Sortable {
    public abstract int compare(Sortable b);

    public static void shell_short(Sortable[] a) {
        Employee[] b = (Employee[]) a;
        int n = a.length;
        int gap;
        if (n % 2 == 0) {
            gap = n / 2;
        } else {
            gap = (n + 1) / 2;
        }
        int inner = 0;
        int outer;
        Employee temp;

        while (gap >= 0) {
            inner = 0;
            for (outer = gap; outer < n; outer++) {
                if (b[outer].compare(b[inner]) == -1) {
                    temp = b[outer];
                    b[outer] = b[inner];
                    b[inner] = temp;
                }
                inner += 1;
            }
            gap -= 1;
        }
    }
}