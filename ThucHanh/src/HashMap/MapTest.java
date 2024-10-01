package HashMap;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, EmployeeData> staffObj = new HashMap<>();
        staffObj.put("101", new EmployeeData("Anna John"));
        staffObj.put("102", new EmployeeData("Harry Hacker"));
        staffObj.put("103", new EmployeeData("Joby Martin"));
        
        System.out.println(staffObj);
        
        staffObj.remove("103");
        
        staffObj.put("106", new EmployeeData("Joby Martin"));
        
        System.out.println(staffObj.get("106"));
        System.out.println(staffObj);
    }
}
