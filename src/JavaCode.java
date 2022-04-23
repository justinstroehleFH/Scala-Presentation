package at.fhv.team3.se;
import java.util.*;

/**
 * @author Justin Ströhle
 * 08.04.2022
 */

public class JavaCode {
    // List
    /*
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
    }
     */

    // Class
    class Student{
        private int id;
        private String course;

        public int getId(){
            return this.id;
        }

        public String getCourse(){
            return this.course;
        }

        public void setId(int id){
            if(id != 0){
                this.id = id;
            }
        }

        public void setCourse(String course){
            this.course = course;
        }
    }
}
