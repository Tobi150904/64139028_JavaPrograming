package HashMap;

import java.util.HashMap;
import java.util.Map;

class EmployeeData {
    private String name;
    private double salary;

    public EmployeeData(String nm) {
        name = nm;
        salary = 5600;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", salary=" + salary + "]";
    }
}


