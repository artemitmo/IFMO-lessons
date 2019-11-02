package Lesson8clone.object;

import java.util.Objects;

public class Owner {
    private String name;
    private String phone;

    public Owner(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Owner)) return false;
        Owner owner = (Owner) o;
        return name.equals(owner.name) &&
                phone.equals(owner.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone);
    }
}
