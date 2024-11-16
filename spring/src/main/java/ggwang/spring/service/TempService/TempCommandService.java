package ggwang.spring.service.TempService;

public interface TempCommandService {
    // 데이터 생성 메서드
    void createData(String data);

    // 데이터 수정 메서드
    void updateData(Long id, String data);

    // 데이터 삭제 메서드
    void deleteData(Long id);
}
