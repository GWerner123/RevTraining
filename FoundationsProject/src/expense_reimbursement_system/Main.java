package expense_reimbursement_system;

public class Main {

    public static void main(String[] args) {

        Menus menus = new Menus();
        menus.openMainMenu();

        if(Menus.manager) {
            menus.openManagerPortal();

        } else {
            menus.openEmployeePortal();

        }
    }
}
