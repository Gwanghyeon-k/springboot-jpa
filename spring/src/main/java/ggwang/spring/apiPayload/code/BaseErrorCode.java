package ggwang.spring.apiPayload.code;

public interface BaseErrorCode {

    ErrorReasonDTO getReason();

    ErrorReasonDTO getReasonHttpStatus();
}