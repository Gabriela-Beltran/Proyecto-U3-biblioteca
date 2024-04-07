
package com.ServicioMock;

import java.util.Random;

public class MockServicioExterno implements ServicioExterno {

    @Override
    public ResultadoDeEvaluacion evaluateBook(String bookTitle) {
        Random random = new Random();
        int rating = random.nextInt(5) + 1;
        String[] reviews = {
            "Muy bueno",
            "Buen libro",
            "Interesante",
            "Recomendado",
            "No me gustó"
        };
        String review = reviews[random.nextInt(reviews.length)];
        return new ResultadoDeEvaluacion(rating, review);
    }
}