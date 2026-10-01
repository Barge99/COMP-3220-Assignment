public class Patient {
private String id;
private String name;
private String number;

public Patient(String id, String name, String number) {
    this.id = id;
    this.name = name;
    this.number = number;
}

public String getId() {
    return id;
}

public String getName() {
    return name;
}

public String getNum() {
    return number;
}

}
