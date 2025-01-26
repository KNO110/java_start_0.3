public class Main {
    public static void main(String[] args) {
        //// 1
        Human human = new Human("Джотаро Джотарський", "20.04.2007", "+666", "Одесса", "Україна", "вул. Пушкінська, 77");
        human.printInfo();
        System.out.println("Кількість створених об'єктів: " + Human.getInstanceCount());

        ///// 2
        City city = new City("Львів", "Львівська область", "Україна", 700000, "79000", "+38032");
        city.printInfo();

        ///// 3
        System.out.println("Максимум: " + Calculator.max(1, 5, 3, 4));
        System.out.println("Мінімум: " + Calculator.min(1, 5, 3, 4));
        System.out.println("Середнє арифметичне: " + Calculator.average(1, 5, 3, 4));
        System.out.println("Факторіал: " + Calculator.factorial(5));
    }
}

//// Клас "Людина"
class Human {
    private String fullName;
    private String birthDate;
    private String phoneNumber;
    private String city;
    private String country;
    private String homeAddress;

    private static int instanceCount = 0;

    ///// Конструктор за замовчуванням
    public Human() {
        instanceCount++;
    }

    ///// Перевантажений конструктор
    public Human(String fullName, String birthDate, String phoneNumber, String city, String country, String homeAddress) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.country = country;
        this.homeAddress = homeAddress;
        instanceCount++;
    }

    ///// Геттери та сеттери
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    ////// Метод для виводу даних
    public void printInfo() {
        System.out.println("ПІБ: " + fullName);
        System.out.println("Дата народження: " + birthDate);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Місто: " + city);
        System.out.println("Країна: " + country);
        System.out.println("Адреса: " + homeAddress);
    }

    /// Статичний метод для підрахунку кількості об'єктів
    public static int getInstanceCount() {
        return instanceCount;
    }
}

//// Клас "Місто"
class City {
    private String name;
    private String region;
    private String country;
    private int population;
    private String postalCode;
    private String phoneCode;

    ///// Конструктор за замовчуванням
    public City() {}

    /// Перевантажений конструктор
    public City(String name, String region, String country, int population, String postalCode, String phoneCode) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.population = population;
        this.postalCode = postalCode;
        this.phoneCode = phoneCode;
    }

    ///// Геттери та сеттери
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    ///// Метод для виводу даних
    public void printInfo() {
        System.out.println("Назва міста: " + name);
        System.out.println("Регіон: " + region);
        System.out.println("Країна: " + country);
        System.out.println("Населення: " + population);
        System.out.println("Поштовий індекс: " + postalCode);
        System.out.println("Телефонний код: " + phoneCode);
    }
}

///// Клас для підрахунків
class Calculator {

    ///// Метод для знаходження максимуму
    public static int max(int a, int b, int c, int d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }

    ///// Метод для знаходження мінімуму
    public static int min(int a, int b, int c, int d) {
        return Math.min(Math.min(a, b), Math.min(c, d));
    }

    ///// Метод для обчислення середнього арифметичного
    public static double average(int a, int b, int c, int d) {
        return (a + b + c + d) / 4.0;
    }

    /// Метод для обчислення факторіала
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число не може бути негативним");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
