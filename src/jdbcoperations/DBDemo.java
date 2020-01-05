package jdbcoperations;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Employee;

/**
 *
 * @author sscerbatiuc
 */
public class DBDemo {

    public static void main(String[] args) throws SQLException {
        EmployeeDao empDao = new EmployeeDao();
        ArrayList<Employee> allEmps = empDao.getAll();
        System.out.println(allEmps);
        // Insert
        Employee ionMocanuEmp = new Employee("Petru", "Mocanu", "123");
         System.out.print(String.format("Adding 1 employee: affected %d", empDao.add(new Employee("name", "surname", "idnp"))));
//
//        // Update
//        Employee editedEmp = allEmps.get(0);
//        editedEmp.setName("new name");
//        empDao.edit(editedEmp);
//
//        // Delete
//        // System.out.print(String.format("Adding 1 employee: affected %d", empDao.add(new Employee(/* add here new data */))));
//        System.out.println(String.format("Removed %s employee: %d rows", editedEmp, empDao.remove(editedEmp)));
    }
}
