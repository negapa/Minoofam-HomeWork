package l4.tamrin3;

import java.util.ArrayList;
import java.util.List;
    public class Generic<s> {

        private String Name;
        private  String Studentid;
        private String FatherName;

        List<s> GradesList = new ArrayList<s>();

        public void GradesGetter(s Grades){
            GradesList.add(Grades);
        }

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public String getStudentid() {
            return Studentid;
        }

        public void setStudentid(String Studentid) {
            this.Studentid = Studentid;
        }

        public String getFatherName() {
            return FatherName;
        }

        public void setFatherName(String FatherName) {
            this.FatherName = FatherName;
        }
    }

