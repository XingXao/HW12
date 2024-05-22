public class Person {
    private String name;
    private String jobTitle;
    private String PlaceOfWork;
    private int age;
    private int Salary;

    public Person() {
    }

    public Person(String name, String jobTitle, String placeOfWork, int age, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.PlaceOfWork = placeOfWork;
        this.age = age;
        this.Salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPlaceOfWork() {
        return PlaceOfWork;
    }

    public void setPlaceOfWork(String placeOfWork) {
        PlaceOfWork = placeOfWork;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}
