package Logic;

import java.util.*;
import java.util.stream.Collectors;

public class JavaStreamExample {
    public static void main(String[] args) {

        List<Prduct> list = new ArrayList<Prduct>();
        //Adding Products
        list.add(new Prduct(1,"HP Laptop",25000f));
        list.add(new Prduct(2,"Dell Laptop",30000f));
        list.add(new Prduct(3,"Lenevo Laptop",28000f));
        list.add(new Prduct(4,"Sony Laptop",28000f));
        list.add(new Prduct(5,"Apple Laptop",90000f));

        //Find all products whose price is greater than 30,000.
        list.stream().filter(p->p.price>30000).map(Prduct->Prduct.name).forEach(System.out::println);
        //Find all products whose price is less than 30,000.
        list.stream().filter(p->p.price<30000).map(Prduct->Prduct.name).forEach(System.out::println);
        //Find the product whose price is 90,000.
        list.stream().filter(prduct -> prduct.price==90000).forEach(System.out::println);
        //Find the number of products in the list.
       int count= (int) list.stream().distinct().count();
        System.out.println(count);
        //Check whether any product has a price greater than 50,000.
        boolean b = list.stream().anyMatch(p -> p.price > 50000);
        System.out.println(b);
        //Check whether all products have a price greater than 20,000.
        boolean b1 = list.stream().allMatch(prduct -> prduct.price > 20000);
        System.out.println(b1);
        //Find the first product whose price is greater than 25,000.
        Optional<Prduct> first = list.stream().filter(prduct -> prduct.price > 25000).findFirst();
        System.out.println(first);
        //Sort products by price in ascending order.
        list.stream().map(prduct -> prduct.price).sorted().forEach(System.out::println);
        //Sort products by price in ascending order.
        list.stream().sorted(Comparator.comparing(prduct -> prduct.price)).forEach(System.out::println);
        //Sort products by price in descending order.
        list.stream().sorted(Comparator.comparing((Prduct prduct)->prduct.price).reversed()).forEach(System.out::println);
        //Sort products by product name alphabetically.
        list.stream().sorted(Comparator.comparing(prduct -> prduct.name)).forEach(System.out::println);
        //Print only the products whose name contains "Laptop".
        list.stream().filter(prduct -> prduct.name.contains("Laptop")).forEach(System.out::println);
        //Convert the product names into a List<String>.
        List<String> collect = list.stream().map(prduct -> prduct.name).collect(Collectors.toList());
        System.out.println(collect);
        //Add 10% to the price of every product and print the updated prices.




        /*sd



Q15

Find the cheapest product.

Q16

Find the most expensive product.

🟠 Level 3 — Important Interview Questions
Q17

Find the second-highest priced product.

Don't use:

Collections.sort()

Try using Stream API.

Q18

Find the second-lowest priced product.

Q19

Find the highest price without returning the Product object.

Expected:

90000
Q20

Find the sum of all product prices.

Q21

Find the average product price.

Q22

Find all products having the same price.

Expected:

Lenovo Laptop - 28000
Sony Laptop   - 28000
Q23

Find the duplicate prices.

Expected:

28000
Q24

Remove duplicate products based on price.

🔴 Level 4 — Grouping & Collectors

For these, learn:

Collectors.groupingBy()
Collectors.counting()
Collectors.toMap()
Collectors.partitioningBy()
Q25

Group products by price.

Expected conceptually:

25000 → HP
28000 → Lenovo, Sony
30000 → Dell
90000 → Apple
Q26

Count how many products have each price.

Expected:

25000 → 1
28000 → 2
30000 → 1
90000 → 1
Q27

Find the price that occurs more than once.

Q28

Partition products into two groups:

price > 30000
price <= 30000
Q29

Create a Map<Integer, String> where:

productId → productName

Expected:

1 → HP Laptop
2 → Dell Laptop
...
Q30

Find the product with the highest price using Collectors.maxBy().

🔥 Level 5 — Tricky Interview Questions
Q31

Find the second-highest distinct price.

For example:

25000
28000
28000
30000
90000

Answer:

30000

The duplicate 28000 should not affect the result.

Q32

Find the second-highest product if multiple products have the same highest price.

Q33

Find all products whose price is between:

25000 and 50000
Q34

Find products whose names start with "H".

Q35

Find products whose names end with "Laptop".

Q36

Find the product having the longest name.

Q37

Find the total price of products costing more than 30,000.

Q38

Find the average price of products costing more than 30,000.

Q39

Find whether there are duplicate product prices.

Q40

Find the most expensive product name directly.

Expected:

Apple Laptop
🚀 Level 6 — Real Interview Style

Now I'll give you questions without telling you which Stream operation to use.

Q41

Given the product list, return the top 2 most expensive products.

Q42

Return the top 3 cheapest products.

Q43

Find all products having a price greater than the average price of all products.

Q44

Find the product whose price is closest to ₹30,000.

Q45

Find the difference between the highest and lowest product price.

Q46

Find the product with the second-highest price without sorting.

Q47

Convert the list into a Map where the key is product name and value is price.

Q48

Convert the list into a Map where the key is price and value is a list of product names.

This one is particularly good for interviews because of duplicate prices.

Q49

Find all prices that occur more than once and print their product names.

Q50 ⭐

Find the highest-priced product for each price category, assuming you add a category field to Product.
                dsd*/
    }
}
