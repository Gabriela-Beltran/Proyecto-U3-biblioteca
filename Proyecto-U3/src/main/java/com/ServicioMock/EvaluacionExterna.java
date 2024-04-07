
package com.ServicioMock;

public class EvaluacionExterna implements ServicioExterno {
    @Override
    public ResultadoDeEvaluacion evaluateBook(String bookTitle) {
        // Aquí podrías implementar la lógica real para obtener la evaluación del libro del servicio externo
        // Por simplicidad, en este ejemplo siempre devolvemos una evaluación vacía
        return null;
    }
}
