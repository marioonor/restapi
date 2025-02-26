package in.bushansirgur.restapi.service;

import in.bushansirgur.restapi.dto.ExpenseDTO;

import java.util.List;

/*
* Service interface for expense module
* @module Bushan SC
* */
public interface ExpenseService {

    /*
    * It will fetch the expenses from database
    * @return list
    * */
    List<ExpenseDTO> getAllExpenses();
}
