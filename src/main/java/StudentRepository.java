import java.util.List;
// 인터페이스
//모든 메서드가 추상메서드 => 스펙만 정의
// 구체적인 메서드는 내용은 StudentRepositoryImp(구현채 클래스)

interface StudentRepository {
    // 모든 학생정보 조회
    List<Student> findAll();
    // 학생 ID로 학생정보 조회
    Student findById(int id);
    // 학생정보 저장
    void save(Student student);
    // 학생정보 수정
    void update(int id, Student updatedStudent);
    // 학생정보 삭제
    void delete(int id);
}
