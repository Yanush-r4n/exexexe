package HW2;

public class User {
    private String name;
    private String lastName;
    private String middleName;
    private String birthDate;
    private Long phoneNumber;
    private Character sex;

    public User() {}

    public String getName() {
        return name;
    }

    public void setName(String name) throws InfoFormatException {
        String regex = "[А-Яа-яA-Za-zЁё]+";
        if (!name.matches(regex)) {
            throw new InfoFormatException(name);
        }
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws InfoFormatException {
        String regex = "[А-Яа-яA-Za-zЁё]+";
        if (!lastName.matches(regex)) {
            throw new InfoFormatException(lastName);
        }
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) throws InfoFormatException {
        String regex = "[А-Яа-яA-Za-zЁё]+";
        if (!middleName.matches(regex)) {
            throw new InfoFormatException(middleName);
        }
        this.middleName = middleName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) throws InfoFormatException {
        String regex = "(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.\\d{4}";
        if (!birthDate.matches(regex)) {
            throw new InfoFormatException(birthDate);
        }
        this.birthDate = birthDate;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws InfoFormatException {
        String regex = "[0-9]+";
        if (!phoneNumber.matches(regex)) {
            throw new InfoFormatException(phoneNumber);
        }
        this.phoneNumber = Long.parseLong(phoneNumber);
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(String sex) throws InfoFormatException {
        String regex = "^[mf]$";
        if (!sex.matches(regex)) {
            throw new InfoFormatException(sex);
        }
        this.sex = sex.charAt(0);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", sex=" + sex +
                '}';
    }
}
