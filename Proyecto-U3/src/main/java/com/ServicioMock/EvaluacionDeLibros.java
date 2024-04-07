package com.ServicioMock;
import com.ServicioMock.ServicioExterno;

public class EvaluacionDeLibros {
   private ServicioExterno externalBookEvaluationService;

    public EvaluacionDeLibros(ServicioExterno externalBookEvaluationService) {
        this.externalBookEvaluationService = externalBookEvaluationService;
    }

    public void processBook(String bookTitle) {
        ResultadoDeEvaluacion evaluationResult = externalBookEvaluationService.evaluateBook(bookTitle);

        // Aquí podrías agregar la lógica para manejar el resultado de la evaluación
    }
}
