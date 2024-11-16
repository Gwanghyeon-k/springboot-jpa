package ggwang.spring.service.TempService;

import org.springframework.stereotype.Service;

@Service
public class TempCommandServiceImpl implements TempCommandService {

    @Override
    public void createData(String data) {
        // 예제 구현: 데이터를 생성합니다.
        System.out.println("Data created: " + data);
    }

    @Override
    public void updateData(Long id, String data) {
        // 예제 구현: 데이터를 수정합니다.
        System.out.println("Data updated for ID: " + id + " with data: " + data);
    }

    @Override
    public void deleteData(Long id) {
        // 예제 구현: 데이터를 삭제합니다.
        System.out.println("Data deleted for ID: " + id);
    }
}
