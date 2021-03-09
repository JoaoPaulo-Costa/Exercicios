public class application {

    static public void main(String[] args) {

        String[] vect = new String[] {"Maria", "Bob", "Alex"};

        for (int i=0; i< vect.length; i++) {
            System.out.println(vect[i]);
        }

        System.out.println("asdasdasdasd");

        for (String obj : vect) {
            System.out.println(obj);
        }

    }

}
