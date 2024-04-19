using Collections;
using System.ComponentModel;

List<Student> students = new List<Student>();

students.Add(new Student{ id=0, name="josh", age=17});
students.Add(new Student{ id=1, name="kiki", age=45});
students.Add(new Student{ id=2, name="ify", age=34});
students.Add(new Student{ id=3, name="samuel", age=56});

Dictionary<int, Student> student = new Dictionary<int, Student>();
student.Add(0, new Student { id=0, name="josh", age = 17 });
student.Add(1, new Student { id=1, name="kiki", age = 45 });
student.Add(2, new Student { id=2, name="stephen", age = 34 });
student.Add(3, new Student { id=3, name="ify", age = 56 });
student.Add(3, new Student { id=4, name="samuel", age = 37 });
