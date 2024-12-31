import java.util.ArrayList;
import java.util.List;
// 실행은 되지만 내용이 없어서 동작하는게 없음
public class StudentRepositoryImpl implements StudentRepository {
    //메모리 저장 !!!
	private final List<Student> students = new ArrayList<>(); //실제 정보가 저장되는 곳
	private int nextId = 1;
	// 저장된 값 불러오기
	
	
	@Override
    public List<Student> findAll() {
		//전체 학생 정보 리턴
//        return new ArrayList<>(students); //카피본을 넘겨준거임
		return students;
    }

    @Override
    public Student findById(int id) {
//    	Student foundStudent = null; // 변수를 선언하고 초기화
    	for (Student student : students) {
//    		 foundStudent = student;
    		 if(student.getId() == id) {
    			 int a = 1;
    			 return student;
    		}
    	} return null;
    }
    	
//    	return id;
    

    @Override
    // 학생 정보 한명 저장하는 것 
    public void save(Student student) {
    	student = new Student(nextId++, student.getName(),student.getMajor());
    	students.add(student);
    }

    @Override
    public void update(int id, Student updatedStudent) {
    	
    }

    @Override
    public void delete(int id) {

    }
}




