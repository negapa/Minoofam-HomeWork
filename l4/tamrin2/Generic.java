package l4.tamrin2;

public class Generic<User>implements Cloneable
    {

        private User name;
        private User familyName;
        private User stuID;

        @Override
        public Object clone() throws CloneNotSupportedException{
            return super.clone();
        }


        public User getName() {
            return name;
        }

        public void setName(User name) {
            this.name = name;
        }

        public User getFamilyName() {
            return familyName;
        }

        public void setFamilyName(User familyName) {
            this.familyName = familyName;
        }

        public User getStuID() {
            return stuID;
        }

        public void setStuID(User stuID) {
            this.stuID = stuID;
        }

        public void out (){
            System.out.println("Name :"+ name +"     School: "+ familyName+"     Student ID: "+stuID);
        }
    }

