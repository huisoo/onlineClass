package msaStudy.onlineLecture.service;

import msaStudy.onlineLecture.domain.Enrollment;
import msaStudy.onlineLecture.domain.Lecture;

import java.io.File;
import java.util.List;
import java.util.Map;

public interface LectureService {

    //수강신청한 강의 컨텐츠 조회
    public List<Lecture> lectureList(Long lectureId) throws Exception;

    //강의등록
    public Map<String,String> registerLecture(Lecture Lecture) throws Exception;

    //강의 컨텐츠 등록
    public Map<String,String> updateLectureContents(Long lectureId, File contents) throws Exception;

    //시험 컨텐츠 등록
    public Map<String,String> updateTestContents(Long lectureId, File contents) throws Exception;

    //강의 숨김처리
    public Map<String,String> setLectureShowyn(Long lectureId, String showYn) throws Exception;

    //강사 강의 매칭 조회
    public List<Lecture> lastTeacherMatchList(Long memberId) throws Exception; //목록에서 강의 조회 후 강의리스트에서 조회

    //강의 매칭 등록
    public Map<String,String> registerTeacherMatch(Long teacherId, Long lectureId, Long registerId);

    //수강신청한 강의 컨텐츠 조회
    public Map<String,String> enrollmentLectureInfo(Long memberId, Long lectureId) throws Exception; //수강신청한 강의 컨텐츠 조회

    //강의 별점 등록
    public Map<String,String> updateEnrollmentLectureGrade(Long memberId, Long lectureId, String grade);

    //학생 평가 등록
    public Map<String,String> updateEnrollmentStudentGrade(Long memberId, Long lectureId, String grade);

    //수강신청 등록
    public Map<String,String> registerEnrollment(Enrollment enrollment);

   //수강 강의목록 조회
    public List<Lecture> enrollmentLectureList(Long memberId) throws Exception; //수강신청목록에서 강의ID 조회 --> Lecture 조회

    //수강 강의목록 별점 조회
    public Enrollment enrollmentLectureGrade(Long memberId, Long lectureId) throws Exception; //강의목록별점조회
}
