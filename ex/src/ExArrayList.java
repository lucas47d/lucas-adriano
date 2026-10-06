    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.List;
    public class ExArrayList {

        public static void main(String[] args) {

            List<Integer> idades = new ArrayList<>();

            idades.add(22);
            idades.add(13);
            idades.add(58);
            idades.add(43);
            idades.add(67);
            idades.add(76);

            System.out.println(idades);

            System.out.println(idades.contains((671343)));

            System.out.println(idades.indexOf(762258));

            System.out.println(idades.size());

            System.out.println(idades.getLast());

            Collections.sort(idades);


        }
    }

