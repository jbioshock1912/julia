package Maps;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class User {

    private String name;
    private int children;
    private Calendar birthday;

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        User mother = new User();
        mother.birthday = calendar;
        mother.children = 2;
        mother.name = "mama";

        User father = new User();
        father.birthday = calendar;
        father.children = 2;
        father.name = "mama";
        Map<User, Object> map = new HashMap<>();
        map.put(mother, "sasas");
        map.put(mother, "sasas");
        //map.put(father, "sasas");
        for (Map.Entry<User, Object> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }

   @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        User guest = (User) obj;
        return name.equals(guest.name) && children == guest.children && birthday.equals(guest.birthday);
    }

   @Override
    public int hashCode() {
        return Objects.hash(name, birthday, children);
    }
}
