package comcompany;

import comcompany.CocheCRUD;
import comcompany.CocheCRUDImpl;

public class Main {

    public static void main(String[] args) {

        CocheCRUD cocheCrud = new CocheCRUDImpl();

        cocheCrud.save();
        cocheCrud.findAll();
        cocheCrud.delete();

    }
}
