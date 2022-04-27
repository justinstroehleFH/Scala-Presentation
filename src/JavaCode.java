package at.fhv.team3.se;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Justin Ströhle
 * 08.04.2022
 */

public class JavaCode {

    // Lambda
//    public class Lambda {
//        JButton button = new JButton();
//        button.addActionListener(
//            new ActionListener() {
//                public void actionPerformed(ActionEvent event) {
//                    System.out.println("Method Body");
//                }
//            }
//        );
//
//        JButton lbutton = new JButton();
//        lbutton.addActionListener(
//            event -> System.out.println("Method Body")
//        )
//    }

    // List
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");

        System.out.println("break");

        List<Integer> ints = new ArrayList<Integer>();
        for(String s : list){
            ints.add(Integer.parseInt(s));
        }
        System.out.println("break");
        List<Integer> ints2 = list.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println("break");
    }

    // Class
    public class User {
        private String name;
        private List<Order> orders;

        public User() {
            orders = new ArrayList<Order>();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Order> getOrders() {
            return orders;
        }

        public void setOrders(List<Order> orders) {
            this.orders = orders;
        }
    }

    public class Order {
        private int id;
        private List<Product> products;

        public Order() {
            products = new ArrayList<Product>();
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public List<Product> getProducts() {
            return products;
        }

        public void setProducts(List<Product> products) {
            this.products = products;
        }
    }

    public class Product {
        private int id;
        private String category;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }
    }
}


