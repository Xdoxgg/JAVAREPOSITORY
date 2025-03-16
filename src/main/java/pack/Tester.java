package pack;

public class Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private String englishLevel;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getExpirienceInYears() {
        return expirienceInYears;
    }

    public void setExpirienceInYears(int expirienceInYears) {
        this.expirienceInYears = expirienceInYears;
    }

    public String getEnglishLevel() {
        return englishLevel;
    }

    public void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Tester() {
    }

    public Tester(String name) {
        setName(name);
    }

    public Tester(String name, String surname) {
        this(name);
        setSurname(surname);
    }

    public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary) {
        this(name, surname);
        setExpirienceInYears(expirienceInYears);
        setEnglishLevel(englishLevel);
        setSalary(salary);
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Surname: " + getSurname() + ", Expirience (years): " + getExpirienceInYears() + ", English lvl: " + getEnglishLevel() + ", Salary: " + getSalary();
    }

    public static void getPerson(Tester obj) {
        System.out.println(obj);
    }

    public void says() {
        switch (this.expirienceInYears) {
            case 1:
            case 2: {
                System.out.println("довольно плохо говорит");
                break;
            }
            case 3:
            case 4:
            case 5: {
                System.out.println("довольно неплохо говорит");
                break;
            }
            default:
            case 6: {
                System.out.println("отлично говорит");
                break;
            }
        }
    }

    public void says(String words) {
        switch (this.expirienceInYears) {
            case 1:
            case 2: {
                System.out.println("довольно плохо говорит" + " " + words);
                break;
            }
            case 3:
            case 4:
            case 5: {
                System.out.println("довольно неплохо говорит" + " " + words);
                break;
            }
            default:
            case 6: {
                System.out.println("отлично говорит" + " " + words);
                break;
            }
        }
    }
}
