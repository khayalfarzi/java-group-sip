package az.iktlab.javasiplessons.lesson13.innerclass;

public class OuterClazz {


    static class InnerClazz {
        private String name;
        private String surname;

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
    }
}
