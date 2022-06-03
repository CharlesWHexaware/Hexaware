public class Main {
    public static void main(String[] args){
        Employee Jiya = new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0);
        Employee Paul = new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0);
        Employee Martin = new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0);
        Employee Murali = new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0);
        Employee Nima = new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0);
        Employee Jasna = new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0);
        Employee Iqbal = new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0);
        Employee Sanvi = new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0);
        Employee Anuj = new Employee(277, "Anuj", 31, "Male", "Product Development", 2012, 35700.0);

        System.out.println(Jiya.getAge());
    }
}
