package jfx_maven_project;
public class Patient {
private String id;
private String name;
private String number;
private String healthcardNum;

public Patient(String id, String name, String number, String healthcardNum) {
    this.id = id;
    this.name = name;
    this.number = number;
    this.healthcardNum = healthcardNum;
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

public String gethealthcardNum() {
    return healthcardNum;
}

}
