package obs;

public class Course {
	Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozlu;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozlu = 0;
    }

    public int sozluHesapla(int sozlu) {
        this.sozlu = sozlu;
        return this.sozlu;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("��lem ba�ar�l�");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmam��t�r.");
        }
    }

}
