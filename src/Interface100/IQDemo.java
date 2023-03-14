package Interface100;

public class IQDemo {

    class FixedQueue implements ICharQ {
        private char q[];
        private int putloc, getloc;

        public FixedQueue(int size) {
            q = new char[size + 1];
            putloc = getloc = 0;
        }

        public void put(char ch) {
            if (putloc == q.length - 1) {
                System.out.println("-----");
                return;
            }

            putloc++;
            q[putloc] = ch;
        }

        public char get() {
            if (getloc == putloc) {
                System.out.println("+++++++");
                return (char) 0;
            }

            getloc++;
            return q[getloc];
        }
    }

    class CircularQueue implements ICharQ {
        private char q[];
        private int putloc, getloc;

        public CircularQueue(int size) {
            q = new char[size + 1];
            putloc = getloc = 0;
        }

        public void put(char ch) {
            if (putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
                System.out.println("============");
                return;
            }
            putloc++;
            if (putloc == q.length) putloc = 0;
            q[putloc] = ch;
        }

        public char get() {
            if (getloc == putloc) {
                System.out.println("(((((((((((");
                return (char) 0;
            }
            getloc++;
            if (getloc == q.length) getloc = 0;
            return q[getloc];
        }

        class DynQuene implements ICharQ {
            private char q[];
            private int putloc, getloc;

            public DynQuene(int size) {
                q = new char[size + 1];
                putloc = getloc = 0;
            }

            public void put(char ch) {
                if (putloc == q.length - 1) {
                    char t[] = new char[q.length * 2];
                    for (int i = 0; i < q.length; i++)
                        t[i] = q[i];
                    q = t;
                }
                putloc++;
                q[putloc] = ch;
            }

            public char get() {
                if (getloc == putloc) {
                    System.out.println(" ))))))))))");
                    return (char) 0;
                }
                getloc++;
                return q[getloc];
            }
        }
    }
}




