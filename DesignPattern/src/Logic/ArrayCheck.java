package Logic;

import java.util.*;

public class ArrayCheck {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(8);
        list.add(3);
        list.add(2);

        System.out.println(list.indexOf(8));

        System.out.println("Index of 8 = " );
        for(int in : list){

            System.out.println(in);
        }
/*        Iterator itr =list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        list.forEach(s-> System.out.println(s));
        list.forEach(System.out::println);*/

        Set<String> set = new TreeSet<>();
        set.add("Sangram");
        set.add("Alok");
        set.add("Adida");

        System.out.println(set);
        Map<Employee, String> map = new HashMap<>();

      map.put(new Employee(101, "Sangram"),"Java developer")  ;
      map.put(new Employee(102,"Alok"), "fisharMan");
      map.put(new Employee(101,"Sangram"),"java developer");

        System.out.println(map);

        for (Map.Entry<Employee, String> mapc : map.entrySet()){
            System.out.println(mapc.getKey() + "  "+mapc.getValue());
        }

        List<Employee> list1 = new ArrayList<>();
        list1.add(new Employee(101,"Sangu"));
        list1.add(new Employee(203,"abs"));
        list1.add(new Employee(102,"dear"));
        list1.add(new Employee(100,"fear"));

       int sum1 =list1.stream().map(Employee->Employee.id).reduce((int) 0.0f,(sum, num)->sum+num);
       list1.stream().map(Employee->Employee.id).reduce(0, (Integer::sum));
       System.out.println(sum1);

    }
}
