package com.ServicioMock;
import com.ServicioMock.ExternalBookEvaluationService;

public class BookEvaluationManager {
    private ExternalBookEvaluationService externalBookEvaluationService;

    public BookEvaluationManager(ExternalBookEvaluationService externalBookEvaluationService) {
        this.externalBookEvaluationService = externalBookEvaluationService;
    }

    public void processBook(String bookTitle) {
        EvaluationResult evaluationResult = externalBookEvaluationService.evaluateBook(bookTitle);
     
    }
}
