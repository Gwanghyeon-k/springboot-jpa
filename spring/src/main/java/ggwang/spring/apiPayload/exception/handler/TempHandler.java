package ggwang.spring.apiPayload.exception.handler;

import ggwang.spring.apiPayload.code.BaseErrorCode;
import ggwang.spring.apiPayload.exception.GeneralException;

public class TempHandler extends GeneralException {

    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
