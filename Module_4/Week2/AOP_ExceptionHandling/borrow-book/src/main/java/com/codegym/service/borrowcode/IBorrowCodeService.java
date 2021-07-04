package com.codegym.service.borrowcode;

import com.codegym.model.BorrowCode;
import com.codegym.service.IGeneralService;

import java.util.Optional;

public interface IBorrowCodeService extends IGeneralService<BorrowCode> {
    Optional<BorrowCode> findBorrowCodeByCode(int code);
}
