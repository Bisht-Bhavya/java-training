public class InterpolationSearching<T extends Number & Comparable<T>> {
    // Declare an array which can store any type of T of data
    T[] a;

    InterpolationSearching(T[] x) {
        a = x;
    }

    T getData(int i) { // To return the element stored
        return a[i];
    }

    void printData() {
        for (int i = 0; i < a.length; i++) {
            System.out.print(getData(i) + " ");
        }
        System.out.println();
    }

    @SuppressWarnings("unchecked")
    T sub(T x, T y) {
        if (x == null || y == null)
            return null;
        if (x instanceof Double)
            return (T) Double.valueOf(x.doubleValue() - y.doubleValue());
        if (x instanceof Integer)
            return (T) Integer.valueOf(x.intValue() - y.intValue());
        if (x instanceof Short)
            return (T) Short.valueOf((short) (x.shortValue() - y.shortValue()));
        if (x instanceof Byte)
            return (T) Byte.valueOf((byte) (x.byteValue() - y.byteValue()));
        if (x instanceof Float)
            return (T) Float.valueOf(x.floatValue() - y.floatValue());
        if (x instanceof Long)
            return (T) Long.valueOf(x.longValue() - y.longValue());
        else {
            throw new IllegalArgumentException("Type " + x.getClass() + " is not supported");
        }
    }

    int interpolationSearch(T k) {
        int l = 0, u = a.length - 1;

        while (l <= u && k.compareTo(a[l]) >= 0 && k.compareTo(a[u]) <= 0) {
            if (l == u) {
                if (a[l].compareTo(k) == 0) return l; // return index l
                return -1;
            }

            int n = sub(k, a[l]).intValue();
            int d = sub(a[u], a[l]).intValue();

            // Prevent Division by Zero if a[l] == a[u]
            if (d == 0) {
                if (a[l].compareTo(k) == 0) return l;
                return -1;
            }

            // Fixed: multiply (u - l) by n before dividing by d to avoid precision loss
            int loc = l + (((u - l) * n) / d);

            // Safety check to ensure loc stays within bounds
            if (loc < l || loc > u) {
                return -1;
            }

            int result = k.compareTo(a[loc]);
            if (result < 0) {
                u = loc - 1; // Fixed: proper boundary adjustment
            } else if (result == 0) {
                return loc;
            } else {
                l = loc + 1; // Fixed: proper boundary adjustment
            }
        }
        return -1;
    }
}