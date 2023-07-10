package DAO;

import model.Employee;

public interface EmployeeDAO {
    void create (Employee e);
    Employee geyById (Integer id);
    void update (Employee e);
    void removeById (Integer id);
}