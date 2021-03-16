package analize;

import java.util.List;

public class Analize {
    public Info diff(List<User> previous, List<User> current) {
        Info statistic = new Info();
        for (User valueCurrent : current) {
            int indexPrev = previous.indexOf(valueCurrent);
            if (indexPrev != -1) {
                User prev = previous.get(indexPrev);
                if (!prev.name.equals(valueCurrent.name)) {
                    statistic.changed++;
                }
            } else {
                statistic.added++;
            }
        }

        for (User valuePrev : previous) {
            int indexCur = current.indexOf(valuePrev);
            if (indexCur == -1) {
                statistic.deleted++;
            }
        }
        return statistic;
    }

    public static class User {
        int id;
        String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            User myUser = (User) obj;
            return this.id == myUser.id;
        }


    }

    public static class Info {
        int added;
        int changed;
        int deleted;
    }
}