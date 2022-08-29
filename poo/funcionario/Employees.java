import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Employees {
   ArrayList<Map> employees = new ArrayList<Map>();
   void addEmployee(String name, Float salary) {  
      Map employee = new HashMap(); // equivalente ao dicionário do python
      employee.put(name, salary);

      employees.add(employee);
   }

   void removeEmployee(String name) {
      Map removedEmployee = new HashMap();
      for(int i = 0; i < employees.size(); i++) {
          // se usa o "(Map)" para converter para Map. Isso só funciona caso o objeto especificado seja um Map já. Por exemplo, "{vitor=1250}" é uma string, mas tem a sintaxe de um map, então essa conversão funciona
          Map employee = (Map)employees.get(i);
          // employee.get(name) retorna o salário do funcionario especificado
          if (employee.get(name) != null) { 
            removedEmployee = (Map)employees.get(i);
          } 
      }

      if (removedEmployee.size() > 0) {
         employees.remove(removedEmployee);
         System.out.println("The employee" + removedEmployee + " was removed. The employee list now is: " + employees);
      } else {
          throw new java.lang.Error("The specified employee doesnt exist");
      }
   }
  
   void increaseSalary(String name, float value) {
      Map target = new HashMap();
      for(int i = 0; i < employees.size(); i++) {
          Map employee = (Map)employees.get(i);
          if (employee.get(name) != null) {
            target = (Map)employees.get(i);
            
            Map alteredEmployee = new HashMap();

            float newSalary = (float)target.get(name) + ((float)target.get(name) * value/100);
            alteredEmployee.put(name, newSalary);
            
            employees.set(i, alteredEmployee);
          } 
      }

      if(target.size() <= 0) {
         throw new java.lang.Error("The specified employee doesnt exist");
      }
   }

   void decreaseSalary(String name, float value) {
      Map target = new HashMap();
      for(int i = 0; i < employees.size(); i++) {
          Map employee = (Map)employees.get(i);
          if (employee.get(name) != null) {
            target = (Map)employees.get(i);
            
            Map alteredEmployee = new HashMap();

            float newSalary = (float)target.get(name) - ((float)target.get(name) * value/100);
            alteredEmployee.put(name, newSalary);
            
            employees.set(i, alteredEmployee);
          } 
      }

      if(target.size() <= 0) {
         throw new java.lang.Error("The specified employee doesnt exist");
      }
   }

   ArrayList getEmployees() {
       return employees;
   }
}