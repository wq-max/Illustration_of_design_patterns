public class Triple {
    private static Triple[] triples = new Triple[] {
            new Triple(0),
            new Triple(1),
            new Triple(3),
    };

    private Triple(int id) {
        System.out.println("生成编号为" + id + "的实例");
    }

    public static Triple getInstance(int id) {
       return triples[id];
    }

    public static void main(String[] args) {
        Triple t1 = Triple.getInstance(0);
        Triple t2 = Triple.getInstance(1);
        Triple t3 = Triple.getInstance(2);
        Triple t4 = Triple.getInstance(3);
        System.out.println(t1 == t4);
    }
}
